public class Practicetwo {
    public static void main(String[] args) {
        int[][] arr = {{0,1,2,3},{3,4,5,6},{6,7,8,9}};
        out(arr);
    }
    public static void out(int[][] arr){
         int sum = 0;
        int totalsum = 0;
        for(int[] row: arr){
            sum = 0;
            for (int col : row){
                sum += col;
                totalsum+=col;
            }
            System.out.println("Sum: " + sum);
        }
        System.out.println((double)totalsum/arr.length);
        
    }
    }
