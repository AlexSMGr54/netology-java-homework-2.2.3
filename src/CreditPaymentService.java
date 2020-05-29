public class CreditPaymentService {
    public int calculate(int creditAmount, int creditTerm, double annualRate) {
        /*
         * annuityPayment = annuityRatio * creditAmount
         * annuityRatio = monthlyRate * (1 + monthlyRate)^periodsNumber / ((1 + monthlyRate)^periodsNumber - 1)
         */
        double monthlyRate = annualRate / 12 / 100;
        int periodsNumber = 12 * creditTerm;
        double annuityRatio =
                monthlyRate * Math.pow((1 + monthlyRate), periodsNumber) /
                (Math.pow((1 + monthlyRate), periodsNumber) - 1);

        return (int) (creditAmount * annuityRatio);
    }
}
