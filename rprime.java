import java.util.Scanner;
public class rprime {
    public static void main(String args[]){
        int r1,r2,num,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range:");
        r1=sc.nextInt();
        r2=sc.nextInt();
        for(i=r1;i<=r2;i++){
            num=i;
            for(j=1;j<=num;j++){
                if(num==j*j){
                    System.out.print(num+" ");
                    break;
                }
            }

        }
        sc.close();
    }
    
}
