//Write a Java program to iterate over the key-value pairs of a Map using the entrySet() method.
import java.util.HashMap;
import java.util.Map;
class Entrymap{
  public static void main(String args[]){
    HashMap<Integer,String> hm=new HashMap<Integer,String>();
    hm.put(123,"Rachana");
    hm.put(453,"Amitha");
    for(Map.Entry m:hm.entrySet()){
      System.out.println("key: "+m.getKey()+" "+"value: "+m.getValue());
    }
  }
}