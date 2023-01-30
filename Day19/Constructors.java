class myEmployee {
    private int id;
    private String name;

    // Constructors
    public myEmployee(int myid, String myname) {
        id = myid;
        name = myname;
    }

    // Constructor overload
    public myEmployee() {
        id = 1;
        name = "Demo";
    }

    public void setName(String n) {
        name = n;
    }

    public void setId(int x) {
        id = x;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

public class Constructors {

    public static void main(String[] args) {
        myEmployee ds = new myEmployee();
        System.out.println(ds.getId());
        System.out.println(ds.getName());

    }
}

/*
 * Contructore name should be same as class name.
 * 
 * 
 */