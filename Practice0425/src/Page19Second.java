
public class Page19Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int k17_i = 1; k17_i < 13; k17_i++) { // k17_i�� 1���� 12���� 1�� �����ϴ� for���� �������.
			System.out.printf(" %d�� =>", k17_i); // k17__i�� 1���� 12���� 1�� �����ϸ� ����Ͽ���.
			for(int k17_j = 1; k17_j < 32; k17_j++) { // k17_j�� 1���� 31���� 1�� �����ϴ� for���� �������.
				System.out.printf("%d", k17_j); // k17_j�� 1���� 31���� 1�� �����Ͽ� ����Ͽ���
				
				if((k17_i == 4 || k17_i == 6 || k17_i == 9 || k17_i == 11) && k17_j == 30) break;
				// k17_i�� 4,6,9,11�϶� k17_j�� 30������ ����ϰ� break�� for���� ������������ �Ͽ���.
				if(k17_i == 2 && k17_j == 28) break; // k17_i�� 2�϶� k17_j�� 28�϶� break������ ���������� �Ͽ���.
			}
			System.out.printf("\n"); //k17_i���� �ѹ� �������� ����ó���� �� �־���.
		}

	}

}
