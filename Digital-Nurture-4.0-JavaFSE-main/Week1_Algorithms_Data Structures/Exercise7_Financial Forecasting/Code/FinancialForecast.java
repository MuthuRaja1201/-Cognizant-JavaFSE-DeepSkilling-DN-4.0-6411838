

public class FinancialForecast {

    // Recursive method to predict future value
    public static double predictFutureValue(double initialValue, double growthRate, int years) {
        // Base case: if no years left, return the initial value
        if (years == 0) {
            return initialValue;
        }

        // Recursive case: calculate value for (years - 1) then apply growth
        double previousValue = predictFutureValue(initialValue, growthRate, years - 1);
        return previousValue * (1 + growthRate);
    }

    public static void main(String[] args) {
        double initialValue = 10000;  // initial investment
        double growthRate = 0.08;     // 8% growth rate per year
        int years = 5;                // forecast for 5 years

        double futureValue = predictFutureValue(initialValue, growthRate, years);
        System.out.printf("Predicted value after %d years: ₹%.2f\n", years, futureValue);
    }
}
