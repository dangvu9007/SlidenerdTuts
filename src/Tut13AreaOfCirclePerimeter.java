import java.util.Scanner;

public class Tut13AreaOfCirclePerimeter {
    public static void main(String[] args){
        System.out.println("What is the radius?");

        Scanner scan = new Scanner(System.in);
        //String r = scan.nextLine();

        double r = Double.parseDouble(scan.nextLine());
        double pi = 3.14;
        double P = 2*pi*r;
        System.out.println("The Perimeter of the circle is "+P);

        double A = pi*r*r;
        System.out.println("The Area of the circle is "+A);

    }

}
