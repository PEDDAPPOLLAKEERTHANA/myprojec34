import java.util.Scanner;
public class nsunny {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=1,c=0,letest=0,num1;
        System.out.print("Enter the range number: ");
        int rangeno=sc.nextInt();
        double root;
        while(c!=rangeno){
            num1=num;
            root=Math.sqrt(num1+1);
            if((int)root==root){
                c++;
                letest=num;
            }
            num=num+1;
        }
        System.out.print("The range number is: "+letest);
        sc.close();
    }
    
}
