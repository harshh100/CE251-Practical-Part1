import java.util.Scanner;

public class part1_3 {
    //Created by HARSH PATEL
    //ID NO 21CE090
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b;

        a=sc.nextInt();
        b=sc.nextInt();
        int p;
        p=b%10;
        if(a==p)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
