
public class Page19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int k17_i = 1; k17_i < 13; k17_i++) { //k17_i�� 1���� 12���� 1�� �����ϴ� ���� �ǹ��ϴ� for���� �������.
			System.out.printf(" %d�� =>", k17_i); // for������ k17_i�� 1���� 12���� �ѹ��� ��µȴ�.
			for(int k17_j = 1; k17_j < 32; k17_j++) { // k17_j�� 1���� 31���� ���ư��� for���� for�� �ȿ� �������.
				System.out.printf("%d,", k17_j); // k17_j �� 31���� 1���� 1�� �����ϸ� ����Ѵ�.
				
				if(k17_i == 4 || k17_i == 6 || k17_i == 9 || k17_i == 11 ) {
					if(k17_j == 30) break;
					// k17_i�� 4,6,9,11�϶��� ���������� 30�̱⶧���� 30�� �Ǹ� break������ ������������ �����Ͽ���
				}
				
				if(k17_i == 2) {
					if(k17_j == 28) break;
					//k17_i �� 2�϶��� ���������� 28���̱⶧���� 28�̵Ǹ� ������������ �����Ͽ���.
				}
			}
			System.out.printf("\n"); // k17_i�� �ѹ� �������� ����ó���� �Ͽ���
		}

	}

}
