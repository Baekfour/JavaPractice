
public class Page20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int k17_i = 1; k17_i <13; k17_i++) { // k17_i�� 1���� 12���� 1�� �����ϴ� for���� �������.
			System.out.printf(" %d�� =>", k17_i); // k17_i�� 1���� 12���� ����Ͽ���.
			Loop: for(int k17_j = 1; k17_j < 32; k17_j++) { // Loop�� for�� ������ �����Ͽ� ���߿� �ʿ��ϸ� �̰����� �̵��ϵ��� �����Ͽ���
													// ���Ŀ� k17_j�� 1���� 31���� 1�� �����ϴ� for���� �������
				System.out.printf("%d,", k17_j); // k17_j�� 1���� 31���� ����Ͽ���
				
				switch(k17_i) { // switch���� �����Ͽ� ����ó���� �غ��Ͽ���
				case 4: case 6: case 9: case 11: // k17_i �� 4,6,9,11�϶� 30���� ����ϰ� break�� switch���� ����������
					if(k17_j == 30) break Loop; // Loop���� ����Ͽ� ���� �����ߴ� Loop �� �̵��ϵ��� �Ͽ���.
					break;
				case 2: 
					if(k17_j == 28) break Loop; // k17_i�� 2�̰� k17_j�� 28�϶� Loop������ �̵���Ű�� break�� �������Դ�.
					break;
				}
			}
			System.out.printf("\n"); // k17_i���� ���������� ����ó���� �Ͽ���.
		}

	}

}
