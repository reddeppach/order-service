package com.order.orderservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderWorkerController {
	
	@GetMapping(path="/orders")
	public List<String> getOrders(){
		
		List<String> list = new ArrayList<>();
		list.add("One");
		list.add("two");
		return list;
	}

}
