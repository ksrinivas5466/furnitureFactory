package hackerrank;

import java.util.HashMap;
import java.util.Map.Entry;

public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * TODO: Create a map of Furniture items to order quantities
     */

    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
	HashMap<Furniture,  Integer> map = null;
	Furniture type = null;
    FurnitureOrder() {
       map = new HashMap<>();
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
    	map.put(type, furnitureCount);
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        return map;
    }

    public float getTotalOrderCost() {
    	float x=0;
    	for(Entry<Furniture, Integer> entrySet :map.entrySet()) {
    		if(entrySet!=null)
    		x+=entrySet.getKey().cost()*entrySet.getValue();
    	}
        return x;
    }

    public int getTypeCount(Furniture type) {
        // TODO: Complete the method
        return map.get(type);
    }

    public float getTypeCost(Furniture type) {
        return map.get(type) * type.cost();
    }

    public int getTotalOrderQuantity() {
        // TODO: Complete the method
    	int x=0;
    	for(Entry<Furniture, Integer> entrySet :map.entrySet()) {
    		if(entrySet!=null)
    		x+=entrySet.getValue();
    	}
        return x;
    }
}