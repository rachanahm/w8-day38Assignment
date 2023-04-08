//Write a Java program to iterate over the values of a Map using the values() method.
import java.util.HashMap;
import java.util.Map;
class Valuemap{
  public static void main(String args[]){
    HashMap<Integer,String> hm=new HashMap<Integer,String>();
    hm.put(123,"Rachana");
    hm.put(453,"Amitha");
    for(String m:hm.values()){
      System.out.println( " Value: " + m);
    }
  }
}
  