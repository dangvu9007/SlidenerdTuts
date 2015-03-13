import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tut18AreaOfCylinder {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the radius: ");

        String input1 = br.readLine();
        double radius = Double.parseDouble(input1);

        System.out.println("Enter the height: ");

        String input2 = br.readLine();
        double height = Double.parseDouble(input2);

        double pi = 3.14;

        //double area = (2*pi*radius*radius)+(2*pi*radius*height);
        double area = 2*pi*radius*(radius+height);

        System.out.println("Volume of Cylinder: "+area);
    }
}

