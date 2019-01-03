package prob6;

public class Rectangle extends Shape implements Resizable{

	public Rectangle(double w, double h) {
		super.width = w;
		super.height = h;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width * height;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return (width + height) * 2;
	}

	@Override
	public void resize(double s) {
		// TODO Auto-generated method stub
		width *= s;
		height *= s;
	}
	
}
