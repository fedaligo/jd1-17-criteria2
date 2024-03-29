package by.tc.task01.service.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOFactory;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.validation.Validator;

public class ApplianceServiceImpl implements ApplianceService{

	public Appliance find(Criteria criteria) throws Throwable {
		if (!Validator.criteriaValidator(criteria)) {//Validator.criteriaValidator(criteria)!=true
			Appliance appliance = new Appliance("пусто");
			
			return appliance;
		}
		
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();
		
		Appliance appliance = applianceDAO.find(criteria);
		
		// you may add your own code here
		return appliance;
	}

	

}

//you may add your own new classes
