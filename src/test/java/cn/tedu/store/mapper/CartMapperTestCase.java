package cn.tedu.store.mapper;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.tedu.store.entity.Cart;
import cn.tedu.store.vo.CartVO;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CartMapperTestCase {

	@Autowired
	private CartMapper mapper;
	
	@Test
	public void insert() {
		Cart cart = new Cart();
		cart.setUid(6);
		cart.setGid(10000017L);
		cart.setNum(2);
		Integer rows = mapper.insert(cart);
		System.err.println("rows=" + rows);
	}
	
	@Test
	public void updateNum() {
		Integer cid = 1;
		Integer num = 5;
		String modifiedUser = "Admin";
		Date modifiedTime = new Date();
		Integer rows = mapper.updateNum(cid, num, modifiedUser, modifiedTime);
		System.err.println("rows=" + rows);
	}
	
	@Test
	public void findByUidAndGid() {
		Integer uid = 6;		
		Long gid = 10000017L;
		Cart data = mapper.findByUidAndGid(uid, gid);
		System.err.println(data);
	}
	
	@Test
	public void findByCid() {
		Integer cid = 40;		
		Cart data = mapper.findByCid(cid);
		System.err.println(data);
	}
	
	@Test
	public void findListByUid() {
		Integer uid = 6;
		List<CartVO> list = mapper.findListByUid(uid);
		System.err.println("BEGIN:");
		for (CartVO cartVO : list) {
			System.err.println(cartVO);
		}
		System.err.println("END.");
	}
	
	@Test
	public void findListByCids() {
		Integer[] cids = {6,3,5};
		List<CartVO> list = mapper.findListByCids(cids);
		System.err.println("BEGIN:");
		for (CartVO cartVO : list) {
			System.err.println(cartVO);
		}
		System.err.println("END.");
	}
	
}









