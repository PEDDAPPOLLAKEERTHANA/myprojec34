import java.util.Scanner;
public class rsunny {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int r1,r2,num,i;
        double root;
        System.out.print("Enter the range:");
        r1=sc.nextInt();
        r2=sc.nextInt();
        for(i=r1;i<=r2;i++){
            num=i;
            //double root;
            root=Math.sqrt(num+1);
            if((int)root==root){
                System.out.print(i+" ");
            }

        }
        sc.close();

    }
}
