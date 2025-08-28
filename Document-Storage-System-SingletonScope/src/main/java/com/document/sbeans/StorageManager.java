package com.document.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("storage")
public class StorageManager {
	@Autowired
	@Qualifier("file")
private StorageService service;
	public void save(String file)
	{
		service.store(file);
	}
}
