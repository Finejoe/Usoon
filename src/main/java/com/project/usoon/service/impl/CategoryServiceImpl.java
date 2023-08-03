package com.project.usoon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.project.usoon.common.CustomException;
import com.project.usoon.entity.Category;
import com.project.usoon.entity.Dish;
import com.project.usoon.entity.Setmeal;
import com.project.usoon.mapper.CategoryMapper;
import com.project.usoon.service.CategoryService;
import com.project.usoon.service.DishService;
import com.project.usoon.service.SetmealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {
    @Autowired
    private DishService dishService;
    @Autowired
    private SetmealService setmealService;

    /**
     * 根据id删除分类，但需要先判断
     * @param id
     */
    @Override
    public void remove(Long id) {

        //Query based on id
        LambdaQueryWrapper<Dish> dishLambdaQueryWrapper = new LambdaQueryWrapper<>();
        dishLambdaQueryWrapper.eq(Dish::getCategoryId,id);
        int count1 = dishService.count(dishLambdaQueryWrapper);
        //是否关联菜品
        if(count1 > 0) {
            throw new CustomException("Connected to dishes, cannot delete");
        }

        LambdaQueryWrapper<Setmeal> setmealLambdaQueryWrapper = new LambdaQueryWrapper<>();
        setmealLambdaQueryWrapper.eq(Setmeal::getCategoryId,id);
        int count2 = setmealService.count(setmealLambdaQueryWrapper);
        //是否关联套餐
        if(count2 > 0) {
            throw new CustomException("Connected to meals, cannot delete");
        }

        //正常删除
        super.removeById(id);

    }
}
