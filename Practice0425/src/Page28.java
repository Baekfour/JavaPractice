import java.text.DecimalFormat;

public class Page28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String k17_item = "���"; // k17_item ���ڿ��� "���"�� �����Ͽ���.
		int k17_unit_price = 5000; // k17_unit_price �� ���������� �����Ͽ� ���� ������ 5000������ �����Ͽ���.
		int k17_num = 500; 	// ������ k17_num�� 500���� �����Ͽ���(����)
		int k17_total = 0;  // ������ k17_total�� 0���� �ʱ�ȭ�Ͽ���.
		
		DecimalFormat df = new DecimalFormat("###,###,###,###,###"); // DecimalFormat Class�� ����Ͽ� ���� ���ڸ��� ','�� ����ش�
		
		System.out.printf("======================================================\n");
		System.out.printf("%20.20s%8.8s%8.8s%8.8s\n", "ǰ��", "�ܰ�", "����", "�հ�"); 
		//����ϴ� ���ڿ�"ǰ��"���� 20ĭ�� ����Ͽ� 20���� ���ڸ� �Է��� �� �ְ�, "�ܰ�","����","�հ�" ��  8�ڸ��� ����Ͽ� 8���� ���ڸ� �Է��� �� �ְ� �����Ͽ���.
		System.out.printf("======================================================\n");
		
		System.out.printf("%20.20s%10.10s%8.8s%10.10s\n",
				k17_item,df.format(k17_unit_price), df.format(k17_num), df.format(k17_unit_price * k17_num));
		/* ���ڿ� k17_item�� 20ĭ�� ����Ͽ� 20���� ���ڸ� �Է��� �� �ְ� �Ͽ���, DecimalFormat�� �̿��� �ν��Ͻ� df�� �̿��Ͽ� df.format(k17_unit_price),
		 *  df.format(k17_num),df.format(k17_unit_price * k17_num) �������� ���ڸ� ������ ','�� �ﵵ�� �Ͽ���. 
		 �� ��ġ���� 10���� ���ڿ��� �Է��� �� �ֵ��� �Ͽ���. */
		 
		 
		System.out.printf("======================================================\n");
	}

}
