//package com.section01;
//
//import com.javamaster.mypackage.*;
//public class chap10_1{
//	public static void main(String[] args) {
//		chap10 myCat=new chap10();
//		myCat.eat();
//		myCat.scratch();
//		myCat.meow();
//	}
//
//}
//
//Object 클래스
//package com.section01;
//
//import com.javamaster.mypackage.*;
//public class chap10_1{
//	public static void main(String[] args) {
//		chap10 myCat01=new chap10();
//		chap10 myCat02=new chap10();
//		System.out.println(myCat01.toString());
//		System.out.println(myCat01.toString());
//		System.out.println(myCat01.equals(myCat02));
//		myCat01=myCat02;
//		System.out.println(myCat01.equals(myCat02));
//	}
//}
//package com.section01;
//
//import com.javamaster.mypackage.*;
//public class chap10_1{
//	public static void main(String[] args) {
//		chap10 dog01=new chap10();
//		chap10 dog02=new chap10();
//		System.out.println(dog01.equals(dog02));
//		
//		String str1=dog01.bowwow();
//		String str2=dog02.bowwow();
//		System.out.println(str1.equals(str2));
//	}
//}
//
//Math 클래스
//package com.section01;
//
//public class chap10_1{
//	public static void main(String[] args) {
//System.out.println((int)(Math.random()*100));//랜덤수
//		System.out.println(Math.abs(-10)); //절대값
//		System.out.println(Math.round(4.5)); //반올림
//		System.out.println(Math.sqrt(4.0));//제곱근
//		System.out.println(Math.pow(2,2));//제곱
//		System.out.println(Math.ceil(9.9));//올림
//		System.out.println(Math.floor(9.9));//내림
//		System.out.println(Math.round(9.9));//반올림
//		System.out.println(Math.max(5,100));//최댓깂
//		System.out.println(Math.min(5,100));//최솟값	
//	}
//}
//String 클래스
//package com.section01;
//
//public class chap10_1 {
//     public static void main(String[] args) {
//    	 String str = new String("Java");
//    	 for (int i = 0; i < str.length(); i++) {
//    		 System.out.print(str.charAt(i) + " ");
//    	 	}
//    	 System.out.println("\n");
//    	 System.out.println(str.compareTo("JAVA"));
//    	 System.out.println(str.compareTo("Java"));
//    	 System.out.println(str.compareToIgnoreCase("JAVA"));
//   }
//}
//package com.section01;
//
//public class chap10_1 {
//      public static void main(String[] args) {
//          String str1 = "www.google.com";
//
//          String[] arrStr1;
//
//          arrStr1 = str1.split("\\.");
//
//          for (int i = 0; i < arrStr1.length; i++) {
//               System.out.println(arrStr1[i]);
//          }
//     }
//}
//StringBuffer 클래스
//package com.section01;
//
//public class chap10_1 {
//     public static void main(String[] args) {
//    	 StringBuffer sb = new StringBuffer("Hello ");
//    	 sb.append("Programming");
//    	 System.out.println(sb);
//    	 sb.insert(6,"Java ");
//    	 System.out.println(sb);
//    	 sb.replace(1,4,"Good");
//    	 System.out.println(sb);
//    	 sb.delete(1,5);
//    	 System.out.println(sb);
//    	 sb.reverse();
//    	 System.out.println(sb);
//   } 
//}
//package com.section01;
//
//import java.util.Scanner;
//
//public class chap10_1 {
//     public static void main(String[] args) {
//
//     String str = "";
//
//     Scanner in = new Scanner(System.in);
//
//     System.out.print("입력 문자열 :");
//     str = in.nextLine();
//     
//     int len = str.length();
//     
//     String revStr1 = "";
//     
//        for (int i = len - 1; i >= 0; i--) {
//           revStr1 = revStr1 + str.charAt(i);
//       }
//     
//         System.out.println("String 클래스의 역순 문자열 : " + revStr1);
//         StringBuilder revStr2 = new StringBuilder(str);
//         revStr2.reverse();
//     
//         System.out.println("StringBuilder 클래스의 역순 문자열 : " + revStr2);
//     }
//}
//래퍼 클래스
//package com.section01;
//
//public class chap10_1 {
//    public static void main(String[] args) {
//
//       Integer num1 = 100;
//       Integer num2 = 200;
//       System.out.println("num1 : " + num1);
//       System.out.println("num2 : " + num2);
//
//       String value1 = num1.toString();
//       String value2 = Integer.toString(num1);
//
//       System.out.println("num1.toString(): " + value1);
//       System.out.println("Integer.toString(num2): " + value2);
//    }
//}
//java.util 패키지
//Date 클래스
//package com.section01;
//
//import java.util.Date;
//
//public class chap10_1 {
//    public static void main(String[] args) {
//    	Date date1 = new Date();
//    	System.out.println(date1);
//    	long millis = System.currentTimeMillis();
//    	Date date2 = new Date(millis);
//    	System.out.println(date2);
//   }
//}
//Calendar
//package com.section01;
//
//import java.util.Calendar;
//
//public class chap10_1 {
//      public static void main(String[] args) {
// Calendar calendar = Calendar.getInstance();
// System.out.print("현재 날짜 : ");
// System.out.print(calendar.get(Calendar.YEAR) + "년 ");
// System.out.print(calendar.get(Calendar.MONTH) + 1 + "월 ");
// System.out.print(calendar.get(Calendar.DATE) + "일");
//   }
//}
//Random 클래스
//package com.section01;
//
//import java.util.Random;
//
//public class chap10_1 {
//       public static void main(String[] args) {
//    	   Random random1 = new Random();
//    	   System.out.println("난수 값 : " + random1.nextInt());
//    	   Random random2 = new Random();
//    	   for (int i = 0; i < 10; i++) {
//    		   System.out.print( random2.nextInt(100) + " ");
//	    }
//   }
//}
//java.text 패키지
//DateFormat 클래스
package com.section01;
import java.util.Date;
import java.text.DateFormat;
public class chap10_1 {
   public static void main(String[] args) {
 Date currentDate = new Date();
 System.out.println("현재 날짜 : " + currentDate);
 String dateToStr = DateFormat.getInstance().format(currentDate);
 System.out.println("DateFormat.getInstance(): " + dateToStr);
 dateToStr = DateFormat.getDateInstance().format(currentDate);
 System.out.println("DateFormat.getDateInstance(): " + dateToStr);
 dateToStr = DateFormat.getTimeInstance().format(currentDate);
 System.out.println("DateFormat.getTimeInstance(): " + dateToStr);
 dateToStr = DateFormat.getDateTimeInstance().format(currentDate);
 System.out.println("DateFormat.getDateTimeInstance(): " + dateToStr);
 dateToStr = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(currentDate);
 System.out.println("DateFormat.getTimeInstance(DateFormat.MEDIUM): " + dateToStr);
 dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG , DateFormat.SHORT ).
format(currentDate);
 System.out.println("DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT): " + dateToStr);
   }
}
















