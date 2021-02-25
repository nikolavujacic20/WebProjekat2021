package main;
import model.User;

import io.UserIO;


import java.io.IOException;

import java.text.ParseException;
import java.util.ArrayList;


public class main {
	
	public static ArrayList<User> users = new ArrayList<User>();

	public static void main(String[] args) throws NumberFormatException, IOException, ParseException {
	
		UserIO.fromFile();
		System.out.println("ZAVRSENO UPISIVANJE");
		UserIO.toFile();

	}

}
