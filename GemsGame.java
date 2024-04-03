
package Assignments;
import java.util.*;

class  GemsGame
{
    public static int getRandomNum(int max,int min )
    {

        return (int)(Math.random()*(max-min)+min);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter Maximun Value :");
        int max =sc.nextInt();
        System.out.print("\nEnter Minimum Value :");
        int min=sc.nextInt();
        int gem1=getRandomNum(max,min);
        int ans=max;
        int b=8;
        int a=5;
        while(ans>0)
        {
            int gem2;
            {
                for(int i=1;ans>=0;i++)
                {
                    System.out.print("\nCHOOSE YOUR GEMS BETWEEN " +a+" AND "+b+" :");
                    gem2=sc.nextInt();
                    if(gem2<b&&gem2>a)
                    {
                        ans=gem1-gem2;
                        if(ans<=0)
                        {
                            System.out.println("\nYOU WIN");
                        }
                        else
                        {

                            gem2=getRandomNum(a,b);
                            System.out.println("\nCOMPUTER's GEMS "+gem2);
                            ans=ans-gem2;
                            if(ans<=0)
                            {
                                System.out.println("\nCOMPUTER WIN ");
                            }
                            else
                            {
                                a+=4;
                                b+=4;
                                gem1=ans;
                            }
                        }
                    }
                    else
                    {
                        System.out.println("\nCHOOSE A VALUE OF GEMS WITHIN THE RANGE");
                    }
                }
            }

        }
    }

}
