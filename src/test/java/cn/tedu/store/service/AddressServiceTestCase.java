package cn.tedu.store.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.tedu.store.entity.Address;
import cn.tedu.store.service.ex.ServiceException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AddressServiceTestCase {
	
	@Autowired
	private IAddressService service;
	
	@Test
	public void addnew() {
		try {
			String username = "超级管理员";
			Address address = new Address();
			address.setUid(3);
			address.setReceiver("小王同学");
			service.addnew(address, username);
			System.err.println("OK.");
		} catch (ServiceException e) {
			System.err.println(e.getMessage());
		}
	}
	
	@Test
	public void setDefault() {
		try {
			Integer uid = 3;
			Integer aid = 100;
			String username = "单元测试";
			service.setDefault(uid, aid, username);
			System.err.println("OK.");
		} catch (ServiceException e) {
			System.err.println(e.getMessage());
		}
	}
	
	@Test
	public void deleteByAid() {
		try {
			Integer uid = 6;
			Integer aid = 5;
			String username = "单元测试";
			service.deleteByAid(uid, aid, username);
			System.err.println("OK.");
		} catch (ServiceException e) {
			System.err.println(e.getMessage());
		}
	}
	
	@Test
	public void getListByUid() {
		Integer uid = 6;
		List<Address> list = service.getListByUid(uid);
		System.err.println("BEGIN:");
		for (Address address : list) {
			System.err.println(address);
		}
		System.err.println("END.");
	}
	
}








