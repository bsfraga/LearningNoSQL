package mongoDBExampleCRUD.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import mongoDBExampleCRUD.db.Connection;
import mongoDBExampleCRUD.model.Cliente;
import mongoDBExampleCRUD.model.Distribuidor;
import mongoDBExampleCRUD.model.GrupoLoja;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> arrayAcessoCliente = new ArrayList<String>();
		ArrayList<String> arrayPerfilCliente = new ArrayList<String>();
		
		ArrayList<String> arrayAcessoDistribuidor = new ArrayList<String>();
		ArrayList<String> arrayPerfilDistribuidor = new ArrayList<String>();

		ArrayList<String> arrayAcessoGrupoLoja = new ArrayList<String>(); 
		ArrayList<String> arrayPerfilGrupoLoja = new ArrayList<String>(); 

		arrayAcessoCliente.add("Acesso1");
		arrayAcessoCliente.add("Acesso2");
		arrayAcessoCliente.add("Acesso3");
		arrayAcessoCliente.add("Acesso4");
		arrayAcessoCliente.add("Acesso5");
		arrayPerfilCliente.add("perfil1");
		arrayPerfilCliente.add("perfil2");
		arrayPerfilCliente.add("perfil3");
		arrayPerfilCliente.add("perfil4");
		arrayPerfilCliente.add("perfil5");
		arrayPerfilCliente.add("perfil6");
		/********************************************************************/
		
		//Nova Instancia dos objetos com os parâmetros
		Cliente cliente = new Cliente("Nome Nomeado", "nomeNome", "nome@nome.com.br", "redeNome", "empresaNome", arrayAcessoCliente, arrayPerfilCliente);
		Distribuidor distribuidor = new Distribuidor("Nomeado Nome", "nomeNomeado", "nome@nomeado.com.br", "distribuidor", arrayAcessoDistribuidor, arrayPerfilDistribuidor);
		GrupoLoja grupoLoja = new GrupoLoja("Nome Nome", "nomeadoNomeado", "nomeado@nomeado.com.br", "grupoLoja", arrayAcessoGrupoLoja, arrayPerfilGrupoLoja );
		/********************************************************************/

		Connection db = new Connection();
		
		Map<String, Object> clientMapper = new HashMap<String, Object>();
		clientMapper.put("cliente_ulululululu", cliente);
		db.insert("testeCliente", clientMapper);
	}
	
}
