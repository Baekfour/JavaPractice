
public class Page19Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int k17_i = 1; k17_i < 13; k17_i++) { // k17_i가 1부터 12까지 1씩 증가하는 for문을 만들었다.
			System.out.printf(" %d월 =>", k17_i); // k17__i를 1부터 12까지 1씩 증가하며 출력하였다.
			for(int k17_j = 1; k17_j < 32; k17_j++) { // k17_j는 1부터 31까지 1씩 증가하는 for문을 만들었다.
				System.out.printf("%d", k17_j); // k17_j를 1부터 31까지 1씩 증가하여 출력하였다
				
				if((k17_i == 4 || k17_i == 6 || k17_i == 9 || k17_i == 11) && k17_j == 30) break;
				// k17_i가 4,6,9,11일때 k17_j를 30까지만 출력하고 break로 for문을 빠져나오도록 하였다.
				if(k17_i == 2 && k17_j == 28) break; // k17_i가 2일때 k17_j가 28일때 break문으로 빠져나오게 하였다.
			}
			System.out.printf("\n"); //k17_i문이 한번 돌때마다 개행처리를 해 주었다.
		}

	}

}
