public class Average {
    public static void main(String[] args) {
        int nums [] = {-2, 0, 5, 7, 9};
        //iterate the array with a for loop
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        avg = (double)sum/nums.length;
        System.out.println(avg);
        }
    }