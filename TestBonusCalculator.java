public class TestBonusCalculator {

    public static void main(String[] args) {
        calculateYearlyBonuses();
        calculateQuarterlyBonuses();
    }

    private static void calculateYearlyBonuses() {
        YearlyBonusVisitor yearlyBonusCalculator = new YearlyBonusVisitor();

        SalesTrainee bradTrainee = new SalesTrainee(5, 1, 20000);
        Salesman tomSalesman = new Salesman(150000, 62);
        Boss rossBoss = new Boss(1000000, 1200, 4000000);

        System.out.println("YEARLY BONUS");

        System.out.println(bradTrainee.accept(yearlyBonusCalculator));
        System.out.println(tomSalesman.accept(yearlyBonusCalculator));
        System.out.println(rossBoss.accept(yearlyBonusCalculator));
    }

    private static void calculateQuarterlyBonuses() {
        QuarterlyBonusVisitor quarterlyBonusCalculator = new QuarterlyBonusVisitor();

        SalesTrainee bradTrainee = new SalesTrainee(1, 0, 20000);
        Salesman tomSalesman = new Salesman(30000, 22);
        Boss rossBoss = new Boss(200000, 300, 11000);

        System.out.println("\nQUARTERLY BONUS");

        System.out.println(bradTrainee.accept(quarterlyBonusCalculator));
        System.out.println(tomSalesman.accept(quarterlyBonusCalculator));
        System.out.println(rossBoss.accept(quarterlyBonusCalculator));
    }
}
