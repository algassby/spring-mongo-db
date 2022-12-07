package com.barry.springmongodb.repository;
public interface CustomItemRepository {
	
	void updateItemQuantity(String itemName, float newQuantity);

}