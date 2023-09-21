import java.util.Scanner;
public class Main {
    public static int add(int numOne, int numTwo){
        return numOne + numTwo;
    }
    public static String greeting(String name){
        return "Bonjour, " + name + " !";
    }
    public static int add4(int numOne, int numTwo, int numThree, int numFour){
        int a;
        int b;
        int c;
        a = add(numOne, numTwo);
        b = add(numThree, numFour);
        c = add(a,b);
        return c;
    }
    public static String printMe(String toBePrinted){
        return toBePrinted;
    }
    public static void main(String[] args) {

        System.out.println("enter an integer");
        Scanner method1 = new Scanner(System.in);
        int numOne = method1.nextInt();
        System.out.println("enter an integer you want to add to that");
        Scanner method2 = new Scanner(System.in);
        int numTwo = method2.nextInt();
        int resultOne = add(numOne,numTwo);
        System.out.println("Result one is: " + resultOne + "\n");

        System.out.println("What is your name?");
        Scanner method3 = new Scanner(System.in);
        String name = method3.nextLine();
        String resultTwo = greeting(name);
        System.out.println("Result Two is: " + resultTwo + "\n");

        System.out.println("Remember the first two numbers? Now enter a third.");
        Scanner method4 = new Scanner(System.in);
        int numThree = method4.nextInt();
        System.out.println("Now another.");
        Scanner method5 = new Scanner(System.in);
        int numFour = method5.nextInt();
        int resultThree = add4(numOne, numTwo, numThree, numFour);
        System.out.println("Result three is:" + resultThree + "\n");

        System.out.println("Now enter something you want me to repeat...sorta like an echo but with text");
        Scanner method6 = new Scanner(System.in);
        String toBePrinted = method6.nextLine();
        String resultFour = printMe(toBePrinted);
        System.out.println("Result Four is: " + resultFour + ", thank you for your time.");

    }

}
/*i have neither given nor recieved any unauthorised aid on this piece of work*/