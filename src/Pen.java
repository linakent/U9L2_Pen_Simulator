public class Pen {
    private String brand;
    private String color;
    private double tipSize;

    public Pen(String brand, String color, double tipSize){
        this.brand = brand;
        this.color = color;
        this.tipSize = tipSize;
    }

    public String getBrand(){
        return brand;
    }

    public String getColor(){
        return color;
    }

    public double getTipSize() {
        return tipSize;
    }

    public void write(){
        System.out.println("I can feel my ink dispersing onto this sheet of paper, heck yeah, write that essay, baby");
    }
}
