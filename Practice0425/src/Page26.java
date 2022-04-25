
public class Page26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double k17_fSin; // k17_fSin의 값을 실수형으로 선언하였다.
		
		for(int k17_i = 0; k17_i < 360; k17_i++) { // 정수형 k17_i를 0부터 360까지 1씩 증가하는 for문을 생성하였다.
			k17_fSin = Math.sin(k17_i * 3.141592/180); /* k17_fSin 은 1도일때 1*Pi/180에 sin함수를 이용하여 사인값을 구했다.
														for문을 이용하여 360도까지의 사인값을 구할 수 있다*/
			System.out.printf("%d sin ==> %f\n", k17_i, k17_fSin); // 구한 sin값을 출력하면 1도 - 360도 일때까지의 k17_fSin 값이 출력된다
		}
		
		for(int k17_i = 0; k17_i < 360; k17_i++) { //for문을 이용하여 1-360도 일때의 sin값을 구하여
			k17_fSin = Math.sin(k17_i * 3.141592/180); //  k17_fSin 은 1도일때 1*Pi/180에 sin함수를 이용하여 사인값을 구했다.
			
			int k17_iSpace = (int)((1.0 - k17_fSin) * 50); // sin의 위치를 확인할 정수형 k17_iSpace에 (1 - k17_i) * 50을 하고 정수형으로 변경하였다.
			for(int k17_j = 0; k17_j < k17_iSpace; k17_j++) System.out.printf(" "); // k17_iSpace만큼 띄어쓰기를 입력한다
			System.out.printf("*[%f][%d]\n", k17_fSin, k17_iSpace); // 띄어쓰기 후 구했던 sin값을 입력한다
		} // 이는 사인값
		

	}

}

