package cn.tedu.store.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.tedu.store.entity.Order;
import cn.tedu.store.entity.OrderItem;
import cn.tedu.store.vo.OrderVO;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMapperTestCase {

	@Autowired
	private OrderMapper mapper;
	
	@Test
	public void insertOrder() {
		Order order = new Order();
		order.setUid(6);
		order.setReceiver("小刘同学");
		order.setTotalPrice(2048L);
		System.err.println("插入数据之前：" + order);
		Integer rows = mapper.insertOrder(order);
		System.err.println("rows=" + rows);
		System.err.println("插入数据之后：" + order);
	}
	
	@Test
	public void insertOrderItem() {
		OrderItem orderItem = new OrderItem();
		orderItem.setOid(1);
		orderItem.setGoodsTitle("饮料");
		orderItem.setGoodsPrice(3L);
		orderItem.setGoodsNum(6);
		Integer rows = mapper.insertOrderItem(orderItem);
		System.err.println("rows=" + rows);
	}
	
	@Test
	public void findByOid() {
		Integer oid = 8;
		OrderVO data = mapper.findByOid(oid);
		System.err.println(data);
	}
	
}









