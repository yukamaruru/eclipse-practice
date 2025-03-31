
public class forbunouyou {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0 ) {
				System.out.println(i);
			}
		}
		
			for(int a = 0; a < 3; a++) {
				for(int b = 1; b < 4; b++) {
					System.out.println(b);
				}
			}
		int a = 10;
		String b = a >= 0 ? "プラス" : "マイナス";
		System.out.println(b);
		
		int c = 2;
		String d = c % 2 == 0 ? "偶数" : "奇数";
		System.out.println(d);
		
		for(int i = 0; i <= 5; i++) {
			String e = i % 2 == 0 ? "☆" : "★";
			System.out.println(e);
		}
	}

}
