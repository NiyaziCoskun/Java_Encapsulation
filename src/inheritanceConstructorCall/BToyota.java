package inheritanceConstructorCall;

public class BToyota extends Carr{
    BToyota(){
        System.out.println("Parametresiz Toyota Constructor");
    }

    BToyota(int pt) {
        System.out.println("Parametreli Toyota Constructor");
    }
}
