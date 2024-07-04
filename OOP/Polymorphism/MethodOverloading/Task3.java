// 3. Simple Interest Calculation:
//    Develop a class `InterestCalculator` with overloaded methods `calculateInterest()` to determine the simple interest using principal, rate, and time provided in different formats (e.g., years, months, days).

class InterestCalculator {
    public double calculateInterest(double principal, double rate, int years) {
        double timeInYears = years;
        return (principal * rate * timeInYears) / 100;
    }

    public double calculateInterest(double principal, double rate, int months, String timeUnit) {
        double timeInMonths;
        if (timeUnit.equalsIgnoreCase("months")) {
            timeInMonths = months;
        } else if (timeUnit.equalsIgnoreCase("years")) {
            timeInMonths = months * 12;
        } else {
            throw new IllegalArgumentException("Invalid time unit. Use 'months' or 'years'.");
        }
        return (principal * rate * timeInMonths) / (100 * 12);
    }

    public double calculateInterest(double principal, double rate, int days, boolean isLeapYear) {
        double timeInDays = days;
        if (isLeapYear) {
            return (principal * rate * timeInDays) / (100 * 366);
        } else {
            return (principal * rate * timeInDays) / (100 * 365);
        }
    }
}

public class Task3 {
    public static void main(String[] args) {
        InterestCalculator interestCalculator = new InterestCalculator();

        double interest1 = interestCalculator.calculateInterest(1000, 5, 3);
        System.out.println("Simple Interest for 3 years: $" + interest1);

        double interest2 = interestCalculator.calculateInterest(2500, 6, 18, "months");
        System.out.println("Simple Interest for 18 months: $" + interest2);

        double interest3 = interestCalculator.calculateInterest(5000, 4, 90, true);
        System.out.println("Simple Interest for 90 days (leap year): $" + interest3);
    }
}
