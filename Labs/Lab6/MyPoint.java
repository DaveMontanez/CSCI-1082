package labs;

public class MyPoint {

	private double x;
	private double y;
	String pointName;
	
	public MyPoint(){
		x = 0;
		y = 0;
		pointName = "P1";
	}
	
	public MyPoint(double x, double y, String pointName){
		this.x = x;
		this.y = y;
		this.pointName = pointName;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String getPointName() {
		return pointName;
	}

	public void setPointName(String pointName) {
		this.pointName = pointName;
	}
	
	public double distance(MyPoint newPoint){
		double newX = newPoint.getX();
		double newY = newPoint.getY();
		double distance = Math.sqrt(Math.pow(newX-x, newY-y) 
				+ Math.pow(newX-x, newY-y));
		return distance;
	}
	
	public double distance(double newX, double newY){
		double distance = Math.sqrt(Math.pow(newX-x, 2) 
				+ Math.pow(newY-y, 2));
		return distance;
	}
	
	@Override
	public String toString(){
		String pointData = String.format("%s is at coordinates (%d,%d)."
				, pointName, x, y);
		return pointData;
	}
	}
}
