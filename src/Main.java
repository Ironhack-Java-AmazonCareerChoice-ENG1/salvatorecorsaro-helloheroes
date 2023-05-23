import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SuperHero.printCounter();

        SuperHero hero1 = new SuperHero("WonderWoman",
                "Super Strength",
                "USA");
//        hero1.setName("WonderWoman");
//        System.out.println(hero1.getName());
//        hero1.setPower("Super Strength");
//        hero1.setOrigin("USA");
        hero1.introduce();

        SuperHero.printCounter();

        SuperHero hero2 = new SuperHero("Batman", "Deep Voice", "Gotham City");
        SuperHero hero3 = new SuperHero("Batman", "Money", "Madrid");
        hero2.introduce();

        System.out.println("========");
        hero1.train(hero2);


        System.out.println(hero1);
        System.out.println(hero2);
        System.out.println(hero3);
        System.out.println(hero2.equals(hero3));

        System.out.println("========");

        SuperHacker hacker1 = new SuperHacker("MrRobot",
                "Can hack anything", "NewYork", "Python");
        SuperHacker hacker2 = new SuperHacker("Snowden",
                "Integrity", "NewYork", "Shell");
        hacker1.drinkCoffee();

        System.out.println(hacker1);
        hacker1.train(hero1);
        hacker1.train(hacker2);


        System.out.println("========");


        hacker1.drinkCoffee();
        hacker1.drinkCoffee("Japanese V60 decaf");

//        int[] arr1 = {};
//
//        Arrays.toString(arr1);
        SuperHero.printCounter();


    }
}
