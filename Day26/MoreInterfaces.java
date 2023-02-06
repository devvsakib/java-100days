interface Camera {
    void takeSnap();

    void recordVideo();

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

public class MoreInterfaces {
    public static void main(String[] args) {
        SmartPhone ms = new SmartPhone();
        String[] ar = ms.getNetwork();
        for (String str : ar) {
            System.out.println(str);
        }
    }
}
