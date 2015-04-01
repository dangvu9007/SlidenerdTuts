import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tut29RightAngleTriangle {

    public static void main(String[] args)throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double a=0, b=0, c=0, hypot=0;
        System.out.println("Enter length of side 1: ");
        a = Double.parseDouble(reader.readLine());

        System.out.println("Enter length of side 2: ");
        b = Double.parseDouble(reader.readLine());

        System.out.println("Enter length of side 3: ");
        c = Double.parseDouble(reader.readLine());


        if (a>b && a>c){
            hypot=a;
            if (hypot*hypot == b*b + c*c) {
                System.out.println("This is a Right-angle triangle with hypotenuse "+hypot);
            }
            else{
                System.out.println("Not a Right-angle triangle");
            }
        }
        if (b>a && b>c) {
            hypot = b;
            if (hypot*hypot == a*a + c*c) {
                System.out.println("This is a Right-angle triangle with hypotenuse "+hypot);
            } else {
                System.out.println("Not a Right-angle triangle");
            }
        }
        if (c>a && c>b) {
            hypot = c;
            if (hypot*hypot == a*a + b*b) {
                System.out.println("This is a Right-angle triangle with hypotenuse "+hypot);
            } else {
                System.out.println("Not a Right-angle triangle");
            }
        }
    }
}
