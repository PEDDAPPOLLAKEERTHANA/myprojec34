import java.util.Scanner;
public class nprime {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,num=2,c=0,rangenum,letest=0,count=0;
        System.out.print("Enter the range number: ");
        rangenum=sc.nextInt();
        while(c!=rangenum){
            count=0;
            for(i=2;i<=(num/2);i++)
            {
                if(num%i==0)
                {
                    count++;
                    //break;
                }
            }
            if(count==0)
            {
                c++;
                letest=num;
            }
            num=num+1;

        }
        System.out.print("Prime range number is "+letest);
        sc.close();
    }
    
}
