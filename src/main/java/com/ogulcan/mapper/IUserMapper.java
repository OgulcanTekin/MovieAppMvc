package com.ogulcan.mapper;

import com.ogulcan.dto.request.MovieCommentCreateRequestDto;
import com.ogulcan.dto.request.UserResgisterRequestDto;
import com.ogulcan.dto.response.LoginResponseDto;
import com.ogulcan.repository.entity.MovieComment;
import com.ogulcan.repository.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IUserMapper {

    IUserMapper INSTANCE= Mappers.getMapper(IUserMapper.class);

    User toUser(final UserResgisterRequestDto dto);

    LoginResponseDto toLoginResponseDto(final User user);

    MovieComment toMovieComment(final MovieCommentCreateRequestDto dto);
}