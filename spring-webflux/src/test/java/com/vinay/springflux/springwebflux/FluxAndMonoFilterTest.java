package com.vinay.springflux.springwebflux;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

public class FluxAndMonoFilterTest {
	
	List<String> nameList = Arrays.asList("Vinay","Nihal","Test","Test2");

	 @Test
	 public void filterTest() {
		 Flux<String> test1 = Flux.just("");
		 nameList.forEach(test-> {
			  test1.just(test);
		 });
		 Flux<String> stringFlux = Flux.fromIterable(nameList);
		  stringFlux = test1.filter(s->s.startsWith("T"));
		 StepVerifier.create(stringFlux).expectNext("Test","Test2").verifyComplete();
		 
		 
		 
		 
		 
	 }
}
