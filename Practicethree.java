public class Practicethree {

    public static void main(String[] args) {

        String[][] names = {
            {"Jack", "Jill", "Jane", "Joey"},
            {"Maura", "Molly", "Mason", "Maureen"},
            {"Emma", "Eileen", "Elizabeth", "Emma"}
        };

        String[][] shortNames = shortenMe(names);
        int row = countduplicates(shortNames);
        System.out.println(row);

        String[][] shifted = shiftMe(shortNames);

        for (int r = 0; r < shifted.length; r++) {
            for (int c = 0; c < shifted[0].length; c++) {
                System.out.print(shifted[r][c] + " ");
            }
            System.out.println();
        }
    }

    public static String[][] shortenMe(String[][] arr) {
        String[][] out = new String[arr.length][arr[0].length];
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[0].length; c++) {
                String s = arr[r][c];
                out[r][c] = s.substring(0, 3);
            }
        }
        return out;
    }

    public static int countduplicates(String[][] arr) {
        int bestRow = 0;
        int best = 0;
        for (int r = 0; r < arr.length; r++) {
            int count = 0;
            for (int i = 0; i < arr[0].length; i++) {
                for (int j = i + 1; j < arr[0].length; j++) {
                    if (arr[r][i].equals(arr[r][j])) count++;
                }
            }
            if (count > best) {
                best = count;
                bestRow = r;
            }
        }
        return bestRow;
    }

public static String[][] shiftMe(String[][] arr) {
     int rows = arr.length; int cols = arr[0].length; 
     String[][] out = new String[rows][cols]; 
     String last = arr[rows - 1][cols - 1]; 
     for (int r = rows - 1; r >= 0; r--) {
         for (int c = cols - 1; c >= 0; c--) {
             if (r == 0 && c == 0) { 
                out[0][0] = last; 
            } 
            else if (c == 0) { 
                out[r][c] = arr[r - 1][cols - 1];
             } 
             else { 
                out[r][c] = arr[r][c - 1];
             }
             } 
            } 
            return out;
         }
}
