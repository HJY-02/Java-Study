import java.io.File;
import java.io.IOException;//입출력에서 예외가 있을 경우

public class chap12 {
	public static void main(String[] args) {
		File fileObj=new File("example01.txt");
		try {
			boolean success=fileObj.createNewFile();
			if(success) {
				System.out.println("파일 생성 성공");//처음 파일을 만들 때
			}
			else {
				System.out.println("파일 생성 실패");//이미 파일이 있는 경우
			}
		}catch(IOException e) {//예외가 발생했을 경우
			System.out.println(e);
		}
	}
}
import java.io.File;

public class chap12 {
	public static void main(String[] args) {
		File finfo=new File("C:\\JavaStudy\\chap12\\example01.txt");
		
		if(finfo.exists()) {
			System.out.println("파일의 이름: "+finfo.getName());
			System.out.println("파일의 경로: "+finfo.getAbsolutePath());
			System.out.println("파일 쓰기가 가능한가?: "+finfo.canWrite());
			System.out.println("파일 읽기가 가능한가?: "+finfo.canRead());
			System.out.println("파일의 이름: "+finfo.length());
		}else {
			System.out.println("존재하는 파일이 아닙니다.");
		}
	}
}
import java.io.File;

public class chap12 {
	public static void main(String[] args) {
		File finfo=new File("C:\\JavaStudy\\chap12\\example01.txt");
		
		if(finfo.exists()) {
			System.out.println("파일의 이름: "+finfo.getName());
			System.out.println("파일의 경로: "+finfo.getAbsolutePath());
			System.out.println("파일 쓰기가 가능한가?: "+finfo.canWrite());
			System.out.println("파일 읽기가 가능한가?: "+finfo.canRead());
			System.out.println("파일의 이름: "+finfo.length());
		}else {
			System.out.println("존재하는 파일이 아닙니다.");
		}
	}
}
import java.io.File;
import java.io.FileOutputStream;

public class chap12 {
	public static void main(String[] args) {
		String str="Hello! Java Programming";
		try {
			File file=new File("example02.txt");
			if(!file.exists())
				file.createNewFile();
			
			FileOutputStream fos=new FileOutputStream(file);
			
			byte[] b=str.getBytes();
			fos.write(b);
			fos.close();
			System.out.println("파일 쓰기 성공");
		}catch(Exception e) {
			e.getMessage();
			}
	}
}
import java.io.File;
import java.io.FileOutputStream;

public class chap12 {
	public static void main(String[] args) {
		File file=new File("gugudan.txt");
		try {
			if(!file.exists())
				file.createNewFile();
			
			FileOutputStream fos=new FileOutputStream(file); 
			for (int x=2; x<=9; x++) {
				for(int y=1; y<=9; y++) {
					String str=x+"X"+y+"="+(x*y)+"\n";
					byte[] b=str.getBytes();
					fos.write(b);
				}
			}
			
		}catch(Exception e) {
			e.getMessage();
			}
	}
}
import java.io.File;
import java.io.FileWriter;

public class chap12 {
	public static void main(String[] args) {
		try {
			File file=new File("example03.txt");
			if(!file.exists())
				file.createNewFile();
			
			FileWriter myWriter=new FileWriter(file); 
			
			myWriter.write("Hello!!\n");
			myWriter.write("Java Programmin");
			myWriter.close();
			System.out.println("파일 쓰기 성공");
		}catch(Exception e) {
			e.getMessage();
			}
	}
}
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class chap12 {
	public static void main(String[] args) {
		File file=new File("member.txt");
		try {
			if(!file.exists())
				file.createNewFile();
			
			FileWriter fw=new FileWriter(file); 
			Scanner input=new Scanner(System.in);
			
			boolean quit=false;
			while(!quit) {
				System.out.print("아이디: ");
				String userID=input.next();
				fw.write("아이디: "+userID+" ");
				
				System.out.print("이름: ");
				String userName=input.next();
				fw.write("이름: "+userName+" ");
				
				System.out.println("계속 진행? Y|N ");
				input=new Scanner(System.in);
				String str=input.nextLine();
				
				if(str.toUpperCase().equals("N"))
					quit=true;
			}
			fw.close();
			System.out.println("파일 쓰기 성공");
		}catch(Exception e) {
			e.getMessage();
			}
	}
}
import java.io.File;
import java.io.FileInputStream;
public class chap12 {
public static void main(String[] args) {
 
    try {
    	File file = new File("example03.txt");
    	if (!file.exists()) 
    		file.createNewFile();
 
    	FileInputStream fis = new FileInputStream(file); 
    	int i = 0;
 
    	while ((i=fis.read())!= -1) { 
    		System.out.print((char)i); 
    	}
    	fis.close();
    	System.out.println("\n파일 읽기 성공"); 
    } catch(Exception e) {
    	System.out.println(e);
    } 
  }
}
import java.io.File;
import java.io.FileInputStream;
public class chap12 {
public static void main(String[] args) {

	File file = new File("gugudan.txt");
    try {
    	if (!file.exists()) 
    		file.createNewFile();
 
    	FileInputStream fis = new FileInputStream(file); 
    	int i = 0;
 
    	while ((i=fis.read())!= -1) { 
    		System.out.print((char)i); 
    	}
    	fis.close();
    	System.out.println("\n파일 읽기 성공"); 
    } catch(Exception e) {
    	System.out.println(e);
    } 
  }
}
import java.io.File;
import java.io.FileReader;
public class chap12 {
    public static void main(String[] args) {
try {
    File file = new File("example03.txt");
    if (!file.exists())
        file.createNewFile();
    FileReader fis = new FileReader(file);
    int i = 0;
    while ((i = fis.read()) != -1) {
       System.out.print((char) i);
    }
   fis.close();
   System.out.println("\n파일 읽기 성공");
      } catch(Exception e) {
 System.out.println(e);
     }
   }
}
import java.io.File;
import java.io.FileReader;
public class chap12 {
    public static void main(String[] args) {
    	File file = new File("member.txt");
    	try {
    		if (!file.exists())
    			file.createNewFile();
    	FileReader fis = new FileReader(file);
    	int i = 0;
    	while ((i = fis.read()) != -1) {
    		System.out.print((char) i);
    	}
    	fis.close();
   System.out.println("\n파일 읽기 성공");
      } catch(Exception e) {
 System.out.println(e);
     }
   }
}
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
public class chap12 {
    public static void main(String[] args) {
 try {
     File file = new File("example03.txt");
     if (!file.exists())
         file.createNewFile();
     FileReader fis = new FileReader(file);
     BufferedReader br = new BufferedReader(fis);
     String str;
     while ((str = br.readLine()) != null) {
         System.out.println(str);
     }
    fis.close();
    System.out.println("파일 읽기 성공");
 } catch(Exception e) {
     System.out.println(e);
        }
    }
}
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
public class chap12 {
    public static void main(String[] args) {
 try {
     File file = new File("member.txt");
     if (!file.exists())
         file.createNewFile();
     FileReader fis = new FileReader(file);
     BufferedReader br = new BufferedReader(fis);
     String str;
     while ((str = br.readLine()) != null) {
         System.out.println(str);
     }
    fis.close();
    System.out.println("파일 읽기 성공");
 } catch(Exception e) {
     System.out.println(e);
        }
    }
}

