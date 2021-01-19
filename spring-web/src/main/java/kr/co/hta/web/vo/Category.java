package kr.co.hta.web.vo;

public class Category {

	private int no;
	private String name;
	private int typeNo;
	
	public Category() {}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTypeNo() {
		return typeNo;
	}

	public void setTypeNo(int typeNo) {
		this.typeNo = typeNo;
	}

	@Override
	public String toString() {
		return "Category [no=" + no + ", name=" + name + ", typeNo=" + typeNo + "]";
	}
	
	
}
