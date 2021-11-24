public class MiniPc extends Computer{
    public String dimension;
    public int core_Number;
    public int memory;

    public MiniPc(int price, int productYear, String brandName, int core_Number, int memory, String dimension){
        super(price, productYear, brandName);
        this.core_Number = core_Number;
        this.dimension = dimension;
        this.memory = memory;
    }
}
