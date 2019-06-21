package by.tc.task01.dao.impl;

import java.io.FileReader;
import java.io.BufferedReader;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

public class ApplianceDAOImpl implements ApplianceDAO{

	public Appliance find(Criteria criteria) throws Throwable {
		
		String fileName = "resources/appliances_db.txt";
		FileReader fileReader = new FileReader(fileName);
		BufferedReader bufferReader = new BufferedReader(fileReader);
		String line = bufferReader.readLine();
		
		while(line!=null) {
			String[]mass = line.split("\\W");
			
			if(mass[0].equals(criteria.getGroupSearchName())) 
			{
				for(int i=0;i<mass.length;i++){
					if(criteria.getCriteria().containsKey(mass[i])==true){
						//if(criteria.getCriteria().containsValue(Integer.getInteger(mass[i]))==true)
						if(Integer.getInteger(criteria.getCriteria().get(mass[i]).toString())==Integer.getInteger(mass[i+1]))
						{//criteria.getCriteria().get(mass[i])
							Appliance a = new Appliance(criteria.getGroupSearchName());
							return a;
						}
					}
				}
							}
			line = bufferReader.readLine();
			
		}
		fileReader.close();
		
			return null;
		
		
		
	}

	
	
	// you may add your own code here

}


//you may add your own new classes