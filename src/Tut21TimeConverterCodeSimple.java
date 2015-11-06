import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tut21TimeConverterCodeSimple{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter distance travelled in km: ");
        double distance = Double.parseDouble(br.readLine());

        System.out.println("Enter speed in km/hr: ");
        double speed = Double.parseDouble(br.readLine());

        distance = distance*1000;
        speed = (speed*1000)/3600;

        double time = distance/speed;

        System.out.println(time+"s");

        int hrs= (int)time/3600;
        System.out.println(hrs);
        int mins = (int)(time-(hrs*3600))/60;
        System.out.println(mins);
        //int secs = (int)time-(hrs*3600)-(mins*60);
        int secs = (int)time%60;
        System.out.println(secs);

    }
}