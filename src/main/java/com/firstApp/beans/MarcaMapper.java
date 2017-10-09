package com.firstApp.beans;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MarcaMapper implements RowMapper<Marca>{

	public Marca mapRow(ResultSet rs, int rowNum) throws SQLException {
		Marca m = new Marca();
		m.setId(rs.getInt("id"));
		m.setNombre(rs.getString("nombre"));
		return m;
	}

}
