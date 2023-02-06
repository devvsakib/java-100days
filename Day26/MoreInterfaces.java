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

    // public void record4kVideo() {
    // System.out.println("record 4k updated");
    // // deafult method will not work
    // }

    public void connectToNetwork(String network) {
        System.out.println("Connecting network... " + network);
    }
}

public class MoreInterfaces {
    public static void main(String[] args) {
        SmartPhone ms = new SmartPhone();
        ms.record4kVideo();
        // ms.greet(); // we cant use private method directly
        String[] ar = ms.getNetwork();
        for (String str : ar) {
            System.out.println(str);
        }
    }
}