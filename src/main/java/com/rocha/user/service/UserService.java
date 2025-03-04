package com.rocha.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rocha.user.domain.conversor.ConversorMapper;
import com.rocha.user.domain.dto.UserDTO;
import com.rocha.user.domain.entity.User;
import com.rocha.user.domain.vo.UserVO;
import com.rocha.user.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private ConversorMapper<User, UserDTO, UserVO> mapper;

	@Autowired
	private UserRepository repository;

	public UserDTO create(UserVO vo) {
		User save = repository.save(mapper.toEntity(vo, User.class));
		return mapper.toDTO(save, UserDTO.class);

	}

}
