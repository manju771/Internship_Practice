import java.util.Scanner;
class Divisibleby5{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a[][]={{2,4,6},{5,8,13},{15.18.19}};
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        if(a[i][j]%5==0){
          System.out.println(a[i][j]);
        
      }
    }
  }
} 