package mongoDBExampleCRUD.db;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

import java.util.Map;

import org.bson.Document;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Connection {

	CodecRegistry pojoCodecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(),
			fromProviders(PojoCodecProvider.builder().automatic(true).build()));
	
	public MongoClient makeConnection() {
		
		MongoClient client = new MongoClient(new MongoClientURI("mongodb://localhost:27017/"));
		
		return client;
	}

	public MongoDatabase openDatabse() {
		MongoDatabase database = makeConnection().getDatabase("Teste");
		database.withCodecRegistry(pojoCodecRegistry);
		return database;
	}

	public void closeConnection() {
		makeConnection().close();
	}

	public void insert (String collectionName, Map<String, Object> mapper) {


		try {
			MongoDatabase database = openDatabse();
			System.out.println("\nConexão com o Banco de Dados Estabelecida com êxtio!\n");
			
			Document document = new Document(mapper);
			
			MongoCollection<Document> collection = database.getCollection(collectionName).withCodecRegistry(pojoCodecRegistry);
			
			collection.insertOne(document);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
	}
	
	public void search() {
		
	}

}
