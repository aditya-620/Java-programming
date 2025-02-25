import java.util.HashMap;
class hashmap1{
    public static void main(String[] args) {
        //creating a hashmap
        HashMap<String, Integer> map = new HashMap<>();

        //adding elements to the hashmap(Insert)
        map.put("India", 135);  
        map.put("China", 200);
        map.put("USA", 100);

        System.out.println(map); // {India=135, China=200, USA=100}

        //getting the value of a key - O(1)
        int population = map.get("India");
        System.out.println(population); // 135
         
        System.out.println(map.get("nepal")); // null

        //containsKey - O(1)
        System.out.println(map.containsKey("India")); // true
        System.out.println(map.containsKey("nepal")); // false

        //remove - O(1)
        System.out.println(map.remove("China")); // 200
        System.out.println(map.remove("nepal")); // null

        System.out.println(map); // {India=135, USA=100}


        //size - O(1)
        System.out.println(map.size()); // 2

        //isEmpty - O(1)
        System.out.println(map.isEmpty()); // false

        //keySet - O(n)
        System.out.println(map.keySet()); // [India, USA]

        //values - O(n)
        System.out.println(map.values()); // [135, 100]

        //entrySet - O(n)
        //returns a set of key-value pairs
        System.out.println(map.entrySet()); // [India=135, USA=100]

        //clear - O(1)
        map.clear();
        System.out.println(map); // {}
        System.out.println(map.isEmpty()); // true
    }
}