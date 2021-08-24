package br.com.erudio;
// imports 
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.br.com.erudio.exception.unuportedMathOperationException;

/**
 * GreetingController
 */
@RestController
public class MathController {
  @RequestMapping(value="/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
  public double sum(
    @PathVariable(value = "numberOne") String numberOne, 
    @PathVariable(value = "numberTwo") String numberTwo
  ) throws Exception {
      if (!isNumeric(numberOne) || !isNumeric(numberTwo)){
        throw new unuportedMathOperationException("Please set a numeric value");
      }
      Double sum = convertToDouble(numberOne) + convertToDouble(numberTwo);
      return sum;
  }
  
  private Double convertToDouble(String strNumber){
    if (strNumber == null) return 0D;
    String number = strNumber.replaceAll(",", ".");
    if (isNumeric(number)) return Double.parseDouble(number);
    return 0D;
  }

  private boolean isNumeric(String strNumber){
    if (strNumber == null) return false;
    String number = strNumber.replaceAll(",", ".");
    return number.matches("[-+]?[0-9]*\\.?[0-9]+");
  }

}