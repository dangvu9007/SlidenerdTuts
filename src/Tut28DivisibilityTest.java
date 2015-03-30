import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tut28DivisibilityTest {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int no1, no2;
        System.out.println("Enter no1: ");
        no1 = Integer.parseInt(reader.readLine());

        System.out.println("Enter no2: ");
        no2 = Integer.parseInt(reader.readLine());

        if (no1%no2 == 0){
            System.out.println(no1+" is a multiple of "+no2);
        }
        else if (no2%no1 == 0){
            System.out.println(no2+" is a multiple of "+no1);
        }
        else{
            System.out.println("Not multiples");
        }


    }
}
