package chap05.geometry;

public class Circle {
	public int radius ; // 필드
	
	public Circle(int radius ) { // 생성자
		this.radius = radius;
	}
	
	public double getArea() { // 메소드
		double area ;
		area = this.radius * this.radius * 3.14;
		return area;
	}
}
