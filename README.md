■**예외와 예외 처리**

- 예외
    - 프로그램의 정상적인 흐름을 방해하는 원치 않는 이벤트
    - 비정상적인 상태인 예외가 발생하면 프로그램의 실행이 종료되고 시스템 생성 오류 메시지가 나타냄

```java
public class chap11 {
	public static void main(String[] args) {
		int a=0;
		int b=5/a;
	}
}
```

```java
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at chap11.main(chap11.java:4)
	  클래스명 메서드명 파일명   행번호
```

## 👣예외의 유형

- 컴파일 예외
    - 컴파일러가 컴파일 시간에 확인하는 검사형 예외(checked exception)
    - 메서드 내부에 확인된 예외가 있는 경우 메서드는 예외를 처리하거나 throw 키워드를 사용하여 예외를 처리할 수 있음
    - 주요 컴파일 예외 클래스
        - IOException
        - ClassNotFoundException
        - SQLException
        - InterruptedException
- 런타임 예외
    - 런타임에 발생하는 비검사형 예외(unchecked exception)
    - 예외를 처리할 지 말지가 전적으로 프로그래머에게 달려 있음
    - 주요 런타임 예외 클래스
        - ArithmeticException
        - NumberFormatException
        - ArrayIndexOutOfBoundsException
- Exception클래스의 주요 메서드
    - getMessage()
    - toString()
    - printStackTrace()
    - getCause()

## ✍️**예외 처리를 위한 키워드**

- 자바에서 예외를 처리하는 데 사용하는 키워드
    - try, catch, finally, throw, throws
