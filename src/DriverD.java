public class DriverD extends Driver {
    public DriverD(String name, boolean driverLicense, int experience) {
        super(name, driverLicense, experience);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель категории D" +getName() + " начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Водитель категории D" +getName() + " закончил движение");
    }

    @Override
    public void refuelTheСar() {
        System.out.println("Водитель категории D" +getName() + " нзаправляет автомобиль");
    }

    @Override
    public void driversLicenseType() {
        try {
            isDriverLicense();
        } catch (LicenseTypeException e) {
            System.out.println("Произошла ошибка");
            System.out.println("Необходимо указать тип прав!");
        }
    }
}
