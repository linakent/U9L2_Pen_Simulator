public class Fountain extends Pen{
    private String fillingSystem;

    public Fountain(String brand, String color, double tipSize, String fillingSystem){
        super(brand, color, tipSize);
        this.fillingSystem = fillingSystem;
    }

    public String getFillingSystem(){
        return fillingSystem;
    }

    public void dip(){
        System.out.println("Ohhhhhhhhh yeah, dip me in that bottle of ink so I can keep writing, dude");
    }
}
