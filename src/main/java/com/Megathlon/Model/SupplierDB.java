package com.Megathlon.Model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.Megathlon.Beans.Suppliers;

public class SupplierDB {
		String s1 = null;
		public String insertUser(Suppliers rb) {
			myDatabase db = new myDatabase();
			Connection con = db.getCon();
			try {
				Statement stat = con.createStatement();
				String query = "INSERT INTO supplier (supplierName, supplierContact, supplierLocation) VALUES ('"
				        + rb.getSupplierName() + "', '" + rb.getSupplierContact() + "', '" + rb.getSupplierLocation() + "')";
				
				stat.executeUpdate(query);
				s1 = "Data Insert Successfully";
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
			return s1;
	}
		
}

