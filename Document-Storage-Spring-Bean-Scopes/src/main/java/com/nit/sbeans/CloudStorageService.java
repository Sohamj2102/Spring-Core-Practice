package com.nit.sbeans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CloudStorageService implements StorageService {

	public CloudStorageService() {
		System.out.println("CloudStorageService.CloudStorageService()");
	}

	@Override
	public void store(String fileName) {
		System.out.println("Storing "+fileName+" in Cloud Storage");
	}

}
