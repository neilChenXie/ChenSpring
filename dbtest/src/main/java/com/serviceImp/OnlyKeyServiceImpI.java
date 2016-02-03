package com.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.OnlyKeyMapper;
import com.model.OnlyKey;
import com.service.OnlyKeyServiceI;

@Service("onlyKeyService")
public class OnlyKeyServiceImpI implements OnlyKeyServiceI {

	private OnlyKeyMapper onlyKeyMapper;

	/**
	 * @return the onlyKeyMapper
	 */
	public OnlyKeyMapper getOnlyKeyMapper() {
		return onlyKeyMapper;
	}

	/**
	 * @param onlyKeyMapper the onlyKeyMapper to set
	 */
	@Autowired
	public void setOnlyKeyMapper(OnlyKeyMapper onlyKeyMapper) {
		this.onlyKeyMapper = onlyKeyMapper;
	}

	@Override
	public OnlyKey getOnlyKeyByID(Integer id) {
		return onlyKeyMapper.selectByPrimaryKey(id);
	}

	@Override
	public int addNew(OnlyKey record) {
		return 0;
	}

}
