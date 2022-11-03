package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int number = 0;
        int factorial = 1;

        while (number <= printToInclusive) {
            factorial *= ++number;
            number++;
            System.out.println(factorial);
        }


    }
}
