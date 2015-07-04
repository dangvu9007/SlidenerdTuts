import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tut44DecimalToOctalMethod1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number ");

        int num = Integer.parseInt(reader.readLine());

        System.out.println(Integer.toOctalString(num));
    }
}
