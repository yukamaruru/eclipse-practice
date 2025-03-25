
public class switchbun {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
			int a = 1;
			if(a == 0) {
				System.out.println("aは０に等しい");
			}else if(a == 1) {
				System.out.println("aは１に等しい");
			}
		
		int b = 1;
		switch(a) {
			case 0:	
				System.out.println("bは０に等しい");
				break;
			case 1:
				System.out.println("bは１に等しい");
				break;
		}
		
		int c = 1;
		switch(c) {
			case 0:
				System.out.println("cは０に等しい");
				break;
			
			case 1:
				System.out.println("cは１に等しい");
				break;
		}
		
		int d = 5;
		switch(d) {
			case 0:
				System.out.println("aは０に等しい");
				break;
			case 1:
				System.out.println("aは１に等しい");
				break;
			default:
				System.out.println("aは０でも１でもない");
		}
		
		String a1 = "赤";
		switch(a1) {
			case "赤":
				System.out.println("赤組です");
				break;
			
			case "白":
				System.out.println("白組です");
				break;
		}
		
		String b1 = "青";
		switch(b1) {
			case "赤":
				System.out.println("赤組です");
				break;
			
			case "白":
				System.out.println("白組です");
				break;
				
			default:
				System.out.println("エラーです");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
