package web.Model;

public class Car {
    private String model;

    private String color;

    private String number;

    public Car(String model, String color, String number) {
        this.model = model;
        this.color = color;
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Car{ " +
                "model = '" + model + '\'' +
                ", color = '" + color + '\'' +
                ", number = '" + number + '\'' +
                " }";
    }
}