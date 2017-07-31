package kz.manas.exam1.models;

public class Students {
	
	private Long id;
	
	private String firstname, lastname, level;
	
	private Long valuation;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public Long getValuation() {
		return valuation;
	}

	public void setValuation(Long valuation) {
		this.valuation = valuation;
	}
	
	
}
