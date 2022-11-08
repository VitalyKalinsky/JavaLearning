package vitaly.learning.reflectionAPI;



class Car<T> {
    private int horsepower;
    private final String serialNumber;

    public Car(int horsepower, String serialNumber) {
        this.horsepower = horsepower;
        this.serialNumber = serialNumber;
    }

    public final int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    private void startEngine() {
        System.out.println("Wroooommmm");
    }

    public T logAndReturn(T type) throws IllegalAccessException {
        System.out.println(type);
        return type;
    }
}