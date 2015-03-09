package service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import clientServeur.IServiceGrenouille;
import dao.DaoException;
import dao.DaoFacade;
import entity.Grenouille;
import entity.IGrenouille;


@Stateless
@Remote(IServiceGrenouille.class)
public class ServiceGrenouille implements IServiceGrenouille {

	@EJB
	DaoFacade daoFacade ;
	
	public ServiceGrenouille() {

	}
	
	@Override
	public void addGrenouille(IGrenouille Grenouille) {
		try {
			daoFacade.addGrenouille(Grenouille);
		} catch (DaoException e) {
			System.out.println("**!!**!!** : ServiceGrenouille - addGrenouille - " + e.getCode() + ":" + e.getMessage());
		}
		
	}
	@Override
	public void updateGrenouille(IGrenouille Grenouille) {
		try {
			daoFacade.updateGrenouille(Grenouille);
		} catch (DaoException e) {
			System.out.println("**!!**!!** : ServiceGrenouille - updateGrenouille - " + e.getCode() + ":" + e.getMessage());
		}
		
	}
	@Override
	public void delGrenouille(IGrenouille Grenouille) {
		try {
			daoFacade.delGrenouille(Grenouille);
		} catch (DaoException e) {
			System.out.println("**!!**!!** : ServiceGrenouille - delGrenouille - " + e.getCode() + ":" + e.getMessage());
		}
		
	}

	@Override
	public void delGrenouilles() {
		daoFacade.delGrenouilles();
	}
	
	
	@Override
	public IGrenouille getGrenouille(int code) {
		IGrenouille grenouille = null;
		try {
			grenouille = daoFacade.getGrenouille(code);
		} catch (DaoException e) {
			System.out.println("**!!**!!** : ServiceGrenouille - getGrenouille(int code) - " + e.getCode() + ":" + e.getMessage());
		}
		return grenouille;	
	}


	@Override
	public IGrenouille getGrenouille(Grenouille grenouille) {
		IGrenouille grenouillex = null;
		try {
			grenouillex = daoFacade.getGrenouille(grenouille);
		} catch (DaoException e) {
			System.out.println("**!!**!!** : ServiceGrenouille - getGrenouille(Grenouille grenouille) - " + e.getCode() + ":" + e.getMessage());
		}
		return grenouillex;	
	}
	
	@Override
	public List<IGrenouille> getGrenouilles() {
		return daoFacade.getGrenouilles();
		
	}

}
