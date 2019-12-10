package mongoDBExampleCRUD.model;

import java.util.ArrayList;
import java.util.Objects;

public class GrupoLoja extends Usuario {

	private String grupoLoja;
	private Usuario user;

	public GrupoLoja(String nome, String nomeLogin, String email, String grupoLoja, ArrayList<String> sistema,
			ArrayList<String> perfilAcesso) {
		user = new Usuario();
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(grupoLoja, user);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof GrupoLoja)) {
			return false;
		}
		GrupoLoja other = (GrupoLoja) obj;
		return Objects.equals(grupoLoja, other.grupoLoja) && Objects.equals(user, other.user);
	}

	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}

}
