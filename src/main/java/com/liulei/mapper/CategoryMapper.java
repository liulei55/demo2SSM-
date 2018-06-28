package com.liulei.mapper;

import com.liulei.pojo.Category;import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CategoryMapper {
    /**
     * 集合
     * @returnCategory
     */
    public List<Category> selectCategory();

    /**
     * 新增
     */
    public void insertCategory(@Param("category")Category category);

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    public Category getCategoryById(@Param("id") int id);

    /**
     * 修改
     * @param category
     */
    public void updateCategory(@Param("category")Category category);

    /**
     * 删除
     * @param id
     */
    public void deleteCategory(@Param("id")int id);

}
