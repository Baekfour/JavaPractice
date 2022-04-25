
public class Page27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k17_n, k17_m; // 정수형 k17_n과 k17_m을 선언하였다.
		
		k17_m = 20; k17_n = 1; // k17_m은 20, k17_n은 1로 초기화하였다.
		
		while(true) { // while문을 만들었다
			for(int k17_i = 0; k17_i < k17_m; k17_i++) System.out.printf(" "); // k17_i는 0부터 k17_m의 수(20)까지 빈칸으로 출력한다
			for(int k17_i = 0; k17_i < k17_n; k17_i++) System.out.printf("*"); // 빈칸으로 출력한뒤 k17_i는 k17_n의 수만큼 출력한다
			System.out.printf("\n"); // 그 다음 개행처리 한다
			
			k17_m = k17_m -1; // while문이 한번 돌때마다 k17_m은 1씩 작아진다
			k17_n = k17_n+2; // while문이 한번 돌때마다 k17_n은 2씩 커진다
								// while문이 한번씩 돌때마다  k17_m은 1씩 작아지므로 빈칸은 19칸 - 18칸- 17칸 순으로 1씩 작아지며 출력된다
								// 반면 "*"은 2씩 커지므로 별의 개수가 1개 - 3개 - 5개 순으로 커진다. 그러므로 아래와 같이 별의 개수가 증가하며 피라미드 형태로 출력된다 
			
			if (k17_m < 0) break; // k17_m이 0보다 작으면 while문이 끝나므로 k17_m이 0이 되는 20줄까지 출력된다.
									// 마지막에는 빈칸은 없어지고 "*"로만 출력이 되는 것을 알 수 있다.
		}

	}

}
