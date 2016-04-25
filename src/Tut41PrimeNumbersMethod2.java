import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tut41PrimeNumbersMethod2 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number: ");
        int num = Integer.parseInt(reader.readLine());

        for (int j = 2; j <= num; j++) {

            int cnt = 0;

            for (int i = 1; i <= j; i++) {

                if (j % i == 0) {
                    cnt++;
                }
            }if (cnt == 2) {
                System.out.println(j + " is a Prime Number");
            }else {
                System.out.println(j + " is not a Prime Number");
            }
        }
    }
}
