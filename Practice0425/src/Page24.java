
public class Page24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int k17_i = 0; k17_i < 10; k17_i++) { // 정수형 k17_i를 선언하여 1부터 9까지 1씩 증가하도록 하여 돌아가는 for문을 만들었다
			for(int k17_j = 0; k17_j < k17_i; k17_j++) System.out.printf(" "); // k17_i를 이용한 for문 안에 정수형 k17_j를 1씩 증가시키는 for문을 만들었다.
			System.out.printf("%d\n", k17_i);				// k17_j for문은 k17_i의 수만큼 띄도록 만들었기 때문에 0은 0칸 띄우고 9는 9칸 띄우도록 하였다.
		}

	}

}
