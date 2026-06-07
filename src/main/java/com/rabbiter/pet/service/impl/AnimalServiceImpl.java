package com.rabbiter.pet.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rabbiter.pet.entity.Animal;
import com.rabbiter.pet.mapper.AnimalMapper;
import com.rabbiter.pet.service.IAnimalService;
import org.springframework.stereotype.Service;

@Service
public class AnimalServiceImpl extends ServiceImpl<AnimalMapper, Animal> implements IAnimalService {

}
