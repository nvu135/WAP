package model;

public class Product {
	private String productId;
	private String productName;
	private String detailInformation;
	private Number price;

	public Product(String productId, String productName, String detailInformation, Number price) {
		this.productId = productId;
		this.productName = productName;
		this.detailInformation = detailInformation;
		this.price = price;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDetailInformation() {
		return detailInformation;
	}

	public void setDetailInformation(String detailInformation) {
		this.detailInformation = detailInformation;
	}

	public Number getPrice() {
		return price;
	}

	public void setPrice(Number price) {
		this.price = price;
	}
}
