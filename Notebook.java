// 1. Создание класса Notebook с полями
public class Notebook {
    private String brand;
    private String model;
    private double inches;
    private int memory;
    private String processor;
    private int ram;
    private String typeOS;
    private int price;

    public Notebook(String brand, String model, int inches, int memory, String processor, int ram, String typeOS, int price) {
        this.brand = brand;
        this.model = model;
        this.inches = inches;
        this.memory = memory;
        this.processor = processor;
        this.ram = ram;
        this.typeOS = typeOS;
        this.price = price;
    }
    // Конструктор
    public Notebook() {
    }

    // Геттеры и сеттеры для полей
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getInches() {
        return (int) inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getTypeOS() {
        return typeOS;
    }

    public void setTypeOS(String typeOS) {
        this.typeOS = typeOS;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void displayPrice() {
        System.out.printf("Price is %s RUB", price);
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", inches=" + inches +
                ", memory=" + memory +
                ", processor='" + processor + '\'' +
                ", memoryROM=" + ram +
                ", typeOS='" + typeOS + '\'' +
                ", price=" + price +
                '}';
    }

}