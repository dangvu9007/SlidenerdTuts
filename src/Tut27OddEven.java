import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tut27OddEven {

    public static void main(String[] args)throws IOException{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number: ");

        double num =  Double.parseDouble(reader.readLine());

        if (num%2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

    }
}
