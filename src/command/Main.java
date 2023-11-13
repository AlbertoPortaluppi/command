package command;

public class Main {
	public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();
        Produto maca = new Produto("Maçã", 2);
        Produto laranja = new Produto("Laranja", 2);

        Command addMaca = new AddProductCommand(carrinho, maca);
        Command removeMaca = new RemoveProductCommand(carrinho, maca);
        Command addLaranja = new AddProductCommand(carrinho, laranja);
        Command removeLaranja = new RemoveProductCommand(carrinho, laranja);

        addMaca.execute();
        addMaca.execute();
        addLaranja.execute();
        addLaranja.execute();
        
        removeMaca.execute();
        removeLaranja.execute();
    }
}
