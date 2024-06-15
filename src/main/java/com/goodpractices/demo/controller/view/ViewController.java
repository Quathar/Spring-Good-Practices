package com.goodpractices.demo.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewController {

    @ModelAttribute
    public void setList(Model model) {
        var exampleList = java.util.List.of(
                "element1",
                "element2",
                "element3",
                "element4",
                "element5",
                "element6",
                "element7"
        );
        model.addAttribute("list", exampleList);
    }

    @GetMapping("/my-page")
    public String showView() {
        return "index";
    }

    @PostMapping("/process-view")
    public ModelAndView processView(Boolean show) {
        var mAV = new ModelAndView("index");

        mAV.addObject("show", show);

        return mAV;
    }

}
