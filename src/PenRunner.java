public class PenRunner {
    public static void main(String[] args) {
        Pen pen1 = new Pen("Pilot", "Black", 0.5);
        System.out.println(pen1.getBrand());
        System.out.println(pen1.getColor());
        System.out.println(pen1.getTipSize());
        pen1.write();

        Ballpoint pen2 = new Ballpoint("Bic", "Blue", 0.7, false);
        System.out.println(pen2.getBrand());
        System.out.println(pen2.getColor());
        System.out.println(pen2.getTipSize());
        System.out.println(pen2.getIsRefillable());
        pen2.write();
        pen2.replaceInkCartridge();

        Fountain pen3 = new Fountain("Kaweco", "Green", 0.3, "Piston");
        System.out.println(pen3.getBrand());
        System.out.println(pen3.getColor());
        System.out.println(pen3.getTipSize());
        System.out.println(pen3.getFillingSystem());
        pen3.write();
        pen3.dip();
    }
}