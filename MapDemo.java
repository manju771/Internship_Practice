import java.util.HashMap;
import java.util.Map;
class MapDemo{
  public static void main(String args[]){
    HashMap<Integer,String> map=new HashMap<Integer,String>();
    map.put(10,"ram");
    map.put(20,"sham");
    System.out.println(map);
    for(Map.Entry m:map.entrySet() ){
      System.out.println(m.getKey()+""+m.getValue());
    }
  }
  }
  
