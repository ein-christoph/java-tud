public class AbsoluteDifferenz { 
    public static void main(String[] args) {
        int a = 93;
        int b = 34;
        
        if (a > b) { //hier war der Fehler
            System.out.println(a - b);
        } else {
            System.out.println(b - a);
        }
    }
}