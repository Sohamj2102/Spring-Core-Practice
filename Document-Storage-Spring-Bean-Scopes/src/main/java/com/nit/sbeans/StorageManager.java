package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class StorageManager {
	
	@Autowired
	@Qualifier("cloudStorageService")
	private StorageService manger;

	public StorageManager() {
		System.out.println("StorageManager.StorageManager()");
	}
	public void store(String fileName)
	{
		manger.store(fileName);
	}
	
}
