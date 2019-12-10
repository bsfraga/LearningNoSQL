package mongoDBExampleCRUD.model;

import java.util.ArrayList;
import java.util.Objects;

public class Distribuidor extends Usuario {

	private String distribuidor;
	private Usuario user;

	public Distribuidor(String nome, String nomeLogin, String email, String distribuidor, ArrayList<String> sistema,
			ArrayList<String> perfilAcesso) {
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(distribuidor, user);
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
		if (!(obj instanceof Distribuidor)) {
			return false;
		}
		Distribuidor other = (Distribuidor) obj;
		return Objects.equals(distribuidor, other.distribuidor) && Objects.equals(user, other.user);
	}

	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}

}
