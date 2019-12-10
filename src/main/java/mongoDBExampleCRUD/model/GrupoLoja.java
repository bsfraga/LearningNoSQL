package mongoDBExampleCRUD.model;

import java.util.ArrayList;

public class GrupoLoja extends Usuario{

	
	private String grupoLoja;
	private Usuario user = new Usuario();

	public GrupoLoja(String nome, String nomeLogin, String email, String grupoLoja, ArrayList<String> sistema, ArrayList<String> perfilAcesso) {
		user.setNome(nome);
		user.setNomeLogin(nomeLogin);
		user.setEmail(email);
		this.grupoLoja = grupoLoja;
		user.setSistema(sistema);
		user.setPerfilAcesso(perfilAcesso);
	}
	
	public String getGrupoLoja() {
		return grupoLoja;
	}

	public void setGrupoLoja(String grupoLoja) {
		this.grupoLoja = grupoLoja;
	}
	
	
}
