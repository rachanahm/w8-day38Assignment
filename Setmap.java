//Write a Java program to iterate over the key-value pairs of a Map using the keySet() method.
import java.util.HashMap;
import java.util.Map;
class Setmap{
  public static void main(String args[]){
    HashMap<Integer,String> hm=new HashMap<Integer,String>();
    hm.put(123,"Rachana");
    hm.put(453,"Amitha");
    for(Integer m:hm.keySet()){
      System.out.println("Key: " + m + ", Value: " + hm.get(m));
    }
  }
}
    
    
    
    