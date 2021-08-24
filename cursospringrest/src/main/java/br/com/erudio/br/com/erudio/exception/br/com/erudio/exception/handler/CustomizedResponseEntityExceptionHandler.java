package br.com.erudio.br.com.erudio.exception.br.com.erudio.exception.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

// class exceptionResponse
import br.com.erudio.br.com.erudio.exception.ExceptionRespose;
import br.com.erudio.br.com.erudio.exception.unuportedMathOperationException;

@RestController
@ControllerAdvice
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler{
  @ExceptionHandler(Exception.class)
  public final ResponseEntity<ExceptionRespose> handleAllException(Exception ex , WebRequest request){
    ExceptionRespose exceptionRespose = new ExceptionRespose(new Date(), ex.getMessage(), request.getDescription(false));
    return new ResponseEntity<>(exceptionRespose, HttpStatus.INTERNAL_SERVER_ERROR);
  }

  @ExceptionHandler(unuportedMathOperationException.class)
  public final ResponseEntity<ExceptionRespose> handleBadRequestException(Exception ex , WebRequest request){
    ExceptionRespose exceptionRespose = new ExceptionRespose(new Date(), ex.getMessage(), request.getDescription(false));
    return new ResponseEntity<>(exceptionRespose, HttpStatus.BAD_REQUEST);
  }
}