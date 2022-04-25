
public class Page23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k17_iNumVal = 1001034567;  // k17_iNumVal를 정수형 1001034567로 선언하였다.
		
		String k17_sNumVal = String.valueOf(k17_iNumVal); // 정수형 k17_iNumVal를 문자열로 변경하여 주었다.
		
		String k17_sNumVoice = ""; // 문자열 k17_sNumVoice는 공백으로 선언하였다.
		
		System.out.printf("=> %s [%d자리]\n", k17_sNumVal , k17_sNumVal.length()); // 
		
		int k17_i, k17_j;
		
		String [] k17_units = {"영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
		String [] k17_unitX = {"", "십", "백", "천", "만", "십", "백", "천", "억", "십"};
		
		k17_i = 0;
		k17_j = k17_sNumVal.length()-1;
		
		while(true) {
			if(k17_i >= k17_sNumVal.length()) break;
			
			System.out.printf("%s[%s]", k17_sNumVal.substring(k17_i, k17_i+1),
					k17_units[Integer.parseInt(k17_sNumVal.substring(k17_i, k17_i + 1))]);
			
			if(k17_sNumVal.substring(k17_i, k17_i+1).equals("0")) {
				if (k17_unitX[k17_j].equals("만") || k17_unitX[k17_j].equals("억")) {
					k17_sNumVoice = k17_sNumVoice + "" + k17_unitX[k17_j];
				} else {
					
				}
			} else {
				k17_sNumVoice = k17_sNumVoice
						+ k17_units[Integer.parseInt(k17_sNumVal.substring(k17_i, k17_i + 1))]
						+ k17_unitX[k17_j];
			}
			k17_i++; k17_j--;
		}
		System.out.printf("\n %s[%s]\n", k17_sNumVal, k17_sNumVoice);
	}

}
