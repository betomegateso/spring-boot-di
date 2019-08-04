package com.bolsadeideas.springboot.di.app.service;

import org.springframework.stereotype.Component;

//@Component("serviceOne")
public class ServiceOne implements IService {

	
	@Override
	public String operacion() {
		return "ejecutando algún proceso de lógica negocio serviceOne";
	}

}
