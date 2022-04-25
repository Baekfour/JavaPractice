
public class page16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k17_il;			// k17_il을 정수형으로 선언하였다.
		double k17_iD; 		// k17_iD를 실수형으로 선언하였다.
		
		k17_il = 10/3;		// 정수형 k17_il은 10/3의 값으로 초기화하였는데 이는 정수형이기때문에 k17_il은 3이 된다
		k17_iD = 10/3.0;	// 실수형 k17_iD는 10/3.0의 값으로 초기화하였다. 실수형이기때문에 k17_iD는 3.33333.. 이 된다 
		
		if(k17_il == k17_iD) System.out.printf("equal\n"); // 정수형 k17_il과 실수형 k17_iD가 같으면 "equal"이라고 출력한다
		else System.out.printf("Not equal [%f][%f]\n", (double)k17_il, k17_iD); // 정수형 k17_il을 실수형으로 변경한 몫 과 실수형 k17_iD가 다르면 
														// "Not equal [k17_il] [k17_iD]를 출력하도록 명령하였다.
														// k17_il과 k17_iD는 각각 3.0000, 3.333333으로 다르므로 else문과 같이 출력된다
		
		if(k17_iD == 3.333333) System.out.printf("equal\n"); // 실수형 k17_iD와 일반 지정값 3.333333 이 같다면 "equal"을 출력하도록 하였다.
		else System.out.printf("Not equal [3.333333][%f]\n",k17_iD); // 두개가 다르다면 " Not equal [3.333333][k17_iD]를 출력하도록 하였다
																	// 두개가 출력상으로는 같게 나오지만 k17_iD는 실제 소수점이 계속되기때문에
																	// 결국은 다른것임을 알 수 있다.
		
		k17_iD = (int)k17_iD; //실수형이었던 k17_iD를 정수형으로 변경하여 주었다.
		if (k17_il == k17_iD) System.out.printf("equal\n"); // 정수형 k17_il과 정수형으로 바꿔준 실수형 k17_iD가 같으면 "equal"을 출력한다
		else System.out.printf("Not equal[%f][%f]\n", (double)k17_il, k17_iD); // 다르다면 k17_il을 실수형으로 바꾸고 k17_iD와 같이 출력한다
																			   // 실수형 3.3333.. 을 정수형으로 바꾸면 소수점이 삭제된다.
																			// 결국은 두개의 수는 같아지므로 equal이 출력된다.
		
		System.out.printf("int로 인쇄[%d][%f]\n", k17_il, k17_iD); /* 값은 같지만 k17_il 은 3으로 출력이 되고
															     	k17_iD는 int형으로 변경을 해도 소수점 이하의 수들이 0으로 바뀌는 것 뿐
																 	3.0과 같이 형태는 유지하게 되므로 %d로는 출력 불가하고 %f형으로 써줘야 한다*/
		
		char k17_a = 'c';		// k17_a를 문자형 'c'로 선언하였다.
		
		if (k17_a == 'b') System.out.printf("a는 b이다\n"); // k17_a가 문자형 'c'이므로 'b'와 같지 않으므로 출력되지 않는다
		if (k17_a == 'c') System.out.printf("a는 c이다\n"); // k17_a는 문자형 'c'이므로 if문에 부합한다. 그리하여 "a는 c이다가 출력된다
		if (k17_a == 'd') System.out.printf("a는 d이다\n"); // k17_a는 문자형 'c'이므로 'd'와 같지 않다. 그러므로 출력되지 않는다
		
		String k17_aa = "abcd"; // k17_aa 는 문자열 "abcd"로 지정한다
		
		if(k17_aa.equals("abcd")) System.out.printf("aa는 abcd이다\n"); // equals문법을 사용하여 k17_aa가 같을때 "aa는 abcd이다"를 출력하도록 하고
		else System.out.printf("aa는 abcd이 아니다\n"); // 아닐경우 "aa는 abcd이 아니다"로 출력하도록 한다. k17_aa는 "abcd"이므로 "aa는 abcd이다"가 출력된다
		
		boolean k17_bb = true; //boolean형을 사용하여 k17_bb는 참이다라고 선언하였다.
		
		if(!!k17_bb) System.out.printf("k17_bb가 아니고 아니면 참이다\n"); // if문을 사용하여 k17_bb가 참이 아닐경우에 "k17_bb가 아니고 아니면 참이다"라고 출력한다
		else System.out.printf("k17_bb가 아니고 아니면 거짓이다\n"); // 반대의 경우 "k17_bb가 아니고 아니면 거짓이다"라고 출력한다
																// k17_bb는 참으로 지정되었고 !!를 사용하여 참이 아니기때문에 "k17_bb가 아니고 아니면 참이다"가 출력된다

	}

}
