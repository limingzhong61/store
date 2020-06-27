package cn.tedu.store.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.tedu.store.entity.User;
import cn.tedu.store.service.ex.ServiceException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTestCase {
	
	@Autowired
	private IUserService service;
	
	@Test
	public void reg() {
		try {
			User user = new User();
			user.setUsername("ChengHeng");
			user.setPassword("8888");
			user.setPhone("13800138007");
			user.setEmail("chengheng@tedu.cn");
			user.setGender(1);
			user.setAvatar("http://www.tedu.cn/logo.png");
			service.reg(user);
			System.err.println("OK.");
		} catch (ServiceException e) {
			System.err.println(e.getMessage());
		}
	}

	@Test
	public void login() {
		try {
			String username = "rest";
			String password = "1234";
			User user = service.login(username, password);
			System.err.println(user);
		} catch (ServiceException e) {
			System.err.println(e.getMessage());
		}
	}
	
	@Test
	public void changePassword() {
		try {
			Integer uid = 6;
			String oldPassword = "8888";
			String newPassword = "1234";
			service.changePassword(uid, oldPassword, newPassword);
			System.err.println("OK.");
		} catch (ServiceException e) {
			System.err.println(e.getMessage());
		}
	}
	
	@Test
	public void changeInfo() {
		try {
			User user = new User();
			user.setUid(50);
			user.setGender(0);
			user.setPhone("88888888");
			user.setEmail("tedu@qq.com");
			service.changeInfo(user);
			System.err.println("OK.");
		} catch (ServiceException e) {
			System.err.println(e.getMessage());
		}
	}
	
	@Test
	public void changeAvatar() {
		try {
			Integer uid = 6;
			String avatar = "123456";
			service.changeAvatar(uid, avatar);
			System.err.println("OK.");
		} catch (ServiceException e) {
			System.err.println(e.getMessage());
		}
	}
	
	@Test
	public void getByUid() {
		Integer uid = 5;
		User user = service.getByUid(uid);
		System.err.println(user);
	}
	
}








