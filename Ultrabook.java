public class Ultrabook extends Computer{
    public int display;
    public String processor;
    public String modelName;

    public Ultrabook(int price, int productYear, String brandName, int display, String processor, String modelName){
        super(price, productYear, brandName);
        this.display = display;
        this.processor = processor;
        this.modelName = modelName;
    }
}
