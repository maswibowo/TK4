class QuarterlyBonusVisitor implements Visitor {

    private static final double TRAINEE_BONUS_PERCENTAGE = 0.01;
    private static final double SALESMAN_BONUS_PERCENTAGE = 0.03;
    private static final double BOSS_BONUS_PERCENTAGE = 0.05;
    private static final double DEFAULT_BONUS_PERCENTAGE = 0.01;

    public double visit(SalesTrainee trainee) {
        System.out.println("Trainee's Yearly Bonus");

        double quarterlyBonusPercentage = (trainee.getSickDays() < 2 && trainee.getFailedTests() < 1) ? TRAINEE_BONUS_PERCENTAGE : DEFAULT_BONUS_PERCENTAGE;

        double quarterlyBonusAmount = trainee.getSalary() * quarterlyBonusPercentage;

        return quarterlyBonusAmount;
    }

    public double visit(Salesman salesman) {
        System.out.println("Salesman's Yearly Bonus");

        double quarterlyBonusPercentage = (salesman.getTotalSalesAmount() > 25000 && salesman.getNewCustomers() > 20) ? SALESMAN_BONUS_PERCENTAGE : DEFAULT_BONUS_PERCENTAGE;

        double quarterlyBonusAmount = salesman.getTotalSalesAmount() * quarterlyBonusPercentage;

        return quarterlyBonusAmount;
    }

    public double visit(Boss boss) {
        System.out.println("Boss's Yearly Bonus");

        double quarterlyBonusPercentage = (boss.getOfficeExpenses() < 12000 && boss.getNewCustomers() > 250) ? BOSS_BONUS_PERCENTAGE : DEFAULT_BONUS_PERCENTAGE;

        double quarterlyBonusAmount = boss.getTotalSalesAmount() * quarterlyBonusPercentage;

        return quarterlyBonusAmount;
    }
}
