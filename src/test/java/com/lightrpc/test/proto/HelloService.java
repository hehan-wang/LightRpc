package com.lightrpc.test.proto;

public interface HelloService {
    String hello(String name);

    String hello(Person person);
}
