package br.com.localweb.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.localweb.util.FacesUtil;

@ManagedBean
@ViewScoped
public class FabricanteBean {
	public void salvar(){
		FacesUtil.adicionarMsgErro("Fabricante salvo com sucesso");
	}
}
