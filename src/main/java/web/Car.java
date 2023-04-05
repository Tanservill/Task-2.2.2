package web;

public class Car {
    private String name;
    private String model;
    private int number;

    public Car() {
    }

    public Car(String name, String model, int number) {
        this.name = name;
        this.model = model;
        this.number = number;
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Car {" +
                "name = '" + name + '\'' +
                ", model = '" + model + '\'' +
                ", number = " + number +
                '}';
    }
}
