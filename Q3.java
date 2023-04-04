//Input Format:First line of the input is an integer N that gives the number of rows and columns of the grid.Next N lines will have a valid initial board configuration with N*N cells. Assume that the maximum number in a cell can be 10. Grey colored cells are represented by the integer 20 in the matrix representation of the input configuration.
import java.util.Scanner;
class Q3{
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number of rows");
   int n=sc.nextInt();
    int sum=0;
    int a[][]=new int[n][n];
    System.out.println("Enter elements of array");
    int count=0;
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        a[i][j]=sc.nextInt();
      }
      System.out.println();
    }
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        if(a[i][j]<10 || a[i][j]!=20){
          if(a[i][j]<10)
          sum=a[i][j]+sum;
            
        }
      }
    }
    System.out.println(sum);
  }
}
 




