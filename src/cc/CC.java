
package cc;

public class CC {
    
    private String id;
    private String numcc;
    private Double saldo;

    public CC(String id, String numcc, Double saldo) {
        this.id = id;
        this.numcc = numcc;
        this.saldo = saldo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumcc() {
        return numcc;
    }

    public void setNumcc(String numcc) {
        this.numcc = numcc;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "CC{" + "id=" + id + ", numcc=" + numcc + ", saldo=" + saldo + '}';
    }

   
    
    
}
