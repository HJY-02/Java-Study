//import java.util.HashSet;
//public class chap13_3 {
//    public static void main(String[] args) {
//    	HashSet<String> cats = new HashSet<String>();
//    	cats.add("페르시안");
//		cats.add("아브라카브라");
//    	cats.add("샴");
//    	System.out.println(cats);
//    	cats.add("러시안블루");
//    	System.out.println(cats);
//    	cats.remove("페르시안");
//    	System.out.println(cats);
//    	System.out.println(cats.size());
//    	System.out.println(cats.contains("샴"));
//    }
//}
//import java.util.HashSet;
//public class chap13_3 {
//    public static void main(String[] args) {
//    	HashSet<String> str = new HashSet<String>();
//    	
//    	str.add("A");
//    	str.add("B");
//    	str.add("C");
//    	System.out.println(str);
//    	
//    	System.out.print("HashSet 요소: ");
//    	for (String elements : str)
//    		System.out.print(elements+" ");
//    	
//    	String[] array=new String[str.size()];
//    	str.toArray(array);
//    	
//    	System.out.println();
//    	System.out.print("Array 요소: ");
//    	for(int i=0; i<array.length; i++)
//    		System.out.print(array[i]+" ");
//    }
//}
//import java.util.TreeSet;//자동으로 오름차순 정렬
//public class chap13_3 {
//   public static void main(String[] args) {
//	   TreeSet<String> cats = new TreeSet<String>();
//	   cats.add("페르시안");
//	   cats.add("러시안블루");
//	   System.out.println(cats);
//	   cats.add("샴");
//	   System.out.println(cats); 
//	   cats.remove("페르시안"); 
//	   System.out.println(cats); 
//	   System.out.println(cats.size());  
//	   System.out.println(cats.contains("샴")); 
//	   System.out.println(cats.first()); 
//	   System.out.println(cats.last()); 
//   } 
//}
import java.util.TreeSet;
public class chap13_3 {
    public static void main(String[] args) {
    	TreeSet<String> str = new TreeSet<String>();
    	
    	str.add("A");
    	str.add("B");
    	str.add("C");
    	System.out.println(str);
    	
    	System.out.print("TreeSet 요소: ");
    	for (String elements : str)
    		System.out.print(elements+" ");
    	
    	String[] array=new String[str.size()];
    	str.toArray(array);
    	
    	System.out.println();
    	System.out.print("Array 요소: ");
    	for(int i=0; i<array.length; i++)
    		System.out.print(array[i]+" ");
    }
}
