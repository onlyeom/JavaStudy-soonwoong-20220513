package j02_변수와_상수;

public class MyInfo {

	public static void main(String[] args) {
		/*
		 * 1.문제
		 * name1, name2, name3
		 * age
		 * phone
		 * address
		 * 
		 * 이름: 김준일 
		 * 나이: 29
		 * 연락처: 010-9988-1916
		 * 주소: 부산 동래구 사직동
		 */
		
		char name1 = '염';
		char name2 = '순';
		char name3 = '웅';
		
		int age = 34;
		
		String phone = "010-6369-0401";
		String address = "부산 금정구 구서동";
		
		System.out.println("이름: " + name1 + name2 + name3);
		System.out.println("나이: " + age);
		System.out.println("연락처: " + phone);
		System.out.println("주소: " + address);
	}

}
