package code;

public class Page8 {
	
	private static int k17_inVal;
	public static void up(){
		k17_inVal++;
		System.out.printf("�� �׳� �޼ҵ�[%d]\n", k17_inVal);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		k17_inVal = 0; //�ڱ⳻�� ���� ���
		Page7 elev; //Ŭ������ �޾� ��ü�� ����
		
		elev = new Page7(); //�ν��Ͻ��� �����Ͽ� ��ü�� ����
		
		up(); // ���� �ҽ��� �޼ҵ�
		for(int k17_i = 0; k17_i < 10; k17_i++) {
			elev.up(); // Page7Ŭ�������� �� elev ��ü�� up �޼ҵ�
			System.out.printf("MSG[%s]\n", elev.k17_help);
		}
		
		for(int k17_i = 0; k17_i < 10; k17_i++) {
			elev.down();
			System.out.printf("MSG[%s]\n", elev.k17_help);
		}

	}

}
