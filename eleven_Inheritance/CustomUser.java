package eleven_Inheritance;

public class CustomUser implements Watchable,Addable{
    public static void main(String[] args) {
        
    }
    public void addVideo() {
        System.out.println("WatchVideo");
    }
    public void watchVideo() {
        System.out.println("AddVideo");
    }
}
