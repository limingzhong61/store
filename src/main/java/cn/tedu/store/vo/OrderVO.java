package cn.tedu.store.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import cn.tedu.store.entity.OrderItem;

/**
 * 订单详情的VO类
 */
public class OrderVO implements Serializable {

	private static final long serialVersionUID = -7502488199732110916L;

	private Integer oid;
	private Integer uid;
	private String receiver;
	private String phone;
	private String address;
	private Long totalPrice;
	private Integer state;
	private Date orderTime;
	private Date payTime;
	private List<OrderItem> orderItems;

	public Integer getOid() {
		return oid;
	}

	public void setOid(Integer oid) {
		this.oid = oid;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Long totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Date getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public Date getPayTime() {
		return payTime;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	@Override
	public String toString() {
		return "OrderVO [oid=" + oid + ", uid=" + uid + ", receiver=" + receiver + ", phone=" + phone + ", address="
				+ address + ", totalPrice=" + totalPrice + ", state=" + state + ", orderTime=" + orderTime
				+ ", payTime=" + payTime + ", orderItems=" + orderItems + "]";
	}

}
