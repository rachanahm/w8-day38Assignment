//Write a Java program to copy all the key-value pairs of one Map to another Map.
import java.util.HashMap;
import java.util.Map;
class Copymap{
  public static void main(String args[]){
    HashMap<Integer,String> hm1=new HashMap<Integer,String>();
    hm1.put(123,"Rachana");
    hm1.put(453,"Amitha");
    HashMap<Integer,String> hm2=new HashMap<Integer,String>(hm1);
    System.out.println("map1:"+hm1);
    System.out.println("map2:"+hm2);
    }
  }
