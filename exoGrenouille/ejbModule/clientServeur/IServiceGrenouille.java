package clientServeur;

import java.util.List;

import entity.Grenouille;
import entity.IGrenouille;

/*
 * Cette ionterface expose les services utilisables par une application cliente
 */
public interface IServiceGrenouille {
	public void 				addGrenouille(IGrenouille grenouille);
	public void 				updateGrenouille(IGrenouille grenouille);
	public void					delGrenouille(IGrenouille grenouille);
	public void 				delGrenouilles();
	public IGrenouille 			getGrenouille(int code);
	public IGrenouille 			getGrenouille(Grenouille grenouille);
	public List<IGrenouille> 	getGrenouilles();

}
