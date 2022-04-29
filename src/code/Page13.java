package code;

public class Page13 {
	private int k17_limit_up_floor; // 최상위층
	private int k17_limit_down_floor; //최하위층
	private int k17_floor; //현재층
	private String k17_help;
	
	Page13(){
		k17_limit_up_floor = 10;
		k17_limit_down_floor = 1;
		k17_floor = 1;
		k17_help = "엘리베이터 기본 준공완료";
	}
	
	//최대층, 최소층, 현재층을 주어서 클래스를 생성할 수 있도록 해봤다
	Page13(int k17_up_floor, int k17_d_floor, int k17_in_floor){
		k17_limit_up_floor = k17_up_floor;
		k17_limit_down_floor = k17_d_floor;
		k17_floor = k17_in_floor;
		k17_help = "엘리베이터 맞춤 준공완료";
	}
	
	void up() {
		if(k17_floor == k17_limit_up_floor) {
			k17_help = "마지막 층입니다";
		} else {
			k17_floor++;
			k17_help = String.format("[%d] 층입니다",k17_floor);
		}
	}
	void down() {
		if(k17_floor == k17_limit_up_floor) {
			k17_help = "처음 층입니다";
		} else {
			k17_floor--;
			k17_help = String.format("[%d] 층입니다",k17_floor);
		}
	}
	
	void up(int k17_u) {
		for(int k17_i = 0; k17_i < k17_u; k17_i++) this.up();
	}
	void down(int k17_u) {
		for(int k17_i = 0; k17_i < k17_u; k17_i--) this.down();
	}
	void msg(String k17_id) {
		System.out.printf("%s=>[%s] 최대층[%d] 최소층[%d] 현재층[%d]\n",
				k17_id,k17_help,k17_limit_up_floor,k17_limit_down_floor,k17_floor);
	}

}
