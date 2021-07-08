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
public class Historico {
    private  Aluno HAluno;
    private Diciplina Diciplinas[]=new Diciplina[100];
    private int Notas[] = new int[100];
    private String NotasConceito[]= new String[100];

    public Historico(Aluno HAluno) {
        this.HAluno = HAluno;
    }
    public int getNotasEspec(int PosicaoDiciplina){
        int Nota = Notas[PosicaoDiciplina];
        return Nota;
    }
    public String getNotasConceitoEspec(int PosicaoDiciplina){
        String NotaConceito = NotasConceito[PosicaoDiciplina];
        return NotaConceito;
    }
    
    public void setNotasConceitoEspec(int PosicaoDiciplina,String NotaConceito){
        NotasConceito[PosicaoDiciplina]=NotaConceito;
    }
    public void setNotasEspec(int PosicaoDiciplina,int Nota){
        Notas[PosicaoDiciplina] = Nota;
    }
    
    public void setDiiciplinaEspec(int PosicaoNota, Diciplina Diciplina){
        Diciplinas[PosicaoNota] = Diciplina;
    }

    public Aluno getHAluno() {
        return HAluno;
    }

    public void setHAluno(Aluno HAluno) {
        this.HAluno = HAluno;
    }

    public Diciplina[] getDiciplinas() {
        return Diciplinas;
    }

    public void setDiciplinas(Diciplina[] Diciplinas) {
        this.Diciplinas = Diciplinas;
    }

    public int[] getNotas() {
        return Notas;
    }

    public void setNotas(int[] Notas) {
        this.Notas = Notas;
    }

    public String[] getNotasConceito() {
        return NotasConceito;
    }

    public void setNotasConceito(String[] NotasConceito) {
        this.NotasConceito = NotasConceito;
    }
    
    
}
