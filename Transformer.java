public class Transformer extends Computer{
    public String touchScreen;
    public int battery;
    public int weight;

    public Transformer(int price, int productYear, String brandName, String touchScreen, int battery, int weight){
        super(price, productYear, brandName);
        this.battery = battery;
        this.touchScreen = touchScreen;
        this.weight = weight;
    }
}
