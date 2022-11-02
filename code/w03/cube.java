package code.w03;

class cube{
    public float Seitenlänge;
    public cube(float a){
        Seitenlänge = a;
    }

    public float Volumen() {
        return Seitenlänge*Seitenlänge*Seitenlänge;    
    }
    public float Oberflacheninhalt() {
        return 6*(Seitenlänge*Seitenlänge);
    }
    public void halbiereSeitenlängen() {
        Seitenlänge = Seitenlänge / 2;
    }
}