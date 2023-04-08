//Write a Java program to remove a key-value pair from a Map.
import java.util.HashMap;
import java.util.Map;
class Remove{
  public static void main(String args[]){
    HashMap<Integer,String> hm=new HashMap<Integer,String>();
    hm.put(123,"Rachana");
    hm.put(453,"Amitha");
      Integer key=123;
     if (hm.containsKey(key)) {
      String value=hm.remove(key);
       System.out.println( key + " and value " + value + " has been removed from the map.");
    }
  }
}