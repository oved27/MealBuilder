package items;
import itemsPrototypes.Item;
import itemsPrototypes.Packing;
import itemsPrototypes.Wrapper;


public abstract class Burger implements Item {
	public Packing pack(){
		return new Wrapper();
		
	}

}
