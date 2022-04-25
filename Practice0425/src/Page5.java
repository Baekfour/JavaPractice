
public class Page5 {

	public static void main(String[] args) { // switch/case 문 예제
		// TODO Auto-generated method stub
		String jumin = "123456-1234567"; //jumin이라는 문자열을 "123456-1234567"로 선언하였다
		switch (jumin.charAt(7)) { // charAt을 사용하여 jumin의 7번째(0부터시작이므로 처음부터 8번째) 문자를 지정한다
			case '1' : // 7번째문자가 1일때 "20세기전 태어난 남자 사람"을 출력한다  break;문으로 switch/case문을 마무리한다
				System.out.printf("20세기전 태어난 남자 사람\n");
				break;
			case '2' : // 7번째문자가 1일때 "20세기전 태어난 여자 사람"을 출력한다  break;문으로 switch/case문을 마무리한다
				System.out.printf("20세기전 태어난 여자 사람\n");
				break;
			case '3' : // 7번째문자가 1일때 "20세기후 태어난 남자 사람"을 출력한다  break;문으로 switch/case문을 마무리한다
				System.out.printf("20세기후 태어난 남자 사람\n");
				break;
			case '4' :// 7번째문자가 1일때 "20세기후 태어난 여자 사람"을 출력한다  break;문으로 switch/case문을 마무리한다
				System.out.printf("20세기후 태어난 여자 사람\n");
				break;
		}
	}
}
