public class Pocket {
    private double money;

    public Pocket(double money) {
        this.money = money;
    }

    public double getMoney() {
        if (this.money <= 10) {
            return 0;
        } else {
            return this.money;
        }
    }

    public void setMoney(double money) {
        if (money > 3000) {
            System.out.println("I don't have enough space in my pocket for as much money");
        } else if (money <= 0) {
            System.out.println("Not accepted such low value");
        } else {
            this.money = money;
        }
    }

    @Override
    public String toString() {
        System.out.println("Money = " + money);
        return "Money = " + money;
    }
}
