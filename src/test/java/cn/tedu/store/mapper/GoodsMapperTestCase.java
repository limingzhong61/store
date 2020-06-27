package cn.tedu.store.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.tedu.store.entity.Goods;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GoodsMapperTestCase {

	@Autowired
	private GoodsMapper mapper;
	
	@Test
	public void findHotGoods() {
		Integer count = 4;
		List<Goods> data = mapper.findHotGoods(count);
		System.err.println("BEGIN:");
		for (Goods goods : data) {
			System.err.println(goods);
		}
		System.err.println("END.");
	}
	
	@Test
	public void findById() {
		Long id = 10000017L;
		Goods data = mapper.findById(id);
		System.err.println(data);
	}
	
}









