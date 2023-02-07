package com.douzone.fileupload.service;

public class FileuploadServiceException extends RuntimeException {
	public FileuploadServiceException(String message) {
		super(message);
	}
	
	public FileuploadServiceException() {
		super("Fileupload Exception Occurs");
	}
}
