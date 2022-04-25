
public class page21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] k17_iLMD = {31,28,31,30,31,30,31,31,30,31,30,31}; // k17_iLMD를 정수형 배열로 선언하였고 각 항에 해당 월의 마지막일을 입력하였다
		 																		
		for(int k17_i = 1 ; k17_i < 13; k17_i++) { //정수형 k17_i를 1로 선언하였고 12까지 1씩 증가하는 for문을 만들었다.
			System.out.printf(" %d월 =>", k17_i);  // 1부터 12까지 각 월이 출력되도록 입력하였다.
			for(int k17_j = 1; k17_j < 32; k17_j++) { // k17_j를 1로 선언하였고 31까지 1씩 증가하는 반복되는 for문을 만들었다
				
				System.out.printf("%d", k17_j); // 모든 월에 31까지 출력되도록 입력하였다.
				
				if(k17_iLMD[k17_i - 1] == k17_j) break; /* 배열 k17_iLMD의 각 항은 월별 마지막 일이므로 k17_j의 값이1부터 31까지 증가는 도중
				 										k17_iLMD와 같아졌을때 break로 for문에서 빠져나오도록 하였다.
				 										k17_i에 1을 뺴준 이유는 배열은 항상 0부터 시작하기 때문에 k17_i에서 1을 제외해주어야 월별로
				 										제대로 부합한다*/
				
				System.out.printf(",");					/* 각 월 마지막 일에 ','를 입력하여주고 개행한다. 하지만 마지막 일은 break로 for문을
														 빠져나오기 때문에 ','가 기입되지 않는다*/
			}
			System.out.printf("\n");
		}

	}

}
