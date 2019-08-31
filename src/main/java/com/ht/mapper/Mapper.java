package com.ht.mapper;

import java.util.Map;

import com.ht.enums.MappingTypeEnum;

/**
 * Template Design Pattern Implementation for mapping objects from one form to another
 * 
 * @author deepakahuja
 */
public abstract class Mapper {
	
	protected abstract Object maptToEntity(Object objToMap, Map<String, String> extraFields) throws Exception;
	
	protected abstract Object maptToResponse(Object objToMap, Map<String, String> extraFields) throws Exception;
	
	public final Object map(Object objToMap, MappingTypeEnum mappingType, Map<String, String> extraFields) throws Exception{
		if(MappingTypeEnum.MAPTOENTITY.equals(mappingType)) {
			return maptToEntity(objToMap, extraFields);
		} else if(MappingTypeEnum.MAPTORESPONSE.equals(mappingType)) {
			return maptToResponse(objToMap, extraFields);
		}
		return null;
	}
}
