package com.strutsDemo.form;

import java.util.List;

import org.apache.struts.action.ActionForm;

import com.strutsDemo.dto.PersonDTO;

public class PersonsForm extends ActionForm {


	private static final long serialVersionUID = 6999453972410441241L;
	
//	private PersonDTO personsForm;
//
//	public PersonDTO getPersonsForm() {
//		return personsForm;
//	}
//
//	public void setPersonsForm(PersonDTO personsForm) {
//		this.personsForm = personsForm;
//	}
	
	private List<PersonDTO> personDTO_List;

	public List<PersonDTO> getPersonDTO_List() {
		return personDTO_List;
	}

	public void setPersonDTO_List(List<PersonDTO> personDTO_List) {
		this.personDTO_List = personDTO_List;
	}
	
}
