package code.w03;

public class cubeprogramm {
    public static void main(String[] args) {
        float a = 7;
        cube wuerfel1 = new cube(a);
        wuerfel1.halbiereSeitenlängen();
        System.out.println("Volumen: " + wuerfel1.Volumen());
        System.out.println("Oberflächeninhalt: " + wuerfel1.Oberflacheninhalt());
    }
}
