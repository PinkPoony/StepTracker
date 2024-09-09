public class Converter {
    int convertToKm(int steps) {
        int kilometers = (steps * 75) / 100000;
        return kilometers;
    }

    int convertStepsToKilocalories(int steps){
        int kilocalories = (steps * 50) / 1000;
        return kilocalories;
    }
}
