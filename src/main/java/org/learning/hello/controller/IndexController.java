package org.learning.hello.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // questa annotation identifica la classe come Controller
@RequestMapping("/") // indica la rotta a cui rispondono i metodi di questo controller
public class IndexController {
  /**
   * @GetMapping indica che risponde a richieste di tipo GET
   * risponde a http://localhost:8080
   */
  @GetMapping // indica che risponde a richieste di tipo GET
  public String index(Model model){
    String mySubtitle = LocalDateTime.now().toString();
    model.addAttribute("subtitle", mySubtitle);
    // ritorna una stringa che è il nome del template che si trova in resources/templates
    return "homepage";
  }

  /*
  * @GetMapping("/about") significa che risponde a richieste di tipo GET
  * all'url http://localhost:8080/about
  * */
  @GetMapping("/about")
  public String aboutUs(){
    // ritorna il nome del template about.html che si trova in resources/templates
    return "about";
  }
}
