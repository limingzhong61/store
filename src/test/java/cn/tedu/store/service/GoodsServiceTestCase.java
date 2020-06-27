package cn.tedu.store.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.tedu.store.entity.Goods;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GoodsServiceTestCase {

	@Autowired
	private IGoodsService service;
	
	@Test
	public void getHotGoods() {
		Integer count = 4;
		List<Goods> data = service.getHotGoods(count);
		System.err.println("BEGIN:");
		for (Goods goods : data) {
			System.err.println(goods);
		}
		System.err.println("END.");
	}
	
	@Test
	public void getById() {
		Long id = 10000017L;
		Goods data = service.getById(id);
		System.err.println(data);
	}
	
}









