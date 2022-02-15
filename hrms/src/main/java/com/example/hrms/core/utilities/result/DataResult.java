package com.example.hrms.core.utilities.result;

public class DataResult<D> extends Result{
	
	private D data;

	public DataResult(D data,String message, boolean success) {
		super(message, success);
		this.data = data;
	}

	public D getData() {
		return this.data;
	}

}
