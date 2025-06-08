public class chap11 {
	public static void main(String[] args) {
		int a=0;
		int b=5/a;
	}
}
public class chap11 {
	public static void main(String[] args) {
		try {
			int a=0;
			int b=5/a;
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눕니다.");
		}
		System.out.println("try~catch의 외부문장입니다.");
	}
}
import java.util.Scanner;
public class chap11 {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num1=s.nextInt();
		
		try {
			int num2=10/num1;
			System.out.println(num2);
		}catch(Exception e) {
			System.out.println("올바른 숫자를 입력하세요.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("try~catch의 외부문장입니다.");
	}
}
public class chap11 {
    public static void main(String[] args) {
    	try { 
    		Integer in = new Integer("abc");
    		in.intValue();
    	} 
    	catch(ArithmeticException e) { 
    		System.out.println("예외 발생 ArithmeticException " + e); 
    	} 
    	catch(NumberFormatException e) { 
    		System.out.println("예외 발생  NumberFormatException " + e); 
    	} 
    	System.out.println("try~catch문의 외부 문장입니다."); 
    } 
}
import java.util.*;
public class chap11 {
    public static void main(String[] args) {
    	
    	Scanner s=new Scanner(System.in);
    	System.out.println("숫자를 입력하세요.");
    	int num=s.nextInt();
    	
    	int arr[]=new int[5];
    	
    	try { 
    		arr[num]=10/num;
    	} 
    	catch(ArithmeticException e) {
    		System.out.println("0이 아닌 값을 입력하세요.");
    		System.out.println(e.getMessage());
    	} 
    	catch(ArrayIndexOutOfBoundsException e) { 
    		System.out.println("올바른 배열 인덱스를 입력하세요.");
    		System.out.println(e.getMessage()); 
    	} 
    } 
}
public class chap11 {
    public static void main(String[] args) {
    	int a[] = new int[2]; 
    	try {
    		System.out.println("잘못된 요소에 접근 : "+ a[3] );
    	}
    	catch(Exception e) {
    		System.out.println("예외 발생 ArrayIndexOutOfBoundException " + e);
    	}
    	finally {
    		System.out.println("finally는 항상 실행됩니다.");
    	}
    } 
}
public class chap11 {
    public static void main(String[] args) {
    	int[] arr= {10,20,30}; 
    	
    	try {
    		for(int i=0; i<=3; i++)
    		System.out.println("arr["+i+"]:"+arr[i]);
    	}
    	catch(Exception ex) {
    		System.out.println("예외 처리입니다....");
    		System.out.println(ex.getMessage());
    	}
    	finally {
    		System.out.println("finally는 항상 실행됩니다.");
    	}
    } 
}
public class chap11 {
   static void check() throws ArithmeticException { 
       System.out.println("내부 메서드");
        int div = 5/0;
   }

   public static void main(String[] args) {
	   try {
		   check();
	   }
	   catch(ArithmeticException e) {
		   System.out.println("예외 발생 " + e);
	   }
   	} 
}
import java.util.Scanner;
public class chap11 {
   static void check(int num) throws NumberFormatException { 
       if(num<0)
    	   throw new NumberFormatException("0보다 작습니다.");
       else
    	   System.out.println(num);
   }
   public static void main(String[] args) {
	   Scanner s=new Scanner(System.in);
	   System.out.println("숫자를 입력하세요.");
	   int num=s.nextInt();
	   
	   try {
		   if(num<0)
			   throw new NumberFormatException("0보다 작습니다.");
		   else
			   System.out.println(num);
		   
		   check(num);
	   }
	   catch(NumberFormatException e) {
		   System.out.println("예외 발생 " + e);
	   }
   	} 
}
class MyException extends Exception {
    String str1;  
    MyException(String str2) {
       str1 = str2;
   }  
    public String toString() {
        return ("MyException 발생: "+ str1);
    }
}
public class chap11 {
   public static void main(String[] args) {
 try {
     System.out.println("try 블록입니다.");
     throw new MyException("MyException 클래스 호출됩니다.");
 }
 catch(MyException e) {
      System.out.println("catch 블록입니다.");
       System.out.println(e);
       }
   }
}
class InvalidException extends Exception {
    public InvalidException(String s) {
    	super(s);
    }
}
public class chap11 {
	void check(int weight) throws InvalidException{
		if(weight<100) {
			throw new InvalidException("InvalidException 클래스 호출입니다.");
		}
	}
   public static void main(String[] args) {
	   chap11 obj=new chap11();
	   try {
		   obj.check(60);
	   }catch(InvalidException ex) {
		   System.out.println("예외 처리입니다. ");
		   System.out.println(ex.getMessage());
	   }
   	}
}




