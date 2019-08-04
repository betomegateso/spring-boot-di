package com.bolsadeideas.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.bolsadeideas.springboot.di.app.model.domain.ItemFactura;
import com.bolsadeideas.springboot.di.app.model.domain.Producto;
import com.bolsadeideas.springboot.di.app.service.IService;
import com.bolsadeideas.springboot.di.app.service.ServiceOne;
import com.bolsadeideas.springboot.di.app.service.ServiceTwo;

@Configuration
public class AppConfig {

	@Bean("serviceOne")

	public IService serviceRegisterOne() {

		return new ServiceOne();

	}

	@Bean("serviceTwo")
	@Primary
	public IService serviceRegisterTwo() {

		return new ServiceTwo();

	}
    
	@Bean("itemsFactura")
	public List<ItemFactura> registerItems() {
		Producto producto1 = new Producto("Camara Sony", 10.001);
		Producto producto2 = new Producto("Camara GG", 20.002);

		ItemFactura item1 = new ItemFactura(producto1, 2);
		ItemFactura item2 = new ItemFactura(producto2, 11);
		
		return Arrays.asList(item1,item2);
		
	}
	
	@Bean("itemsFacturaOficina")
	public List<ItemFactura> registerItemsForOffice() {
		Producto producto1 = new Producto("Monitor DELL", 250.001);
		Producto producto2 = new Producto("NOTEBOOK ASUS", 500.002);
		Producto producto3 = new Producto("Impresora HP", 350.001);
		Producto producto4 = new Producto("Mouse", 5.002);
		
		ItemFactura item1 = new ItemFactura(producto1, 2);
		ItemFactura item2 = new ItemFactura(producto2, 11);
		ItemFactura item3 = new ItemFactura(producto3, 23);
		ItemFactura item4 = new ItemFactura(producto4, 130);
		
		return Arrays.asList(item1,item2,item3,item4);
		
	}

}
