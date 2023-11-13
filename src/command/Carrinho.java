package command;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	private List<Produto> produtos = new ArrayList<>();

    public void addProduct(Produto produto) {
    	produtos.add(produto);
        System.out.println(produto.getNome() + " adicionada ao carrinho!");
    }

    public void removeProduct(Produto produto) {
    	produtos.remove(produto);
        System.out.println(produto.getNome() + " removida do carrinho!");
    }

}
