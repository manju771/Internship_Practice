import java.util.Scanner;
 class Temperature{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the temperature:");
        Double temperature=sc.nextDouble( );
         System.out.print("Enter the unit of the temperature (C or F):");
        String unit=sc.next( );
        double convertedTemperature;
        if(unit.equalsIgnoreCase("C")) {
            convertedTemperature=(temperature*9/5)+32;
            System.out.println(temperature+"degrees Celsius is equal to"+convertedTemperature+"degrees Fahrenheit.");
        } else if (unit.equalsIgnoreCase("F")) { 
            convertedTemperature=(temperature-32)*5/9;
            System.out.println(temperature+"degrees Fahrenheit is equal to"+ convertedTemperature+"degrees Celsius.");
        } else {
            System.out.println("Invalid unit.");
        }
    }
}