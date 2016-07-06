package br.com.localweb.teste;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.localweb.dao.FuncionarioDAO;
import br.com.localweb.domain.Funcionario;

public class FuncionarioDAOTest {
	@Test
	@Ignore
	public void salvar(){
		Funcionario funcionario = new Funcionario();
		funcionario.setCpf("111.111.111-11");
		funcionario.setFuncao("Administrador");
		funcionario.setNome("Pedro");
		funcionario.setSenha("1234");
		
		FuncionarioDAO dao = new FuncionarioDAO();
		
		dao.salvar(funcionario);		
	}
	@Test
	@Ignore
	public void listar(){
		
		FuncionarioDAO dao = new FuncionarioDAO();
		
		List<Funcionario> funcionarios = dao.listar();
		
		System.out.println(funcionarios);
		
	}
	@Test
	@Ignore
	public void buscarPorCodigo(){
		FuncionarioDAO dao = new FuncionarioDAO();
		
		Funcionario funcionarios = dao.buscarPorCodigo(3L);
		
		System.out.println(funcionarios);
		
	}
	@Test
	@Ignore
	public void excluir(){
		FuncionarioDAO dao = new FuncionarioDAO();
		
		Funcionario funcionario = dao.buscarPorCodigo(3L);
		
		
		dao.excluir(funcionario);
	}
	
	@Test
	@Ignore
	public void editar(){
		Funcionario funcionario = new Funcionario();
		funcionario.setCpf("411.411.411-44");
		funcionario.setFuncao("Gerencia");
		funcionario.setNome("Pedro");
		funcionario.setSenha("1234");
		
		FuncionarioDAO dao = new FuncionarioDAO();
		
		dao.editar(funcionario);
	}
}