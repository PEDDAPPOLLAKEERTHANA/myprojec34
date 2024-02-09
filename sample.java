import java.util.Scanner;
public class prime{
    public static void main(String args[]){
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int r1=sc.nextInt();
        int r2=sc.nextInt();
        int count=0;
        for(i=r1;i<=r2;i++)
        {
            count=0;
            n=i;
            for(j=2;j<n;j++){

                if(n%j==0){
                count++;
                break;
                }
            }
            if(count==0){
                     System.out.print(n+" ");
            }
        }
    }
       
    
}
