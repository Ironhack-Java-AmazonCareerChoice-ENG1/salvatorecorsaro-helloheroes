import java.util.Scanner;

public class GreetingInput {
    public static void main(String[] args) {
//        ask for a name
        Scanner scanner = new Scanner(System.in);
        System.out.println("Greetings, what's your name?");
//        store the name
        String name = scanner.nextLine();
//        use the name in a string we will print
        System.out.println("Hello " + name);
        System.out.println("What's the answer?");
        int answer = scanner.nextInt();
        if (answer == 42 ){
            System.out.println("you got it! ;)");
        } else {
            System.out.println("-_- ...");
        }
        System.out.println(answer + "!");
    }
}