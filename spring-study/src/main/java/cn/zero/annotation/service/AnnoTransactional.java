package cn.zero.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.zero.dao.EmployeeDao;
import cn.zero.domain.Employee;

@Service
public class AnnoTransactional {

	@Autowired
	private EmployeeDao employeeDao;

	@Transactional(readOnly = true)
	public Employee selectEmpById(String id) {
		
		return employeeDao.selectEmpById(id);
	}
	
	@Transactional(rollbackFor=Throwable.class)
	public int updateEmpById(String id) {
		Employee emp = employeeDao.selectEmpById(id);
		
		emp.setEmpName("张三");
		int rows = employeeDao.updateEmployee(emp);
		return rows;
	}
}
