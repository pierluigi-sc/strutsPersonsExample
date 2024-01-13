package com.strutsDemo.action;

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
import com.strutsDemo.form.PersonForm;
import com.strutsDemo.model.Person;

public class PersonAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		PersonForm formBean = (PersonForm) form;
		IPersonDao<Person> personDao = new PersonDao();
		//PersonDTO personDTO = formBean.getPersonDTO();// = new PersonDTO();
		//List<PersonDTO> personDTOList = formBean.getPersonDTO_List();
		
		String personID = formBean.getPersonId()!= null?formBean.getPersonId():"";
		String personName = formBean.getPersonName()!= null?formBean.getPersonName():"";
		String personPlace = formBean.getPersonPlace()!= null?formBean.getPersonPlace():"";
		String personAge = formBean.getPersonAge()!= null?formBean.getPersonAge():"";

		if (!(personID.equals("")) && !(personName.equals(""))
				&& !(personPlace.equals("")) && !(personAge.equals(""))) {
			//personDTO = formBean.getPersonDTO();
			//System.out.println("ok");
			
		//}
		//if(personDTO != null) {
			personDao.save(new Person(personID,personName,personPlace,personAge));
			//PersonDTO[] personDTOArray = new PersonDTO[personDTOList.size()];
			//personDTOArray = personDTOList.toArray(personDTOArray);
			
			//formBean.setPersonDTO_List(personDTOList);
		}
		//if (formBean.getCount() != null && personDTO != null) {
			//if (personDTOList.size() != formBean.getCount()) {
				//personDTOList.add(personDTO);
				//PersonDTO[] alienDTOArray = new PersonDTO[personDTOList.size()];
				//alienDTOArray = personDTOList.toArray(alienDTOArray);
				//formBean.setPersonDTO_List(alienDTOArray);

			//}
		//}
		if(personDao.getAll().size() != 0) {
			System.out.println("********* LIST OF PERSONS *********");
			for(Person p:personDao.getAll()) {
				System.out.println(p.toString());
				//System.out.println(personDao.getAll().size());
			}
		}	
		//formBean.setPersonDTO(new PersonDTO());

		return mapping.findForward("success");
	}

}
