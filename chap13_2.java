//import java.util.Vector;
//public class chap13_2 {
//    public static void main(String[] args) {
//    	Vector<String> cats = new Vector<String>();
//    	cats.add("페르시안");
//    	cats.add(null);
//    	System.out.println(cats);
//    	cats.add(1, "샴");
//    	System.out.println(cats);
//    	cats.set(2, "러시안블루");
//    	System.out.println(cats);
//    	cats.remove("페르시안");
//    	System.out.println(cats);
//    	cats.remove(1);
//    	System.out.println(cats);
//    	System.out.println(cats.size());
//    	System.out.println(cats.get(0));
//    	System.out.println(cats.contains("샴"));
//    	System.out.println(cats.indexOf("샴"));
//   }
//}
import java.util.Collections;
import java.util.Vector;
public class chap13_2 {
    public static void main(String[] args) {
    	Vector<Integer> num = new Vector<Integer>();
    	
    	for(int i=10; i>=1; i--)
    		num.add(i);
    	
    	System.out.println(num);
    	
    	System.out.print("정렬 전: ");
    	for(int i=0; i<num.size(); i++)
    		System.out.print(num.get(i)+" ");
    	
    	Collections.sort(num);

    	System.out.println();
    	System.out.print("정렬 후: ");
    	for(int i=0; i<num.size(); i++) {
    		System.out.print(num.get(i)+" ");
    	}
    }
}
