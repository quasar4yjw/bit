/* Value Object
 * => Class 문법을 사용하여 사용자 정의 데이터 타입 만들기
 * 
 * 1) Serializable 인터페이스 구현
 * 
 * 2) 데이터를 저장할 인스턴스 변수 선언
 * 
 * 3) setter/getter 생성
 * 
 * 4) 기본 생성자
 * 
 * 5) equals()/hashCode() 메서드 오버라이딩
 * 
 * 6) toString 오버라이딩
 */
package java02jw.test15;

import java.io.Serializable;

public class Product implements Serializable, Cloneable{
	private static final long serialVersionUID = 1L;
	
  protected int 			no;
  protected String 		name;
  protected int 			quantity;
  protected int 			makerNo;
  
  
	public Product() {

	}
	
	@Override
	public Product clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Product) super.clone();
	}
	
	@Override
	public String toString() {
		return "Product [no=" + no + ", name=" + name + ", quantity=" + quantity
				+ ", makerNo=" + makerNo + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + makerNo;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + no;
		result = prime * result + quantity;
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
		Product other = (Product) obj;
		if (makerNo != other.makerNo)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (no != other.no)
			return false;
		if (quantity != other.quantity)
			return false;
		return true;
	}


	public Product(int no, String name, int quantity, int makerNo) {
		
		this.no = no;
		this.name = name;
		this.quantity = quantity;
		this.makerNo = makerNo;
	}


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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getMakerNo() {
		return makerNo;
	}
	public void setMakerNo(int makerNo) {
		this.makerNo = makerNo;
	}
  
  
}
