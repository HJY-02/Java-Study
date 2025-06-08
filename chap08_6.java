class Animal{
	void eat() {
		System.out.println("먹이를 먹다");	
	}
	void animalSound() {
		System.out.println("동물이 소리를 낸다.");	
	}
}
class Pig extends Animal{
	public void animalSound() {
		System.out.println("돼지는 꿀꿀꿀");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("멍멍하고 짖다.");
	}
	public void animalSound() {
		System.out.println("개는 멍멍멍");
	}
}
public class chap08_6 {
	public static void main(String[] args) {
		Animal myAnimal=new Animal();
		Animal myPig=new Pig();
		Animal myDog=new Dog();
		myAnimal.animalSound();
		myPig.animalSound();
//		myDog.bark();
//		Animal 타입으로 취급되므로 Animal 클래스 안에 선언된 애들만 사용가능
//		그래서 애니멀을 Dog myDog...으로 바꾸면 사용가능
		myDog.animalSound();		
	}
}