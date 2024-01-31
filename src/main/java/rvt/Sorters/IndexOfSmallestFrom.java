package rvt.Sorters;

public class IndexOfSmallestFrom {
    
    public static int[] IndexOfSmallestFrom;
    
    public int[] sort(int[] array){
        for (int i = 0; i < array.length; i++){
            int smallest = SmallestVal.smallest(array);
            swap(array, i, smallest);
        }
        
        return IndexOfSmallestFrom;
    }
    
    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
