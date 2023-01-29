class myEmployee {
    private int id;
    private String name;

    public void setName(String n){
        name = n;
    }
    public void setId(int x){
        id = x;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
}

public class AccessModGetSet {
    public static void main(String[] args) {
        myEmployee rup = new myEmployee();
        
        rup.setName("Rup");
        System.out.println(rup.getName());
    }

}

/*
 * Access Modifiers
 * ----------------
 * Specifier where a property/method is accessible .
 * 4type of access modifiers:
 * 
 * 1. Private
 * 2.Default
 * 3.Protected
 * 4.Public
 * 
 * getters and Setters
 * ------------------
 * Getter --> Return the value  [Access]
 * Setter --> Set/update the value [modifer]
 * 
 * 
 * 
 * 
 */