import java.util.Scanner;
    class ArrayDemo{
  public static void main(String args[]){
    int arr[]={10,20,30,40,50};
    int index=3;
    int arr1[]=new int[arr.length];
    for(int i=0;i<arr.length;i++){
      if (i<index){
        arr1[i]=arr[i];
      }
      else{
        arr1[i]=arr[i-index];
      }
    }
    for(int i=index;i<arr.length;i++){
      System.out.println(arr[i]+"");
    }
  }
}