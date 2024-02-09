import java.util.Scanner;
public class npronic {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int c=0,num=1,num1,letest=0,i=1;
        System.out.print("Enter the range number: ");
        int rangeno=sc.nextInt();
        while(c!=rangeno){
            num1=num;
            int count=0;
            for(i=1;i<=num1;i++){
                if(i*(i+1)==num1){
                    count=1;
                    break;
                }
            }
            if(count==1){
                c++;
                letest=num;
            }
            num=num+1;

        }
        System.out.print("The range number is "+letest);
        sc.close();
    
    }
    
}
