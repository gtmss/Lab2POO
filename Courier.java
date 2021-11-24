public class Courier {
    private String name;
    private int id;
    private int route;

    public Courier(String name, int id, int route){
        this.name = name;
        this.id = id;
        this.route = route;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getRoute() {
        return route;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRoute(int route) {
        this.route = route;
    }

    public String print() {
        return "Courier{" +
                "name='" + name + '\'' +
                ", adress='" +route + '\'' +
                ", id=" + id +
                '}';
    }
}