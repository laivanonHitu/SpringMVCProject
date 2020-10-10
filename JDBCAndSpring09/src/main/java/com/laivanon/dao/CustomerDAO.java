package com.laivanon.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.laivanon.entities.Customer;
import com.laivanon.entities.CustomerMapper;

@Repository
@Transactional
public class CustomerDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Customer> findALL() {
		String sql = "SELECT * FROM customer";
		return jdbcTemplate.query(sql, new CustomerMapper());
	}

	public Customer findById(int id) {
		String sql = "SELECT * FROM customer WHERE id = ?";
		return jdbcTemplate.queryForObject(sql, new CustomerMapper(), id);
	}

	public void save(Customer customer) {
		String sql = "INSERT INTO customer (name,address) VALUES(?,?)";
		jdbcTemplate.update(sql, customer.getName(), customer.getAddress());

	}

	public void update(Customer customer) {
		String sql = "UPDATE customer SET name = ?, address = ? WHERE id = ?";
		jdbcTemplate.update(sql, customer.getName(), customer.getAddress(), customer.getId());
	}

	public void delete(int id) {
		String sql = "DELETE FORM customer WHERE id = " + id;
		jdbcTemplate.update(sql);
	}

}
