package br.com.jsf.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import br.com.jsf.model.User;

@ManagedBean
public class UserBean {
	
	User user = new User();
	
	public User getUser(){
		return user;
	}

	public String validLogin(){
		
		String v = "";
		
		if(user.getUsuario().equals("123")){
			v = "imovel?faces-redirect=true";
		}else{
			
		}
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Login Inválido", "1232"));
		return v;
	}
	
}
