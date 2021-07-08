/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Gabriel
 */
public class Departamento {
    private String NomeDp;
    private int codDp;
    private int NumeroSala;
    private int TelefoneDP;

    public Departamento(String NomeDp, int codDp, int NumeroSala, int TelefoneDP) {
        this.NomeDp = NomeDp;
        this.codDp = codDp;
        this.NumeroSala = NumeroSala;
        this.TelefoneDP = TelefoneDP;
    }

    public Departamento() {
    }

    public void setNomeDp(String NomeDp) {
        this.NomeDp = NomeDp;
    }

    
    public void setCodDp(int codDp) {
        this.codDp = codDp;
    }

    public void setNumeroSala(int NumeroSala) {
        this.NumeroSala = NumeroSala;
    }

    public void setTelefoneDP(int TelefoneDP) {
        this.TelefoneDP = TelefoneDP;
    }

        
    public String getNomeDp() {
        return NomeDp;
    }

    public int getCodDp() {
        return codDp;
    }

    public int getNumeroSala() {
        return NumeroSala;
    }

    public int getTelefoneDP() {
        return TelefoneDP;
    }
        
  
    
}
