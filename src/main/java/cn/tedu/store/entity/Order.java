package cn.tedu.store.entity;

import java.util.Date;

/**
 * 订单数据的实体类
 */
public class Order extends BaseEntity {

	private static final long serialVersionUID = -4555408533815391620L;

	private Integer oid;
	private Integer uid;
	private String receiver;
	private String phone;
	private String address;
	private Long totalPrice;
	private Integer state;
	private Date orderTime;
	private Date payTime;

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

	@Override
	public String toString() {
		return "Order [oid=" + oid + ", uid=" + uid + ", receiver=" + receiver + ", phone=" + phone + ", address="
				+ address + ", totalPrice=" + totalPrice + ", state=" + state + ", orderTime=" + orderTime
				+ ", payTime=" + payTime + "]";
	}
}
