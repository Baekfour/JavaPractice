
public class page7 {  // 3.이해하기

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k17_sum = 0;			//정수형 k17_sum 을 0으로 처음에 선언하였다.
		for(int k17_i = 0; k17_i < 10; k17_i++) { // 정수형 k17_i 를 0부터 9까지 1씩 증가하도록 for문을 지정하였다
			k17_sum = k17_sum + k17_i; // k17_sum은 0부터 시작하고 k17_i는 0부터 1씩 증가한다. 
		}							   // 마지막에 k17_sum과 k17_i를 더한것이 한번 돌아갈때의 결과값이다
									   // 마지막 결과값이 처음으로 돌아가고 위와 같은 공식을 k17_i가 9일때까지 계속해서 돌아간다 	
		System.out.printf("k17_sum %d\n", k17_sum); // k17_i 가 9일때까지 돌아가고 마지막까지 더한값을 출력한다
		
		for(int k17_i = 1; k17_i < 10; k17_i++) {	//정수형 k17_i를 1부터 9까지 순차적으로 반복되는 for문을 만들어 준다
			System.out.printf("***********************\n",k17_i); 
			System.out.printf("   구구단 %d 단 \n", k17_i); //k17_i는 구구단의 몇단인지를 알려주는 정수형이다.
			System.out.printf("***********************\n", k17_i);
			for(int k17_j = 1; k17_j < 10; k17_j++) { // k17_j는 1부터 9까지 순차적으로 증가하는 정수형이다 구구단의 뒷자리 수를 의미한다
				System.out.printf(" %d * %d = %d \n", k17_i, k17_j,k17_i * k17_j); // 구구단을 출력하는 식이다.
			}															// k17_i for문 안에 k17_j for문이 포함되어 있다
														//k17_i는 1일때 k17_j는 1부터 9까지 돌아간다 그리고 나서 k17_i가 2일때도 k17_j가 1부터 9까지 돌아간다
														// 결국 구구단이 1단부터 9단까지 총 9개의 수식이 출력된다.
		}

	}

}
