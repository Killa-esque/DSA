public class Fraction {
    private int numer = 0;
    private int denom = 0;

    public Fraction(){
        this(5,6);
    }
    
    public Fraction(int x, int y){
        this.numer = x;
        this.denom = y;
    }

    public Fraction(Fraction f){
        this.numer = f.numer;
        this.denom = f.denom;

    }
    public String toString(){
        return String.format("%s/%s",this.numer,this.denom);
    }
    public boolean equals (Object obj){
        if (obj instanceof Fraction){
            Fraction tmp = (Fraction) obj;
            if (this.numer == tmp.numer && this.denom == tmp.denom){
                return true;
            }
        }
        return false;
    }
}
