package dao;
/**
 * Couche Dao pour Grenouille
 *
 *  Cette classe joue le role de facade
 *  Elle redirige vers les controleurs specialisés par UC
 * 
 */

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;

import dao.uc1.DaoUc1;
import dao.uc2.DaoUc2;
import entity.IGrenouille;

@Singleton
@LocalBean
public class DaoFacade {
	
	@EJB
	public DaoUc1 daoUc1;
	@EJB
	public DaoUc2 daoUc2;
	

	public void addGrenouille(IGrenouille grenouille) throws DaoException {
		daoUc1.addGrenouille(grenouille);
	}

	public void updateGrenouille(IGrenouille grenouille) throws DaoException {
		daoUc1.updateGrenouille(grenouille);
	}

	public void delGrenouille(IGrenouille grenouille) throws DaoException {
		daoUc1.delGrenouille(grenouille);
	}

	public void delGrenouilles() {
		daoUc1.delGrenouilles();
	}



	public IGrenouille getGrenouille(int refGrenouille) throws DaoException {
		IGrenouille grenouille =  daoUc2.getGrenouille(refGrenouille);
		return grenouille;

	}

	public IGrenouille getGrenouille(IGrenouille grenouille) throws DaoException {

		IGrenouille grenouillex =  daoUc2.getGrenouille(grenouille);
		return grenouillex;
	}

	public List<IGrenouille> getGrenouilles() {
		List<IGrenouille> liste = daoUc2.getGrenouilles();
		return liste;
	}

}


