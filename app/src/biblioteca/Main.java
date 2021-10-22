package biblioteca;

import java.util.*;
import java.util.Scanner;
import java.io.*;
import java.lang.Thread;

public class Main {
    public static void main(String[] args) /*throws InterruptedException*/ {
        Livro l[] = new Livro [100];

        l[1] = new Livro(001, "God of War", "Eu mesmo", 2010, "");
        l[2] = new Livro(002, "God Of War 2", "Tu mesmo", 2011, "");
        l[3] = new Livro(003, "God of War 3", "Ele mesmo", 2012, "");
        l[4] = new Livro(004, "God of War 4", "Nós mesmo", 2013, "");
        l[5] = new Livro(005, "God of war 5", "Vós mesmo", 2014, "");
        l[6] = new Livro(006, "God of War 6", "Todos mesmo", 2015, "");
        l[7] = new Livro(007, "God Of War 7", "Nenhum mesmo", 2016, "");
        l[8] = new Livro(8, "God of War 8", "Aqueles mesmo", 2017, "");
        l[9] = new Livro(9, "God of War 9", "Esse mesmo", 2018, "");
        l[10] = new Livro(10, "God of war 10", "Alguns mesmo", 2019, "");
        l[2].retirarLivro("Calel", 2);
        //l[3].doarLivro();

        int a = 200;
        //l[a].retirarLivro("Calel", a);
      
        Scanner obj = new Scanner(System.in);
        System.out.println(("---------BEM VINDO A BIBLIOTECA DO DEUS DA GUERRA----------"));
        System.out.println("Posso saber seu nome?(sem caracteres especiais) ");
                
        int op = 0;
        while(op != 5){
        System.out.println("---------MENU---------");
        System.out.println("1 - Retirar");
        System.out.println("2 - Devolver");
        System.out.println("3 - Doar");
        System.out.println("4 - Sair");

        op = obj.nextInt();
        
        switch(op){
            case 1:
               System.out.println("LISTA DE LIVROS DISPONÍVEIS PARA RETIRADA: ");
               
               for (int i = 1; i < l.length; i++){
                   if (l[i] != null){
                   l[i].lista();
               }
            }
            int n = 0;
                
                System.out.println("\nDigite o número do livro que deseja retirar:");
                int op1 = obj.nextInt();
                //Thread.sleep(1000);
//nao consegui fazer funcionar o input nome, sem motivo. Foi colocado no inicio do programa
                //System.out.println("Seu nome: ");
                //String nome = obj.nextLine();
                String nomU = obj.nextLine();
                String nome = obj.nextLine();
                l[op1].retirarLivro(nome, op1);
                            
            break;

            case 2:
                System.out.println("Digite o número do livro que deseja devolver:");
                int op2 = obj.nextInt();
                l[op2].devolverLivro();
            break;

            case 3:
                //System.out.println("Preencha os campos para realizar a doação de um livro:");
                System.out.println("Digite o número que deseja doar, até 100");
                

                //if(seuArray == null)
                //seuArray = new Array();

                int op3 = obj.nextInt();
                if (l[op3] == null){
                System.out.println("Ano:");
                int year = obj.nextInt();

                System.out.println("Titulo:");
                String titlu = obj.nextLine();
                String title = obj.nextLine();

                System.out.println("Autor:");
                String author = obj.nextLine();

                

                l[op3] = new Livro(op3, title, author, year, "");
                l[op3].doarLivro();
                }
                else{
                    System.out.println("já existe cadastro");
                }
                
                System.out.println("Nova lista atualizada!");
                for (int i = 1; i < l.length; i++){
                    if (l[i] != null){
                    l[i].lista();
                }
             }
                
                
                break;
                case 4:
                System.out.println("LISTA DE LIVROS DA BIBLIOTECA!");
                for (int i = 1; i < l.length; i++){
                    if (l[i] != null){
                    l[i].listaGeral();
                }
             }
                break;
        } 
        }
    }
}