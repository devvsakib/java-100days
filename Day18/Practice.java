class Employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

class cellPhone {
    public void ring() {
        System.out.println("Ringing...");
    }

    public void vibrate() {
        System.out.println("Virbating...");
    }

    public void callFriend(String name) {
        System.out.println("Calling " + name + "...");
    }
}

class Square {
    int side;

    public int area() {
        return side * side;
    }

    public int perimeter() {
        return 4 * side;
    }
}

class Devv{
    public void hit(){
        System.out.println("Hit... -1");
    }
    public void fire(){
        System.out.println("Fire... -4");
    }
    public void run(){
        System.out.println("Run...");
    }

}


public class Practice {
    public static void main(String[] args) {
        // Practice 1
        // Employee sakib = new Employee();
        // sakib.setName("DevvSakib");
        // System.out.println(sakib.getName());

        // Practice 2
        // cellPhone samsung = new cellPhone();
        // samsung.callFriend("Tobi");
        // samsung.ring();
        // samsung.vibrate();

        // Practice 3
        // Square sq = new Square();
        // sq.side = 5;
        // System.out.println(sq.area());
        // System.out.println(sq.perimeter());

        // Practice 4
        Devv ds = new Devv();
        ds.fire();
        ds.hit();
        ds.run();
    }
}
