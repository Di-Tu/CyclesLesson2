//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println();

//        Task 1
        System.out.println("          Задача №1");
        int totalDeposit = 0;
        int deposit = 15000;
        int month = 0;
        while (totalDeposit < 2_459_000) {
            totalDeposit = totalDeposit + deposit;
            month = month + 1;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalDeposit + " рублей");
        }

//        Task 2
        System.out.println();
        System.out.println("          Задача №2");
        int number = 0;
        while (number < 10) {
            number = number + 1;
            System.out.print(number + " ");
        }
        System.out.println();
        for (; number > 0; number--) {
            System.out.print(number + " ");
        }
        System.out.println();

//        Task 3
        System.out.println();
        System.out.println("          Задача №3");
        int population = 12_000_000;
        for (int i = 1; i <= 10; i++) {
            population = population + population / 1000 * 17 - population / 1000 * 8;
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }

//        Task 4
        System.out.println();
        System.out.println("          Задача №4");
        totalDeposit = 15000;
        month = 0;
        while (totalDeposit < 12_000_000) {
            month = month + 1;
            totalDeposit = (int) (totalDeposit * 1.07);
            System.out.println("Месяц " + month + ", сумма накоплений " + totalDeposit + " рублей");
        }

//        Task 5
        System.out.println();
        System.out.println("          Задача №5");
        totalDeposit = 15000;
        month = 0;
        while (totalDeposit < 12_000_000) {
            month = month + 1;
            totalDeposit = (int) (totalDeposit * 1.07);
            if ((month % 6) == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений " + totalDeposit + " рублей");
            }
        }

        //        Task 6
        System.out.println();
        System.out.println("          Задача №6");
        totalDeposit = 15000;
        for (int i = 1; i <= (9 * 12); i++) {
            totalDeposit = (int) (totalDeposit * 1.07);
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений " + totalDeposit + " рублей");
            }
        }

        //        Task 7
        System.out.println();
        System.out.println("          Задача №7");
        int friday = 3;
        int x = 0;
        do {
            x = x + 1;
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет. " + "Количество итераций " + x);
            friday = friday + 7;
        } while (friday <= 31);


        //        Task 8
        System.out.println();
        System.out.println("          Задача №8");
        int currentYear = 2025;
        int yearBefore = currentYear - 200;
        int yearAfter = currentYear + 100;
        for (int i = 0; i <= yearAfter; i += 79) {
            if (i > yearBefore && (i % 79) == 0) {
                System.out.println(i);
            }
        }

    }
}