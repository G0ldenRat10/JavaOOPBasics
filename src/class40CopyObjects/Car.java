package class40CopyObjects;

public class Car {

    private String make;
    private String model;
    private int year;

    Car (String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Extra overloaded

    Car (Car x) {
        this.copy(x);
    }

    // Get metode (geteri) :

    public String getMake() {
        return make;
    }

    public String getModel() {
        return  model;
    }

    public int getYear() {
        return year;
    }

    // Set metode (seteri) :

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }


    // COPY METODA

    public void copy(Car x) {
        this.setMake(x.getMake());
        this.setModel(x.getModel());
        this.setYear(x.getYear());
    }
}
