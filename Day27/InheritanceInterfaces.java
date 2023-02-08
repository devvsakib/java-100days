interface sampleInterface {  
    void meth1();
    void meth2();
}
interface childSample extends sampleInterface{
    void meth1();
    void meth2();
}
class MySample implements childSample{
    public void meth1(){
        System.out.println("meth1");
    } 
    public void meth2(){
        System.out.println("meth2");
    } 
    public void meth3(){
        System.out.println("meth3");
    } 
    public void meth4(){
        System.out.println("meth4");
    } 
}


public class InheritanceInterfaces {
    public static void main(String[] args) {
        MySample ms = new MySample();
        ms.meth2();
        ms.meth3();
    }    
}
