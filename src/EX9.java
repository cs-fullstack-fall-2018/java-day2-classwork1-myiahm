import java.util.Scanner;

public class EX9 {
    public static void main(String[] args) {
        Scanner userPassword = new Scanner(System.in);
        System.out.println("Enter password: ");
        String password = userPassword.nextLine();

        while (!password.equals("HardCorePassword")) {
            System.out.println("Enter password: ");
            System.out.println(password.equals("HardCorePassword"));
            password = userPassword.nextLine();



        } System.out.println("This is correct");{
        }
    }
}