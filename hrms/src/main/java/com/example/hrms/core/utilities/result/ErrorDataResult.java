package com.example.hrms.core.utilities.result;

public class ErrorDataResult<D> extends DataResult<D>{

	public ErrorDataResult(D data, String message) {
		super(null,message,false);
	}

}
