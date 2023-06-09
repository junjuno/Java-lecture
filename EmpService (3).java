package aproject.model;

import java.sql.Statement;
import java.util.List;

import aproject.vo.EmpVO;

//Service : 업무로직담당 
public class EmpService {

	EmpDAO empDao = new EmpDAO();
	
	public List<EmpVO> selectAll() {
		//
		return empDao.selectAll();
	}
	public EmpVO selectById(int empid) {
		//
		return empDao.selectById(empid);
	}
	public List<EmpVO> selectByDept(int deptid) {
		return empDao.selectByDept(deptid);
	}
	public List<EmpVO> selectByCondition(int deptid, String jobid, double salary) {
		return empDao.selectByCondition(deptid, jobid, salary);
	}
	//자신의 속한 부서의 평균 급여보다 더 적은 급여를 받는 직원들을 조회하시오
	public List<EmpVO> selectLAB() {
		List<EmpVO> emplist = empDao.selectLAB();
		System.out.println("[EempService] 실행건수:" + emplist.size());
		return emplist;
	}
	//신규직원등록 (insert)
	public String empInsert(EmpVO emp) {
		int result = empDao.empInsert(emp);
		return result>0?"입력성공":"입력실패";
	}
	
	
	
}








