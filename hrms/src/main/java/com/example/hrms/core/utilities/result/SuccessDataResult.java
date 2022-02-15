package com.example.hrms.core.utilities.result;

public class SuccessDataResult<D> extends DataResult<D> {

	public SuccessDataResult(D data, String message) {
		super(data, message,true);
	}

}
