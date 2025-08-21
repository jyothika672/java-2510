package thirteen_abstration;

public class Hp implements Laptop {

    public void usbSlot(){
        System.out.println("HP USB Slot");
    }

    public void hdmiSlot() {
        System.out.println("HP HDMI Slot");
    }

    public void cPort() {
        System.out.println("HP Super Fast C Slot");
    }

}