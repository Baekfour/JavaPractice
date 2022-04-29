package code;

public class Page7 {
	
		int k17_limit_up_floor = 10; //최상위 층
		int k17_limit_down_floor=0; //최하위 층
		int k17_floor = 1; //현재층
		String k17_help;
		
		void up() {
			if(k17_floor == k17_limit_up_floor) {
				k17_help = "마지막층입니다";
			} else {
				k17_floor++; //최상층이 아닐 떄 한 층씩 올라감
				k17_help = String.format("%d층입니다", k17_floor);
			}
		}
		
		void down() { //엘리베이터가 내려감
			if(k17_floor == k17_limit_down_floor) {
				k17_help = "처음층입니다.";
			}else {
				k17_floor--; // 최하층이 아닐 떄 한 층씩 내려감
				k17_help = String.format("%d층입니다",k17_floor);
			}
		}
	}




