import java.util.Scanner;
class Array1{
  static void create(int n,int arr[]){
    Scanner sc=new Scanner(System.in);
   System.out.println("enter array elements");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
  }
  static void display(int n,int abc[]){
    System.out.println("**Elements**");
    for(int i=0;i<n;i++){
    System.out.print(abc[i]);
  }
  }
  public static void main(String args[]){
     int a[]=new int[10];
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter size");
    n=sc.nextInt();
    create(n,a);
    display(n,a);
  }
}
