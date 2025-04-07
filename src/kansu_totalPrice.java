
public class kansu_totalPrice {

    // メソッドは main メソッドの外で定義する
    public static int totalPrice(int fruitPrice) {
        double tax = 1.08;
        int haiso = 350;
        return (int) (fruitPrice * tax) + haiso;
    }

    public static void main(String[] args) {
        // "<br>" はjavaで使えないから "\n" 
        System.out.println(totalPrice(300) + "\n");
        System.out.println(totalPrice(450) + "\n");
        System.out.println(totalPrice(400) + "\n");
        System.out.println(totalPrice(350) + "\n");
    }
 
}
