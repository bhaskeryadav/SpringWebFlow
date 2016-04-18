package com.test.flow;

import org.springframework.binding.convert.converters.StringToDate;
import org.springframework.binding.convert.service.DefaultConversionService;
import org.springframework.stereotype.Component;

@Component("conversService")
public class Myconvertor extends DefaultConversionService {

	@Override
	protected void addDefaultConverters() {
		super.addDefaultConverters();
		StringToDate std=new StringToDate();
		std.setPattern("MM-dd-yyyy");
		addConverter("std",std);
	}
}
