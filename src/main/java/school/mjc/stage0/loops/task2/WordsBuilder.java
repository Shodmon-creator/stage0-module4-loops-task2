package school.mjc.stage0.loops.task2;





public class WordsBuilder {
    public void buildPhrase(char... chars) {
//        System.out.print("loops are cool");


                StringBuilder str= new StringBuilder();
                for (char char1:chars){
                    str.append(char1);
                }
                System.out.print(str);

        }

}
