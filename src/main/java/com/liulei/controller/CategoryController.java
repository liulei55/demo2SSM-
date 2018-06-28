package com.liulei.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liulei.config.Page;
import com.liulei.pojo.Category;
import com.liulei.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @RequestMapping(value = "/toIndex")
    public String toIndex(Model model, Page page){
        PageHelper.offsetPage(page.getStart(),5);
        List<Category> categoryList = categoryService.selectCategory();
        int total = (int) new PageInfo<>(categoryList).getTotal();
        System.out.print(total);
        page.caculateLast(total);
        model.addAttribute("categoryList",categoryList);
        return "/index";

    }

    @RequestMapping(value = "/toInsertCategory")
    public String toInsertCategory(){
        return "/insertCategory";
    }

    @RequestMapping(value = "/insertCategory")
    public  String  insertCategory(Category category){
        categoryService.insertCategory(category);
        return "redirect:/toIndex";
    }
    @RequestMapping(value = "deleteCategory")
    public  String deleteCategory(int id){
        categoryService.deleteCategory(id);
        return "redirect:/toIndex";
    }
    @RequestMapping(value = "toUpdateCategory")
    public String toUpdateCategory(Model model,int id){
        Category categoryById = categoryService.getCategoryById(id);
        model.addAttribute("categoryById",categoryById);
        return "/updateCategory";

    }
    @RequestMapping(value = "updateCategory")
    public  String updateCategory(Category category){
        categoryService.updateCategory(category);
        return "redirect:/toIndex";
    }
}
