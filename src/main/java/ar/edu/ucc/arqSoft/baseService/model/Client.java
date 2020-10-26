package ar.edu.ucc.arqSoft.baseService.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import ar.edu.ucc.arqSoft.common.model.GenericObject;

@Entity
@Table(name = "CLIENT")
public class Client extends GenericObject {
	
	@NotNull
	@Size(min = 1, max = 50)
	@Column(name = "NAME")
	private String name;
	
	@NotNull
	@Size(min = 1, max = 50)
	@Column(name = "LAST_NAME")
	private String lastName;
	
	@NotNull
	@Size(min = 1, max = 12)
	@Column(name = "DNI")
	private String dni;
	
	@NotNull
	@Size(min = 1, max = 100)
	@Column(name = "EMAIL")
	private String email;
	
	@OneToMany(mappedBy="client", fetch = FetchType.LAZY)
	private Set<Rental> rentals;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<Rental> getRentals() {
		return rentals;
	}

	public void setRentals(Set<Rental> rentals) {
		this.rentals = rentals;
	}
	
}