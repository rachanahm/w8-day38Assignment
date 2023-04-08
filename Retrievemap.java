//Write a Java program to retrieve a value from a Map using its key.
import java.util.HashMap;
import java.util.Map;
class Retrievemap{
  public static void main(String args[]){
    HashMap<String,Integer> hm=new HashMap<String,Integer>();
    hm.put("Rachana",123);
    hm.put("Amitha",345);
    String key = "Rachana";
        if (hm.containsKey(key)) {
            System.out.println("The map contains the key: " + key);
        } else {
            System.out.println("The map does not contain the key: " + key);
        }
    }
  }