import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tut21TimeConverterCode {
    public static void main(String[] args)throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter distance in km: ");
        double distance =  Double.parseDouble(reader.readLine());

        System.out.println("Enter speed km/hr: ");
        double speed =  Double.parseDouble(reader.readLine());

        distance = distance*1000;
        speed = speed*1000/3600;

        double time = distance/speed;
        //System.out.println(time);

        int hrs = (int)time/3600;
        //System.out.println(hrs);

        int mins = (int)(time - hrs*3600)/60;
        //System.out.println(mins);

        //int secs = (int)(time-(hrs*3600)-(mins*60));
        int secs = (int)time%60;
        //System.out.println(secs);

        if (hrs==1) {
            System.out.println("You took " + hrs + " hour, " + mins + " minutes, " + secs + " seconds");
        }
        if (mins==1){
            System.out.println("You took "+hrs +" hours, "+mins+" minute, "+secs+" seconds");
        }
        if (secs==1){
            System.out.println("You took "+hrs +" hours, "+mins+" minutes, "+secs+" second");
        }
            if (hrs==1 && mins==1) {
                System.out.println("You took " + hrs + " hour, " + mins + " minute, " + secs + " seconds");
            }
                if (mins == 1 && secs == 1) {
                    System.out.println("You took " + hrs + " hours, " + mins + " minute, " + secs + " second");
                }
                    if (hrs == 1 && secs == 1) {
                        System.out.println("You took " + hrs + " hour, " + mins + " minutes, " + secs + " second");
                    }
                        if (hrs == 1 && mins == 1 && secs == 1) {

                            System.out.println("You took " + hrs + " hour, " + mins + " minute, " + secs + " second");

                            if (hrs > 1 && mins > 1 && secs > 1) {
                                System.out.println("You took " + hrs + " hours, " + mins + " minutes, " + secs + " seconds ");
                            }

                            if (hrs < 1 ) {
                                System.out.println("You took " + mins + " minutes, " + secs + " seconds ");
                            }
                        }
                    }
                }
