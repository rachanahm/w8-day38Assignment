//Write a Java program to clear all the key-value pairs of a Map.
import java.util.HashMap;
import java.util.Map;
class Clearmap{
  public static void main(String args[]){
    HashMap<Integer,String> hm=new HashMap<Integer,String>();
    hm.put(123,"Rachana");
    hm.put(453,"Amitha");
    System.out.println("Map before clear: "+hm);
    hm.clear();
    System.out.println("Map after clear: "+hm);
    
    }
  }