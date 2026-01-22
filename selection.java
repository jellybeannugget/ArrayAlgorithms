public class selection {
    public static void main(String[] args) {
        String[] classes = {"Engineering", "Physics", "Physics", "DDP", "Math", "CS",  "English", "History"};
        for(int i = 0; i < classes.length; i+=2){
            System.out.println(classes[i] + " " + classes[i+1]);
            //removed lunch to not get an out of bounds index error
        }
    }
}
