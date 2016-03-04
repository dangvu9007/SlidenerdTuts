import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tut30Do3SidesMakeTriangle {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a, b, c;
        double p, temp, area;
        System.out.println("Enter length of a; ");
        a = Integer.parseInt(reader.readLine());

        System.out.println("Enter length of b; ");
        b = Integer.parseInt(reader.readLine());

        System.out.println("Enter length of c; ");
        c = Integer.parseInt(reader.readLine());

        if (a+b>c && a+c>b && b+c>a){
            p=a+b+c;
            temp = p*0.5;
            area = Math.sqrt((temp)*(temp-a)*(temp-b)*(temp-c));
            System.out.println("This is a triangle with Perimeter "+p+ " and Area "+area);
        }
        else{
            System.out.println("This is not a triangle");
        }
    }
}
