package com.service;

import java.util.List;

import com.model.OnlyKey;

public interface OnlyKeyServiceI {

	public OnlyKey getOnlyKeyByID(Integer id);

	public List<OnlyKey> getAll();

}
