package interview.virtualthreads;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class HighThroughputVirtualThreads {

    public static void main(String[] args) throws Exception {
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            Future<?> future1 = executor.submit(() -> fetchURL("https://www.google.com"));
            Future<?> future2 = executor.submit(() -> fetchURL("https://www.youtube.com"));

            future1.get(); // Wait for the first task to complete
            future2.get(); // Wait for the second task to complete
        }
    }

    public static void fetchURL(String url) {
        try {
            var client = HttpClient.newHttpClient();
            var request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Response from " + url + " received!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}