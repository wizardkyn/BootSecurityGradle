package com.example.web.sqlmappers.login;

import org.springframework.stereotype.Repository;

import com.example.web.domain.UserVo;

@Repository
public interface LoginMapper {
	public UserVo getUser(String userId);
}
