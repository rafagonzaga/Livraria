public class ComparandoReferencias {

    public static void main(String[] args) {

        Autor autor1 = new Autor();
        autor1.nome = "Rodrigo Turini";
        autor1.email = "rodrigo.turini@caelum.com.br";
        autor1.cpf = "123.456.789-10";

		Autor autor2 = new Autor();
        autor2.nome = "Rodrigo Turini";
        autor2.email = "rodrigo.turini@caelum.com.br";
        autor2.cpf = "123.456.789-10";
        
        if (autor1 == autor2) {
            System.out.println("Iguais, mesmo autor!");
        } else {
            System.out.println("Hein? Por que diferentes?");
        }
    }
    
}
