package com.document.sbeans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("database")
@Scope("singleton")
public class DatabaseStorageService implements StorageService {

	@Override
	public void store(String fileName) {
		System.out.println("Storing "+fileName+" in Database System.");
	}

}
