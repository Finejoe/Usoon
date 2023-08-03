package com.project.usoon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.project.usoon.entity.Category;

public interface CategoryService extends IService<Category> {

    public void remove(Long id);
}
