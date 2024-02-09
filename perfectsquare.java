import java.util.Scanner;
public class perfectsquare {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,i,result=0;
        n=sc.nextInt();
        for(i=0;i<=n;i++){
            if(n==i*i){
                result=1;
            }
        }
        if(result!=0){
            System.out.println(n+" It is a perfect square");

        }
        else{
            System.out.println("It is not a perfect square");
        }
        

    }
    
}
