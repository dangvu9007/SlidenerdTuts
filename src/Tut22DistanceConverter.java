import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tut22DistanceConverter {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter distance in meters: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double meters = Double.parseDouble(reader.readLine());

        // 1 meter = 39.3701 inches
        double inches = meters*39.3701;
        System.out.println(inches);

        // 1 foot = 12 inches
        // 1 yard = 3 feet
        // 1 mile = 1760 yards
        // 1 mile = 5280 feet

        int miles = (int) inches/63360;
        System.out.println(miles);

        int feet = (int)(inches-miles*63360)/12;
        System.out.println(feet);

        //int inch = (int)(inches-miles*63360-feet*12);
        //System.out.println(inch);
        int inch2 = (int)inches%12;
        System.out.println(inch2);


    }
}
