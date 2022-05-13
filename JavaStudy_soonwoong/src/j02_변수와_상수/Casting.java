package j02_변수와_상수;

public class Casting {

	public static void main(String[] args) {


		//업캐스팅(형 변환 생략 가능) 
		//문자 -> 정수 -> 실수 
		char a = 'A';
		System.out.println(a);
		int b = a;
		System.out.println(b);
		double c = b;
		System.out.println(c);

		//다운캐스팅 (형 변환 생략 불가) 
		//실수 -> 정수 -> 문자
		int d = (int) c; 
		System.out.println(d);
		char e = (char) d;
		System.out.println(e);

	}

}
