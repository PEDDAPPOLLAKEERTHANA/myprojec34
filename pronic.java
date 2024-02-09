import java.util.Scanner;
public class pronic {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num,i,count=0;
        System.out.print("Enter a number:");
        num=sc.nextInt();
        for(i=1;i<=num;i++){
            if(i*(i+1)==num){
                count++;
                break;
            }
        }
        if(count!=0){
            System.out.println("It is a pronic number");
        }
        else{
            System.out.println("It is not a pronic number");
        }
        sc.close();
    }
    
}
