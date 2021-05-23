package Pizzaria;

public class Client implements IClient {

	private int id;
	private String fullname;
	private String telephone;
	private String address;
	
	private Client() { }
	
	public static Client buildClient() {
		return new Client();
	}
	
	@Override
	public IClient setId(int id) {
		this.id = id;
		return this;
	}

	@Override
	public int getId() {
		return this.id;
	}

	@Override
	public IClient setFullname(String fullname) {
		this.fullname = fullname;
		return this;
	}

	@Override
	public String getFullname() {
		return this.fullname;
	}

	@Override
	public IClient setTelephone(String telephone) {
		this.telephone = telephone;
		return this;
	}

	@Override
	public String getTelephone() {
		return this.telephone;
	}

	@Override
	public IClient setAddress(String address) {
		this.address = address;
		return this;
	}

	@Override
	public String getAddress() {
		return this.address;
	}
		
}
