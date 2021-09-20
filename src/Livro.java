public class Livro {
    
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;

    public Livro() {
    	this.isbn = "000-00-00000-00-0";
    }

    public Livro(Autor autor){
        this();
        this.autor = autor;
    }
    

    void mostrarDetalhes() {
        String mensagem = "Mostrando detalhes do livro ";
        System.out.println(mensagem);
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);
        
        if(this.temAutor()){
            autor.mostrarDetalhes();
        }
        
        System.out.println("--");
    }

    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.3) {
            return false;
        }
        System.out.println("Aplicando desconto no livro...");
        this.valor -= this.valor * porcentagem;
        return true;
    }

    boolean temAutor() {
        return this.autor !=null;
    }

    double getValor() {
        return this.valor;
    }
    
    void setValor(double valor) {
        this.valor = valor;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getDescricao() {
        return descricao;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public String getIsbn() {
        return isbn;
    }


    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    public Autor getAutor() {
        return autor;
    }


    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
