import java.util.Scanner;
class Array2d{
  public static void main(String args[]){
    int a[][]={{10,20,30},{15,25,35},{12,22,32}};
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        System.out.print(a[i][j]+"");
      }
      System.out.println();
    }
    System.out.println(a[2][2]);
  }
}