import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker(scanner);
        while (true) {
            printMenu();
            int command = scanner.nextInt();

            if (command == 1) {
                stepTracker.addNewNumberStepsPerDay();
            } else if (command == 2) {
                stepTracker.changesStepGoal();
            } else if (command == 3) {
                while (true) {
                    printStaticMenu();
                    int staticCommand = scanner.nextInt();
                    if (staticCommand == 1) {
                        stepTracker.printDays();
                    } else if (staticCommand == 2) {
                        stepTracker.sumSteps();
                    } else if (staticCommand == 3) {
                        stepTracker.maxSteps();
                    } else if (staticCommand == 4) {
                        stepTracker.bestSeries();
                    } else if (staticCommand == 5) {
                        stepTracker.converterToKm();
                    } else if (staticCommand == 6) {
                        stepTracker.converterToKilocallories();
                    } else if (staticCommand == 0) {
                        break;
                    }
                }
            } else if (command == 0) {
                System.out.println("Выход");
                break;
            } else {
                System.out.println("Такой команды к сожалению нет");
            }

        }
    }

    public static void printMenu() {
        System.out.println("ГЛАВНОЕ МЕНЮ");
        System.out.println("Что Вы желаете сделать?");
        System.out.println("1 - ввести количество шагов за определённый день");
        System.out.println("2 - изменить цель по количеству шагов за день");
        System.out.println("3 - вывести статистику за определённый месяц");
        System.out.println("0 - выйти из прилоджения");
    }


    public static void printStaticMenu() {
        System.out.println("ДОПОЛНИТЕЛЬНОЕ МЕНЮ");
        System.out.println("Какую статистику Вы хотите получить?");
        System.out.println("1 - количество пройденных шагов по дням");
        System.out.println("2 - общее количество шагов за месяц");
        System.out.println("3 - максимальное количество шагов за месяц");
        System.out.println("4 - лучшая серия");
        System.out.println("5 - пройденная дистанция в км");
        System.out.println("6 - количество сожженных килокалорий");
        System.out.println("0 - выход в главное меню");
    }
}
