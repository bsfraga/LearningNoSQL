package mongoDBExampleCRUD.model;

import java.util.Objects;

import org.bson.types.ObjectId;

public class Usuario extends Acessos{

	private ObjectId _id;
	private String nome;
	private String nomeLogin;
	private String email;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNomeLogin() {
		return nomeLogin;
	}
	public void setNomeLogin(String nomeLogin) {
		this.nomeLogin = nomeLogin;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public ObjectId get_id() {
		return _id;
	}
	public void set_id(ObjectId _id) {
		this._id = _id;
	}
	@Override
	public int hashCode() {
		return Objects.hash(_id, email, nome, nomeLogin);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Usuario)) {
			return false;
		}
		Usuario other = (Usuario) obj;
		return Objects.equals(_id, other._id) && Objects.equals(email, other.email) && Objects.equals(nome, other.nome)
				&& Objects.equals(nomeLogin, other.nomeLogin);
	}
	
}
