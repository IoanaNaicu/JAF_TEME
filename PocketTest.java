public class PocketTest {
    public static void main(String[] args) {
        Pocket pocket = new Pocket(400);
        System.out.println(pocket.getMoney());
        pocket.toString();


        pocket.setMoney(999999);
        pocket.setMoney(-3);
        pocket.setMoney(45);
        pocket.toString();
    }
}


