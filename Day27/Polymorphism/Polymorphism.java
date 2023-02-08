interface Camera {
    void takeSnap();

    void recordVideo();

    private void greet() {
        System.out.println("Hello Samsung");
    } // we cant use private method directly

    default void record4kVideo() {
        greet();
        System.out.println("Record 4k Video");
    }
}

interface Wifi {
    String[] getNetwork();

    void connectToNetwork(String network);

}

class CellPhone {
    void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    void pickCall() {
        System.out.println("Connecting ");
    }

}

class SmartPhone extends CellPhone implements Wifi, Camera {
    public void takeSnap() {
        System.out.println("Clicking...");
    }

    public void recordVideo() {

        System.out.println("Video recording...");
    }

    public String[] getNetwork() {
        System.out.println("Getting Network...");
        String[] networkList = { "DevvSakib", "Chang Wook", "Eun Tak", "Park Bong" };
        return networkList;
    }

    public void connectToNetwork(String network) {
        System.out.println("Connecting network... " + network);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Camera cam1 = new SmartPhone(); // this is a smartphone, only use this only for camera
        // cam1.getNetwork(); // not allowed, use only camera
        cam1.record4kVideo();

        Wifi wf = new SmartPhone();  // this is a smartphone, only use this only for wifi 
        // wf.record4kVideo(); // not allowed
        wf.getNetwork(); // allowed
        
        SmartPhone sp = new SmartPhone();  // Now use everything.
        sp.getNetwork();
        sp.record4kVideo();
        sp.takeSnap();

    }
}
