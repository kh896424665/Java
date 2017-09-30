
public class Rectangle {
	private int width=0;
	private int height=0 ;
	public boolean setWidth(int w) {
		if(w>0) {
			width=w;
			return true;
		}
		return false;
	}
	public boolean setHeight(int h) {
		if(h>0) {
			height=h;
			return true;
		}
		return false;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public int getArea() {
		return height*width;
	}
	public int getPerimeter() {
		return 2*(height+width);
	}
	public static void main(String[] args) {
		Rectangle rect=new Rectangle();
		if(rect.setWidth(4)&&rect.setHeight(3)) {
			System.out.println("Width:"+rect.width+"  "+"Height:"+rect.height);
			System.out.println("Area of Rectangle:"+rect.getArea());
			System.out.println("Perimeter of Reatangle:"+rect.getPerimeter());
		}
	}
}
