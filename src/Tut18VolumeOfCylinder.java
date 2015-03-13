import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tut18VolumeOfCylinder {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter radius: ");

        String input1 = br.readLine();
        double radius = Double.parseDouble(input1);

        System.out.println("Enter height: ");

        String input2 = br.readLine();
        double height = Double.parseDouble(input2);

        double pi = 3.14;

        double volume = pi*radius*radius*height;

        System.out.println("Volume of Cylinder: "+volume);
    }
}
