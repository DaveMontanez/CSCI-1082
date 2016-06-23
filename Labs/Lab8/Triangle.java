package lab8;

public class Triangle extends ShapeObject{
	
	private double side1 = 1;
	private double side2 = 1;
	private double side3 = 1;
	
	//Constructors
	public Triangle(){
	}
	
	public Triangle(double side1, double side2, double side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	//Getters and setters
	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	//Return area of triangle, rounded to 3 decimal places.
	public double getArea(){
		double s = (side1+side2+side3)/2;
		double area = Math.sqrt(s * (s-side1)*(s-side2)*(s-side3));
		double areaRounded = (double)Math.round(area * 1000d) / 1000d;
		return areaRounded;
	}
	
	//Return perimeter
	public double getPerimeter(){
		return (side1+side2+side3);
	}
	
	//Display all shape info
	public String toString(){
		String shapeInfo = super.toString() + "Side1: " + side1 + "\nSide2: " 
				+ side2 + "\nSide3: " + side3 + "\nPerimeter: " + this.getPerimeter()
				+ "\nArea: " + this.getArea();
		return shapeInfo;
	}
}
