package homework;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> myArrayList = new ArrayList<>();
        myArrayList.add("Cesar");
        myArrayList.add("Alex");
        myArrayList.add("Walter");

        for (String arrayList : myArrayList)
            System.out.println(arrayList);

        System.out.println("==========");

        System.out.println(myArrayList.indexOf("Alex"));
        System.out.println(myArrayList.get(1));
        System.out.println("==========");

        myArrayList.remove("Walter");
        //  OR
        // myArrayList.remove(2);

        Object[] listToArray = myArrayList.toArray();

        //MAPS!!!

        Map<String, Integer> nameCount = new HashMap<>();
        nameCount.put("Cesar", 5);
        nameCount.put("Walter", 6);
        nameCount.put("Rebecca", 7);

        System.out.println("Number of letters in Cesar: " + nameCount.get("Cesar"));
        System.out.println("Names in this list are: " + nameCount.keySet());

        if (nameCount.containsKey("Cesar"))
            System.out.println("Yes! This name was found!");
        else
            System.out.println("No! This name was not found.");


        int letterCount = 0;
        for (Integer value : nameCount.values()){
            letterCount += value;
        }
        System.out.println("Total letters in Map list array: " + letterCount);
        System.out.println("==========");


        //SETS!!

        //Initializing a set
        Set<String> customSet = new HashSet<>();
        //Adding Elements
        customSet.add("Hello");
        customSet.add("there");
        customSet.add("world.");
        //Set Operations - Intersections
        Set<String> frontEnd = new HashSet<>(Arrays.asList("HTML", "CSS", "JS"));
        Set<String> backEnd = new HashSet<>(Arrays.asList("Java", "C#", "Ruby", "JS"));
        Set<String> intersection = new HashSet<>(backEnd);
        intersection.retainAll(frontEnd);
        for (String customVariable : intersection)
            System.out.println(customVariable);
        //Set Union
        Set<String> union = new HashSet<>(backEnd);
        union.addAll(frontEnd);
        for (String v : union)
            System.out.println(v);



    }
}
