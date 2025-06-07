//단일 상속
class Animal {
	void eat() {
		System.out.println("먹이를 먹다.");
	}
}
class Cat extends Animal {
	void meow() {
		System.out.println("야옹하고 울다.");
	}
}
public class chap08_2{
      public static void main(String[] args) {
        Cat obj=new Cat();
        obj.meow();
        obj.eat();
    }
}

class Father {
	String familyName="프로그래머";
	String houseAddress="인천";
}
class Son extends Father {
	String name="홍길동";
	
	void printDetails() {
		System.out.println("나의 이름은 "+this.name);
		System.out.println("나의 아버지는 "+this.familyName);
		System.out.println("나의 집은 "+this.houseAddress);
	}
}
//public class chap08_2{
//      public static void main(String[] args) {
//        Son obj=new Son();
//        obj.printDetails();;
//    }
//}위에 코드랑 충돌해서 주석해놓은 것 뿐