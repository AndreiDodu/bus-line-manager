package com.andreidodu.blm.service;

import java.util.List;

public interface CommonService<T, S> {
	
	T findById(Long id);

	List<T> getAll();

	T save(S data);

	T update(Long id, S data);
}
