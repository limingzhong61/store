package cn.tedu.store.service;

import cn.tedu.store.entity.Order;

/**
 * 处理订单与订单数据的业务层接口
 */
public interface IOrderService {

	/**
	 * 创建订单
	 * @param uid 当前登录的用户的id
	 * @param aid 收货地址的id
	 * @param cids 购物车中的数据的id
	 * @param username 当前登录的用户的用户名
	 * @return 成功创建的订单对象
	 */
	Order createOrder(Integer uid, Integer aid, Integer[] cids, String username);
	
}





