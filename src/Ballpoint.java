public class Ballpoint extends Pen{
    private boolean isRefillable;

    public Ballpoint(String brand, String color, double tipSize, boolean isRefillable){
        super(brand, color, tipSize);
        this.isRefillable = isRefillable;
    }

    public boolean getIsRefillable(){
        return isRefillable;
    }

    public void replaceInkCartridge(){
        System.out.println("OH LORD, THE MISERY, I CAN FEEL MY INK CARTRIDGE BEING VIOLENTLY REMOVED FROM MY BODY, AAAAAAAAHHHHHHHH");
    }
}
