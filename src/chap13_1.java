import java.util.LinkedList;

public class chap13_1 {
	public static void main(String[] args) {
		
		LinkedList<String> cats = new LinkedList<String>();
		 cats.add("러시안블루");
		 cats.addFirst("페르시안");
		 cats.addLast("래그돌");
		 System.out.println(cats);
		cats.add(1, "샴"); 
		 System.out.println(cats);
		 
		 cats.set(2, "코리안쇼트헤어"); 
		 System.out.println(cats);
		 
		 cats.removeFirst(); 
		 cats.removeLast(); 
		 System.out.println(cats);
		 cats.remove(1); 
		 System.out.println(cats);
		 System.out.println(cats.size()); 
		 System.out.println(cats.get(0)); 
		 System.out.println(cats.contains("샴")); 
		 System.out.println(cats.indexOf("샴")); 

	}
}

import java.util.Collections;
import java.util.LinkedList;
public class chap13_1 {
    public static void main(String[] args) {
    	LinkedList<Integer> num = new LinkedList<Integer>();
    	
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
