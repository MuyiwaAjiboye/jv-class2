import jv.Computer;
import jv.Cpu;
import jv.Ram;

public class Main {
    public static void main ( String[] args){
    //        Cpu corei5 = new Cpu( 12.2 , "yuf");
    //        System.out.println(corei5);

        Computer hp250 = new Computer( 1020, new Cpu(10,"pi"), new Ram(10,"pii"));
        System.out.println(hp250);

    }
}
