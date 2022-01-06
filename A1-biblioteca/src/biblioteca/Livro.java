package biblioteca;


public class Livro {
    //ATRIBUTOS
    private int numero;
    private String titulo;
    private String autor;
    private int ano;
    private boolean disponivel;
    private String emprestado;


//MÉTODOS PUBLICOS

    public void listaGeral(){
        System.out.println("Número: " + this.getNumero());
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Ano: " + this.getAno());
        System.out.println("Disponivel: " + this.isDisponivel());
        System.out.println("Emprestado: " + this.getEmprestado());
    }
    public void lista(){
        if (this.isDisponivel()){
            System.out.println("Número: " + this.getNumero());
            System.out.println("Título: " + this.getTitulo());
            System.out.println("Autor: " + this.getAutor());
            System.out.println("Ano: " + this.getAno());
            System.out.println("Disponivel: " + this.isDisponivel());
            System.out.println("Emprestado: " + this.getEmprestado());

        }
    }
    public void retirarLivro(String emprestado, int numero){
        this.setDisponivel(false);
        this.setEmprestado(emprestado);
        System.out.println("INFORMAÇÕES DO LIVRO RETIRADO:");
        System.out.println("Número: " + this.getNumero());
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Ano: " + this.getAno());
        System.out.println("Disponivel: " + this.isDisponivel());
        System.out.println("Emprestado: " + this.getEmprestado());

    }

    public void devolverLivro(){
        if (this.isDisponivel() == false){
            this.setDisponivel(true);
            this.setEmprestado("");
            System.out.println("LIVRO DEVOLVIDO:");
            System.out.println("Número: " + this.getNumero());
            System.out.println("Título: " + this.getTitulo());
            System.out.println("Autor: " + this.getAutor());
            System.out.println("Ano: " + this.getAno());
            System.out.println("Disponivel: " + this.isDisponivel());
            System.out.println("Emprestado: " + this.getEmprestado());
        }
        else{
            System.out.println(("O Livro não foi emprestado para devolver"));
        }
    }

    public  void doarLivro(){
        //this.setDisponivel(true);

        System.out.println("-------REVISÃO-------:");
        System.out.println("Número: " + this.getNumero());
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Ano: " + this.getAno());
        System.out.println("Disponivel: " + this.isDisponivel());
        System.out.println("Emprestado: " + this.getEmprestado());
    }

//MÉTODOS ESPECIAIS

    public Livro(int numero, String titulo, String autor, int ano, String emprestado) {
        this.numero = numero;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.disponivel = true;
        this.emprestado = emprestado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String getEmprestado() {
        return emprestado;
    }

    public void setEmprestado(String emprestado) {
        this.emprestado = emprestado;
    }
}