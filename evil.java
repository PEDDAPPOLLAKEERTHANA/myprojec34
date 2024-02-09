import java.util.Scanner;
public class evil {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num,count=0;
        System.out.print("Enter a number: ");
        num=sc.nextInt();
        while(num!=0){
            if(num%2==1){
                count+=1;
            }
            num/=2;
        }
        if(count%2==0){
            System.out.println("It is a evil number");
        }
        else{
            System.out.println("It is a not a evil number");
        }
        sc.close();
    }
    
}
