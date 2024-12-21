package ws;

import java.util.Date;

public class Compte {
    private int code;
    private double solde;
    private Date dateCration;

    public Compte() {
    }

    public Compte(int code,double solde ,Date dateCration ) {
        this.solde = solde;
        this.dateCration = dateCration;
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Date getDateCration() {
        return dateCration;
    }

    public void setDateCration(Date dateCration) {
        this.dateCration = dateCration;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
}
