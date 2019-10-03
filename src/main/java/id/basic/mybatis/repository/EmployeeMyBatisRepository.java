package id.basic.mybatis.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import id.basic.mybatis.model.Employee;

@Mapper
public interface EmployeeMyBatisRepository {
	
	public List<Employee> findAll();
	
	public Employee	 findById(long id);
	
	public int deleteById(long id);
	
	public int insert(Employee employee);
	
	public int update(Employee employee);

}
