/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servico;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import model.bean.Aluno;
import model.bean.Diciplina;
import model.bean.Curso;
import model.bean.Departamento;
import model.bean.Historico;
/**
 *
 * @author Gabriel
 */
public class ServicoMain {
    
    
    public static void main(String[] args) {
        //pegar mês e ano do sistema
        DateTimeFormatter month = DateTimeFormatter.ofPattern("MM"); 
        DateTimeFormatter year = DateTimeFormatter.ofPattern("yyyy"); 
        LocalDateTime now = LocalDateTime.now();
        //--
        //definir ano
                int Ano =Integer.parseInt(year.format(now));
        //--
        //definir semestre
                int Semestre;
                if (Integer.parseInt(month.format(now)) <= 6){
                    Semestre = 1;
                }else{
                    Semestre = 2;
                }
        //--
        //gambiarra pra atualizar variaveis auto incrementaveis
        int DiciplinaID = 0;
        int DepartamentoID = 0;
        int CursoID = 0;
        int AlunoID= 0;
        int PosicaoAluno=-1;
        int PosicaoDiciplina=-1;
        //--
        //gambiarra pra criar vetores que listam os objetos      (SDDS SQL T_T)
        Curso Cursos[] = new Curso[100];
        Aluno Alunos[] = new Aluno[3000];        //---------------------------------------------------------Corrigir se der tempo, muita memoria atoa
        Historico[] Historicos = new Historico[3000];
        Diciplina Diciplinas[] = new Diciplina[100];
        //--
        //gambiarra pra presetar objetos  
            //Departamentos
        DepartamentoID++;
        Departamento TI = new Departamento("TI",DepartamentoID,203,3333333);
        DepartamentoID++;
        Departamento ADM = new Departamento ("ADM",DepartamentoID,204,44444444);
            //--
            //Cursos
        CursoID++;
        Curso Informatica = new Curso("Tecnico em informatica","Curso de formatar PC",CursoID,"Tecnico",90,TI);
        Cursos[1]=Informatica;
        
        
        CursoID++;
        Curso BachareladoADM = new Curso ("Bacharelado em Administração","Curso de contar moeda",CursoID,"Bacharelado",120,ADM);
        Cursos[2]=BachareladoADM;
            //--
            //Alunos e historicos
        AlunoID++;
        Aluno GabrielDeFariaCampos = new Aluno("Gabriel de Faria Campos", AlunoID, "22222222222","Rua zapzap Nº2, bairro","11111111","21/05/2003","No gender, only swag","INFO 3",TI,null,"Tecnico");
        Alunos[1]=GabrielDeFariaCampos;
        Historico HGabrielDeFariaCampos = new Historico(GabrielDeFariaCampos);
        Historicos[1] = HGabrielDeFariaCampos;
        
        AlunoID++;
        Aluno dois = new Aluno("Auno Dois Pereira",AlunoID,"00000000002","Rua 2 Nº2, 2","00000002","02/02/2002","M","ADM 2",ADM,null,"Graduação");
        Alunos[2] = dois;
        Historico Hdois = new Historico(dois);
        Historicos[2] = Hdois;
        
            //--
            //Diciplinas
        DiciplinaID++;
        Diciplina ProjetoDeSoftware = new Diciplina("Carlos Eduardo Paulino",Semestre,Ano,Informatica,DiciplinaID,"Projeto de software");
        Diciplinas[1]=ProjetoDeSoftware;
        
            //--
        //--
        //loop que provavelmente tem um jeito MUUUITO mais eficiente de fazer mas o prazo do trabalho é muito pequeno pra isso
        int esc=0;
        do{
            menu();
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            Scanner teclado = new Scanner(System.in);
            switch (n) {
                case 1:
                    do{
                        //instanciar diciplina
                        System.out.println("Nome da diciplina: ");
                        s.nextLine();
                        String Nome = s.nextLine();
                        System.out.println("Nome do professeor: ");
                        String Prof = s.nextLine();
                        System.out.println("Nome do curso que pertence: ");
                        Curso CursoPertencente = null;
                        //Listar Cursos
                        for (Curso Curso : Cursos) {
                            if (Curso != null) {
                                System.out.println(Curso.getNumCurso() + ": " + Curso.getNomeCurso());
                            }
                        }


                        //--  
                        //Escolher Curso
                        int NumCurso = s.nextInt();
                        for (int cont = 0;cont < 100; cont++){
                            if ((Cursos[cont]!= null)&&(NumCurso == Cursos[cont].getNumCurso())){
                                CursoPertencente = Cursos[cont];
                            }                  
                        }
                        //--
                        DiciplinaID ++;
                        Diciplina d = new Diciplina(Prof, Semestre, Ano,CursoPertencente,DiciplinaID,Nome);
                        Diciplinas[DiciplinaID] = d;
                        System.out.println("-Diciplina Cadastrada-");
                        //mostrar diciplina instanciada
                        System.out.println("Nome da diciplina: " + d.getNomeDiciplina() );
                        System.out.println("Curso pertencente: " + d.getCurso().getNomeCurso());
                        System.out.println("Nome do professor: " + d.getProfessor());
                        System.out.println("Ano da Diciplina:  " +  d.getAno());
                        System.out.println("Semestre da Diciplina: " + d.getSemestre());
                        //----
                        System.out.println("1- Menu \n2-Cadastrar outra Diiciplina \n3-Sair");
                        esc = teclado.nextInt();
                    }while (esc == 2);
                    break;
                case 2:
                    do{
                        //listar aluno
                        listarAlunos(Alunos);
                        //--
                        int EscolhaAluno = teclado.nextInt();
                        System.out.println("Selecione a diciplina que deseja matricula-lo: ");
                        listarDiciplinas(Diciplinas);
                        int EscolhaDiciplina = teclado.nextInt();    
                        //--
                        //matricular aluno em diciplina
                        for(Diciplina Diciplina: Diciplinas){
                            if((Diciplina !=null)&&(Diciplina.getNumeroDiciplina()== EscolhaDiciplina)){
                                for(Historico Historico: Historicos){
                                    if((Historico != null)&&(Historico.getHAluno().getRA() == EscolhaAluno)){
                                        PosicaoAluno++;
                                        Diciplina.setAlunoEspec(PosicaoAluno, Historico.getHAluno());
                                        PosicaoDiciplina++;
                                        Historico.setDiiciplinaEspec(PosicaoDiciplina, Diciplina);
                                        Historicos[EscolhaAluno]=Historico;                                           //atualizar
                                        if(Historico.getHAluno()!=null){
                                            System.out.println(Historico.getHAluno().getNomeAluno());
                                        }
                                    }
                                }
                            }
                        }
                        //--
                        //exibir diciplina
                        for (Diciplina Diciplina: Diciplinas){
                            if((Diciplina != null)&&(Diciplina.getNumeroDiciplina()==EscolhaDiciplina)){
                                System.out.println("Nome da diciplina: " + Diciplina.getNomeDiciplina() );
                                System.out.println("Curso pertencente: " + Diciplina.getCurso().getNomeCurso());
                                System.out.println("Nome do professor: " + Diciplina.getProfessor());
                                System.out.println("Ano da Diciplina:  " +  Diciplina.getAno());
                                System.out.println("Semestre da Diciplina: " + Diciplina.getSemestre());
                                System.out.println("Alunos:");
                                for (Aluno aluno : Diciplina.getAlunos()) {
                                    if( aluno!= null){
                                        System.out.println("> "+aluno.getNomeAluno());
                                    }
                                }
                            }
                        }
                        //--
                        System.out.println("1- Menu \n2-Matricular outro aluno \n3-Sair");
                        esc = teclado.nextInt();
                    }while(esc==2);
                    break;
                case 3:
                    do{
                        //listar alunos dentro de uma diciplina
                        boolean TemAluno = false;
                        System.out.println("Selecione uma diciplina: ");
                        listarDiciplinas(Diciplinas);
                        int EscolhaDiciplina = teclado.nextInt();
                        System.out.println("Selecione um aluno: (Digite 0 para cancelar)");
                        for(Diciplina Diciplina: Diciplinas){
                            if((Diciplina !=null)&&(Diciplina.getNumeroDiciplina()== EscolhaDiciplina)){
                                for(Aluno Aluno: Diciplina.getAlunos()){
                                    if(Aluno != null){
                                        System.out.println(Aluno.getRA()+" "+Aluno.getNomeAluno());
                                        TemAluno=true;
                                    }
                                }
                            }
                        } 
                        if (TemAluno==false){
                            System.out.println("Nenhum Aluno cadastrado nessa diciplina, digite 0 para cancelar.");
                        }
                        //--
                        int EscolhaAluno = teclado.nextInt();
                        for(Diciplina Diciplina: Diciplinas){
                            if((Diciplina !=null)&&(Diciplina.getNumeroDiciplina()== EscolhaDiciplina)){
                                for(Historico Historico: Historicos){
                                    if(Historico != null){
                                        if (Historico.getHAluno().getRA() == EscolhaAluno){
                                            System.out.println("Digite a nota final de "+Historico.getHAluno().getNomeAluno()+" na Diciplina "+Diciplina.getNomeDiciplina()+": ");
                                            int nota = teclado.nextInt();
                                            Historico.setNotasEspec(Diciplina.getNumeroDiciplina(), nota);
                                            String NotaConceito;
                                            if (nota <= 10){
                                                NotaConceito ="F";
                                            }else if((nota >10)&&(nota<=20)){
                                                NotaConceito ="E";
                                            }else if((nota>20)&&(nota<=30)){
                                                NotaConceito ="D";
                                            }else if ((nota>30)&&(nota<=40)){
                                                NotaConceito ="D";
                                            }else if ((nota<40)&&(nota<=50)){
                                                NotaConceito ="C";
                                            }else if ((nota<50)&&(nota<=60)){
                                                NotaConceito ="C";
                                            }else if ((nota<60)&&(nota<=70)){
                                                NotaConceito ="B";
                                            }else if ((nota<70)&&(nota<=80)){
                                                NotaConceito ="B";
                                            }else if ((nota<80)&&(nota<=90)){
                                                NotaConceito ="A";
                                            }else{
                                                NotaConceito ="A";
                                            }

                                            Historico.setNotasConceitoEspec(EscolhaDiciplina, NotaConceito);
                                            Historicos[Historico.getHAluno().getRA()]= Historico;           //atualizar
                                            Diciplinas[Diciplina.getNumeroDiciplina()]=Diciplina;
                                            System.out.println(Historico.getNotasConceitoEspec(EscolhaDiciplina)+Historico.getHAluno().getRA());
                                        }

                                    }

                                }
                            }
                        }
                        System.out.println("1- Menu \n2-Cadastrar outra nota\n3-Sair");
                        esc = teclado.nextInt();
                    }while(esc==2);
                    break;
                case 4:
                    do{
                        boolean TemAluno = false;
                        System.out.println("Selecione uma diciplina: ");
                        listarDiciplinas(Diciplinas);
                        int EscolhaDiciplina = teclado.nextInt();
                        for(Diciplina Diciplina: Diciplinas){
                            if((Diciplina !=null)&&(Diciplina.getNumeroDiciplina()== EscolhaDiciplina)){
                                for(Aluno Aluno: Diciplina.getAlunos()){
                                    if(Aluno != null){
                                        for(Historico Historico:Historicos){
                                            if((Historico!= null)&&(Historico.getHAluno() == Aluno)){
                                                System.out.print(Historico.getHAluno().getNomeAluno());
                                                TemAluno=true;
                                                if(Historico.getNotasEspec(EscolhaDiciplina)>=60){
                                                    System.out.print(" Aprovado");
                                                }else{
                                                    System.out.print(" Reprovado");
                                                }
                                                System.out.println(" Nota: "+Historico.getNotasEspec(EscolhaDiciplina)+" ("+Historico.getNotasConceitoEspec(EscolhaDiciplina)+")");
                                            }
                                        }                                                                  
                                    }
                                }
                            }
                        } 

                        if (TemAluno==false){
                            System.out.println("Nenhum Aluno cadastrado nessa diciplina, digite 0 para cancelar.");
                        }
                        System.out.println("1- Menu \n2-Listar outra diiciplina \n3-Sair");
                        esc = teclado.nextInt();
                    }while(esc==2);
                    break;
                default:
                    System.out.println("ERRO, A opção escolhida nao existe.");
                    break;
            }
            
            
        }while(esc != 3);
        System.out.println("Até mais, "+System.getProperty("user.name")+"!!");
    }
    public static void menu()  {
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("                                                Menu");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("\n");
        System.out.println("1- Cadastrar diciplina");
        System.out.println("2- Matricular aluno");
        System.out.println("3- Registrar nota de um aluno");
        System.out.println("4- Listar alunos aprovados e reprovados");
        System.out.println("");
    }

    private static void listarAlunos(Aluno[] Alunos) {
            for (Aluno Aluno : Alunos) { //------------------------------------------------kkkkkk isso vai travar muito meu deus, corrigir urgente
                if (Aluno != null) {
                    System.out.println(Aluno.getRA() + ": " + Aluno.getNomeAluno());
                }
            }
    }

    private static void listarDiciplinas(Diciplina[] Diciplinas) {
        for(Diciplina Diciplina: Diciplinas){
            if(Diciplina != null){
                System.out.println(Diciplina.getNumeroDiciplina()+": "+Diciplina.getNomeDiciplina());
            }    
        }
    }
    //public static Historico instanciash(Historico H){
    //    H = null;
    //    return H;
    //}

}
