
public class Page23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k17_iNumVal = 1001034567;  // k17_iNumVal�� ������ 1001034567�� �����Ͽ���.
		
		String k17_sNumVal = String.valueOf(k17_iNumVal); // ������ k17_iNumVal�� ���ڿ��� �����Ͽ� �־���.
		
		String k17_sNumVoice = ""; // ���ڿ� k17_sNumVoice�� �������� �����Ͽ���.
		
		System.out.printf("=> %s [%d�ڸ�]\n", k17_sNumVal , k17_sNumVal.length()); // 
		
		int k17_i, k17_j;
		
		String [] k17_units = {"��", "��", "��", "��", "��", "��", "��", "ĥ", "��", "��"};
		String [] k17_unitX = {"", "��", "��", "õ", "��", "��", "��", "õ", "��", "��"};
		
		k17_i = 0;
		k17_j = k17_sNumVal.length()-1;
		
		while(true) {
			if(k17_i >= k17_sNumVal.length()) break;
			
			System.out.printf("%s[%s]", k17_sNumVal.substring(k17_i, k17_i+1),
					k17_units[Integer.parseInt(k17_sNumVal.substring(k17_i, k17_i + 1))]);
			
			if(k17_sNumVal.substring(k17_i, k17_i+1).equals("0")) {
				if (k17_unitX[k17_j].equals("��") || k17_unitX[k17_j].equals("��")) {
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
