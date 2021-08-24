package br.com.erudio;
// imports 
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * GreetingController
 */
@RestController
public class MathController {
  // caminho na url
  @RequestMapping(value="/sum/numberOne/numberTwo", method = RequestMethod.GET)
  // pathVariable torna obrigatorio a passagem da propriedade
  public double sum(
    @PathVariable(value = "numberOne") String numberOne, 
    @PathVariable(value = "numberTwo") String numberTwo
  ) throws Exception {
      if (!isNumeric(numberOne) || !isNumeric(numberTwo)){
        throw new Exception();
      }
      Double sum = convertToDouble(numberOne) + convertToDouble(numberTwo);
      return sum;
  }

  private boolean isNumeric(String strNumber){
    if (strNumber == null) return false;
    String Number = strNumber.replaceAll(",", ".");
    // regex
    return Number.matches("[+-]?[0-9]*\\\\.?[0.9]+");
  }

  private Double convertToDouble(String strNumber){
    // o 0D é um 0 double
    if (strNumber == null) return 0D;
    String Number = strNumber.replaceAll(",", ".");
    if (isNumeric(Number)) return Double.parseDouble(Number);
    return 0D;
  }

}