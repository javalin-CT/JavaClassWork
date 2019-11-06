package com.example.ReviewProjects.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Syntax_And_Notes {
    public static void main(String[] args) {
        //Declare
        ArrayList<Integer> var = new ArrayList<>();
        ArrayList<Boolean> boo = new ArrayList<>();
        ArrayList<Double> dou = new ArrayList<>();
        ArrayList<String> str = new ArrayList<>(Arrays.asList("A","B","C"));
        ArrayList<String> str2 = new ArrayList<>(Arrays.asList("A","B","C"));

        // etc

        //to add lots of elements at a time
        ArrayList<Integer> ArrList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));

    // methods
    //add(index, object)
        var.add(10);
        var.add(20);
        var.add(1,30);
        var.add(2,50);
        var.add(4,40);
    //cannot add index out of order

    //get(index number): returns the object at the given index
        var.get(1); // 20
        System.out.println(var.get(0));


    //size(): returns the length as int
        var.size();
        System.out.println(var.size());

    //clear(): removes all objects from arraylist
        var.clear();
        System.out.println(var);

    //set(index,object): replaces object at given index
        var.add(1);var.add(2);var.add(3);var.add(5);var.add(4);var.add(1);
        var.add(1);var.add(2);var.add(3);var.add(5);var.add(4);var.add(1);
        var.set(0,5); // index 0 is now 5

    //indexOf(object): returns the first matching objects index number
        var.indexOf(2); //returns 3

    //equals(): checks if two arraylists are equal, returns boolean
        str.equals(str2); // returns true

    //contains(object): checks if arraylist contains a specific object
        str.contains("A");

    //isEmpty(); checks if the arrylist is empty
        str.isEmpty();

    //remove(primitives int): removes the index number
    //remove(wrapper class): removes the object
        //not designed to be used in the loop
        str.remove("A");
        var.remove(1);
        var.remove((Integer) 1);
    //removeAll(interface);
        //use Arrays.asList
        var.removeAll(Arrays.asList(2));

    //addAll(interface): adds multiple objects to arraylist
        var.addAll(Arrays.asList(12,3,212,43,555,665,36,34));

    //Collections.sort(ArrayList): sorts the arraylist in ascending order
        Collections.sort(var);
        //can be used on arrays
        Integer [] arr = {12,3,23,23,2,3,45,6,7,5,34,3};
        ArrayList<Integer> lists = new ArrayList<>(Arrays.asList(arr));
        Collections.sort(lists);

    //Convert Arraylist to array
        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("java", "python"));

        String [] copyList = new String [words.size()];
        words.toArray(copyList);
        System.out.println(Arrays.toString(copyList));
        System.out.println();
    //Convert Array to arrayList
        ArrayList<String> copyBack = new ArrayList<>(Arrays.asList(copyList));
        System.out.println(copyBack);


    }
    //creating a method to return arrayList
    //it is necessary to specify the AL type
    public static ArrayList<Integer> ArraytoArrayList(int [] arr){
        ArrayList<Integer> list = new ArrayList<>();
        return list;
    }

}
