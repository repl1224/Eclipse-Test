class Circle{
	public int x, y;
	
	public Circle(int x, int y){
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Circle [x=" + x + ", y=" + y + "]";
	}
	
}

public class Test {
	public static void main(String[] args) {
		System.out.println("wow my first git");
		System.out.println("wow my first git");
		System.out.println("wow my first git");
		Circle cr = new Circle(5, 6);
		cr.toString();
	}
}
