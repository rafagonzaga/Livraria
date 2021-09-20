public class CarrinhoDeCompras {
	private double total;
	
	public void adiciona(Livro livro) {
		
		System.out.println("Adicionando: " + livro);
		livro.aplicaDescontoDe(0.1);
		total = getTotal() + livro.getValor();
	}

	public double getTotal() {
		return total;
	}
	
	
}
