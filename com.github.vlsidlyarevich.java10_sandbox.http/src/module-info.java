module com.github.vlsidlyarevich.java10_sandbox.http {

    requires jdk.incubator.httpclient;

    exports com.github.vlsidlyarevich.java10_sandbox.http.services;
    exports com.github.vlsidlyarevich.java10_sandbox.http.model;

    provides com.github.vlsidlyarevich.java10_sandbox.http.services.HttpClientService
            with com.github.vlsidlyarevich.java10_sandbox.http.services.IncubatorHttpClientService;
}