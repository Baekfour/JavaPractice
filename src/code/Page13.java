package code;

public class Page13 {
	private int k17_limit_up_floor; // �ֻ�����
	private int k17_limit_down_floor; //��������
	private int k17_floor; //������
	private String k17_help;
	
	Page13(){
		k17_limit_up_floor = 10;
		k17_limit_down_floor = 1;
		k17_floor = 1;
		k17_help = "���������� �⺻ �ذ��Ϸ�";
	}
	
	//�ִ���, �ּ���, �������� �־ Ŭ������ ������ �� �ֵ��� �غô�
	Page13(int k17_up_floor, int k17_d_floor, int k17_in_floor){
		k17_limit_up_floor = k17_up_floor;
		k17_limit_down_floor = k17_d_floor;
		k17_floor = k17_in_floor;
		k17_help = "���������� ���� �ذ��Ϸ�";
	}
	
	void up() {
		if(k17_floor == k17_limit_up_floor) {
			k17_help = "������ ���Դϴ�";
		} else {
			k17_floor++;
			k17_help = String.format("[%d] ���Դϴ�",k17_floor);
		}
	}
	void down() {
		if(k17_floor == k17_limit_up_floor) {
			k17_help = "ó�� ���Դϴ�";
		} else {
			k17_floor--;
			k17_help = String.format("[%d] ���Դϴ�",k17_floor);
		}
	}
	
	void up(int k17_u) {
		for(int k17_i = 0; k17_i < k17_u; k17_i++) this.up();
	}
	void down(int k17_u) {
		for(int k17_i = 0; k17_i < k17_u; k17_i--) this.down();
	}
	void msg(String k17_id) {
		System.out.printf("%s=>[%s] �ִ���[%d] �ּ���[%d] ������[%d]\n",
				k17_id,k17_help,k17_limit_up_floor,k17_limit_down_floor,k17_floor);
	}

}
