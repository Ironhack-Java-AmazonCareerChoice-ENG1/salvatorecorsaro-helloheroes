public class SuperHacker extends SuperHero{
    private String favoriteLanguage;

    private final char SECRET_CODE;

    public void drinkCoffee(){
        System.out.println(super.getName() + " is drinking coffee...");
    }

    public void drinkCoffee(String coffeeName){
        System.out.println(name + " loves to drink " + coffeeName);
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("#$#%%^%$");
    }

    @Override
    public void train(SuperHero friend) {
        System.out.println("Is reading code written from " + friend.getName());
        if (friend instanceof SuperHacker){
            System.out.println("Nice code!!");
            friend.introduce();
        } else {
            friend.introduce();
            System.out.println("go back to train with Xavier, noob!");
        }
    }

    @Override
    public String toString() {
        return "SuperHacker{" +
                "name='" + super.getName() + '\'' +
                ", power='" + super.getPower() + '\'' +
                ", origin='" + super.getOrigin() + '\'' +
                ", favoriteLanguage='" + favoriteLanguage + '\'' +
                '}';
    }

    public SuperHacker(String name, String power, String origin, String favoriteLanguage) {
        super(name, power, origin);
        SECRET_CODE = 'x';
        this.favoriteLanguage = favoriteLanguage;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public char getSecretCode() {
        return SECRET_CODE;
    }

//    public void setSecretCode(char secretCode){
//        this.secretCode = secretCode;
//    }
}
