package Components;

public abstract class Component {

    private String name;
    private String model;
//    private int price;

    public Component(String name, String model){
        this.name = name;
        this.model = model;
//        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

//    public int getPrice() {
//        return price;
//    }
}
