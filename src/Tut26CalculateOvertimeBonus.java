import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tut26CalculateOvertimeBonus {
    public static void main(String[] args)throws IOException{

        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));

        double hours, rate, pay;

        System.out.println("Enter hours worked: ");
        hours = Double.parseDouble(reader.readLine());

        System.out.println("Enter rate: ");
        rate = Double.parseDouble(reader.readLine());

        if (hours<=40) {

            pay= rate*hours;
            System.out.println("Pay is: "+pay);
        }

        else {

            pay= rate*40 + (hours-40)*(rate+(0.5*rate));
            System.out.println("Pay is: " +"$"+pay);
        }


    }

}
