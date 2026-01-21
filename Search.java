public class Search {
  public static void main(String[] args) {
    String names[] = {"Jack","Uri", "Kiana", "Kellin", "Remi"};
    for(String name: names){
        if(name.indexOf("K") == 0){
            System.out.println(name);
        }
    }
    }
}
