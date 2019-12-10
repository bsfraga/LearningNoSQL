package mongoDBExampleCRUD.model;

import java.util.ArrayList;
import java.util.Objects;

public class Acessos {
	
	private ArrayList<String> sistema;
	private ArrayList<String> perfilAcesso;

	public ArrayList<String> getSistema() {
		return sistema;
	}
	public void setSistema(ArrayList<String> sistema) {
		this.sistema = sistema;
	}
	public ArrayList<String> getPerfilAcesso() {
		return perfilAcesso;
	}
	public void setPerfilAcesso(ArrayList<String> perfilAcesso) {
		this.perfilAcesso = perfilAcesso;
	}
	@Override
	public int hashCode() {
		return Objects.hash(perfilAcesso, sistema);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Acessos)) {
			return false;
		}
		Acessos other = (Acessos) obj;
		return Objects.equals(perfilAcesso, other.perfilAcesso) && Objects.equals(sistema, other.sistema);
	}

}
