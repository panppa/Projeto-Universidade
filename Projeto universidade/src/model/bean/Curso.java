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
public class Curso {
    private String NomeCurso;
    private String DescCurso;
    private int NumCurso;
    private String NivelCurso;
    private int CargaSemestre;
    private Departamento DpResponsavel;

    public Curso(String NomeCurso, String DescCurso, int NumCurso, String NivelCurso, int CargaSemestre, Departamento DpResponsavel) {
        this.NomeCurso = NomeCurso;
        this.DescCurso = DescCurso;
        this.NumCurso = NumCurso;
        this.NivelCurso = NivelCurso;
        this.CargaSemestre = CargaSemestre;
        this.DpResponsavel = DpResponsavel;
    }

    


    public void setNomeCurso(String NomeCurso) {
        this.NomeCurso = NomeCurso;
    }

    public void setDescCurso(String DescCurso) {
        this.DescCurso = DescCurso;
    }

    public void setNumCurso(int NumCurso) {
        this.NumCurso = NumCurso;
    }

    public void setNivelCurso(String NivelCurso) {
        this.NivelCurso = NivelCurso;
    }

    public void setCargaSemestre(int CargaSemestre) {
        this.CargaSemestre = CargaSemestre;
    }

    public void setDpResponsavel(Departamento DpResponsavel) {
        this.DpResponsavel = DpResponsavel;
    }

    
    public String getNomeCurso() {
        return NomeCurso;
    }

    public String getDescCurso() {
        return DescCurso;
    }

    public int getNumCurso() {
        return NumCurso;
    }

    public String getNivelCurso() {
        return NivelCurso;
    }

    public int getCargaSemestre() {
        return CargaSemestre;
    }

    public Departamento getDpResponsavel() {
        return DpResponsavel;
    }    
}
