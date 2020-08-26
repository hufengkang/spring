package cn.zero.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.zero.dao.EmployeeDao;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeDao employeeDao;
	
	public void selectTest(String id) {
		Map<String, Object> map = employeeDao.selectTest(id);
		System.out.println(map);
	}
	
	public void insertEmp() {
		employeeDao.insertEmp("");
	}
}
