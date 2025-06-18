package day4_JavaMethods.level3PracticeProblems;
public class Q11_EmployeeBonusCalculator {

    public static void main(String[] args) {
        int[][] salaryServiceData = generateSalaryAndService(10);
        double[][] newSalaryBonusData = calculateBonusAndNewSalary(salaryServiceData);
        displayBonusTable(salaryServiceData, newSalaryBonusData);
    }

    // Method to generate 5-digit salary and random years of service (1 to 10)
    public static int[][] generateSalaryAndService(int employeeCount) {
        int[][] data = new int[employeeCount][2]; // [salary, yearsOfService]
        for (int i = 0; i < employeeCount; i++) {
            int salary = 10000 + (int)(Math.random() * 90000); // 5-digit salary
            int service = 1 + (int)(Math.random() * 10); // 1 to 10 years
            data[i][0] = salary;
            data[i][1] = service;
        }
        return data;
    }

    // Method to calculate bonus and new salary based on years of service
    public static double[][] calculateBonusAndNewSalary(int[][] salaryServiceData) {
        int n = salaryServiceData.length;
        double[][] result = new double[n][2]; // [bonusAmount, newSalary]
        for (int i = 0; i < n; i++) {
            int salary = salaryServiceData[i][0];
            int years = salaryServiceData[i][1];
            double bonus = years > 5 ? salary * 0.05 : salary * 0.02;
            double newSalary = salary + bonus;
            result[i][0] = bonus;
            result[i][1] = newSalary;
        }
        return result;
    }

    // Method to display the data in a tabular format
    public static void displayBonusTable(int[][] salaryServiceData, double[][] newSalaryBonusData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        System.out.printf("%-10s %-12s %-10s %-12s %-12s%n",
                "Emp No", "Old Salary", "Service", "Bonus Amt", "New Salary");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < salaryServiceData.length; i++) {
            int oldSalary = salaryServiceData[i][0];
            int service = salaryServiceData[i][1];
            double bonus = newSalaryBonusData[i][0];
            double newSalary = newSalaryBonusData[i][1];

            System.out.printf("%-10d %-12d %-10d %-12.2f %-12.2f%n",
                    (i + 1), oldSalary, service, bonus, newSalary);

            totalOldSalary += oldSalary;
            totalBonus += bonus;
            totalNewSalary += newSalary;
        }

        System.out.println("------------------------------------------------------------");
        System.out.printf("Total     %-12.2f %-10s %-12.2f %-12.2f%n",
                totalOldSalary, "-", totalBonus, totalNewSalary);
    }
}