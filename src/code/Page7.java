package code;

public class Page7 {
	
		int k17_limit_up_floor = 10; //�ֻ��� ��
		int k17_limit_down_floor=0; //������ ��
		int k17_floor = 1; //������
		String k17_help;
		
		void up() {
			if(k17_floor == k17_limit_up_floor) {
				k17_help = "���������Դϴ�";
			} else {
				k17_floor++; //�ֻ����� �ƴ� �� �� ���� �ö�
				k17_help = String.format("%d���Դϴ�", k17_floor);
			}
		}
		
		void down() { //���������Ͱ� ������
			if(k17_floor == k17_limit_down_floor) {
				k17_help = "ó�����Դϴ�.";
			}else {
				k17_floor--; // �������� �ƴ� �� �� ���� ������
				k17_help = String.format("%d���Դϴ�",k17_floor);
			}
		}
	}




