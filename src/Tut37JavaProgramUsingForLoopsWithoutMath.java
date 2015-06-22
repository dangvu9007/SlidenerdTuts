import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tut37JavaProgramUsingForLoopsWithoutMath {
    public static void main(String[] args) throws IOException{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int b,e;

        System.out.println("Enter base ");
        b=Integer.parseInt(reader.readLine());
        System.out.println("Enter exponent ");
        e=Integer.parseInt(reader.readLine());

        int t=1;
        for (int i=1; i<=e; i++){
            t=t*b;
        }
        System.out.println(t);

    }
}
