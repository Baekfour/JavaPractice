package code;

public class Page13Test {
	static Page13 elev1;
	static Page13 elev2;
	static Page13 elev3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		elev1 = new Page13();
		elev2 = new Page13(20,1,8);
		elev3 = new Page13(50,-3,5);
		
		for(int k17_i = 0; k17_i < 20; k17_i++) {
			elev1.up(); elev1.msg("1������������ ���� ������");
//			elev2.up(); elev2.msg("2������������ ���� ������");
//			elev3.up(); elev3.msg("3������������ ���� ������");
		}
		for(int k17_i = 0; k17_i < 20; k17_i++) {
			elev1.up(2); elev1.msg("1������������ 2���� ������");
//			elev2.up(2); elev2.msg("2������������ 2���� ������");
//			elev3.up(2); elev3.msg("3������������ 2���� ������");
		}
		for(int k17_i = 0; k17_i < 20; k17_i++) {
			elev1.up(3); elev1.msg("1������������ 3���� ������");
//			elev2.up(3); elev2.msg("2������������ 3���� ������");
//			elev3.up(3); elev3.msg("3������������ 3���� ������");
		}
		

	}

}
