class Employee {
    int id;
    String name;
    public void printDetails(int a){
        System.out.println("Custom Code: " + a);
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class CustomClass {

    public static void main(String[] args) {

        // intansiating new Employee Obj
        Employee sakib = new Employee(); 
        Employee tobi = new Employee();
        
        // setting attributes
        sakib.id = 12;
        sakib.name = "DevvSakib";
        
        tobi.id = 13;
        tobi.name = "Tobiloba";
        
        // printing attributes
        // sakib.printDetails();
        // System.out.println();
        // tobi.printDetails();
        System.out.println();
        sakib.printDetails(1);
        tobi.printDetails(2);

    }
}
/*
 * [One Java file one public class]
 * 
 * We can write custom class
 * 
 * 
 * 
 */