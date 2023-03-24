package com.jerry.example;

import reactor.core.publisher.Mono;

public class HelloReactiveExample02 {
    public static void main(String[] args) {
        Mono
                .just("Hello,Reactive")
                .subscribe(System.out::println);
    }
}
