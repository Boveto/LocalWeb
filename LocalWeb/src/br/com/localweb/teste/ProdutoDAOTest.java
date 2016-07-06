package br.com.localweb.teste;


import java.math.BigDecimal;
import java.util.List;


import org.junit.Ignore;
import org.junit.Test;

import br.com.localweb.dao.FabricanteDAO;
import br.com.localweb.dao.ProdutoDAO;
import br.com.localweb.domain.Fabricante;
import br.com.localweb.domain.Produto;

public class ProdutoDAOTest {

    @Test
    public void salvar(){

        FabricanteDAO fabricanteDAO = new FabricanteDAO();

        //Verificar o codigo na base, aqui o inserido é (2L)
        Fabricante fabricante = fabricanteDAO.buscarPorCodigo(2L);       

        Produto produto = new Produto();
        produto.setDescricao("DESCRICAOX");
        produto.setPreco(new BigDecimal(19.63D));
        produto.setQuantidade(5);
        produto.setFabricante(fabricante);        

        System.out.println(produto);       

        ProdutoDAO produtoDAO = new ProdutoDAO();

        produtoDAO.salvar(produto);

    }

    

    @Test

    @Ignore

    public void buscarPorCodigo(){

        ProdutoDAO produtoDAO = new ProdutoDAO();

        Produto produto = produtoDAO.buscarPorCodigo(2L);

        

        System.out.println(produto);

    }

   
    @Test
    @Ignore

    public void Listar(){

        ProdutoDAO produtoDAO = new ProdutoDAO();

        List<Produto> produtos = produtoDAO.listar();

        System.out.println(produtos);

    }

    @Test
    @Ignore
    public void editar(){

    		ProdutoDAO produtoDAO = new ProdutoDAO();

    		Produto produto = produtoDAO.buscarPorCodigo(2L);

    		produto.setDescricao("DESCRICAOb");

    		produto.setPreco(new BigDecimal(6.37));

    		produto.setQuantidade(9);

    		FabricanteDAO fabricanteDAO = new FabricanteDAO();

    		Fabricante fabricante = fabricanteDAO.buscarPorCodigo(1L);

    		produto.setFabricante(fabricante);

    		produtoDAO.editar(produto);


    }
}
