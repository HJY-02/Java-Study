class Calculate{
	public int add(int num1, int num2) {
		return num1+num2;	
	}
	public double add(double num1, double num2) {
		return num1+num2;
	}
}
public class chap08_5 {
	public static void main(String[] args) {
		int a=4;
		int b=5;
		double c=11.12;
		double d=21.34;
		Calculate obj=new Calculate();
		System.out.println(obj.add(a, b));
		System.out.println(obj.add(c, d));
	}
}
class CalculateSquare{
	public void square() {
		System.out.println("No Parameter MMethod Called");	
	}
	public int square(int width, int height) {
		int area=width*height;
		return area;
	}
	public double square(double width, double height) {
		double area=width*height;
		return area;
	}
	public double square(int width, double height) {
		double area=width*height;
		return area;
	}
	public double square(double width, int height) {
		double area=width*height;
		return area;
	}
}
public class chap08_5 {
	public static void main(String[] args) {
		CalculateSquare myArea=new CalculateSquare();
		System.out.println("가로: 10, 세로:5 사각형의 넓이는 "+myArea.square(10,5));
		System.out.println("가로: 2.5, 세로:4.5 사각형의 넓이는 "+myArea.square(2.5, 4.5));
	}
}