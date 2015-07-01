import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tut43DecimalToBinaryMethod2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number ");

        int num = Integer.parseInt(reader.readLine());
        StringBuffer buf = new StringBuffer();

        while(num!=0) {

            int digit = num % 2;
            buf.append(digit);

            num = num / 2;
        }
        //System.out.println(buf);
        //buf.reverse();
        System.out.println(buf.reverse());
    }
}
