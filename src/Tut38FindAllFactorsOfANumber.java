import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tut38FindAllFactorsOfANumber {
    public static void main(String [] args)throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number ");

        int num;
        double ans;
        num = Integer.parseInt(reader.readLine());

        for (int i=1; i<=num; i++) {

            ans = (double)num / i;
            //System.out.println(ans + " \t" + Math.ceil(ans));

            if (ans == Math.ceil(ans)) {
                System.out.println(i+ " is a factor");
            }
        }

    }
}
