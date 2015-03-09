package dao.uc1;
/**
 * Couche Dao pour CUD grenouille
 */

import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import dao.DaoException;
import entity.IGrenouille;

@Singleton
@LocalBean
public class DaoUc1
{
	@PersistenceContext(unitName="A1Persistence")
	EntityManager em;  

	public DaoUc1() {
	}

	public void addGrenouille(IGrenouille grenouille) throws DaoException {
		// TODO ajout d'une grenouille
		System.out.println("*** DaoUc1 *** ajout        " + grenouille );
	}

	public void updateGrenouille(IGrenouille grenouille) throws DaoException {
		// TODO modification d'une grenouille
		System.out.println("*** DaoUc1 *** modification " + grenouille );
	}

	public void delGrenouille(IGrenouille grenouille) throws DaoException {
		// TODO suppression d'une grenouille
		System.out.println("*** DaoUc1 *** suppression  " + grenouille );
	}

	public void delGrenouilles() {
		// TODO suppression de toutes les grenouilles (peuchere)
		System.out.println("*** DaoUc1 *** la fin des grinouilles" );
	}

}


