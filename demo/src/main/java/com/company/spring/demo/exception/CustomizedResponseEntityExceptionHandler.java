package com.company.spring.demo.exception;

import java.util.Date;

import org.modelmapper.spi.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllException(Exception ex, WebRequest request) throws Exception {

		String errorMessageDescripton = ex.getLocalizedMessage();
		if (errorMessageDescripton == null)
			errorMessageDescripton = ex.toString();

		ErrorMessage errorMessage = new ErrorMessage(errorMessageDescripton);
		return new ResponseEntity<>(errorMessage, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(UserNotFoundException.class)
	public final ResponseEntity<Object> handleUserNotFoundException(UserNotFoundException ex, WebRequest request)
			throws Exception {
		UserErrorRespons errorRespons = new UserErrorRespons(404, ex.getMessage(), new Date());

		return new ResponseEntity<>(errorRespons, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(AddressNotFoundException.class)
	public final ResponseEntity<Object> handleAddressNotFoundException(AddressNotFoundException ex, WebRequest request)
			throws Exception {
		AddressErrorRespons errorRespons = new AddressErrorRespons(404, ex.getMessage(), new Date());

		return new ResponseEntity<>(errorRespons, HttpStatus.NOT_FOUND);
	}
}
