package com.liulei.service.impl;

import com.liulei.mapper.CategoryMapper;
import com.liulei.pojo.Category;
import com.liulei.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements  CategoryService{

    @Autowired
    CategoryMapper categoryMapper;

    @Override
    public List<Category> selectCategory() {
        return categoryMapper.selectCategory();
    }

    @Override
    public void insertCategory(Category category) {
        categoryMapper.insertCategory(category);
    }

    @Override
    public Category getCategoryById(int id) {
        return categoryMapper.getCategoryById(id);
    }

    @Override
    public void updateCategory(Category category) {
        categoryMapper.updateCategory(category);
    }

    @Override
    public void deleteCategory(int id) {
        categoryMapper.deleteCategory(id);
    }
}
