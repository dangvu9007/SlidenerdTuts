import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tut33SquareCubeForLoop {
    public static void main(String[] args){

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i=2; i<=40; i+=2){

            int square=i*i,cube=i*i*i;

            System.out.println(i+" \t"+square+" \t"+cube);
        }

    }
}
