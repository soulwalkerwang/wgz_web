package com.guanzhong.customer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import com.guanzhong.customer.model.Customer;


public class CustomerDAOImpl implements CustomerDAO
{
	
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource)
	{
		this.dataSource = dataSource;
		
	}
	
	public List<Customer> findAll()
	{
		// TODO Auto-generated method stub
		return null;
	}

	public void insert(Customer customer)
	{
		String sql = "INSERT INTO CUSTOMER " +
				"(CUST_ID, NAME, AGE) VALUES (?, ?, ?)";
		
		Connection conn = null;
		
		try
		{
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, customer.getCusId());
			ps.setString(2, customer.getName());
			ps.setInt(3, customer.getAge());
			ps.executeUpdate();
			ps.close();
			
			
			
			
		} catch (SQLException e)
		{
			throw new RuntimeException();
		} finally
		{
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
			
			
		}

	}

	public Customer findByCustomerId(int custId)
	{
		String sql = "SELECT * FROM CUSTOMER WHERE CUST_ID = ?";
		 
		Connection conn = null;
 
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, custId);
			Customer customer = null;
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				customer = new Customer();
				customer.setCusId(rs.getInt("CUST_ID"));
				customer.setName(rs.getString("NAME"));
				customer.setAge(rs.getInt("Age"));
			}
			rs.close();
			ps.close();
			return customer;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
				conn.close();
				} catch (SQLException e) {}
			}
		}
	}

}
