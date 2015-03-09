public class main {
    public static void main(String[] args) {
        Car[] cars = {new Car(1), new Car(2), new Car(3),new Car(4)};
        Race myRace = new Race(500, cars);
        myRace.start();
    }
}
