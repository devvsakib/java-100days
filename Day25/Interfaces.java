/**
 * InnerInterfaces
 **/
interface Bicycle {
    int a = 50;

    // final int a = 50; //final is not require to write, its default
    void applyBrack(int decSpeed);

    void speedUp(int incSpeed);
}

interface HornBicycle {
    void blowHornK3g();

    void blowHornMnh();
}

class ElectricBicycle implements Bicycle, HornBicycle {
    int speed = 10;

    void pressHorn() {
        System.out.println("Pep Pep...");
    }

    public void applyBrack(int decSpeed) {
        speed = speed - decSpeed;
        System.out.println("Brake pressed...");
    };

    public void speedUp(int incSpeed) {
        speed += incSpeed;
        System.out.println("Speeding up cycle...");
    }
    public void blowHornK3g(){
        System.out.println("Horn k3G from another interface");
    }
    public void blowHornMnh(){
        System.out.println("Horn Mnh from another interface");
    }

}

public class Interfaces {
    public static void main(String[] args) {
        ElectricBicycle bc = new ElectricBicycle();
        bc.applyBrack(10);
        bc.pressHorn();
        bc.speedUp(1);

        // cannot modify the properties in Interface, they are final
        bc.blowHornK3g();
        bc.blowHornMnh();
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