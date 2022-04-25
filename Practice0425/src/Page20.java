
public class Page20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int k17_i = 1; k17_i <13; k17_i++) { // k17_i가 1부터 12까지 1씩 증가하는 for문을 만들었다.
			System.out.printf(" %d월 =>", k17_i); // k17_i를 1부터 12까지 출력하였다.
			Loop: for(int k17_j = 1; k17_j < 32; k17_j++) { // Loop를 for문 전으로 지정하여 나중에 필요하면 이곳으로 이동하도록 설정하였다
													// 이후에 k17_j가 1부터 31까지 1씩 증가하는 for문을 만들었다
				System.out.printf("%d,", k17_j); // k17_j를 1부터 31까지 출력하였다
				
				switch(k17_i) { // switch문을 설정하여 예외처리를 준비하였다
				case 4: case 6: case 9: case 11: // k17_i 가 4,6,9,11일때 30까지 출력하고 break로 switch문을 빠져나오고
					if(k17_j == 30) break Loop; // Loop문을 사용하여 위에 설정했던 Loop 로 이동하도록 하였다.
					break;
				case 2: 
					if(k17_j == 28) break Loop; // k17_i가 2이고 k17_j가 28일때 Loop문으로 이동시키고 break로 빠져나왔다.
					break;
				}
			}
			System.out.printf("\n"); // k17_i문이 끝날때마다 개행처리를 하였다.
		}

	}

}
