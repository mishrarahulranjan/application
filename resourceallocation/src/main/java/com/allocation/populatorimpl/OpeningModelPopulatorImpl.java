package com.allocation.populatorimpl;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;

import com.allocation.dto.OpeningDto;
import com.allocation.model.OpeningModel;
import com.allocation.populator.IAllocationPopulator;

/**
 * @author Team
 *
 */
public class OpeningModelPopulatorImpl implements
		IAllocationPopulator<OpeningDto, OpeningModel> {

	public OpeningModel populate(OpeningDto dto) {
		
		OpeningModel model = new OpeningModel();
		try {
			
			BeanUtils.copyProperties(model, dto);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return model;
	}

}
