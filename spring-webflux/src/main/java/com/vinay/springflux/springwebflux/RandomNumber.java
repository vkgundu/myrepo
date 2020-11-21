package com.vinay.springflux.springwebflux;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
public class RandomNumber {
		 
		   public static void main(String[] args) {
			   Flux<Integer> stream = Flux.fromIterable(Arrays.asList(1, 2, 3, 4, 5));
			    List<Integer> values = new ArrayList<>();
			    List<String> signals = new ArrayList<>();
			    
			   Mono<List<Integer>> ss = stream.collectList();

		
		   }
		   

}
