import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tut17SalaryBonus {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter employee salary: ");
        String input1 = br.readLine();
        System.out.println("Enter bonus %: ");
        double salary = Double.parseDouble(input1);
        String input2 = br.readLine();
        double bonus = Double.parseDouble(input2);

        double total = salary + bonus/100*salary;

        System.out.println("Total Salary is: "+ total);

    }

}
