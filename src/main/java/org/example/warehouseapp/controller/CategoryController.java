package org.example.warehouseapp.controller;

import org.example.warehouseapp.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("{/categories}")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

}
