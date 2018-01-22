package entity;

import javax.persistence.*;

@Entity
@Table(name="products")
public class Products {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="productname")
	private String productName;
	
	@Column(name="numberofavailableinstock")
	private long  numberofavailableInStock;
	
	@Column(name="productprice")
	private String productPrice;
	
	@Column(name="percentageofsell")
	private double percentageOfSell;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public long getNumberofavailableInStock() {
		return numberofavailableInStock;
	}
	public void setNumberofavailableInStock(long numberofavailableInStock) {
		this.numberofavailableInStock = numberofavailableInStock;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	public double getPercentageOfSell() {
		return percentageOfSell;
	}
	public void setPercentageOfSell(double percentageOfSell) {
		this.percentageOfSell = percentageOfSell;
	}
	@Override
	public String toString() {
		return "Products [id=" + id + ", productName=" + productName + ", numberofavailableInStock="
				+ numberofavailableInStock + ", productPrice=" + productPrice + ", percentageOfSell=" + percentageOfSell
				+ "]";
	}
	
}
