public class Smallestvalue {

        public static void main(String[] args) {
            int[][] arr = {{0,1,2,3},{3,4,5,6},{6,7,8,9}};
            out(arr);
        }
        public static void out(int[][] arr){
            int sum = 0;

            int min = Integer.MAX_VALUE;
            for(int[] row: arr){
                for (int col : row){
                    if(col < min){
                    min = col;
                    sum += col;
                    }                  
                }
            min = Integer.MAX_VALUE;
                System.out.println("Sum: " + sum);
            }
            System.out.println((double)sum/arr.length);
            
        }
        }

