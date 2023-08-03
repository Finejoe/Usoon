package com.project.usoon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.project.usoon.dto.SetmealDto;
import com.project.usoon.entity.Setmeal;

import java.util.List;

public interface SetmealService extends IService<Setmeal> {
    /**
     * 新增套餐，并保存套餐和菜品的关联关系
     * @param setmealDto
     */
    public void saveWithDish(SetmealDto setmealDto);

    /**
     * 删除套餐，并删除套餐和菜品的关联关系
     * @param ids
     */
    public void removeWithDish(List<Long> ids);
}
