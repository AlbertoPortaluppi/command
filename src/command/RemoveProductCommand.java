package command;

public class RemoveProductCommand implements Command {
    private Carrinho carrinho;
    private Produto produto;

    public RemoveProductCommand(Carrinho carrinho, Produto produto) {
        this.carrinho = carrinho;
        this.produto = produto;
    }

    @Override
    public void execute() {
    	carrinho.removeProduct(produto);
    }
}