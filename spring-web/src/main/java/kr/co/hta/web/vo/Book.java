package kr.co.hta.web.vo;

import java.sql.Date;

public class Book {

	private int no;
	private int categoryNo;
	private String title;
	private String writer;
	private String translator;
	private String publisher;
	private Date pubDate;
	private int stock;
	private int price;
	private int discountPrice;
	private double discountRate;
	private int point;
	private double pointRate;
	private String status;
	private int reviewCount;
	private double reviewPoint;
	private String bestseller;
	private String freeDelivery;
	private String fileName;
	private Date createdDate;
	
	public Book() {}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getCategoryNo() {
		return categoryNo;
	}

	public void setCategoryNo(int categoryNo) {
		this.categoryNo = categoryNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTranslator() {
		return translator;
	}

	public void setTranslator(String translator) {
		this.translator = translator;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Date getPubDate() {
		return pubDate;
	}

	public void setPubDate(Date pubDate) {
		this.pubDate = pubDate;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(int discountPrice) {
		this.discountPrice = discountPrice;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public double getPointRate() {
		return pointRate;
	}

	public void setPointRate(double pointRate) {
		this.pointRate = pointRate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getReviewCount() {
		return reviewCount;
	}

	public void setReviewCount(int reviewCount) {
		this.reviewCount = reviewCount;
	}

	public double getReviewPoint() {
		return reviewPoint;
	}

	public void setReviewPoint(double reviewPoint) {
		this.reviewPoint = reviewPoint;
	}

	public String getBestseller() {
		return bestseller;
	}

	public void setBestseller(String bestseller) {
		this.bestseller = bestseller;
	}

	public String getFreeDelivery() {
		return freeDelivery;
	}

	public void setFreeDelivery(String freeDelivery) {
		this.freeDelivery = freeDelivery;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "Book [no=" + no + ", categoryNo=" + categoryNo + ", title=" + title + ", writer=" + writer
				+ ", translator=" + translator + ", publisher=" + publisher + ", pubDate=" + pubDate + ", stock="
				+ stock + ", price=" + price + ", discountPrice=" + discountPrice + ", discountRate=" + discountRate
				+ ", point=" + point + ", pointRate=" + pointRate + ", status=" + status + ", reviewCount="
				+ reviewCount + ", reviewPoint=" + reviewPoint + ", bestseller=" + bestseller + ", freeDelivery="
				+ freeDelivery + ", fileName=" + fileName + ", createdDate=" + createdDate + "]";
	}
	
	
}
