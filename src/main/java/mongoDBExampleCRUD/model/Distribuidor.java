package mongoDBExampleCRUD.model;

import java.util.ArrayList;

public class Distribuidor extends Usuario{

	private String distribuidor;
	private Usuario user;

	public Distribuidor(String nome, String nomeLogin, String email, String distribuidor, ArrayList<String> sistema, ArrayList<String> perfilAcesso) {
		user = new Usuario();
		user.setNome(nome);
		user.setNomeLogin(nomeLogin);
		user.setEmail(email);
		this.distribuidor = distribuidor;
		user.setSistema(sistema);
		user.setPerfilAcesso(perfilAcesso);
	}
	
	
	public String getDistribuidor() {
		return distribuidor;
	}

	public void setDistribuidor(String distribuidor) {
		this.distribuidor = distribuidor;
	}
	
}
