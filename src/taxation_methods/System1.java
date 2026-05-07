package taxation_methods;

public class System1 {
    public static int taxEarnings(int earnings) {
        /*
         * Расчет tax в float сделан специально, для более точного расчета налога
         */
        float tax = (float)earnings / 100.0F * 6.0F;
        return (int)tax;
    }
}


