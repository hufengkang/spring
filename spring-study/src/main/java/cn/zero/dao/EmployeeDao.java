package cn.zero.dao;

import java.util.Map;

import cn.zero.domain.Employee;

public interface EmployeeDao {
	
	Map<String,Object> selectTest(String id);
	
	Employee selectEmpById(String id);
	
	void insertEmp(String id);

	int updateEmployee(Employee emp);
}
