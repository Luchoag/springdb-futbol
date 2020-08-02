package com.greppiluciano.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.greppiluciano.beans.Marca;

@Repository
public class DAOMarcaImpl implements DAOMarca {
	
	@Autowired
	private DataSource dataSource;

	@Override
	public void registrar(Marca marca) throws Exception {
		String sql = "INSERT INTO Marca (id, nombre) values (?, ?)";
		Connection con = null;
		try {
			con = dataSource.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, marca.getId());
			ps.setString(2, marca.getNombre());
			ps.executeUpdate();
			ps.close();
		} catch (Exception e) {
			throw e;
		} finally {
			if (con != null) con.close();
		}
		
	}

}
