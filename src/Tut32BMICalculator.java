import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tut32BMICalculator {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter weight in kg: ");
        double weight = Double.parseDouble(reader.readLine());

        System.out.println("Enter height in cm: ");
        double height = Double.parseDouble(reader.readLine());
        height = height/100;

        double bmi = weight/(height*height);

        if (bmi<18.5){
            System.out.println("Your BMI is "+bmi+" and you are underweight");
        }
        else if (bmi>=18.5 && bmi<25){
            System.out.println("Your BMI is "+bmi+" and you are normal");
        }
        else if (bmi>=25 && bmi<30){
            System.out.println("Your BMI is "+bmi+" and you are overweight");
        }
        else if (bmi>30){
            System.out.println("Your BMI is "+bmi+" and you are obese");
        }
        else{
            System.out.println("Incorrect BMI");
        }

    }
}
