package com.project.usoon.dto;

import com.project.usoon.entity.Setmeal;
import com.project.usoon.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
