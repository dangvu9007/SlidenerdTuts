import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tut24Compare2Numbers {
    public static void main(String[] args)throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a, b;
        System.out.println("Enter No1: ");
        a =Integer.parseInt(reader.readLine());

        System.out.println("Enter No2: ");
        b =Integer.parseInt(reader.readLine());

        if (a>b){
            System.out.println(a+" is bigger than "+b);
        }
            if (a<b) {
                System.out.println(b + " is bigger than " + a);
            }
                if (a==b) {
                    System.out.println("Both numbers are same");
                }




    }
}
