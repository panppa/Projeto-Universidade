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

public class Diciplina {
    private String Professor;
    private int Semestre;
    private int Ano;
    private Curso Curso;
    private int NumeroDiciplina;
    private String NomeDiciplina;
    private Aluno Alunos[]=new Aluno[30]; 

    public Diciplina(String Professor, int Semestre, int Ano, Curso Curso, int NumeroDiciplina, String NomeDiciplina) {

        this.Professor = Professor;
        this.Semestre = Semestre;
        this.Ano = Ano;
        this.Curso = Curso;
        this.NumeroDiciplina = NumeroDiciplina;
        this.NomeDiciplina = NomeDiciplina;
    }

    public Aluno[] getAlunos() {
        return Alunos;
    }
    //Procedimento de setar aluno especifico na matriz da classe 
    public void setAlunoEspec(int PosicaoAluno,Aluno Aluno){
        Alunos[PosicaoAluno] = Aluno;

    }
    //--
    public void setAlunos(Aluno[] Alunos) {
        this.Alunos = Alunos;
    }
    
    
    
    public String getNomeDiciplina() {
        return NomeDiciplina;
    }

    public void setNomeDiciplina(String NomeDiciplina) {
        this.NomeDiciplina = NomeDiciplina;
    }  
    
    
    
    public int getNumeroDiciplina() {
        return NumeroDiciplina;
    }

    public void setNumeroDiciplina(int NumeroDiciplina) {
        this.NumeroDiciplina = NumeroDiciplina;
    }

    public String getProfessor() {
        return Professor;
    }

    public int getSemestre() {
        return Semestre;
    }

    public void setProfessor(String Professor) {
        this.Professor = Professor;
    }

    public void setSemestre(int Semestre) {
        this.Semestre = Semestre;
    }

    public void setAno(int Ano) {
        this.Ano = Ano;
    }

    public void setCurso(Curso Curso) {
        this.Curso = Curso;
    }

    public int getAno() {
        return Ano;
    }

    public Curso getCurso() {
        return Curso;
    }
    
    
}
