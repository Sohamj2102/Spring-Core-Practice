package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component
public class FileSystemStorageService implements StorageService {
	

	public FileSystemStorageService() {
		System.out.println("FileSystemStorageService.FileSystemStorageService()");
	}

	@Override
	public void store(String fileName) {
		System.out.println("Storing "+fileName+" in Local File System");
	}

}
