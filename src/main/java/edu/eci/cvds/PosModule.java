package edu.eci.cvds;

import com.google.inject.AbstractModule;

import edu.eci.cvds.sampleprj.dao.*;
import edu.eci.cvds.sampleprj.dao.mybatis.*;


public class PosModule extends AbstractModule {
	  @Override 
	  protected void configure() {
	    bind(ClienteDAO.class).to(MyBATISClienteDAO.class);
	    bind(ItemDAO.class).to(MyBATISItemDAO.class);
	 
	  }
	}
