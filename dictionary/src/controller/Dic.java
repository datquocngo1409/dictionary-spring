package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Dic {

    @GetMapping("/dictionary")
    public String greeting(){
        return "view";
    }

    @PostMapping("/dictionary")
    public String greeting(Model model, @RequestParam String eng){
        DicImpl dic = new DicImpl();
        String vn = dic.findVN(eng);
        model.addAttribute("eng", eng);
        model.addAttribute("vn", vn);
        return "view";
    }


}
