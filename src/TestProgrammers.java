public class TestProgrammers {

    public static void main(String[] args) {
        Programmer programmer1 = new Programmer();
        programmer1.name = "Marcus";
        programmer1.age = 25;
        programmer1.wearsGlasses = true;


        Programmer programmer2 = new Programmer();
        programmer2.name = "Robert";
        programmer2.age = 19;
        programmer2.wearsGlasses = false;

        System.out.println(programmer1.drinkCoffee() + programmer1.printDetails());
        System.out.println(programmer2.printDetails() + programmer2.hasGlasses());

    }






}

    