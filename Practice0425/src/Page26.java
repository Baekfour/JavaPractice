
public class Page26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double k17_fSin; // k17_fSin�� ���� �Ǽ������� �����Ͽ���.
		
		for(int k17_i = 0; k17_i < 360; k17_i++) { // ������ k17_i�� 0���� 360���� 1�� �����ϴ� for���� �����Ͽ���.
			k17_fSin = Math.sin(k17_i * 3.141592/180); /* k17_fSin �� 1���϶� 1*Pi/180�� sin�Լ��� �̿��Ͽ� ���ΰ��� ���ߴ�.
														for���� �̿��Ͽ� 360�������� ���ΰ��� ���� �� �ִ�*/
			System.out.printf("%d sin ==> %f\n", k17_i, k17_fSin); // ���� sin���� ����ϸ� 1�� - 360�� �϶������� k17_fSin ���� ��µȴ�
		}
		
		for(int k17_i = 0; k17_i < 360; k17_i++) { //for���� �̿��Ͽ� 1-360�� �϶��� sin���� ���Ͽ�
			k17_fSin = Math.sin(k17_i * 3.141592/180); //  k17_fSin �� 1���϶� 1*Pi/180�� sin�Լ��� �̿��Ͽ� ���ΰ��� ���ߴ�.
			
			int k17_iSpace = (int)((1.0 - k17_fSin) * 50); // sin�� ��ġ�� Ȯ���� ������ k17_iSpace�� (1 - k17_i) * 50�� �ϰ� ���������� �����Ͽ���.
			for(int k17_j = 0; k17_j < k17_iSpace; k17_j++) System.out.printf(" "); // k17_iSpace��ŭ ���⸦ �Է��Ѵ�
			System.out.printf("*[%f][%d]\n", k17_fSin, k17_iSpace); // ���� �� ���ߴ� sin���� �Է��Ѵ�
		} // �̴� ���ΰ�
		

	}

}

