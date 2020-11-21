package com.vinay.webflux.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vinay.model.Product;

import reactor.core.publisher.Mono;
@RestController
public class MyController {
	@GetMapping("/greetings")
	public Mono<String> getDepartmentsByStoreIdAndOfferType(@RequestParam String name) {
		return Mono.just("Good Morning," + name);
	}
	
	@PostMapping("/product")
	public Mono<String> saveTest(@RequestBody Product product) {
		return Mono.just(product.getProductId());
	}
}
