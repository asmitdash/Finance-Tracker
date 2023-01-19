package tests;
import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;

public class FinanceTracker {
    public static void main(String[] args) {
        Map<String, Double[]> finances = new LinkedHashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter month (YYYY-MM): ");
            String month = scanner.next();
            if (month.equals("q")) {
                break;
            }
            System.out.print("Enter total income for the month: ");
            double income = scanner.nextDouble();
            System.out.print("Enter total expenses for the month: ");
            double expenses = scanner.nextDouble();

            double netIncome = income - expenses;
            finances.put(month, new Double[]{income, expenses, netIncome});
        }

        System.out.println("Month  | Income | Expenses | Net Income");
        System.out.println("-------|--------|----------|------------");
        for (Map.Entry<String, Double[]> entry : finances.entrySet()) {
            String month = entry.getKey();
            Double[] values = entry.getValue();
            double income = values[0];
            double expenses = values[1];
            double netIncome = values[2];
            System.out.printf("%s  | %.2f  | %.2f   | %.2f%n", month, income, expenses, netIncome);
        }
    }
}

