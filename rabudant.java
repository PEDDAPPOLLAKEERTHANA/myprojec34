import java.util.Scanner;
public class rabudant{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int r1,r2,i,j,num,sum=0;
        System.out.print("Enter the range: ");
        r1=sc.nextInt();
        r2=sc.nextInt();
        for(i=r1;i<=r2;i++){
            num=i;
            sum=0;
            for(j=1;j<num;j++)
            {
                if(num%j==0){
                    sum=sum+j;
                }
            }
            if(sum>i){
                System.out.print(i+" ");
            }
            

        }
        //sc.close();

    }
    
}
