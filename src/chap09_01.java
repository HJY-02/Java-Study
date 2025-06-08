//밑에 코드 오류 발생
abstract 클래스는 인스턴스(객체)로 만들 수 없다
abstract class Animal { 
    public abstract void printSound();
 
    public void displayInfo() { 
       System.out.println("나는 동물입니다");
    } 
}
public class chap09_01 {
	public static void main(String[] args) {
		Animal myObj = new Animal();
		
		myObj.displayInfo();
	}
}
abstract class Animal { 
    public abstract void printSound();
 
    public void displayInfo() { 
       System.out.println("나는 동물입니다");
    } 
}
class Cat extends Animal{
	public void printSound() {
		System.out.println("고양이는 야옹야옹");
	}
}
public class chap09_01 {
	public static void main(String[] args) {
		Cat myObj = new Cat();
		
		myObj.displayInfo();
		myObj.printSound();
	}
}
abstract class Vehicle { 
     abstract void printPrice(); 
}
abstract class TwoWheeler extends Vehicle { 
    abstract void printPrice(); 
}
abstract class FourWheeler extends Vehicle {}

class Bike extends TwoWheeler {
	   public void printPrice() {
	       System.out.println("가격 : 150,000");
	   }
	   public void printType() { 
	      System.out.println("이것은 자전거입니다.");
	   } 
	   public void printBrand() { 
	     System.out.println("브랜드 : 삼천리");
	  }
	}
class Car extends FourWheeler {
	   public void printPrice() {
	      System.out.println("가격 : 50,000,000");
	   }
	   public void printType() { 
	      System.out.println("이것은 자동차입니다.");
	   } 
	   public void printBrand() {
	      System.out.println("브랜드 : BMW");
	   }
	}
public class chap09_01 {
	public static void main(String[] args) {
        Bike myBike = new Bike();
        Car myCar = new Car();
        myBike.printType();
        myBike.printBrand();
        myBike.printPrice();
        System.out.println("---------------");
        myCar.printType();
        myCar.printBrand(); 
        myCar.printPrice();
	}
}
abstract class Shape { 
     String color;
     
     abstract double area();
     public abstract String toString();
     
     public Shape(String color) {
    	 System.out.println("Shape 클래스 생성자 호출");
    	 this.color=color;
     }
     public String getColor() {return color;}
}
class Circle extends Shape{
	double radius;
	
	public Circle(String color, double radius) {
		super(color);
		System.out.println("Circle 클래스 생성자 호출");
		this.radius=radius;
	}
	double area() {
		return radius*radius*3.14;
	}
	public String toString() {
		return "원 색상은"+super.getColor()+" 그리고 면적은: "+area();
	}
}
class Rectangle extends Shape{
	double length;
	double width;
	
	public Rectangle(String color, double length, double width) {
		super(color);
		System.out.println("Rectangle 클래스 생성자 호출");
		this.length=length;
		this.width=width;
	}
	double area() {
		return length*width;
	}
	public String toString() {
		return "사각형 색상은"+super.getColor()+" 그리고 면적은: "+area();
	}
}
public class chap09_01 {
	public static void main(String[] args) {
       Shape s1=new Circle("빨간색", 2.2);
       Shape s2=new Rectangle("노란색", 2, 4);
       
       System.out.println(s1.toString());
       System.out.println(s2.toString());
	}
}