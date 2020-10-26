package ar.edu.ucc.arqSoft.baseService.dto;

import java.util.Date;

public class RentalResponseDto {
	
	private Date date;
	
	private String Name;
	
	private String lastName;
	
	private String title;
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date fecha) {
		this.date = fecha;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	private Long id;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	
}
