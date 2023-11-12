package HomeWork.Lesson_2;

public class Main {
    public static void main(String[] args) {
        Methods method = new Methods();
        method.printThreeWords();
        method.checkSumSign();
        method.printColor();
        compareNumbers();
    }

    public static void compareNumbers() {
        int a = 1;
        int b = 2;
       if(a>b || a==b){
           System.out.println("a>=b");
       } else {
           System.out.println("a<b");
       }
        System.out.println();
    }
}
