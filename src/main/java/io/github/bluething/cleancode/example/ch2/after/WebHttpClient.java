package io.github.bluething.cleancode.example.ch2.after;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.IOException;

public class WebHttpClient {
    private HttpClient client = getDefaultClient();

    public HttpResponse sendGet(String s) throws IOException {
        return client.execute(new HttpGet(s));
    }

    private CloseableHttpClient getDefaultClient() {
        return HttpClientBuilder.create()
                .build();
    }
}
