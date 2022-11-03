package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int number =1;
        int divider = 1;
        int counter = 0;
        while (number <=printToInclusive) {
            while (number % divider == 0) {
                counter++;
                divider++;
            }
            if (counter == 2)
                System.out.println(number);
            number++;
        }
    }
}
