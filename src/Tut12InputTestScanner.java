import java.util.Scanner;

public class Tut12InputTestScanner {
    public static void main(String args[]){
        System.out.println("Enter your name");

        Scanner scan = new Scanner(System.in);
        String data = scan.nextLine();

        System.out.println("Your name is "+data);
    }
}
