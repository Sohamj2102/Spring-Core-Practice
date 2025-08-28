package com.document.sbeans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("cloud")
@Scope("singleton")
public class CloudStorageService implements StorageService {

	@Override
	public void store(String fileName) {
		System.out.println("Storing "+fileName+" in Cloud System.");
	}

}
