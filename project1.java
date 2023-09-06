import java.util.*; 
 
public class CollectionsDemo { 
 
    public static void main(String[] args) { 
         
        Set<String> set = new HashSet<>(); 
        set.add("John"); 
        set.add("Doe"); 
        set.add("Jane"); 
        set.add("Smith"); 
 
       
        set.add("John"); // This will not be added because "John" already exists in the set 
 
       
        set.remove("Doe"); 
 
         
        System.out.println("Is John in the set? " + set.contains("John")); 
 
         
        System.out.println("The number of elements in the set is: " + set.size()); 
 
         
        for (String name : set) { 
            System.out.println(name); 
        } 
 
        
        List<Integer> list = new ArrayList<>(); 
        list.add(1); 
        list.add(2); 
        list.add(3); 
        list.add(4); 
        list.add(5); 
 
         
        list.add(6); 
 
         
        list.remove(3); 
 
         
        System.out.println("Is 1 in the list? " + list.contains(1)); 
 
         
        System.out.println("The number of elements in the list is: " + list.size()); 
 
         
        for (int number : list) { 
            System.out.println(number); 
        } 
 
         
        Map<String, String> map = new HashMap<>(); 
        map.put("name", "John Doe"); 
        map.put("age", "30"); 
        map.put("city", "New York"); 
 
         
        map.put("occupation", "Software Engineer"); 
 
         
        System.out.println("John Doe's occupation is: " + map.get("occupation")); 
 
         
        System.out.println("Does the map have a key named 'name'? " + map.containsKey("name")); 
 
         
        for (String key : map.keySet()) { 
            System.out.println(key + ": " + map.get(key)); 
        } 
    } 
}
