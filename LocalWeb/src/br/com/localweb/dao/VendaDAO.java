package br.com.localweb.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import br.com.localweb.domain.Venda;
import br.com.localweb.util.HibernateUtil;

public class VendaDAO {
	public void salvar(Venda venda){
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction transacao = null;
		  try{
	            transacao = sessao.beginTransaction();
	            sessao.save(venda);
	            transacao.commit();
	        } catch (RuntimeException ex) {
	            if (transacao != null) {
	                transacao.rollback();

	            }

	            throw ex;

	        } finally{

	            sessao.close();
	        }
	  }

	@SuppressWarnings("unchecked")

	public List<Venda> listar() {

		Session sessao = HibernateUtil.getSessionFactory().openSession();

		List<Venda> vendas = null;
		try {

			Query consulta = sessao.getNamedQuery("venda.listar");

			vendas = consulta.list();

		} catch (RuntimeException ex) {

			throw ex;

		} finally {

			sessao.close();

		}

		return vendas;

	}

	public Venda buscarPorCodigo(Long codigo) {

		Session sessao = HibernateUtil.getSessionFactory().openSession();

		Venda venda = null;

		try {

			Query consulta = sessao.getNamedQuery("venda.buscarPorCodigo");

			consulta.setLong("codigo", codigo);

			venda = (Venda) consulta.uniqueResult();

		} catch (RuntimeException ex) {

			throw ex;

		} finally {

			sessao.close();

		}

		return venda;

	}

	public void excluir(Venda venda) {

		Session sessao = HibernateUtil.getSessionFactory().openSession();

		Transaction transacao = null;

		try {

			transacao = sessao.beginTransaction();

			sessao.delete(venda);

			transacao.commit();

		} catch (RuntimeException ex) {

			if (transacao != null) {

				transacao.rollback();

			}

			throw ex;

		} finally {

			sessao.close();

		}

	}

	public void editar(Venda venda) {

		Session sessao = HibernateUtil.getSessionFactory().openSession();

		Transaction transacao = null;

		try {

			transacao = sessao.beginTransaction();

			sessao.update(venda);

			transacao.commit();

		} catch (RuntimeException ex) {

			if (transacao != null) {

				transacao.rollback();

			}

			throw ex;

		} finally {

			sessao.close();

		}

	}

}
