import java.util.Scanner;

public class Tut16FtoCTempConverter {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter temperature in F ");

        String data = scan.nextLine();
        double far = Double.parseDouble(data);

        double cel = (far-32)*5/9;

        System.out.println(cel);
    }

}
