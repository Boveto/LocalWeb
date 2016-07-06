package br.com.localweb.teste;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.localweb.dao.ItemDAO;
import br.com.localweb.dao.ProdutoDAO;
import br.com.localweb.dao.VendaDAO;
import br.com.localweb.domain.Item;
import br.com.localweb.domain.Produto;
import br.com.localweb.domain.Venda;

public class ItemDAOTest {   
	@Test
   
    public void salvar(){
        ProdutoDAO produtoDAO = new ProdutoDAO();
        Produto produto = produtoDAO.buscarPorCodigo(2L);
        
        VendaDAO vendaDAO = new VendaDAO();
        Venda venda = vendaDAO.buscarPorCodigo(3L);

        Item item = new Item();
        item.setProduto(produto);
        item.setQuantidade(4);
        item.setValor(new BigDecimal (32.54D));
		item.setVenda(venda);

        ItemDAO itemDAO = new ItemDAO();
        itemDAO.salvar(item);

    }

    @Test
    @Ignore

    public void listar() {

        ItemDAO itemDAO = new ItemDAO();

        

        List<Item> itens = itemDAO.listar();

        

        System.out.println(itens);        

    }

    

    @Test

    @Ignore

    public void buscarPorCodigo(){

        ItemDAO itemDAO = new ItemDAO();

        

        Item item = itemDAO.buscarPorCodigo(3L);

        

        System.out.println(item);

    }


    @Test

    @Ignore

    public void excluir(){

        ItemDAO itemDAO = new ItemDAO();

        

        Item item = itemDAO.buscarPorCodigo(3L);

        

        itemDAO.excluir(item);        

    }

    

    @Test

    @Ignore

    public void editar(){

        ProdutoDAO produtoDAO = new ProdutoDAO();

        Produto produto = produtoDAO.buscarPorCodigo(2L);

        VendaDAO vendaDAO = new VendaDAO();

        Venda venda = vendaDAO.buscarPorCodigo(3L);

        

        ItemDAO itemDAO = new ItemDAO();

        Item item = itemDAO.buscarPorCodigo(1L);

        

        item.setProduto(produto);

        item.setQuantidade(4);

        item.setValor(new BigDecimal (32.54));

        item.setVenda(venda);

        

        itemDAO.editar(item);

    	}
    
	}
