package br.com.localweb.teste;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.localweb.dao.FuncionarioDAO;
import br.com.localweb.dao.VendaDAO;
import br.com.localweb.domain.Funcionario;
import br.com.localweb.domain.Venda;

import java.math.BigDecimal;
public class VendaDAOTest {

    @Test

    @Ignore

    public void salvar(){

        //faz pesquisa de funcionario

        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

        Funcionario funcionario = funcionarioDAO.buscarPorCodigo(7L);

        //insere a venda

        Venda venda = new Venda();

        venda.setFuncionario(funcionario);

       // venda.setHorario(new Date());

        venda.setValor(new BigDecimal (12.34D));

        

        VendaDAO vendaDAO = new VendaDAO();

        vendaDAO.salvar(venda);

    }

    

    @Test

    public void listar() {

        VendaDAO vendaDAO = new VendaDAO();

        

        List<Venda> vendas = vendaDAO.listar();

        

        System.out.println(vendas);        

    }

    

    @Test

    @Ignore

    public void buscarPorCodigo(){

        VendaDAO vendaDAO = new VendaDAO();

        

        Venda venda = vendaDAO.buscarPorCodigo(4L);

        

        System.out.println(venda);

    }

    

    @Test

    @Ignore

    public void excluir(){

        VendaDAO vendaDAO = new VendaDAO();

        

        Venda venda = vendaDAO.buscarPorCodigo(7L);

        

        vendaDAO.excluir(venda);        

    }

    

    @Test

    @Ignore

    public void editar(){

        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

        Funcionario funcionario = funcionarioDAO.buscarPorCodigo(2L);

        

        VendaDAO vendaDAO = new VendaDAO();

        Venda venda = vendaDAO.buscarPorCodigo(7L);

        

       // venda.setHorario(Calendar.getInstance().getTime());

      //  venda.setValor(new BigDecimal (15.34D));

        venda.setFuncionario(funcionario);

        vendaDAO.editar(venda);

    }

    


}


