package com.wipro.service;

import java.util.ArrayList;
import java.util.List;

import com.wipro.bean.EmployeeBean;

public class EmployeeService {
	private List<EmployeeBean> listEmp = new ArrayList<>();

	public boolean insertEmployee(EmployeeBean bean) {
		if(listEmp.add(bean)) {
			return true;
		}
		return false;
	}

	public String insertEmployeeByPosition(EmployeeBean bean, int position) {
		if ((position<0)||(position>listEmp.size()-1)) {
			listEmp.add(bean);
			return("Inserted employee at end position : "+(listEmp.size()-1));
		}
		else {
			listEmp.add(position,bean);
			return("Inserted employee at position : "+position);
		}
	}

	public List<EmployeeBean> fetchAllEmployees(){
		if (listEmp.isEmpty()){
			return null;
		}
		else {
			return listEmp;
		}
	}

	public boolean deleteEmployeeByEmpID(int empID) {

		for (int i=0;i<listEmp.size();i++) {
			if(listEmp.get(i).getEmpID()==empID) {
				listEmp.remove(i);
				return true;
			}
		}
		return false;
	}

	public boolean updateEmployeeByEmpID(EmployeeBean bean) {
		if((bean.getEmpID()<0)||(bean.getEmpID()>listEmp.size())) {
			return false;
		}
		for(EmployeeBean b1: listEmp) {
			if (b1.getEmpID()==bean.getEmpID()) {
				b1.setDesignation(bean.getDesignation());
				b1.setName(bean.getName());
				b1.setSalary(bean.getSalary());
				return true;
			}
		}
		return false;
	}
	public EmployeeBean findEmployeeByEmpID(int empID){
		if((empID<0)||(empID>listEmp.size())) {
			return null;
		}
		for(EmployeeBean b1: listEmp) {
			if (b1.getEmpID()==empID) {
				return b1;
			}
		}
		return null;
	}
}
