package br.com.erudio.br.com.erudio.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class unuportedMathOperationException extends RuntimeException{
  private static final long serialVersiononUId = 1L;
  
  public unuportedMathOperationException(String exception) {
    super(exception);
  }
}

