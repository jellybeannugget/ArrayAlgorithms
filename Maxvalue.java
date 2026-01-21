public class Maxvalue {
public static void main(String[] args) {
    int nums [] = {-2, 0, 5, 7, 9};
    //iterate the array with a for loop
    int max = nums[0];

    for (int i = 0; i < nums.length; i++){
        if (nums[i] > max){
            max = nums[i];
            System.out.println(max);

        }
    }
    
    System.out.println(max);
    }
}
