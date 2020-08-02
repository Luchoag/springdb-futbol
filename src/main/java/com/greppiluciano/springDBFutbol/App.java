package com.greppiluciano.springDBFutbol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.greppiluciano.beans.Marca;
import com.greppiluciano.service.ServiceMarca;


public class App 
{
    public static void main( String[] args )
    {
        Marca mar = new Marca();
        mar.setId(2);
        mar.setNombre("Marca2");
        
        ApplicationContext appContext = new ClassPathXmlApplicationContext("com/greppiluciano/xml/beans.xml");
        
        ServiceMarca sm = (ServiceMarca) appContext.getBean("serviceMarcaImpl");
        
        try {
        	sm.registrar(mar);
        } catch (Exception ex) {
        	System.out.println(ex.getMessage());
        }
        
        Marca mar3 = (Marca) appContext.getBean("marca3");
        
        try {
        	sm.registrar(mar3);
        } catch (Exception ex) {
        	System.out.println(ex.getMessage());
        }   
        
        
    }
}
