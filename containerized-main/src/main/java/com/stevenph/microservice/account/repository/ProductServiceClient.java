package com.stevenph.microservice.account.repository;

import com.stevenph.microservice.account.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Component
@FeignClient("containerized-products")
public interface ProductServiceClient
{
	@RequestMapping(method = RequestMethod.GET, value = "/api/v1/products/{productId}")
	Product findById(@PathVariable("productId") Integer orderId);

	@RequestMapping(method = RequestMethod.GET, value = "/api/v1/products")
	List<Product> findAll();
}
