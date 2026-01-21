public class Criteria {
    public static void main(String[] args) {
        String names[] = {"Jack","Uri", "Kiana", "Kellin", "Remi"};
        int count = 0;
        for(String name: names){
            if(name.length() == 4){
                count++;
            }

        }
        System.out.println(count);
        }
}
