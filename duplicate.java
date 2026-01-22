public class duplicate {
    public static boolean ContainsDupe(String[] classes){
        int i = 0;
        
        while(i < classes.length){
            for(int j = i+1; j < classes.length; j++){
                if (classes[i].equals(classes[j])){
                    return true;
                }
            }
            i++;
        }
        return false;
    }
    public static void main(String[] args) {
        String[] classes = {"Engineering", "Physics", "Physics", "DDP", "Math", "CS",  "English", "History"};
        System.out.println(ContainsDupe(classes));
    }
}
