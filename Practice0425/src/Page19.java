
public class Page19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int k17_i = 1; k17_i < 13; k17_i++) { //k17_i는 1부터 12까지 1씩 증가하는 월을 의미하는 for문을 만들었다.
			System.out.printf(" %d월 =>", k17_i); // for문에서 k17_i가 1부터 12까지 한번씩 출력된다.
			for(int k17_j = 1; k17_j < 32; k17_j++) { // k17_j가 1부터 31까지 돌아가는 for문을 for문 안에 만들었다.
				System.out.printf("%d,", k17_j); // k17_j 를 31까지 1부터 1씩 증가하며 출력한다.
				
				if(k17_i == 4 || k17_i == 6 || k17_i == 9 || k17_i == 11 ) {
					if(k17_j == 30) break;
					// k17_i가 4,6,9,11일때는 마지막일이 30이기때문에 30이 되면 break문으로 빠져나오도록 설정하였다
				}
				
				if(k17_i == 2) {
					if(k17_j == 28) break;
					//k17_i 가 2일때는 마지막일이 28일이기때문에 28이되면 빠져나오도록 설정하였다.
				}
			}
			System.out.printf("\n"); // k17_i가 한번 돌때마다 개행처리를 하였다
		}

	}

}
