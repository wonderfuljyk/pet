package com.rabbiter.pet.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rabbiter.pet.controller.dto.UserDTO;
import com.rabbiter.pet.controller.dto.UserPasswordDTO;
import com.rabbiter.pet.entity.User;


public interface IUserService extends IService<User> {

    UserDTO login(UserDTO userDTO);

    User register(UserDTO userDTO);

    void updatePassword(UserPasswordDTO userPasswordDTO);
}
