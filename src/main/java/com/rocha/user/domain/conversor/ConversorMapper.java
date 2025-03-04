package com.rocha.user.domain.conversor;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConversorMapper<E, D, V> {

	@Autowired
	ModelMapper mapper;

	public E toEntity(V vo, Class<E> entityClass) {
		return mapper.map(vo, entityClass);
	}

	public D toDTO(E entity, Class<D> dto) {
		return mapper.map(entity, dto);
	}
}
