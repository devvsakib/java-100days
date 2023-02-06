import java.net.SocketException;

/**
 * InnerInterfaces
 **/
interface Bicycle {
    void applyBrack(int decSpeed);

    void speedUp(int incSpeed);
}

class ElectricBicycle implements Bicycle {
    int speed = 10;

    public void applyBrack(int decSpeed) {
        speed = speed - decSpeed;
    };

    public void speedUp(int incSpeed) {
        speed += incSpeed;
    }

}

public class Interfaces {
    public static void main(String[] args) {
        Bicycle bc = new ElectricBicycle();
 
    }
}
/*
 * INTERFACES
 * ----------
 * In English, a point where two system meet and interact.
 * 
 * TV <----BUTTON----> HUMAN
 * Mouse, Keybaord, Powerswtich...
 * 
 * In java interface is a group of related method with empty bodies
 * 
 * 
 * 
 */