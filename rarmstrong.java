import java.util.Scanner;
public class rarmstrong {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int r1,r2,num,num1,i,j,rem=0,res=0;
        System.out.print("Enter the range:");
        r1=sc.nextInt();
        r2=sc.nextInt();
        for(i=r1;i<=r2;i++){
            num=i;
            res=0;
            while(num!=0){
                rem=num%10;
                res+=rem*rem*rem;
                num/=10;
            }
            if(res==i){
                System.out.print(res+" ");
            }
        }
        sc.close();
    }
    
}
