import java.util.Scanner;
public class pattern12 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        for(int row=0;row<=n;row++){
            for(int col=0;col<=n;col++){
                if(row-col<=0){
                    System.out.print(" "+"*");
                }
                else{
                    System.out.print(" ");
                }
                //System.out.print(" ");
            }
            
            
            System.out.println();
        
        }
        for(int row=0;row<=n;row++){
            for(int col=0;col<=n;col++){
                if(row+col>=n){
                    System.out.print(" "+"*");
                }
                else{
                    System.out.print(" ");
                }
                //System.out.print(" ");
            }
            
            
            System.out.println();
        
        }
        sc.close();
    }
    
}
