package cn.tedu.store.mapper;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.tedu.store.entity.Address;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AddressMapperTestCase {

	@Autowired
	private AddressMapper mapper;
	
	@Test
	public void insert() {
		Address address = new Address();
		address.setUid(3);
		address.setReceiver("小张同学");
		Integer rows = mapper.insert(address);
		System.err.println("rows=" + rows);
	}
	
	@Test
	public void updateNonDefault() {
		Integer uid = 6;
		String modifiedUser = "管理员";
		Date modifiedTime = new Date();
		Integer rows 
			= mapper.updateNonDefault(
				uid, modifiedUser, modifiedTime);
		System.err.println("rows=" + rows);
	}
	
	@Test
	public void updateDefault() {
		Integer aid = 8;
		String modifiedUser = "管理员";
		Date modifiedTime = new Date();
		Integer rows 
			= mapper.updateDefault(
				aid, modifiedUser, modifiedTime);
		System.err.println("rows=" + rows);
	}
	
	@Test
	public void deleteByAid() {
		Integer aid = 8;
		Integer rows 
			= mapper.deleteByAid(aid);
		System.err.println("rows=" + rows);
	}
	
	@Test
	public void getCountByUid() {
		Integer uid = 3;
		Integer count = mapper.getCountByUid(uid);
		System.err.println("count=" + count);
	}
	
	@Test
	public void findListByUid() {
		Integer uid = 6;
		List<Address> list = mapper.findListByUid(uid);
		System.err.println("BEGIN:");
		for (Address address : list) {
			System.err.println(address);
		}
		System.err.println("END.");
	}
	
	@Test
	public void findByAid() {
		Integer aid = 80;
		Address address = mapper.findByAid(aid);
		System.err.println(address);
	}
	
	@Test
	public void findLastModifiedByUid() {
		Integer uid = 6;
		Address address = mapper.findLastModifiedByUid(uid);
		System.err.println(address);
	}
	
}









