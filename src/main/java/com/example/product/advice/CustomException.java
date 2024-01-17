package com.example.product.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.product.dto.ResponseDto;
import com.example.product.exception.ProductNotFoundException;
import com.example.product.exception.WrongInputException;

@RestControllerAdvice
public class CustomException {

	
	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseDto customException(ProductNotFoundException pex) {
		return new ResponseDto(404, "Not Found", pex.getMessage());
	}
	
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(WrongInputException.class)
	public ResponseDto customException1(WrongInputException wex) {
		return new ResponseDto(400, "Bad Request", wex.getMessage());
	}
}
