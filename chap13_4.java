//import java.util.HashMap;
//import java.util.Iterator;
//public class chap13_4 {
//    public static void main(String[] args) {
//    	HashMap<Integer, String> cats = new HashMap<Integer, String>();
//    	cats.put(1, "페르시안");
//    	cats.put(2, "샴");
//    	System.out.println(cats);
//    	cats.put(3, "러시안블루");
//    	System.out.println(cats);
//    	cats.put(3, "래그돌");
//    	System.out.println(cats);
//    	cats.remove(1);
//    	System.out.println(cats);
//    	System.out.println(cats.size());
//    	System.out.println(cats.get(2));
//    	System.out.print("(Key, Value) =");
//    	Iterator<Integer> keys = cats.keySet().iterator();
//    	while (keys.hasNext()) {
//    		int key = keys.next();
//    		System.out.print(" (" + key + ", " + cats.get(key) + ") ");
//        }
//   }
//}
//import java.util.HashMap;
//import java.util.Map.Entry;;
//
//public class chap13_4{
//	public static void main(String[] args) {
//		HashMap<Integer, String> str=new HashMap<Integer, String>();
//		
//		str.put(1, "A");
//		str.put(2, "B");
//		str.put(3, "C");
//		
//		System.out.println(str);
//		
//		System.out.print("Keys: ");
//		for(Integer key : str.keySet()) {
//			System.out.print(key);
//			System.out.print(", ");
//		}
//		System.out.println();
//		System.out.print("Values: ");
//		for (String value: str.values()) {
//			System.out.print(value);
//			System.out.print(", ");
//		}
//		System.out.println();
//		System.out.print("Keys=Values: ");
//		for (Entry<Integer, String>entry:str.entrySet()) {
//			System.out.print(entry);
//			System.out.print(", ");
//		}
//	}
//}
import java.util.TreeMap;
import java.util.Iterator;

public class chap13_4{
	public static void main(String[] args) {
		TreeMap<Integer, String> cats=new TreeMap<Integer, String>();
		
		cats.put(7, "페르시안");
		cats.put(3, "러시안블루");
		System.out.println(cats);
		cats.put(5, "샴");
		System.out.println(cats);
		cats.replace(3,"래그돌");
		System.out.println(cats);
		cats.remove(5);
		System.out.println(cats);
		System.out.println(cats.size());
		System.out.println(cats.get(7));
		System.out.print("(Keys,Values)= ");
		Iterator<Integer> keys=cats.keySet().iterator();
		while(keys.hasNext()) {
			int key=keys.next();
			System.out.print(" (" + key + ", " + cats.get(key) + ") ");
		}
	}
}

