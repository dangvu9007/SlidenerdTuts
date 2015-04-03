import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tut35FactorialOfNumMethod1 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number: ");

        int num = Integer.parseInt(reader.readLine()), prod=1;

        for(int i=1; i<=num; i++){

            prod= prod*i;
        }
        System.out.println("Factorial is "+prod);


    }
}
