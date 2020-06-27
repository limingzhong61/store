package cn.tedu.store.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.tedu.store.service.ex.ServiceException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderServiceTestCase {

	@Autowired
	private IOrderService service;
	
	@Test
	public void addToCart() {
		try {
			String username = "超级管理员";
			Integer uid = 6;
			Integer aid = 13;
			Integer[] cids = {6,5,4};
			service.createOrder(uid, aid, cids, username);
			System.err.println("OK.");
		} catch (ServiceException e) {
			System.err.println(e.getMessage());
		}
	}
	
}









