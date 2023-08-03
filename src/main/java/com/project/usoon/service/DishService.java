package com.project.usoon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.project.usoon.dto.DishDto;
import com.project.usoon.entity.Dish;

import java.util.List;

public interface DishService extends IService<Dish> {
    //新增菜品，同时插入对应的口味数据
    public void saveWithFlavor(DishDto dishDto);

    //根据id查询菜品和对应口味信息
    public DishDto getByIdWithFlavor(Long id);

    public void updateWithFlavor(DishDto dishDto);

    //删除/批量删除菜品
    public void deleteByIds(List<Long> ids);
}
