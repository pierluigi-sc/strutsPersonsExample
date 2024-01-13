package com.strutsDemo.dto;

import java.util.List;

public class PersonDTO {
	private String personId;
	private String personName;
	private String personPlace;
	private String personAge;
	private static List<PersonDTO> personDTO_List;
	
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

	
	
	@Override
	public String toString() {
		return "PersonDTO [personId=" + personId + ", personName=" + personName + ", personPlace=" + personPlace + ", age="
				+ personAge + "]";
	}

	public List<PersonDTO> getPersonDTO_List() {
		return personDTO_List;
	}

	public void setPersonDTO_List(List<PersonDTO> personDTO_List) {
		this.personDTO_List = personDTO_List;
	}

}
