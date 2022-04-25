
public class page15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k17_iA, k17_iB;  // k17_iA 와 k17_iB를 정수형으로 선언하여 주었다.
		
		k17_iA = 0;  // 정수 k17_iA를 0으로 초기화하였다.
		while(true) { //while문을 사용하여 반복문을 사용하였다.
			
			k17_iB = 0; // while안에 정수 k17_iB를 0으로 초기화하여 while문안에서 시작할때 0부터 시작하도록 하였다.
			while(true) { // while문 안에 while문을 사용하여 이중으로 반복문이 돌아갈 수 있도록 하였다.
				System.out.printf("*"); // "*"을 출력하도록 하였다
				
				if(k17_iA == k17_iB) break; // k17_iA가 k17_iB가 같은 수일때 break를 사용하여 while문을 빠져나오도록 지정하였다
				k17_iB++; // while문 안에서 k17_iB가 1씩 증가하도록 지정하였다.
			}
			System.out.printf("\n"); // k17_iA와 k17_iB가 같아져서 마지막 while문을 빠져나오게 되면 개행이 되도록 처리하였다.
			k17_iA++; // 한줄이 개행이 되면 k17_iA가 1씩 증가하도록 처리하였다.
			if(k17_iA == 30) break; // 17_iA가 1씩 증가하여 30이 되었을때 break를 사용하여 첫 while문을 빠져나오도록 처리하였다.
		}							// 결국 17_iA가 0일때 *이 하나 출력되고 17_iB도 0으로 같으므로 개행처리가 된다 
									// 그 다음 k17_iA가 1이므로 k17_iB는 0부터 1까지 두번 돌아야 k17_iA와 k17_iB가 같아지므로 "*"을 두번 찍게된다
									// 그렇게 i가 30일때까지 31번동안 출력이 되고 "*"의 출력 갯수는 1개씩 늘어나 마지막에는 "*"이 31개 출력되고
	} 								// while문이 마무리된다

}
