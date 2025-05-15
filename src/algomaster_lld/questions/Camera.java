package algomaster_lld.questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Image{
   private String content;
   public Image(String content){
       this.content = content;
   }
}


class ObjectTracker{
    private List<Camera> cameras;
    private ExecutorService cameraExecutorService;//to run camera operations concurrently
    private volatile boolean isTracking;//to control the tracking loop
    private List<Thread> cameraThreads; // To keep track of manually created threads
    public ObjectTracker() {
        this.cameras = new ArrayList<>();
        this.cameraThreads = new ArrayList<>(); // Initialize the list for threads
        isTracking = false;
        System.out.println("ObjectTracker initialized");
    }

    public void addCamera(Camera camera){
        System.out.println("Camera added");
        cameras.add(camera);
    }

    public void startTracking(){
        if (cameras.isEmpty()){
            System.out.println("no cameras configured. Tracking not started");
        }

        isTracking = true;
        cameraExecutorService = Executors.newFixedThreadPool(cameras.size());
        for(Camera camera: cameras){
//            cameraExecutorService.submit(() -> {
//                Random random = new Random();
//                int objectCounter = 0;
//                System.out.println("task for "+camera.getCameraId() + " started on thread: "+ Thread.currentThread().getName());
//                while(isTracking){
//                    if (random.nextInt(10) < 3) { // 30% chance of detecting an object
//                        objectCounter++;
//                        String detectedObject = "Object_" + objectCounter;
//                        camera.takeImage(detectedObject);
//                    }
//
//                    try {
//                        // Simulate some delay between detection attempts
//                        Thread.sleep(random.nextInt(500) + 100); // Sleep 100-600 ms
//                    } catch (InterruptedException e) {
//                        System.out.println("Camera " + camera.getCameraId() + " operation interrupted.");
//                        Thread.currentThread().interrupt(); // Preserve interrupt status
//                        break; // Exit loop if interrupted
//                    }
//
//                }
//                System.out.println("task for "+camera.getCameraId()+" finished");
//            });


            // Create a Runnable for each camera's task
            Runnable cameraTask = new Runnable() {
                @Override
                public void run() {
                    Random random = new Random();
                    int objectCounter = 0;
                    System.out.println("Task for "+camera.getCameraId() + " started on thread: "+ Thread.currentThread().getName());
                    while(isTracking){ // Check the volatile flag
                        // Simulate object detection
                        if (random.nextInt(10) < 3) { // 30% chance of detecting an object
                            objectCounter++;
                            String detectedObject = "Object_" + objectCounter + "_by_" + camera.getCameraId();
                            camera.takeImage(detectedObject);
                        }

                        try {
                            // Simulate some delay between detection attempts
                            Thread.sleep(random.nextInt(500) + 100); // Sleep 100-600 ms
                        } catch (InterruptedException e) {
                            // This thread was interrupted, likely by stopTracking()
                            System.out.println("Camera " + camera.getCameraId() + " operation interrupted. Exiting task.");
                            Thread.currentThread().interrupt(); // Preserve interrupt status
                            break; // Exit loop if interrupted
                        }
                    }
                    System.out.println("Task for "+camera.getCameraId()+" finished.");
                }
            };

            Thread cameraThread = new Thread(cameraTask, "CameraThread-" + camera.getCameraId()); // Give threads names
            cameraThreads.add(cameraThread);
            cameraThread.start(); // Start the thread
        }
    }

    public void stopTracking(){
        System.out.println("ObjectTracker stopping tracking...");
        isTracking = false;

//        if(cameraExecutorService != null){
//            //disable new tasks from being submitted
//            cameraExecutorService.shutdown();
//            try {
//                // Wait a while for existing tasks to terminate
//                if (!cameraExecutorService.awaitTermination(5, TimeUnit.SECONDS)) {
//                    cameraExecutorService.shutdownNow(); // Cancel currently executing tasks
//                    // Wait a while for tasks to respond to being cancelled
//                    if (!cameraExecutorService.awaitTermination(5, TimeUnit.SECONDS)) {
//                        System.err.println("Camera executor service did not terminate.");
//                    }
//                }
//            } catch (InterruptedException ie) {
//                cameraExecutorService.shutdownNow();
//                Thread.currentThread().interrupt();
//            }
//
//        }

        // Wait for all camera threads to finish
        for (Thread thread : cameraThreads) {
            try {
                // Wait for the thread to die. If it doesn't respond to 'isTracking = false'
                // quickly, the interrupt() call later might be needed if it's stuck in sleep.
                thread.join(1000); // Wait for up to 1 second for the thread to finish
                if (thread.isAlive()) {
                    System.out.println("Thread " + thread.getName() + " did not stop gracefully, interrupting...");
                    thread.interrupt(); // If join timed out, interrupt the thread
                    thread.join(1000); // Wait a bit more for it to handle the interruption
                    if (thread.isAlive()) {
                        System.err.println("Thread " + thread.getName() + " could not be stopped.");
                    }
                }
            } catch (InterruptedException e) {
                System.err.println("Interrupted while waiting for thread " + thread.getName() + " to stop.");
                // Optionally, try to interrupt the target thread again or log
                thread.interrupt(); // Re-interrupt the current thread (the one calling stopTracking)
                // or the camera thread if the intention is to force it.
                // In this context, it's likely the stopTracking thread itself was interrupted.
            }
        }
        cameraThreads.clear(); // Clear the list of threads

        System.out.println("ObjectTracker tracking stopped.");

    }


}
public class Camera {
    private String cameraId;
    private final int bufferSize;
    private final String[] imageBuffer;
    private int currentImageIndex; // points to the next slot to write
    private int imagesStoredCount; // number of actual images in the buffer

    public Camera(String cameraId, int bufferSize) {
        this.cameraId = cameraId;
        this.bufferSize = bufferSize;
        imageBuffer = new String[bufferSize];
    }

    public synchronized void takeImage(String objectDescription){
        if(isBufferFull()){
            System.out.println(cameraId+ ": buffer is full");
            return;
        }
        String imageData = "Image_from_"+cameraId+"_seeing_"+objectDescription+"_at_"+System.currentTimeMillis();
        imageBuffer[currentImageIndex] = imageData;
        System.out.println(cameraId + " | Stored: " + imageData + " at index " + currentImageIndex);
        currentImageIndex = currentImageIndex + 1;//move to the next slot
        imagesStoredCount++;//increment buffer is full
    }


    public int getBufferSize() {
        return bufferSize;
    }

    public String getCameraId() {
        return cameraId;
    }

    public  boolean isBufferFull(){
        return imagesStoredCount == bufferSize;
    }

    public int getImagesStoredCount() {
        return imagesStoredCount;
    }
}

class DemoObjectTracker{
    public static void main(String[] args) throws InterruptedException {
        Camera cam1 = new Camera("C1",5);
        Camera cam2 = new Camera("C2",4);

        ObjectTracker tracker = new ObjectTracker();
        tracker.addCamera(cam1);
        tracker.addCamera(cam2);

        tracker.startTracking();
        // Let tracking run for a while
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000); // Main thread sleeps
        }
        tracker.stopTracking();
    }
}
