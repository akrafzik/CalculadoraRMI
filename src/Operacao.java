
import java.io.Serializable;


public class Operacao implements Serializable{
    float n1;
    float n2;
    char op;

    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }
    
    public char getOp() {
        return op;
    }

    public void setOp(char op) {
        this.op = op;
    }
}
