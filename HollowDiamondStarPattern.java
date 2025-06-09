import java.util.Scanner;
public class HollowDiamondStarPattern{
    public static void main(String args[]){
        Scanner snr=new Scanner(System.in);
	System.out.println("Enter the number of rows to print");
        int n=15;
	System.out.println("The pattern is: ");
        for(int i=0;i<=n;i++){
            for(int j=0;j<n;j++){
                if(i==0||i==n||j==0||j==n-1||i+j<=n/2||i+j>=22||((i>0)&&(i<n/2)&&(j>=i+(n/2))&&(i+j>=9))||(i>(n/2)+j)&&(j<=n/2)&&(i+j>=10)){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}