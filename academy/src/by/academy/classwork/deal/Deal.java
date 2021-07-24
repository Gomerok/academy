package by.academy.classwork.deal;

import java.util.Arrays;
import java.util.Date;

public class Deal {

	private Product products[];
	private User seller = new User();
	private User buyer = new User();
	private Date date;

	public Deal() {
		super();
	}

	public Deal(Product[] products, User seller, User buyer, Date date) {
		super();
		this.products = products;
		this.seller = seller;
		this.buyer = buyer;
		this.date = date;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public User getSeller() {
		return seller;
	}

	public void setSeller(User seller) {
		this.seller = seller;
	}

	public User getBuyer() {
		return buyer;
	}

	public void setBuyer(User buyer) {
		this.buyer = buyer;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double calcFullPrice() {
		double FullPrice=0;
		
		for(Product p: products) {
			FullPrice += p.calcPrice();
		}
		return FullPrice;
		
	}
	
//	public void deal() {
//		System.out.println("Bill:");
//		for(Product p: getProducts()) {
//			System.out.println(p.getName() +" price: " + p.calcPrice());
//		}
//		
//		System.out.println("-------------------------");
//		System.out.println(calcFullPrice());
//		
//	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((buyer == null) ? 0 : buyer.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + Arrays.hashCode(products);
		result = prime * result + ((seller == null) ? 0 : seller.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Deal other = (Deal) obj;
		if (buyer == null) {
			if (other.buyer != null)
				return false;
		} else if (!buyer.equals(other.buyer))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (!Arrays.equals(products, other.products))
			return false;
		if (seller == null) {
			if (other.seller != null)
				return false;
		} else if (!seller.equals(other.seller))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Deal [products=");
		builder.append(Arrays.toString(products));
		builder.append(", seller=");
		builder.append(seller);
		builder.append(", buyer=");
		builder.append(buyer);
		builder.append(", date=");
		builder.append(date);
		builder.append("]");
		return builder.toString();
	}

}
