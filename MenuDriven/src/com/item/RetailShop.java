package com.item;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RetailShop {

List<Item> l = new ArrayList<>();
public void addItem(Item i){
	l.add(i);
			
}

public Item  searchbyName(String name) {
	for(Item i:l) {
		if(i.getName().equals(name)) {
		return i;
	}
			
	}	
	throw new  IllegalArgumentException("Item not found");
}


public void remove(String name) {
    for (int i = 0; i < l.size(); i++) {
        if (l.get(i).getName().equals(name)) {
            l.remove(i);
            break;
        }
    }
}

public double calculate() {
	double total=0;
	for(Item i:l) {
		total += i.calculate();
	}
	return total;
	
}
public void saveItemsToFile(String filename) {
    try (FileWriter writer = new FileWriter(filename)) {
        for (Item item : l) {
            writer.write(item.toString() + "\n");
        }
    } catch (IOException e) {
        e.printStackTrace();
    }


	
}	
}
