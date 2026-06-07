package com.rabbiter.pet.controller;

import cn.hutool.core.date.DateUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.rabbiter.pet.common.Result;
import com.rabbiter.pet.config.interceptor.AuthAccess;
import com.rabbiter.pet.entity.Animal;
import com.rabbiter.pet.service.IAnimalService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


@RestController
@RequestMapping("/animal")
public class AnimalController {

    @Resource
    private IAnimalService animalService;

    private final String now = DateUtil.now();

    // 新增或者更新
    @PostMapping
    public Result save(@RequestBody Animal animal) {
        animalService.saveOrUpdate(animal);
        return Result.success();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        animalService.removeById(id);
        return Result.success();
    }

    @PostMapping("/del/batch")
    public Result deleteBatch(@RequestBody List<Integer> ids) {
        animalService.removeByIds(ids);
        return Result.success();
    }

    @GetMapping
    public Result findAll() {
        return Result.success(animalService.list());
    }

    @GetMapping("/{id}")
    public Result findOne(@PathVariable Integer id) {
        return Result.success(animalService.getById(id));
    }

    @AuthAccess
    @GetMapping("/page/user")
    public Result findPage(@RequestParam(defaultValue = "") String name,
                           @RequestParam Integer pageNum,
                           @RequestParam Integer pageSize) {
        QueryWrapper<Animal> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("id");
        if (!"".equals(name)) {
            queryWrapper.like("nickname", name);
        }
        queryWrapper.eq("adopt", "可领养");
        return Result.success(animalService.page(new Page<>(pageNum, pageSize), queryWrapper));
    }

    @AuthAccess
    @GetMapping("/page")
    public Result findPage(@RequestParam(defaultValue = "") String name,
                           @RequestParam(defaultValue = "") String adopt,
                           @RequestParam Integer pageNum,
                           @RequestParam Integer pageSize) {
        QueryWrapper<Animal> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("id");
        if (!"".equals(name)) {
            queryWrapper.like("nickname", name);
        }
        if (!"".equals(adopt)) {
            queryWrapper.eq("adopt", adopt);
        }
        return Result.success(animalService.page(new Page<>(pageNum, pageSize), queryWrapper));
    }

}

