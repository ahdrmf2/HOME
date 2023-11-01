package HOME;

import java.util.ArrayList;
//임포트로 자바 유틸 ArrayList를 들고와야한다.

public class ArrayList1 {
	
public static void main(String[] args) {
	ArrayList <String> list = new ArrayList <String> ();
	//클래스 <데이터 타입> 변수 = new 클래스 <데이터 타입>
	
	list.add("서울"); list.add("북경"); list.add("상해");
	list.add("서울"); list.add("도쿄"); list.add("뉴욕");
	//추가되는 리스트에 String 데이터 타입만 들어넣어서 오류 없음
	for(int i = 0; i < list.size(); i++) {
		//size는  ArrayList에 저장된 데이터 개수를 반환 6개
		System.out.println(list.get(i));
		//차례대로 데이터 저장  get()메서드는 데이터를 제네릭으로 선언한 타입으로 변환시켜준다.
		//서울 북경 상해 서울 도쿄 뉴욕
		list.add("런"); list.add("로마"); list.add("방콕");
		list.add("북경"); list.add("도쿄"); list.add("서울");	
		System.out.println("1 : " + list.toString());
	}
	}
}
