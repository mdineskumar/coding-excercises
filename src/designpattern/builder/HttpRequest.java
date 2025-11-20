package designpattern.builder;

public class HttpRequest {
    private final String url; // required

    private final String method;

    private HttpRequest(Builder builder) {
        this.url = builder.url;
        this.method = builder.method;
    }




    //static class
    public static class Builder {
        private final String url;
        private String method = "GET";


        public Builder(String url) {
            this.url = url;
        }

        public Builder method(String method) {
            this.method = method;
            return this;
        }

        public HttpRequest build() {
            return new HttpRequest(this);
        }

    }
}
