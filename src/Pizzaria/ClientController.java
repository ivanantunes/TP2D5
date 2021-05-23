package Pizzaria;

import java.util.ArrayList;
import java.util.List;

public class ClientController {

	private static ClientController instance;
	
	private List<IClient> clients = new ArrayList<IClient>();
	
	private ClientController() { }
	
	public static ClientController getInstance() {
		
		if (ClientController.instance == null) {
			ClientController.instance = new ClientController();
		}
		
		return ClientController.instance;
		
	}
	
	public static void destroyInstance() {
		ClientController.instance = null;
	}
	
	public ClientController addClient(IClient iClient) {
		this.clients.add(iClient);
		
		return this;
	}
	
	public IClient getClient(int id) {
		IClient currentClient = null;
		
		for (IClient client : this.clients) {
			
			if (client.getId() == id) {
				currentClient = client;
				break;
			}
			
		}
		
		return currentClient;
	}
	
	public List<IClient> getClients() {
		return this.clients;
	}
	
	public ClientController updateClient(IClient client) {
		
		for (IClient cli : this.clients) {
	
			if (cli.getId() == client.getId()) {
				cli
				.setFullname(client.getFullname())
				.setAddress(client.getAddress())
				.setTelephone(client.getTelephone());
				break;
			}
	
		}

		return this;
	}
	
	public ClientController deleteClient(Client client) {
		
		this.clients.remove(client);
		
		return this;
	}
	
}
