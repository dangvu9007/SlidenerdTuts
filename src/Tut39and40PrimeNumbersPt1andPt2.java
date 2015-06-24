public class Tut39and40PrimeNumbersPt1andPt2 {

    public static void main(String[] args){

        int cnt=0;
        for (int n=2; n<=100; n++){

            for (int i=1; i<=n; i++){

                double ans= (double)n/i;
                if (ans==Math.ceil(ans)){
                    cnt++;
                }
            }if (cnt==2)
                System.out.println(n + " is a Prime Number");
                cnt=0;
        }
    }
}


