import java.util.Scanner;
public class Automorphic{
    public static boolean isAutomorphic(int n)
    {
        int sq = n*n;
        return Integer.toString(sq).endsWith(Integer.toString(n));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        if(isAutomorphic(a))
        {
            System.out.println("Automorphic");
        }
        else{
            System.out.println("Not Automorphic");
        }

    }
}