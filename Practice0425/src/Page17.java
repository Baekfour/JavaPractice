
public class Page17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k17_iVal; // k17_iVal�� ���������� �����Ͽ���
		for(int k17_i = 0; k17_i < 300; k17_i++) { // for���� ����Ͽ� k17_i�� 0���� 300���� ������ �������
			k17_iVal = 5 * k17_i; //k17_iVal�� k17_i�� 5�� ���� ������ �����Ͽ���
			if(k17_iVal >= 0 && k17_iVal < 10) System.out.printf("�� %d\n", k17_iVal); 
			// k17_iVal�� 0���� ũ�ų� ���� 10���� ������� �����ڸ��� ����ϵ��� �Ͽ���.
			else if(k17_iVal >= 10 && k17_iVal < 100) System.out.printf("�� %d\n", k17_iVal);
			// k17_iVal�� 10���� ũ�ų� ���� 100���� ������� �����ڸ��� ����ϵ��� �Ͽ���.
			else if(k17_iVal >= 100 && k17_iVal < 1000) System.out.printf("�� %d\n", k17_iVal);
			// k17_iVal�� 100���� ũ�ų� ���� 1000���� ������� �����ڸ��� ����ϵ��� �Ͽ���.
			else System.out.printf("õ %d\n", k17_iVal);
			// �� ���� ���� õ�� k17_iVal�� ���� �Է��ϵ��� �Ͽ���
		}

	}

}
