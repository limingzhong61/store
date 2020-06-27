package cn.tedu.store.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.tedu.store.entity.Cart;
import cn.tedu.store.service.ex.ServiceException;
import cn.tedu.store.vo.CartVO;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CartServiceTestCase {

	@Autowired
	private ICartService service;
	
	@Test
	public void addToCart() {
		try {
			Cart cart = new Cart();
			cart.setUid(3);
			cart.setGid(10000017L);
			cart.setNum(2);
			String username = "超级管理员";
			service.addToCart(cart, username);
			System.err.println("OK.");
		} catch (ServiceException e) {
			System.err.println(e.getMessage());
		}
	}
	
	@Test
	public void addNum() {
		try {
			Integer cid = 60;
			Integer uid = 6;
			String username = "超级管理员";
			Integer num = service.addNum(cid, uid, username);
			System.err.println("num=" + num);
		} catch (ServiceException e) {
			System.err.println(e.getMessage());
		}
	}
	
	@Test
	public void getListByUid() {
		Integer uid = 6;
		List<CartVO> list = service.getListByUid(uid);
		System.err.println("BEGIN:");
		for (CartVO cartVO : list) {
			System.err.println(cartVO);
		}
		System.err.println("END.");
	}
	
	@Test
	public void getListByCids() {
		Integer[] cids = { 5,3,6 };
		List<CartVO> list = service.getListByCids(cids);
		System.err.println("BEGIN:");
		for (CartVO cartVO : list) {
			System.err.println(cartVO);
		}
		System.err.println("END.");
	}
	
}









