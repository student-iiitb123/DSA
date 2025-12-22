
import java.util.HashMap;

// hashmap is the key value pair 
//hashmap is a datastructure with store data is key value pair form we have one key and one value 
//key value is unique and value may be different or same 
//insert remove and search time complixity o(k)
//import java.util.hasma
// Hashmap<String,Integer> hm = new Hashmap<>()
//put(key,value)

public class hashmap {
    public static void main(String[] args) {
        //crete
        HashMap<String,Integer> hm = new HashMap<>();
        //Insert
        hm.put("india", 100);
        hm.put("China", 50);
          hm.put("US", 80);

       System.out.println(hm);
       //In hahmap randomply added 


       //get operation 
    int population =   hm.get("india");
    System.out.println(population);

    //contain keys
    //check key exist or not 
    System.out.println(hm.containsKey("india"));

    //remove operation 
    System.out.println(hm.remove("india"));

    System.out.println(hm);

    //size of the map
    System.out.println(hm.size());

    System.out.println(hm.isEmpty());

    hm.clear();
    }
}

