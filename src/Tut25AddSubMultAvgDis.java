import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tut25AddSubMultAvgDis {
    public static void main(String[] args)throws IOException{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a, b;
        System.out.println("Enter no1: ");
        a = Integer.parseInt(reader.readLine());

        System.out.println("Enter no2: ");
        b = Integer.parseInt(reader.readLine());

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println((a+b)/2);

        double avg = ((double)a+b)/2;
        System.out.println(avg);

        int distance = Math.abs(a-b);
        System.out.println(distance);

    }
}
