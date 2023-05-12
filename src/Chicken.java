public class Chicken extends Cookable implements Food, PricedProduct{
    public String toString(){
        return "chicken";
    }
    public int price(){
        return 50;
    }
}
