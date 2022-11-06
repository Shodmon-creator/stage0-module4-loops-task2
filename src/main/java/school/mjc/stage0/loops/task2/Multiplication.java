package school.mjc.stage0.loops.task2;


public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int numberOne = 0;
        if (multiplyByAndToInclusive > 0) {
            while (numberOne <= multiplyByAndToInclusive) {
                System.out.println(numberOne*multiplyByAndToInclusive);
                numberOne++;
            }
        }else if (multiplyByAndToInclusive<0){
            while (numberOne <= Math.abs(multiplyByAndToInclusive)) {
                System.out.println(numberOne*multiplyByAndToInclusive);
                numberOne++;
            }
        }


    }
}
