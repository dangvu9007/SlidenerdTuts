import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tut15MilesToKmConverter {

    public static void main(String[] args) throws IOException {
        System.out.println("Enter distance in Miles: ");
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String miles = new BufferedReader(new InputStreamReader(System.in)).readLine();

        double m = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());

        double k = 1.60934*m;

        System.out.printf(m +" Miles is equal to "+k+ " Km");

        //System.out.println(1.60934*Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine()));


    }
}
