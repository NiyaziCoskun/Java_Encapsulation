package OOP;

public class MainClass {

        public static void main(String[] args) {

            //Mensch niyaz = new Mensch();
            //niyaz.setIsim("Niyaz");
            //niyaz.setAnadil("Türkce");
            //niyaz.setYas(32);
            //niyaz.setKimlikNo(123456);

            Animal cat = new Cat();
            Animal bird = new Bird();

            cat.speak();
            bird.speak();

        }
    }

