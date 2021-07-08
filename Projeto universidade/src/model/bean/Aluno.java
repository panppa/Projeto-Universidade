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
public class Aluno {
    private String NomeAluno;
    private int RA;
    private String CPF;
    private String Endereco;
    private String Telefone;
    private String Nascimento;
    private String Sexo;
    private String Turma;
    private Departamento DepartamentoPrim;
    private Departamento DepartamentoSec;
    private String ProgGrad;
    
    
    
    public Aluno(String NomeAluno, int RA, String CPF, String Endereco, String Telefone, String Nascimento, String Sexo, String Turma, Departamento DepartamentoPrim, Departamento DepartamentoSec, String ProgGrad) {
        this.NomeAluno = NomeAluno;
        this.RA = RA;
        this.CPF = CPF;
        this.Endereco = Endereco;
        this.Telefone = Telefone;
        this.Nascimento = Nascimento;
        this.Sexo = Sexo;
        this.Turma = Turma;
        this.DepartamentoPrim = DepartamentoPrim;
        this.DepartamentoSec = DepartamentoSec;
        this.ProgGrad = ProgGrad;
        Historico H = new Historico(this);
        //System.out.println(H.getHAluno().getNomeAluno());
    }
    
    public void setNomeAluno(String NomeAluno) {
        this.NomeAluno = NomeAluno;
    }

    public void setRA(int RA) {
        this.RA = RA;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public void setNascimento(String Nascimento) {
        this.Nascimento = Nascimento;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public void setTurma(String Turma) {
        this.Turma = Turma;
    }

    public void setDepartamentoPrim(Departamento DepartamentoPrim) {
        this.DepartamentoPrim = DepartamentoPrim;
    }

    public void setDepartamentoSec(Departamento DepartamentoSec) {
        this.DepartamentoSec = DepartamentoSec;
    }

    public void setProgGrad(String ProgGrad) {
        this.ProgGrad = ProgGrad;
    }

    
    
    public String getNomeAluno() {
        return NomeAluno;
    }

    public int getRA() {
        return RA;
    }

    public String getCPF() {
        return CPF;
    }

    public String getEndereco() {
        return Endereco;
    }

    public String getTelefone() {
        return Telefone;
    }

    public String getNascimento() {
        return Nascimento;
    }

    public String getSexo() {
        return Sexo;
    }

    public String getTurma() {
        return Turma;
    }

    public Departamento getDepartamentoPrim() {
        return DepartamentoPrim;
    }

    public Departamento getDepartamentoSec() {
        return DepartamentoSec;
    }

    public String getProgGrad() {
        return ProgGrad;
    } 
}
