import java.util.LinkedHashMap;
class MapDemo1{
  public static void main(String args[]){
    LinkedHashMap<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
    map.put(10,1000);
    map.put(20,2000);
    map.put(30,3000);
      if(map.containsValue(2000)){
        System.out.println("Found");
      }
    else{
      System.out.println("Not Found");
    }
  }
  }
