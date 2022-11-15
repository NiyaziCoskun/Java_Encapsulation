package inheritanceConstructorCall;

import javax.swing.*;

public class Corolla extends BToyota{

    Corolla (int pc) {
        super(5);
        System.out.println("Parametreli Corolla constructor");
    }
    Corolla(){

    }
    Corolla (String str){
        this();
        System.out.println("String parametreli Corolla cons");
    }
    public static void main(String[] args) {
        Corolla corolla1 = new Corolla("ABCD");
        System.out.println("============");

        Corolla corolla2 = new Corolla(3);
    }
}
