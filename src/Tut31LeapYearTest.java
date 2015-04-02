import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tut31LeapYearTest {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int y;
        System.out.println("Enter the year: ");
        y = Integer.parseInt(reader.readLine());

        if (y%4 == 0 && y%100 != 0 || y%400 == 0){
            System.out.println("This is a leap year");
        }
        else{
            System.out.println("This is not a leap year");
        }
    }
}
