import java.util.Scanner;
class EqualMatrices{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a[][]=new int[3][3];
    int b[][]=new int[3][3];
    System.out.println("Enter elements of array");
    int count=0;
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        a[i][j]=sc.nextInt();
      }
      System.out.println();
    }
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        a[i][j]=sc.nextInt();
      }
      System.out.println();
    }
    int equal[][]=new int[3][3];
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
       }
    }
    if(a[i][j]==a[i][j]){
      System.out.println("Matrices are equal");
        }
    else{
      System.out.println("Matrices are not equal");
    }
    }
  }
