package code;

public class Page5 {
	static int k17_iStatic;
	
	public static void add(int k17_i) {
		k17_iStatic++;
		k17_i++;
		System.out.printf("add메소드에서 ->k17_iStatic=[%d]\n",k17_iStatic);
		System.out.printf("add메소드에서->i=[%d]\n",k17_i);
	}
	
	public static int add2(int k17_i) {
		k17_iStatic++;
		k17_i++;
		System.out.printf("add메소드에서->iStatic=[%d]\n",k17_iStatic);
		System.out.printf("add메소드에서->k17_i=[%d]\n",k17_i);
		return k17_i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k17_iMain;
		
		k17_iMain = 1;
		k17_iStatic = 1;
		
		System.out.printf("***************************************\n");
		System.out.printf("메소드호출전 메인에서 ->k17_iStatic=[%d]\n",k17_iStatic);
		System.out.printf("메소드호출전 메인에서->k17_iMain=[%d]\n",k17_iMain);
		System.out.printf("***************************************\n");		
		add(k17_iMain);
		
		System.out.printf("***************************************\n");		System.out.printf("메소드호출후 메인에서->k17_iStatic=[%d]\n",k17_iStatic);
		System.out.printf("메소드호출후 메인에서->k17_iMain=[%d]\n",k17_iMain);
		System.out.printf("***************************************\n");		
		k17_iMain = add2(k17_iMain);
		
		System.out.printf("***************************************\n");		System.out.printf("메소드 add2호출후 메인에서->iStatic=[%d]\n",k17_iStatic);
		System.out.printf("메소드 add2호출후 메인에서->k17_iMain=[%d]\n",k17_iMain);
		System.out.printf("***************************************\n");
	}

}
