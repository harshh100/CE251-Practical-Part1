import java.util.Scanner;

public class part1_2 {
      //Created by HARSH PATEL
    //ID NO 21CE090
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        String a;
        a=sc.next();
        if(a.charAt(0)=='o')
        {
            System.out.print("o");
            if(a.charAt(1)=='z')
            {
                System.out.println("z");
            }
        } else if (a.charAt(1)=='z') {
            System.out.println('z');
        }
        else
        {
            System.out.print(a.charAt(0));
            System.out.print(a.charAt(1));
        }
    }
}
