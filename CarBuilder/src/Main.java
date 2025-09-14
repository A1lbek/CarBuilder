public class Main {
    public static void main(String[] args) {
        Car car = new Car.Builder()
                .brand("BMW")
                .model("M3")
                .year(2022)
                .color("Blue")
                .build();

        System.out.println(car);
    }
}
