import java.util.Scanner;
public class nperfectno {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int rangeno,i,num=1,num2,c=0,letest=0;
        System.out.print("Enter the range number: ");
        rangeno=sc.nextInt();
        while(c!=rangeno){
            num2=0;
            for(i=1;i<num;i++){
                if(num%i==0){
                    num2=num2+i;
                }
            }
            if(num2==num){
                c++;
                letest=num;
            }
            num=num+1;
        }
        System.out.print("The range number is "+letest);
        sc.close();
    }
    
}
