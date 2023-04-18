public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        int bonusFinal = (int) service.calculate(2000,true);

        System.out.println(bonusFinal);
    }
    }
