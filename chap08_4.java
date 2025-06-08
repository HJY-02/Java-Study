//super
class SuperCat{
	String breed="샴고양이";
	String age="15살";
	
	void printInfo() {
		System.out.println("부모 고양이입니다.");
	}
}
class SubKitten extends SuperCat{
	String age="2살";
	void printInfo() {
		System.out.println("아기 고양입니다.");
	}
	void printDetail() {
		super.printInfo();
		System.out.println("품종은 "+super.breed+", 나이는"+super.age);
		printInfo();
		System.out.println("품종은 "+breed+", 나이는"+age);
	}
}
public class chap08_4{
	public static void main(String[] args) {
		SubKitten objCat=new SubKitten();
		objCat.printDetail();
	}
}

class parent{
	String name="홍길순";
	
	void details() {
		System.out.println(name);
	}
}
class child extends parent{
	String name="홍길동";
	
	void details() {
		super.details();
		System.out.println(name);
	}
	void printDetail() {
		details();
		System.out.println("부모 이름: "+super.name);
		System.out.println("자식 이름: "+name);
	}
}
public class chap08_4 {
	public static void main(String[] args) {
		child objCat=new child();
		objCat.printDetail();
	}
}

class SuperCat{
	String name;
	String age="15살";
	SuperCat(String n){
		name=n;
		System.out.println("부모고양이입니다. 이름은"+name);
	}
}
class SubKitten extends SuperCat{
	String name;
	String age="2살";
	public SubKitten(String n1, String n2) {
		super(n1);
		this.name=n2;
		System.out.println("아기고양이입니다. 이름은 "+name);
	}
}
public class chap08_4 {
	public static void main(String[] args) {
		SubKitten objCat=new SubKitten("아름이","다운이");
	}
}