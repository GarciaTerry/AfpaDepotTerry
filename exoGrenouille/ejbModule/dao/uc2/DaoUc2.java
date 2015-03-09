package dao.uc2;
/**
 * Couche Dao pour rechercher une/des grebnouille(s)
 */

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import dao.DaoException;
import entity.Grenouille;
import entity.IGrenouille;

@Singleton
@LocalBean
public class DaoUc2
{
	@PersistenceContext(unitName="A1Persistence")
	EntityManager em;  

	public DaoUc2() {
	}

	public IGrenouille getGrenouille(int code) throws DaoException {
		// TODO rechercher une grenouille par code
		// on simule la recherche
		Grenouille grenouille = new Grenouille (code,"Grenouille des champs");
		System.out.println("*** DaoUc2 *** recherche par code  " + grenouille );
		return grenouille;
	}

	public IGrenouille getGrenouille(IGrenouille grenouille) throws DaoException {
		// TODO rechercher une grenouille par instance
		// on simule la recherche
		System.out.println("*** DaoUc2 *** recherche par instance " + grenouille );
		return grenouille;
	}

	public List<IGrenouille> getGrenouilles() {
		// TODO rechercher une grenouille par instance
		// on simule la recherche
		System.out.println("*** DaoUc2 *** recherche toutes les grenouilles ");
		List<IGrenouille> liste = new ArrayList<IGrenouille>();

		for (int i=0; i<10;i++) {   
			liste.add(new Grenouille (i,"Grenouille " + i));
		}
		return liste;

	}

}


