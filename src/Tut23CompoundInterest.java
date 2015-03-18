import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tut23CompoundInterest {
    public static void main(String[] args) throws IOException {

        double amount, rate, years, total;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter invested amount: ");
        amount = Double.parseDouble(reader.readLine());

        System.out.println("Enter interest rate: ");
        rate = Double.parseDouble(reader.readLine());

        System.out.println("Enter number of years: ");
        years = Double.parseDouble(reader.readLine());

        //Amount = invested*(Math.pow((1+interest),number of years)

        total = amount*(Math.pow((1+rate),years));
        System.out.println(total);
    }
}
