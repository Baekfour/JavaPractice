
public class Page18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int k17_i = 1; k17_i < 13; k17_i++ ) { // k17_i 를 1부터 12까지 1씩 증가하는 for문을 만들었다
			System.out.printf("%d월 =>", k17_i); // k17_i는 월을 의미하게 되고 출력을 하게 하였다. 
			for(int k17_j = 1; k17_j <32; k17_j++) { // k17_i for문 안에 k17_j가 1부터 31까지 1씩 증가하는 for문을 만들었다
				
				System.out.printf("%d,", k17_j); // k17_을 k17_i가 한번 돌때마다 31까지 출력하도록 설정하였다.
				
				if(k17_i == 1 && k17_j == 31) break; // 1월을 31일까지이므로 31이 되면 break로 for문을 빠져나오게 만들었다.
				if(k17_i == 2 && k17_j == 28) break; // 2월을 28일까지이므로 28이 되면 break로 for문을 빠져나오게 만들었다.
				if(k17_i == 3 && k17_j == 31) break; // 3월을 31일까지이므로 31이 되면 break로 for문을 빠져나오게 만들었다.
				if(k17_i == 4 && k17_j == 30) break; // 4월을 30일까지이므로 30이 되면 break로 for문을 빠져나오게 만들었다.
				if(k17_i == 5 && k17_j == 31) break; // 5월을 31일까지이므로 31이 되면 break로 for문을 빠져나오게 만들었다.
				if(k17_i == 6 && k17_j == 30) break; // 6월을 30일까지이므로 30이 되면 break로 for문을 빠져나오게 만들었다.
				if(k17_i == 7 && k17_j == 31) break; // 7월을 31일까지이므로 31이 되면 break로 for문을 빠져나오게 만들었다.
				if(k17_i == 8 && k17_j == 31) break; // 8월을 31일까지이므로 31이 되면 break로 for문을 빠져나오게 만들었다.
				if(k17_i == 9 && k17_j == 30) break; // 9월을 30일까지이므로 30이 되면 break로 for문을 빠져나오게 만들었다.
				if(k17_i == 10 && k17_j == 31) break; // 10월을 31일까지이므로 31이 되면 break로 for문을 빠져나오게 만들었다.
				if(k17_i == 11 && k17_j == 30) break; // 11월을 30일까지이므로 30이 되면 break로 for문을 빠져나오게 만들었다.
				if(k17_i == 12 && k17_j == 31) break; // 12월을 31일까지이므로 31이 되면 break로 for문을 빠져나오게 만들었다.
			}
			System.out.printf("\n"); // k17_i가 한바퀴 돌때마다 개행처리를 하였다. 위와같이 하면 마지막에 ','로 끝나기 때문에 
									// 보기에 좋지않게 마무리된다
		}

	}

}
