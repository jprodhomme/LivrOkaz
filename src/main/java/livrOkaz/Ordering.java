package livrOkaz;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;

public class Ordering {
	private int orderingId;
	private Date dateOrdering;
	private Date dateDelivery;
	private double shippingFees;
	private int userId;
	private double totalAmount;
	private double ordering_user_id; //5.5%
	private double userId_R_ordering_User;
	
	
	public Ordering(int orderingId, Date dateOrdering, Date dateDelivery, double shippingFees, int userId,
			double totalAmount, double ordering_user_id, double userId_R_ordering_User) {
		super();
		this.orderingId = orderingId;
		this.dateOrdering = dateOrdering;
		this.dateDelivery = dateDelivery;
		this.shippingFees = shippingFees;
		this.userId = userId;
		this.totalAmount = totalAmount;
		this.ordering_user_id = ordering_user_id;
		this.userId_R_ordering_User = userId_R_ordering_User;
	}
	
	public Ordering() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getOrderingId() {
		return orderingId;
	}
	
	public void setOrderingId(int orderingId) {
		this.orderingId = orderingId;
	}
	
	public Date getDateOrdering() {
		return dateOrdering;
	}
	
	public void setDateOrdering(Date dateOrdering) {
		this.dateOrdering = dateOrdering;
	}
	
	public Date getDateDelivery() {
		return dateDelivery;
	}
	
	public void setDateDelivery(Date dateDelivery) {
		this.dateDelivery = dateDelivery;
	}
	
	public double getShippingFees() {
		return shippingFees;
	}
	
	public void setShippingFees(double shippingFees) {
		this.shippingFees = shippingFees;
	}
	
	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public double getTotalAmount() {
		return totalAmount;
	}
	
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public double getOrdering_user_id() {
		return ordering_user_id;
	}
	
	public void setOrdering_user_id(double ordering_user_id) {
		this.ordering_user_id = ordering_user_id;
	}
	
	public double getUserId_R_ordering_User() {
		return userId_R_ordering_User;
	}
	
	public void setUserId_R_ordering_User(double userId_R_ordering_User) {
		this.userId_R_ordering_User = userId_R_ordering_User;
	}
}
