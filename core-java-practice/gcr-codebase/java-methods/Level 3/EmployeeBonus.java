public class EmployeeBonus {

    public static double[][] generateEmployeeData(int employees) {
        double[][] data = new double[employees][2];

        for (int i = 0; i < employees; i++) {
            data[i][0] = 10000 + (int)(Math.random() * 90000);
            data[i][1] = 1 + (int)(Math.random() * 10);
        }

        return data;
    }

    public static double[][] calculateBonus(double[][] data) {
        double[][] result = new double[data.length][4];

        for (int i = 0; i < data.length; i++) {
            double salary = data[i][0];
            double years = data[i][1];

            double bonus = years > 5 ? salary * 0.05 : salary * 0.02;
            double newSalary = salary + bonus;

            result[i][0] = salary;
            result[i][1] = years;
            result[i][2] = bonus;
            result[i][3] = newSalary;
        }

        return result;
    }

    public static void displayReport(double[][] result) {

        double totalOldSalary = 0;
        double totalBonus = 0;
        double totalNewSalary = 0;

        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Emp\tOld Salary\tYears\tBonus\t\tNew Salary");
        System.out.println("--------------------------------------------------------------------------");

        for (int i = 0; i < result.length; i++) {

            System.out.printf("%d\t%.2f\t%.0f\t%.2f\t%.2f%n",
                    i + 1,
                    result[i][0],
                    result[i][1],
                    result[i][2],
                    result[i][3]);

            totalOldSalary += result[i][0];
            totalBonus += result[i][2];
            totalNewSalary += result[i][3];
        }

        System.out.println("--------------------------------------------------------------------------");
        System.out.printf("Total Old Salary : %.2f%n", totalOldSalary);
        System.out.printf("Total Bonus      : %.2f%n", totalBonus);
        System.out.printf("Total New Salary : %.2f%n", totalNewSalary);
    }

    public static void main(String[] args) {

        int employees = 10;

        double[][] employeeData = generateEmployeeData(employees);

        double[][] result = calculateBonus(employeeData);

        displayReport(result);
    }
}
