import java.util.Scanner;

public class EX8 {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("How awesome is Kevin and Kenn?");
        String quit = userInput.nextLine();
        while (!quit.equals("They are awesome")) {
            System.out.println("How awesome is Kevin and Kenn?");
            System.out.println(quit.equals("They are awesome"));
            quit = userInput.nextLine();

        }
    }
}