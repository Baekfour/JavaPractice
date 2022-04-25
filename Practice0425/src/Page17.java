
public class Page17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k17_iVal; // k17_iVal을 정수형으로 선언하였다
		for(int k17_i = 0; k17_i < 300; k17_i++) { // for문을 사용하여 k17_i를 0부터 300까지 돌도록 만들었다
			k17_iVal = 5 * k17_i; //k17_iVal을 k17_i에 5를 곱한 값으로 지정하였다
			if(k17_iVal >= 0 && k17_iVal < 10) System.out.printf("일 %d\n", k17_iVal); 
			// k17_iVal이 0보다 크거나 같고 10보다 작을경우 일의자리로 출력하도록 하였다.
			else if(k17_iVal >= 10 && k17_iVal < 100) System.out.printf("십 %d\n", k17_iVal);
			// k17_iVal이 10보다 크거나 같고 100보다 작을경우 십의자리로 출력하도록 하였다.
			else if(k17_iVal >= 100 && k17_iVal < 1000) System.out.printf("백 %d\n", k17_iVal);
			// k17_iVal이 100보다 크거나 같고 1000보다 작을경우 백의자리로 출력하도록 하였다.
			else System.out.printf("천 %d\n", k17_iVal);
			// 그 외의 값은 천에 k17_iVal의 수를 입력하도록 하였다
		}

	}

}
