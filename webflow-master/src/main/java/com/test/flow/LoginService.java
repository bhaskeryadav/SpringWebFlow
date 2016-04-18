package com.test.flow;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class LoginService{
	
	private Map<String, String> dataMap = new HashMap<String, String>(10);
	
	public String performLogin(LoginCredentials loginCredentials) throws IncorrectLoginCredentialsException {
		
	/*	List<Object> li=dataMap.entrySet().stream().filter(e->
			e.getValue().equals(loginCredentials.getLoginName())&& e.getKey().equals(loginCredentials.getPassword()))
		.map(e->e.getValue()).collect(Collectors.toList());
		
		System.out.println(li.size());*/
		System.out.println("performLogin");
		
/*		if(li.size()>0){
			return "success";
		}else{
			throw new IncorrectLoginCredentialsException();
		}*/
		
		return "success";
	}
	
	public void createNewAccount(LoginCredentials loginCredentials) throws IncorrectLoginCredentialsException{
		System.out.println("createNewAccount");
		dataMap.put(loginCredentials.getLoginName(), loginCredentials.getPassword());
		
	}
	
}