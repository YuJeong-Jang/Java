package com.yedamcommon;

import java.util.List;
import java.util.OptionalDouble;

import com.yedam.Employees;
import com.yedam.EmployeesDAO;

public class EmployeesExample {
	public static void main(String[] args) {

		List<Employees> list = null;
		EmployeesDAO dao = new EmployeesDAO();
		list = dao.getEmployeesList();
//		OptionalDouble avg = list.stream()
//				.filter(t -> t.getBirth().startsWith("19"))
//				.filter(t -> t.getBirth() > 1970)
//				.mapToInt(p -> p.getId());
//		if (avg.isPresent()) {
//			System.out.println("직무 : " + avg.getAsDouble());
//		} else {
//			System.out.println("적합한 사원이 없습니다.");
//		}
	}
}
