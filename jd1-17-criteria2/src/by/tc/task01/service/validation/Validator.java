package by.tc.task01.service.validation;

import by.tc.task01.dao.impl.ApplianceDAOImpl;
import by.tc.task01.entity.criteria.Criteria;

public class Validator {
	
	public static boolean criteriaValidator(Criteria criteria) throws Throwable {
		ApplianceDAOImpl a = new ApplianceDAOImpl();
		
		if(a.find(criteria)!=null){
			return true;
		} else{
			return false;
		}
		
		
	}

}

//you may add your own new classes