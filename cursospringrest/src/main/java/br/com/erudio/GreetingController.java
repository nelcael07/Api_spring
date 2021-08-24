package br.com.erudio;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
  @RequestMapping("/greeting")
  public Greeting greeting(@RequestParam(value = "name",defaultValue = "word") String Name) {
      // retorna uma greeting levando os elementos do construtor
      // incrementAndGet sempre vai incrementar
      return new Greeting(counter.incrementAndGet(), String.format(template, Name));
  }
  
}