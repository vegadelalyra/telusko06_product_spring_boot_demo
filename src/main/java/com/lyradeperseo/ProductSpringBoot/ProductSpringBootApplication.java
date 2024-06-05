package com.lyradeperseo.ProductSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class ProductSpringBootApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ProductSpringBootApplication.class, args);

		ProductService productService = context.getBean(ProductService.class);
		productService.show();

		List<Product> products = productService.getAllProducts();
		products.forEach(System.out::println);

	}

}
