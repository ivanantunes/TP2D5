package Pizzaria;

public interface IClient {

	public IClient setId(int id);
	public int getId();
	
	public IClient setFullname(String fullname);
	public String getFullname();
	
	
	public IClient setTelephone(String telephone);
	public String getTelephone();
	
	public IClient setAddress(String address);
	public String getAddress();
	
}
