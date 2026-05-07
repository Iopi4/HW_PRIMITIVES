import taxation_methods.System1;
import taxation_methods.System2;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        int earnings = 0;    // доходы
        int spendings = 0;   // расходы

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Выберите операцию и введите её номер:");
            System.out.println("1. Добавить новый доход");
            System.out.println("2. Добавить новый расход");
            System.out.println("3. Выбрать систему налогообложения");

            String input = scanner.nextLine();

            if ("end".equals(input)){
                break;
            }
            int operation = Integer.parseInt(input);

            switch (operation){
                case 1:
                    System.out.println("Введите сумму дохода:");
                    String moneyStr = scanner.nextLine();
                    int money = Integer.parseInt(moneyStr);
                    earnings += money;
                    break;
                case 2:
                    System.out.println("Введите сумму расхода:");
                    String costStr = scanner.nextLine();
                    int cost = Integer.parseInt(costStr);
                    spendings += cost;
                    break;
                case 3:
                    int tax1 = System1.taxEarnings(earnings);
                    int tax2 = System2.taxEarningsMinusSpendings(earnings, spendings);

                    if (tax1<tax2){
                        System.out.println("Мы советуем вам УСН доходы");
                        System.out.println("Доходы: " + earnings + " руб." + " Расходы: " + spendings + " руб.");
                        System.out.println("Ваш налог составит: " + tax1 + " рублей");
                        System.out.println("Налог на другой системе: " + tax2 + " рублей");
                        System.out.println("Экономия: " + (tax2 - tax1) + " рублей");
                    } else {
                        System.out.println("Мы советуем вам УСН доходы минус расходы");
                        System.out.println("Доходы: " + earnings + " руб." + " Расходы: " + spendings + " руб.");
                        System.out.println("Ваш налог составит: " + tax2 + " рублей");
                        System.out.println("Налог на другой системе: " + tax1 + " рублей");
                        System.out.println("Экономия: " + (tax1 - tax2) + " рублей");
                    } System.out.println();
                    break;
                default:
                    System.out.println("Такой операции нет");
            }
        }
        System.out.println("Программа завершена!");
    }
}