import java.io.Serializable;

public class Resposta implements Serializable{
    int Status;
    float result;

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }

    public double getResult() {
        return result;
    }

    public void setResult(float result) {
        this.result = result;
    }
}