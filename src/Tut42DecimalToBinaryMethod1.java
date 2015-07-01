import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tut42DecimalToBinaryMethod1 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number ");
        int bin = Integer.parseInt(reader.readLine());
        //int num = 14;
        System.out.println(Integer.toBinaryString(bin));
    }
}
