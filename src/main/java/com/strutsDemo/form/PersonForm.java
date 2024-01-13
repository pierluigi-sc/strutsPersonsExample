package com.strutsDemo.form;

import org.apache.struts.action.ActionForm;

public class PersonForm extends ActionForm {
	private static final long serialVersionUID = 7352021000623040587L;
	//private Integer count;
	//List<PersonDTO> personDTO_List;
	
	private String personId;
	private String personName;
	private String personPlace;
	private String personAge;
	
	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPersonPlace() {
		return personPlace;
	}

	public void setPersonPlace(String personPlace) {
		this.personPlace = personPlace;
	}

	public String getPersonAge() {
		return personAge;
	}

	public void setPersonAge(String personAge) {
		this.personAge = personAge;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

//	private PersonDTO personDTO;

//	public Integer getCount() {
//		return count;
//	}
//
//	public void setCount(Integer count) {
//		this.count = count;
//	}
//
//	public List<PersonDTO> getPersonDTO_List() {
//		if(personDTO_List == null)
//			personDTO_List = new ArrayList<>();
//		return personDTO_List;
//	}
//
//	public void setPersonDTO_List(List<PersonDTO> personDTO_List) {
//		this.personDTO_List = personDTO_List;
//	}

//	public PersonDTO getPersonDTO() {
//		return personDTO;
//	}
//
//	public void setPersonDTO(PersonDTO personDTO) {
//		this.personDTO = personDTO;
//	}

}
