public class Car {
    public String brand;
    public String model;
    public float engineVolume;
    public String color;
    public int year;
    public String country;

    public Car(String brand, String model, float engineVolume, String color, int year, String country) {
        this.brand = validOrDefault(brand, "Default");
        this.model = validOrDefault(model, "default");
        this.engineVolume = engineVolume > 0.0f ? engineVolume : 1.5f;
        this.color = validOrDefault(color, "White");
        this.year = year >= 0 ? year : 2000;
        this.country = validOrDefault(country, "default");
    }

    public static String validOrDefault(String value, String defaultValue){
        return value == null || value.isBlank() ? defaultValue : value;
    }


    @Override
    public String toString() {
        return "Автомобиль {" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                '}';
    }
}
