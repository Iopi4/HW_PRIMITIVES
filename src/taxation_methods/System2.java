package taxation_methods;

public class System2 {
    /*
     * Расчет tax в float сделан специально, для более точного расчета налога
     */
    public static int taxEarningsMinusSpendings(int earnings, int spendings) {
        float tax = (float) (earnings - spendings) / 100.0F * 15.0F;
        return tax >= 0.0F ? (int) tax : 0;
    }

}
