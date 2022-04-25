import java.text.DecimalFormat;

public class Page28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String k17_item = "사과"; // k17_item 문자열을 "사과"로 선언하였다.
		int k17_unit_price = 5000; // k17_unit_price 를 정수형으로 선언하여 개당 가격을 5000원으로 지정하였다.
		int k17_num = 500; 	// 정수형 k17_num을 500으로 선언하였다(개수)
		int k17_total = 0;  // 정수형 k17_total을 0으로 초기화하였다.
		
		DecimalFormat df = new DecimalFormat("###,###,###,###,###"); // DecimalFormat Class를 사용하여 숫자 세자리당 ','를 찍어준다
		
		System.out.printf("======================================================\n");
		System.out.printf("%20.20s%8.8s%8.8s%8.8s\n", "품목", "단가", "수량", "합계"); 
		//출력하는 문자열"품목"에서 20칸을 배당하여 20개의 문자를 입력할 수 있고, "단가","수량","합계" 는  8자리를 배당하여 8개의 문자를 입력할 수 있게 지정하였다.
		System.out.printf("======================================================\n");
		
		System.out.printf("%20.20s%10.10s%8.8s%10.10s\n",
				k17_item,df.format(k17_unit_price), df.format(k17_num), df.format(k17_unit_price * k17_num));
		/* 문자열 k17_item에 20칸을 배당하여 20개의 문자를 입력할 수 있게 하였고, DecimalFormat을 이용한 인스턴스 df를 이용하여 df.format(k17_unit_price),
		 *  df.format(k17_num),df.format(k17_unit_price * k17_num) 형식으로 세자리 수마다 ','를 찍도록 하였다. 
		 각 위치마다 10개의 문자열을 입력할 수 있도록 하였다. */
		 
		 
		System.out.printf("======================================================\n");
	}

}
