package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class SaleDAO
{
	@Autowired
    private SaleRepository jdbcTemplate;
  
    public List<Sale> list() 
    {
         return jdbcTemplate.findAll();
    }
  
    public void save(Sale sale) 
    {
    	jdbcTemplate.save(sale);
    }
  
    public Sale get(int id) {
        return jdbcTemplate.findById(id).get();
    }
  
    public void update(Sale sale) 
    {
    	jdbcTemplate.save(sale);
    }
  
    public void delete(int id) 
    {
    	jdbcTemplate.deleteById(id);
    }

}
