package code;

public class Page8 {
	
	private static int k17_inVal;
	public static void up(){
		k17_inVal++;
		System.out.printf("난 그냥 메소드[%d]\n", k17_inVal);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		k17_inVal = 0; //자기내부 변수 사용
		Page7 elev; //클래스를 받아 객체를 만듬
		
		elev = new Page7(); //인스턴스를 생성하여 객체에 연결
		
		up(); // 현재 소스내 메소드
		for(int k17_i = 0; k17_i < 10; k17_i++) {
			elev.up(); // Page7클래스에서 찍어낸 elev 객체의 up 메소드
			System.out.printf("MSG[%s]\n", elev.k17_help);
		}
		
		for(int k17_i = 0; k17_i < 10; k17_i++) {
			elev.down();
			System.out.printf("MSG[%s]\n", elev.k17_help);
		}

	}

}
