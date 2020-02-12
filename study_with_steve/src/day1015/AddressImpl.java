package day1015;

import java.util.Set;

public class AddressImpl implements Address {
	private String firstName;
	private String lastName;
	private Map<String, String> fields;
	
	private AddressImpl() {
		this.fields = new HashMap<String, String>();
	}
	
	
	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return firstName;
	}

	@Override
	public void setFirstName(String firstName) {
		// TODO Auto-generated method stub
		this.firstName = firstName;
	}

	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeField(String fieldName) {
		// TODO Auto-generated method stub
		this.fields.remove(fieldName);
	}


	@Override
	public void setLastName(String LastName) {
		// TODO Auto-generated method stub
		this.lastName = lastName;
	}

	@Override
	public Set<String> getFieldNames() {
		// TODO Auto-generated method stub
		this.fieldNames.keySet();
	}

	@Override
	public void addField(String fieldName, String value) {
		// TODO Auto-generated method stub
		this.fields.put(fieldName, value);
	}
		

}
