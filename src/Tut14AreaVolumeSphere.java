import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

public class Tut14AreaVolumeSphere {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is the Radius of the sphere ");

        //String data = br.readLine();

        double rad = Double.parseDouble(br.readLine());
        double pi = 3.14;

        double A = 4*pi*rad*rad;

        System.out.println("The Area of the Sphere is " + A);

        double V = (4/3)*pi*(rad*rad*rad);

        System.out.println("The Volume of the Sphere is "+V);
    }
}
