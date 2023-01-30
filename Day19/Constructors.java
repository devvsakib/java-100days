class myEmployee {
    private int id;
    private String name;

    // Constructors
    public myEmployee(int myid, String myname) {
        id = myid;
        name = myname;
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
        myEmployee ds = new myEmployee(1, "DevvSakib");
        System.out.println(ds.getId());
        System.out.println(ds.getName());

    }
}

/*
 * Contructore name should be same as class name.
 * 
 * 
 */