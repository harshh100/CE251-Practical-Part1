import java.lang.Math;
public class part1_7 {

    //Created by HARSH PATEL
    //ID NO 21CE090
    public static void main(String[] args) {
        int n;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 15; j++) {

                if(j==7)
                {
                    n=(int)Math.pow(2,i);
                    System.out.print(n+" ");
                } else if (j<7) {

                  if(j+i>=7) {
                       n=(int)Math.pow(2,i+j-7);
                       System.out.print(n+" ");

                   } else {
                       System.out.print("  ");
                   }

                }else if (j>7) {

                     if(j-i<=7) {
                        n=(int)Math.pow(2,7-j+i);
                        System.out.print(n+" ");

                    }else {
                        System.out.print("  ");
                    }

                }


            }
            System.out.print("\n");
        }
    }
}
