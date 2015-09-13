package com.guanzhong.customer.dao;




import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.guanzhong.customer.model.Customer;

public class CustomerDAOImplUpdate extends JdbcDaoSupport implements CustomerDAO
{
   
	
	
	
	private String sql;

	public void insert(Customer customer)
	{
		String sql = "INSERT INTO CUSTOMER " +
				"(CUST_ID, NAME, AGE) VALUES (?, ?, ?)";
		
		
		
		getJdbcTemplate().update(sql, new Object[] {
			customer.getCusId(),customer.getName(),customer.getAge()});
		
		
		
		
	}
	
	public Customer findByCustomerId(int custId)
	{
		String sql = "SELECT * FROM CUSTOMER WHERE CUST_ID = ?"; 
		
		Customer customer = (Customer)getJdbcTemplate().queryForObject(sql, new Object[]{custId},
				new BeanPropertyRowMapper(Customer.class));
		
		
		return customer;
	}
	
	@SuppressWarnings("unchecked")
	public List<Customer> findAll()
	{
		sql = "SELECT * FROM CUSTOMER";
		
		List<Customer> customers = getJdbcTemplate().query(sql, 
				new BeanPropertyRowMapper(Customer.class));
		
		return customers;
		
		
	}
	
	

}
