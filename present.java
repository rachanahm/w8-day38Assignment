//Write a Java program to check if a particular key is present in a Map.
import java.util.HashMap;
import java.util.Map;
class present{
  public static void main(String args[]){
    HashMap<Integer,String> hm=new HashMap<Integer,String>();
    hm.put(123,"Rachana");
    hm.put(453,"Amitha");
      String key = "Rachana";
        if (hm.containsKey(key)) {
            System.out.println("The map contains the key: " + key);
        } else {
            System.out.println("The map does not contain the key: " + key);
        }
    }
  }
