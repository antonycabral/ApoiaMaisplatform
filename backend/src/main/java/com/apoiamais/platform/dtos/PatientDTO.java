package com.apoiamais.platform.dtos;

import java.time.LocalDate;

import com.apoiamais.platform.entities.Patient;

public class PatientDTO extends UserDTO {
	
	private LocalDate birthDate;
	private String cpf;
	private String rg;
	private String nis;
	
	public PatientDTO() {
		
	}

	
	
	public PatientDTO(Long id, String name, String email, String password, LocalDate birthDate, String cpf, String rg,
			String nis) {
		super(id, name, email, password);
		this.birthDate = birthDate;
		this.cpf = cpf;
		this.rg = rg;
		this.nis = nis;
	}



	public PatientDTO(Patient entity) {
		super(entity.getId(), entity.getName(), entity.getEmail(), entity.getPassword());
		this.birthDate = entity.getBirthDate();
		this.cpf = entity.getCpf();
		this.rg = entity.getRg();
		this.nis = entity.getNis();
	}
	
	

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getNis() {
		return nis;
	}

	public void setNis(String nis) {
		this.nis = nis;
	}

	
	
	
	
	
}