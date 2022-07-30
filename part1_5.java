import java.util.*;

public class part1_5 {

    //Created by HARSH PATEL
    //ID NO 21CE090
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String a;
        String b;
        System.out.print("Enter String a:");
        a=sc.next();
        System.out.print("Enter String b:");
        b=sc.next();
        int p=a.length();
        int q=b.length();
        int n=0;
        int count=0;
        if(p>q)
        {
            n=q;
        }
        else
        {
            n=p;
        }

        for(int i=0;i<n-1;i++)
        {
            if(a.charAt(i)==b.charAt(i))
            {
                if(a.charAt(i+1)==b.charAt(i+1))
                {
                    count++;
                }

            }
        }
        System.out.println(count);

    }
}
