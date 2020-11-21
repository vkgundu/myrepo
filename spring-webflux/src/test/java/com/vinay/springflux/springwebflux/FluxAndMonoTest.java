/**
 * 
 */
package com.vinay.springflux.springwebflux;

import org.junit.jupiter.api.Test;

import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

/**
 * @author vgund01
 *
 */
public class FluxAndMonoTest {
	@Test
	public void fluxTest() {
		Flux<String> stringFlux = Flux.just("Spring","Demo","Mono","Flux")
				//.concatWith(Flux.error(new RuntimeException("Exception occurred")))
				.log();
		
		stringFlux.subscribe(e -> {
			System.out.println(e);
		},e->{
			System.out.println(e);
		},()->{
			System.out.println("completed");
		});
	}
	
	@Test
	public void fluxTestWithoutError() {
		Flux<String> stringFlux = Flux.just("Spring","Demo","Mono","Flux")
				.log();
		StepVerifier.create(stringFlux)
		.expectNext("Spring")
		.expectNext("Demo")
		.expectNext("Mono")
		.expectNext("Flux")
		.verifyComplete();
		
	}
	
	@Test
	public void fluxTestCountWithError() {
		
		Flux<String> stringFlux = Flux.just("Spring","Demo")
				.concatWith(Flux.error(new RuntimeException("Exception occurred"))).log();
		StepVerifier.create(stringFlux)
		.expectNextCount(2)
		.expectErrorMessage("Exception occurred")
		.verify();
	}
	
	
	


}
