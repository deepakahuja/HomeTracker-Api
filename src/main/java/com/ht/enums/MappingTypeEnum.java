package com.ht.enums;

public enum MappingTypeEnum {
	
	MAPTOENTITY("maptoentity"), MAPTORESPONSE("maptoresponse");
	
	String mappingType;
	
	MappingTypeEnum(String mappingType){
		this.mappingType = mappingType;
	}
}
