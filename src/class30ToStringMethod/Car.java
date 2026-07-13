package class30ToStringMethod;

public class Car {

    String mark = "Ford";
    String model = "Mustang";
    String color = "black";
    int year = 2025;

    // overwrite-ovanje toString metode:

    public String toString() {

        //String myString = mark +" "+ model +" "+ color +" "+ year;
        // return myString;

        return mark +" "+ model +" "+ color +" "+ year;
    };
}
