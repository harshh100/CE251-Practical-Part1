import java.util.*;

public class part1_6 {
    //Created by HARSH PATEL
    //ID NO 21CE090
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l;
        System.out.print("Enter length :");
        l=sc.nextInt();
        String[] a=new String[l];
        String[] x=new String[l];

        for(int i=0;i<l;i++)
        {
            a[i]=sc.next();
        }
        String b;
        b=sc.next();
        int n=0;
        for(int j=0;j<l;j++)
        {

             if(!a[j].contains(b))
             {
                 x[n]=a[j];
                 n++;
             }
        }

        for (int q=0;q<n;q++)
        {

            System.out.print(x[q]);
        }

    }
}
