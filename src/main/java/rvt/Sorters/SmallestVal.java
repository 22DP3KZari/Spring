package rvt.Sorters;

public class SmallestVal {
    public static int smallest(int[] array){
        int smallest = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] < smallest){
                smallest = array[i];
            }
        }
        return smallest;
    }
    
}
