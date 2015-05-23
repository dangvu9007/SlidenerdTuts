import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tut36PerfectSquares {
    public static void main(String[] args)throws IOException {

        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //System.out.println("Enter number: ");
        //int num = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= 100; i++) {

            /*
            int num = i;
            double sq = Math.sqrt(num);
            double round = Math.ceil(sq);

            if (sq == round) {
                System.out.println(num+" is a Perfect Square");
            */

            double sq = Math.sqrt(i);
            double round = Math.ceil(sq);

            if (sq == round) {
                System.out.println(i+" is a Perfect Square");
            }
            //else {
                //System.out.println(num+" is not a Perfect Square");
            //}

        }
    }
}
