import java.util.Scanner;

class StepTracker {
    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];
    int goalByStepsPerDay = 10000;
    Converter converter = new Converter();

    StepTracker(Scanner scan) {
        scanner = scan;

        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяц");
        int monthNumber = scanner.nextInt();
        if (monthNumber >= 1 && monthNumber <= 12) {
            System.out.println("Введите день от 1 до 30");
            int dayNumber = scanner.nextInt();
            if (dayNumber >= 1 && dayNumber <= 30) {
                System.out.println("Введите количество шагов");
                int newSteps = scanner.nextInt();
                MonthData monthData = monthToData[monthNumber - 1];
                monthData.days[dayNumber - 1] += newSteps;
                System.out.println("Ваше количество шагов успешно добавлено!");
            } else {
                System.out.println("К сожалению такой формат не поддерживается");
            }
        }
    }

    void changesStepGoal() {
        System.out.println("Введите цель шагов на день");
        int newGoal = scanner.nextInt();
        // Red
        // Пользователь, к сожалению, не сможет вернуть цель к значению 10000 ни при каких обстоятельствах
        // А хотелось бы!)
        if (newGoal == 10000) {
            System.out.println("Эта цель стоит по умолчанию");
        // Red
        // Очень странное условие
        // Оно сработает только при newGoal = 0
        } else if ((newGoal <= 10000) && (newGoal == 0)) {
            System.out.println("К сожалению Ваша цель не подходит, попробуйте выбрать другую");
        } else {
            goalByStepsPerDay = newGoal;
            System.out.println("Ваша успешно добавлена!");
            System.out.println("Удачного выполнения!");
        }
    }

    // Red
    // Очень много повторяющего кода в методах ниже
    // Общую часть с получением и проверкой нужного месяца можно вынести в отдельный метод

    // Red
    // Программа вылетит с исключением, если пользователь введет некорректный месяц
    void printDays() {
        System.out.println("Введите номер месяца (от 1 до 12)");
        int monthNumber = scanner.nextInt();
        MonthData month = monthToData[monthNumber - 1];
        month.printDaysAndStepsFromMonth();
    }

    // Red
    // Программа вылетит с исключением, если пользователь введет некорректный месяц
    void sumSteps() {
        System.out.println("Введите номер месяца (от 1 до 12)");
        int monthNumber = scanner.nextInt();
        MonthData month = monthToData[monthNumber - 1];
        int sumSteps = month.sumStepsFromMonth();
        System.out.println(sumSteps + " - именно столько шагов вы прошли за этот месяц!");
    }

    // Red
    // Программа вылетит с исключением, если пользователь введет некорректный месяц
    void maxSteps() {
        System.out.println("Введите номер месяца (от 1 до 12)");
        int monthNumber = scanner.nextInt();
        MonthData month = monthToData[monthNumber - 1];
        int maxSteps = month.maxStepsFromMonth();
        System.out.println(maxSteps + " - ваш максимум за этот месяц!");
    }

    // Red
    // Программа вылетит с исключением, если пользователь введет некорректный месяц
    void bestSeries() {
        System.out.println("Введите номер месяца (от 1 до 12)");
        int monthNumber = scanner.nextInt();
        MonthData month = monthToData[monthNumber - 1];
        int bestSeries = month.bestSeriesFromMonth(goalByStepsPerDay);
        System.out.println(bestSeries + " - ваша лучшая серия за месяц!");
    }

    // Red
    // Программа вылетит с исключением, если пользователь введет некорректный месяц
    void converterToKm() {
        System.out.println("Введите номер месяца (от 1 до 12)");
        int monthNumber = scanner.nextInt();
        MonthData month = monthToData[monthNumber - 1];
        int kilometrs = converter.convertToKm(month.sumStepsFromMonth());
        System.out.println(kilometrs + "километров");
    }

    // Red
    // Программа вылетит с исключением, если пользователь введет некорректный месяц
    void converterToKilocallories() {
        System.out.println("Введите номер месяца (от 1 до 12)");
        int monthNumber = scanner.nextInt();
        MonthData month = monthToData[monthNumber - 1];
        int kilocallories = converter.convertStepsToKilocalories(month.sumStepsFromMonth());
        System.out.println(kilocallories + "килокаллорий");
    }
}
