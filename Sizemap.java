//Write a Java program to get the size of a Map.
import java.util.HashMap;
import java.util.Map;
class Sizemap{
  public static void main(String args[]){
    HashMap<Integer,String> hm=new HashMap<Integer,String>();
    hm.put(123,"Rachana");
    hm.put(453,"Amitha");
    int size=hm.size();
      System.out.println("size: "+size);
    }
  }
