package com.quality.project.search;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Search {
	
	//autowiring the jdbc template using jdbc credentials in properties
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<String> getAllResults() {
		List<String> results = new ArrayList<>();
		results.addAll(jdbcTemplate.queryForList("select * from sample;",String.class));
		return results;
	}

}
