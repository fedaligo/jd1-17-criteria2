package by.tc.task01.dao;

import java.io.FileNotFoundException;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

public interface ApplianceDAO {
	Appliance find(Criteria criteria) throws Throwable;
}
