//66. Write a JAVAprogram to count total number of vowels and consonants in a string.

public class StringVowels{
	public static void main(String[] args){
      String str="manjunath";

    int vows=0;
    int cons=0;
      for(int i=0;i<str.length();i++){
         char ch=str.charAt(i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
          vows++;
        }else{
          cons++;
        }
      }
        System.out.println("total vowels are "+vows);
        System.out.println("total consonents are "+cons);
      
	}
}