package io.seata.sample.controller;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.seata.sample.service.OrderService;

/**
 * @author jimin.jm@alibaba-inc.com
 * @date 2019/06/14
 */

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;

	@GetMapping(value = "/create", produces = "application/json")
	public Boolean create(String userId, String commodityCode, Integer count) throws InterruptedException {

		System.out.println("进入了order1111111");
		//int i = 1/0;
        Thread.sleep(1000);
		System.out.println("调用了订单服务 userId=" + userId + ",commodityCode = " + commodityCode);
		// orderService.create(userId, commodityCode, count);
		return true;
	}
	@GetMapping(value = "/create2")
	public Boolean create2( ) throws InterruptedException {
		
		System.out.println("进入了order create2");
		return true;
	}

}
