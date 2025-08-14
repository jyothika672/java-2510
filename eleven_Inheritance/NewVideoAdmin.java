package eleven_Inheritance;

public class NewVideoAdmin  extends NewGuest implements Addable{

    @Override
    public void addVideo() {
        System.out.println("AddVideo");
    }

}
