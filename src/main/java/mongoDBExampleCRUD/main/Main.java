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
		
		arrayAcessoDistribuidor.add("Acesso1");
		arrayAcessoDistribuidor.add("Acesso2");
		arrayAcessoDistribuidor.add("Acesso3");
		arrayAcessoDistribuidor.add("Acesso4");
		arrayAcessoDistribuidor.add("Acesso5");
		arrayPerfilDistribuidor.add("perfil1");
		arrayPerfilDistribuidor.add("perfil2");
		arrayPerfilDistribuidor.add("perfil3");
		arrayPerfilDistribuidor.add("perfil4");
		arrayPerfilDistribuidor.add("perfil5");
		arrayPerfilDistribuidor.add("perfil6");
		
		arrayAcessoGrupoLoja.add("Acesso1");
		arrayAcessoGrupoLoja.add("Acesso2");
		arrayAcessoGrupoLoja.add("Acesso3");
		arrayAcessoGrupoLoja.add("Acesso4");
		arrayAcessoGrupoLoja.add("Acesso5");
		arrayPerfilGrupoLoja.add("perfil1");
		arrayPerfilGrupoLoja.add("perfil2");
		arrayPerfilGrupoLoja.add("perfil3");
		arrayPerfilGrupoLoja.add("perfil4");
		arrayPerfilGrupoLoja.add("perfil5");
		arrayPerfilGrupoLoja.add("perfil6");
		/********************************************************************/
		
		//Nova Instancia dos objetos com os parâmetros
		Cliente cliente = new Cliente("Nome Nomeado", "nomeNome", "nome@nome.com.br", "redeNome", "empresaNome", arrayAcessoCliente, arrayPerfilCliente);
		Distribuidor distribuidor = new Distribuidor("Nomeado Nome", "nomeNomeado", "nome@nomeado.com.br", "distribuidor", arrayAcessoDistribuidor, arrayPerfilDistribuidor);
		GrupoLoja grupoLoja = new GrupoLoja("Nome Nome", "nomeadoNomeado", "nomeado@nomeado.com.br", "grupoLoja", arrayAcessoGrupoLoja, arrayPerfilGrupoLoja );
		/********************************************************************/

		Connection db = new Connection();
		
		Map<String, Object> distribuidorMapper = new HashMap<String, Object>();
		distribuidorMapper.put("distribuidor", distribuidor);
		db.insert("distribuidor", distribuidorMapper);
		
		Map<String, Object> clientMapper = new HashMap<String, Object>();
		clientMapper.put("cliente", cliente);
		db.insert("cliente", clientMapper);
		
		Map<String, Object> grupoLojaMapper = new HashMap<String, Object>();
		grupoLojaMapper.put("grupoLoja", grupoLoja);
		db.insert("grupoLoja", grupoLojaMapper);
		
		
	}
	
}
