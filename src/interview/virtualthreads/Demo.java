package interview.virtualthreads;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;

public class Demo {
    public static void main(String[] args) {
        var executor = Executors.newFixedThreadPool(100); // A pool of 100 platform threads

        for (int i = 0; i < 1000; i++) {
            executor.submit(() -> {
                try {
                    // Simulate a blocking network call
                    var client = HttpClient.newHttpClient();
                    var request = HttpRequest.newBuilder()
                            .uri(URI.create("https://www.google.com"))
                            .build();
                    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                    System.out.println("Response received!");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        }

        executor.shutdown();
    }
}
