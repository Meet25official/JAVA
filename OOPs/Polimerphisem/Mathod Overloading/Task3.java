//3. Simple Interest Calculation:
//Develop a class `InterestCalculator` with overloaded methods `calculateInterest()` to determine the simple interest using principal, rate, and time provided in different formats (e.g., years, months, days).

class InterestCalculator{
    void calculateInterest(float p , float r , float t){
        float ar = p*r*t/100;
        System.out.println("The Simple Interest is below of year :- "+ar);
    }
    void calculateInterest(double p , double r , double t){
        double ar = p*r*t/100;
        System.out.println("The Simple Interest is below of months :- "+ar);
    }
    void calculateInterest(float p , float r , int t){
        float ar = p*r*t/100;
        System.out.println("The Simple Interest is below of days :- "+ar);
    }
}

public class Task3 {
    public static void main(String[] args){
        InterestCalculator obj = new InterestCalculator();
        obj.calculateInterest(1000f, 0.5f, 2f);
        obj.calculateInterest(2000, 1.45, 5);
        obj.calculateInterest(3000f, 2.3f, 1);
    }  
}
