//다단계 상속
class GrandFather {
	void printGrandFather() {
		System.out.println("나는 할아버지입니다.");
	}
}
class SubFather extends GrandFather {
	String familyName="프로그래머";
	String houseAddress="인천";
	
	void printFather() {
		System.out.println("나는 아버지입니다! 나는 할아버지로부터 상속받았습니다.");
	}	
}
class SubSon extends SubFather{
	void printSon() {
		System.out.println("나는 아들입니다.");
		System.out.println("나는 아버지로부터 상속받습니다.");
		System.out.println("나의 아버지는 "+this.familyName);
		System.out.println("나의 집은 "+this.houseAddress);
	}
} 
public class chap08_3{
      public static void main(String[] args) {
    	  SubSon obj=new SubSon();
    	  obj.printSon();
    	  obj.printFather();
    	  obj.printGrandFather();
    }
}