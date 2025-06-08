//인터페이스 단일 상속
interface Parent{
	public void printInfo();
}
class Father implements Parent{
	public void printInfo() {
		System.out.println("아버지입니다.");
	}
}
public class chap09_02 {
	public static void main(String[] args) {
		Father myFather=new Father();
		myFather.printInfo();
	}
}
interface Animal{
	public void animalSound();
	public void animalWalk();
}
class Pig implements Animal{
	public void animalSound() {
		System.out.println("꿀꿀꿀하고 소리 내다");
	}
	public void animalWalk() {
		System.out.println("네발로 걷다");
	}
}
public class chap09_02 {
	public static void main(String[] args) {
		Pig myPig=new Pig();
		myPig.animalSound();
		myPig.animalWalk();
	}
}

//인터페이스 다중상속
interface Papa{
	public void genderFather();
}
interface Mama{
	public void genderMother();
}
class Baby implements Papa, Mama{
	public void genderFather() {
		System.out.println("나는 아버지입니다");
	}
	public void genderMother() {
		System.out.println("나는 어머니입니다");
	}
	public void printInfo() {
		System.out.println("나는 아기입니다");
	}
}
public class chap09_02 {
	public static void main(String[] args) {
		Baby myBaby=new Baby();
		myBaby.genderFather();
		myBaby.genderMother();
		myBaby.printInfo();
	}
}
interface Fly{
	public void fly();
}
interface Walk{
	public void walk();
}
class Chicken implements Fly, Walk{
	public void fly() {
		System.out.println("닭은 날 수 있다");
	}
	public void walk() {
		System.out.println("닭은 걸을 수 있다");
	}
}
class Bird implements Fly{
	public void fly() {
		System.out.println("새는 날 수 있다");
	}
}
public class chap09_02 {
	public static void main(String[] args) {
		Chicken myChicken=new Chicken();
		Bird myBird=new Bird();
		
		myChicken.fly();
		myChicken.walk();
		myBird.fly();
	}
}
