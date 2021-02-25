package io;
import java.io.BufferedReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;


import main.main;
import model.BuyerType;
import model.BuyerTypeName;
import model.Role;
import model.User;

public class UserIO {
	
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy.");
	
	public static void fromFile() throws IOException, ParseException {
		String csvFileName = "././data/users.csv";
		
		String line = "";  
		String splitBy = ",";
		
		 
		BufferedReader br = new BufferedReader(new FileReader(csvFileName));  
		while ((line = br.readLine()) != null)   
		{  
	
		String[] user = line.split(splitBy);
		String [] buyerType = user[5].split(":");
		String pass = user[0];
		String name = user[1];
		String lastName = user[2];
		Date date = sdf.parse(user[3]);
		Role role = Role.valueOf(user[4]);
		BuyerTypeName buyerTypeName = BuyerTypeName.valueOf(buyerType[0]);
		double buyerTypeDiscount = Double.parseDouble(buyerType[1]);
		int buyerTypePoints = Integer.parseInt(buyerType[2]);
		String username = user[6];
		User u = new User(pass,name,lastName,date,role, new BuyerType(buyerTypeName,buyerTypeDiscount,buyerTypePoints),username);
		main.users.add(u);
		
		}  
		
		br.close();
		
	}
	
	
	public static void toFile() throws IOException {
		
		FileWriter csvWriter = new FileWriter("././data/users.csv");
		
		for (User u : main.users) {
			csvWriter.append(u.getPassword());
			csvWriter.append(",");
			csvWriter.append(u.getName());
			csvWriter.append(",");
			csvWriter.append(u.getLastname());
			csvWriter.append(",");
			csvWriter.append(sdf.format(u.getDate()));
			csvWriter.append(",");
			csvWriter.append(u.getRole().toString());
			csvWriter.append(",");
			csvWriter.append(u.getBuyerType().getBuyerTypeName().toString());
			csvWriter.append(":");
			csvWriter.append(Double.toString(u.getBuyerType().getDiscount()));
			csvWriter.append(":");
			csvWriter.append(Integer.toString(u.getBuyerType().getRequiredPoints()));
			csvWriter.append(",");
			csvWriter.append(u.getUsername());
			csvWriter.append("\n");
			
		}
		
		csvWriter.flush();
		csvWriter.close();
		
		
		
	}
	


}
