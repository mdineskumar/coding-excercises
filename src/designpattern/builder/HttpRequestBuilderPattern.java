package designpattern.builder;

public class HttpRequestBuilderPattern {
    public static void main(String[] args) {
        HttpRequest request1 = new HttpRequest.Builder("https://api.example.com/data").build();
        HttpRequest request2 = new HttpRequest.Builder("https://api.example.com/submit").method("POST").build();


    }
}
