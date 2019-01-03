package prob6;

public class RectTriangle extends Shape {

	public RectTriangle(double w, double h) {
		super.width = w;
		super.height = h;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width * height / 2;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		double hypotenuse = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));//빗변구하기
		return width + height + hypotenuse;
	}

}
