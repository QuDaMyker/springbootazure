package com.builtlab.healthdemo.mapper;

import com.builtlab.healthdemo.dto.request.UserCreationRequest;
import com.builtlab.healthdemo.dto.request.UserUpdateRequest;
import com.builtlab.healthdemo.dto.response.UserResponse;
import com.builtlab.healthdemo.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);
    UserResponse toUserResponse(User user);
    void updateUser(@MappingTarget User user, UserUpdateRequest userUpdateRequest);
}
