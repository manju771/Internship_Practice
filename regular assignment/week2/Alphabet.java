import java.util.Scanner;
class Alphabet{
public static void main(String args[]){
  char ch;
  Scanner sc=new Scanner(System.in);

  System.out.println("Enter a character");
  ch=sc.next().charAt(0);

  if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
    System.out.println("Alphabet");
  }
  else{
    System.out.println("Not Alphabet");
  }
  
} 
}