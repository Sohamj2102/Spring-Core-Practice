package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component
public class DatabaseStorageService implements StorageService {

	public DatabaseStorageService() {
		System.out.println("DatabaseStorageService.DatabaseStorageService()");
	}

	@Override
	public void store(String fileName) {
		System.out.println("Storing "+fileName+" in Database");
	}

}
