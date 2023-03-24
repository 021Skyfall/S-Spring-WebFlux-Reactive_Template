package com.jerry.example;

import reactor.core.publisher.Flux;

import java.util.List;

public class HelloReactiveExample03 {
    public static void main(String[] args) {
        Flux
                .fromIterable(List.of(1,3,6,7,8,11))
                .filter(n -> n > 4 && n % 2 == 0)
                .reduce(Integer::sum)
                .subscribe(System.out::println);
    }
}
