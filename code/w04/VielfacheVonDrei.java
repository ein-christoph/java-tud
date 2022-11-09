public class VielfacheVonDrei { 
    public static void main(String[] args) {
        int i = 0;
        
        while (i < 1000) {
            if (i % 3 == 0) {
                i = i+1;
                System.out.println(i);
            }
        }
    }
}