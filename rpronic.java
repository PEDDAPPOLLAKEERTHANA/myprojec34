import java.util.Scanner;
public class rpronic {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int r1,r2,num,i,j;
        System.out.print("Enter the range: ");
        r1=sc.nextInt();
        r2=sc.nextInt();
        for(i=r1;i<=r2;i++){
            num=i;
            
            for(j=1;j<=num;j++){
                if(j*(j+1)==num){
                    System.out.print(num+" ");
                }
            }
        }
        sc.close();
    }
    
}
