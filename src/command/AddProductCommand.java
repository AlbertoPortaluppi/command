package command;

public class AddProductCommand implements Command {
    private Carrinho carrinho;
    private Produto produto;

    public AddProductCommand(Carrinho carrinho, Produto produto) {
        this.carrinho = carrinho;
        this.produto = produto;
    }

    @Override
    public void execute() {
    	carrinho.addProduct(produto);
    }
}