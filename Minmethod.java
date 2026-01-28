public class Minmethod{
    public static  int locateMinimum(int[] arr){
        int min = arr[0];
        
        for (int i = 1; i< arr.length; i++){
        if (arr[i] < min){
        min = arr[i];
        }
        }
        return min;

    }
        
    public static void main(String[] args) {
        int[] num = {9,7,2,7,9,2,0,5,3}; 
       System.out.println(locateMinimum(num));
}
}