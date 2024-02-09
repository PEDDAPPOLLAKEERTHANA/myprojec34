import java.util.Scanner;
public class rperfectnumber {
    public static void main(String args[]){
        int i,r1,r2,j,num,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range:");
        r1=sc.nextInt();
        r2=sc.nextInt();
        for(i=r1;i<=r2;i++){
            num=i;
            sum=0;
            for(j=1;j<num;j++)//j<=num it is not used here
            {
                if(num%j==0)
                {
                    sum+=j;
                }
            }

            if(sum==i){
                System.out.print(i+" ");
            }
            
        }
        sc.close();
    }
}
