package com.service;

import com.model.OnlyKey;

public interface OnlyKeyServiceI {

	public OnlyKey getOnlyKeyByID(Integer id);
	public int addNew(OnlyKey record);

}
