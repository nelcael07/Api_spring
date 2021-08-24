package br.com.erudio;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * GreetingController
 */
@RestController
public class GreetingController {

  // string template
  private static final String template = "Hello, %s!";

  // AtomicLong counter
  private final AtomicLong counter = new AtomicLong();
  
  // caminho na url
  @RequestMapping(value="/sum/numberOne/numberTwo", method = RequestMethod.GET)
  // pathVariable torna obrigatorio a passagem da propriedade
  public double sum(
    @PathVariable(value = "numberOne") String numberOne, 
    @PathVariable(value = "numberTwo") String numberTwo
  ) {
      return 1D;
  }
  
}