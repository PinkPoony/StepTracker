public class Converter {
    int convertToKm(int steps) {
        // Yellow
        // Переменная создана, чтобы сразу вернуть значение из нее
        // Можно сразу возвращать значение выражения
        // return steps * 75 / 100000;

        int kilometers = (steps * 75) / 100000;
        return kilometers;
    }

    int convertStepsToKilocalories(int steps){
        // Yellow
        // Переменная создана, чтобы сразу вернуть значение из нее
        // Можно сразу возвращать значение выражения

        int kilocalories = (steps * 50) / 1000;
        return kilocalories;
    }
}
