import java.util.Scanner;

public class part1_4 {
    //Created by HARSH PATEL
    //ID NO 21CE090
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int[] a= new int[10];
        int l;
        System.out.print("Enter lenth :");
        l=sc.nextInt();
        int count=0;
        for(int j=0;j<l;j++)
        {
            a[j]=sc.nextInt();
        }
        for(int i=0;i<l-2;i++)
        {
            if(a[i]==1)
            {
                if(a[i+1]==2)
                {
                    if(a[i+2]==3)
                    {
                        count++;

                    }
                }
            }
        }
        if(count==1)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }

    }

}
