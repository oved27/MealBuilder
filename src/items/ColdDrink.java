package items;

import itemsPrototypes.Item;
import itemsPrototypes.Packing;
import itemsPrototypes.Bottel;;

public abstract class ColdDrink implements Item {
	public Packing pack(){
		return new Bottel();
		
	}

}
