import java.util.Scanner;
class SearchValue{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n value");
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    System.out.println("Enter the value");
    int search=sc.nextInt();
    int count=0;
    for(int j=0;j<n;j++){
      if(a[j]==search){
        count++;
      }
    }
    System.out.println("the element is repeated:"+count);
    
  }
  
}