package mongoDBExampleCRUD.model;

import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

public class Cliente extends Usuario{
	
	private String rede;
	private String empresa;
	private Map<String, Usuario> usuario;
	private Usuario user;

	public Cliente(String nome, String nomeLogin, String email, String rede, String empresa, ArrayList<String> sistema, ArrayList<String> perfilAcesso) {
		user = new Usuario();
		user.setNome(nome);
		user.setNomeLogin(nomeLogin);
		user.setEmail(email);
		this.rede = rede;
		this.empresa = empresa;
		user.setSistema(sistema);
		user.setPerfilAcesso(perfilAcesso);
	}
	
	public String getRede() {
		return rede;
	}
	public void setRede(String rede) {
		this.rede = rede;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(empresa, rede, user);
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
		if (!(obj instanceof Cliente)) {
			return false;
		}
		Cliente other = (Cliente) obj;
		return Objects.equals(empresa, other.empresa) && Objects.equals(rede, other.rede)
				&& Objects.equals(user, other.user);
	}

	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}

	
}
