package com.bolsadeideas.springboot.di.app.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/*@Component("serviceTwo")
@Primary*/
public class ServiceTwo implements IService {

	
	@Override
	public String operacion() {
		return "ejecutando algún proceso de lógica negocio serviceTwo"; 
	}

}
