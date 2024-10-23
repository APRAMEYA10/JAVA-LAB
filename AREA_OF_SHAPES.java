import java.util.Scanner;
abstract class Shape  {
	double a;
	double b;
	abstract void printArea();
}
class Rectangle extends Shape{
	double l; 
	double br;
  Rectangle(double a, double b){
	l=a;
	br=b;
}

	void printArea(){
		System.out.println("The Area of the rectangle is: "+l*br);
}
}
class Triangle extends Shape{
	double h; 
	double b;
	Triangle(double a, double b){
		h=a;
		this.b=b;
	}
	void printArea(){
		System.out.println("The Area of the triangle is: "+(h*b)/2.0);
	}
}
class Circle extends Shape{
	double r;
	Circle(double r){
		this.r=r;
	}
	void printArea(){
		System.out.println("The area of the Circle is: "+ 3.14*r);	
	
	}
}
class ShapeDemo{
	public static void main(String args[]){
                System.out.println("Aprameya S J USN:1BM23CS048");
		Rectangle r = new Rectangle(5,7);
		Triangle t = new Triangle(4,10);
		Circle c = new Circle(7);

		r.printArea();
		t.printArea();
		c.printArea();
		
	}
}
