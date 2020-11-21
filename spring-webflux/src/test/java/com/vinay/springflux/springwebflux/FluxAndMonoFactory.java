package com.vinay.springflux.springwebflux;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

public class FluxAndMonoFactory {
	
	List<String> stringList = Arrays.asList("Spring","Demo");
	@Test
	public void fluxFromStream() {
		Flux<String> stringFlux = Flux.fromStream(stringList.stream());
		
		StepVerifier.create(stringFlux)
		.expectNext("Spring")
		.expectNext("Demo")
		.verifyComplete();
	}
	
	@Test
	public void monoEmpty() {
		
		Mono<String> stringMono = Mono.justOrEmpty(null);
		StepVerifier.create(stringMono).expectComplete();
		
	}
	
	@Test
	public void fluxRangeTest() {
		
		Flux<Integer> intergerFlux = Flux.range(1, 5);
		StepVerifier.create(intergerFlux)
		.expectNext(1,2,3,4,5)
		.verifyComplete();
	}

}
