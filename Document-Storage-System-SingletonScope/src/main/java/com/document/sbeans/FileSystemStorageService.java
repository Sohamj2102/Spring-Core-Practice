package com.document.sbeans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("file")
@Scope("singleton")
public class FileSystemStorageService implements StorageService {

	@Override
	public void store(String fileName) {
		System.out.println("Storing "+fileName+" in Local File System.");
	}

}
