//feb 26 yusef
public class TwoDpractice{
public static void main(String[] args) {
    int[][] arr = {{0,1,2},{3,4,5},{6,7,8},{9,10,11}};
    out(arr);

}
public static void out(int[][] arr){
    for(int[] row: arr){
        for (int col : row){
            System.out.print(col + " ");
        }
        System.out.println();
    }
}
}