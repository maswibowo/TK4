public class YearlyBonusVisitor implements Visitor {

    @Override
    public double visit(SalesTrainee trainee) {
        System.out.println("Trainee's Yearly Bonus");

        double yearlyBonusPercentage = (trainee.getSickDays() < 10 && trainee.getFailedTests() < 2) ? 0.10 : 0.02;
        double yearlyBonusAmount = trainee.getSalary() * yearlyBonusPercentage;

        return yearlyBonusAmount;
    }

    @Override
    public double visit(Salesman salesman) {
        System.out.println("Salesman's Yearly Bonus");

        double yearlyBonusPercentage = (salesman.getTotalSalesAmount() > 100000 && salesman.getNewCustomers() > 50) ? 0.12 : 0.04;
        double yearlyBonusAmount = salesman.getTotalSalesAmount() * yearlyBonusPercentage;

        return yearlyBonusAmount;
    }

    @Override
    public double visit(Boss boss) {
        System.out.println("Boss's Yearly Bonus");

        double yearlyBonusPercentage = (boss.getOfficeExpenses() < 50000 && boss.getNewCustomers() > 1000) ? 0.15 : 0.04;
        double yearlyBonusAmount = boss.getTotalSalesAmount() * yearlyBonusPercentage;

        return yearlyBonusAmount;
    }
}
