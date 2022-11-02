package school.mjc.stage0.loops.task2;



public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int numberOne=0;
        int numberTwo=multiplyByAndToInclusive;

        while (numberOne<=multiplyByAndToInclusive){
            System.out.println(numberOne*numberTwo);
            numberOne++;
            numberTwo--;
        }
    }
}
