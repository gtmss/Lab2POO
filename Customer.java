public class Customer {
    private String name;
    private String adress;
    private long id;

    public Customer(String name, String adress, long id){
        this.name = name;
        this.adress = adress;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public  String getAdress(){
        return adress;
    }

    public long getId(){
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String print() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", id=" + id +
                '}';
    }
}
