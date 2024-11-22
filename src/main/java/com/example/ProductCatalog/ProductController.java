package com.example.ProductCatalog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ProductController {
    @Autowired
    Operation op;
    @GetMapping("/")
    public String getFirst(Model model) {
        model.addAttribute("tab_lines", op.products);
        return "productList";
    }
    @GetMapping("/product")
    public String getProductById(@PathVariable int id,Model model){
        Product product = op.getProductById(id);
    }

}
