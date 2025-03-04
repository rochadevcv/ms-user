package com.rocha.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rocha.user.domain.dto.UserDTO;
import com.rocha.user.domain.vo.UserVO;
import com.rocha.user.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/users", produces = { MediaType.APPLICATION_JSON_VALUE })
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping
	public ResponseEntity<UserDTO> create(@RequestBody @Valid UserVO vo) {

		UserDTO save = userService.create(vo);

		return ResponseEntity.ok().body(save);

	};

}
