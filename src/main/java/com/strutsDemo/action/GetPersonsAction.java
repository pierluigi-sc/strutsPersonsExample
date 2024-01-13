package com.strutsDemo.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.strutsDemo.dao.IPersonDao;
import com.strutsDemo.dao.PersonDao;
import com.strutsDemo.dto.PersonDTO;
import com.strutsDemo.form.PersonsForm;
import com.strutsDemo.model.Person;

public class GetPersonsAction extends Action{

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
		HttpServletResponse response) throws Exception{
		
		PersonsForm formBean = (PersonsForm) form;
		IPersonDao<Person> pDao = new PersonDao();
		List<Person> persons = pDao.getAll();
		PersonDTO pDto;
		List<PersonDTO> personsDTO = new ArrayList<>();
		for(Person p: persons) {
			pDto = new PersonDTO();
			pDto.setPersonId(p.getId());
			pDto.setPersonName(p.getName());
			pDto.setPersonPlace(p.getPlace());
			pDto.setPersonAge(p.getAge());
			
			personsDTO.add(pDto);
			
		}
		
		//pDto.setPersonDTO_List(personsDTO);
		
		formBean.setPersonDTO_List(personsDTO);
		
		return mapping.findForward("success");
		
	}
}
