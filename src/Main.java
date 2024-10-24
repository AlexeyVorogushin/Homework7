public class Main {
    public static void main(String[] args) {
        System.out.println("task 1");
        int targetAmount = 2_459_000;
        int currentAmount = 0;
        int monthlySaving = 15000;
        int month = 0;
        while (currentAmount < targetAmount) {
            currentAmount += monthlySaving;
            month++;
            System.out.println("Месяц " + month + ",сумма накоплений равна " + currentAmount + " рублей");
        }
        System.out.println("task 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;

        }
        System.out.println();
        for (int g = 10; g >= 1; g--) {
            System.out.print(g + " ");
        }
        System.out.println("task 3");
        int population = 12_000_000;
        int birthRate = 17;
        int deathRate = 8;
        int years = 10;
        for (int year = 1; year <= years; year++) {
            int birth = (population * birthRate) / 1000;
            int death = (population * deathRate) / 1000;
            population += (birth - death);
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
        System.out.println("task 4");
        int initialDeposit = 15000;
        int wantAmount = 12_000_000;
        double interestRate = 0.07;
        int months = 0;

        while (initialDeposit < wantAmount) {
            initialDeposit += initialDeposit * interestRate;
            months++;
            System.out.println("Месяц " + months + " , сумма накоплений равна " + initialDeposit + " рублей");
        }
        System.out.println("task 5");
        int initialDeposit2 = 15000;
        int wantAmount2 = 12_000_000;
        double interestRate2 = 0.07;
        int months2 = 0;
        while (initialDeposit2 < wantAmount2) {
            initialDeposit2 += initialDeposit2 * interestRate2;
            months2++;
            if (months2 % 6 == 0) {
                System.out.println("Месяц " + months2 + " , сумма накоплений равна " + initialDeposit2 + " рублей");
            }
        }
        System.out.println("task 6");
        int initialDeposit3 = 15000;
        double interestRate3 = 0.07;
        int totalMonths = 12 * 9;

        for (int months3 = 1; months3 <= totalMonths; months3++) {
            initialDeposit3 += initialDeposit3 * interestRate3;
            if (months3 % 6 == 0) {
                System.out.println("По истечении " + months3 + " месяцев, сумма накоплений будет равна " + initialDeposit3 + " рублей");
            }
        }
        System.out.println("task 7");
        int firstFriday = 1;
        int totalDays = 31;
        for (int day = firstFriday; day <= totalDays; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
        }
        System.out.println("task 8");
        int startYear = 2024 - 200;
        int endYear = 2024 + 100;
        int cometPeriod = 79;
        for (int year = startYear; year <= 2024; year++) {
            if (year % cometPeriod == 0) {
                System.out.println(year);
            }
        }
        for (int year = 2024; year <= endYear; year++) {
            if (year % cometPeriod == 0) {
                System.out.println(year);
            }
        }
    }
}