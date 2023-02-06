public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            DriverB DriverB = new DriverB("driver №" + i, true, 3 + i);
            Cars Car = new Cars("Lada", "Granta", 1.8f, DriverB, "Механическая",
                    "Седан", "123213", 5);
            DriverC DriverC = new DriverC("driver №" + i, true, 5 + i);
            Trucks Trucks = new Trucks("Газ", "Cоболь", 3, DriverC, 1,
                    1680, "Бензин", 2);
            DriverD DriverD = new DriverD("driver №" + i, true, 10 + i);
            Bus Bus = new Bus("Mercedes", "Sprinter", 4, DriverD, 18000, 6,
                    "Максимальная", "Синий");
            printInfo(Car);
            printInfo(Trucks);
            printInfo(Bus);
        }
    }
    private static void printInfo (Transport transport){
        System.out.println("водитель " + transport.getDriver().getName() + " управляет автомобилем "
                + transport.getBrand() + " и будет участвовать в заезде");
    }

}