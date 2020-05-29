public class Main {
    public static void main(String[] args) {
        CreditPaymentService creditPaymentService = new CreditPaymentService();
        int creditAmount = 1_000_000;
        double annualRate = 9.99;

        for (int i = 1; i <= 3 ; i++) {
            System.out.println(creditPaymentService.calculate(creditAmount, i, annualRate));
        }
    }
}
