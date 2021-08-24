package br.com.erudio.br.com.erudio.exception;

import java.io.Serializable;
import java.util.Date;
/**
 * ExceptionRespose
 */
public class ExceptionRespose implements Serializable {
  private static final long serialVersiononUId = 1L;

  private Date timestamp;
  private String message;
  private String details;

  // construtor
  public ExceptionRespose(Date timestamp, String message, String details) {
    this.timestamp = timestamp;
    this.message = message;
    this.details = details;
  }

  public Date getTimestamp() {
    return timestamp;
  }

  public String getMessage() {
    return message;
  }

  public String getDetails() {
    return details;
  }

}
