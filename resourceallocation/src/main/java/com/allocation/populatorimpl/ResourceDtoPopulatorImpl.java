package com.allocation.populatorimpl;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;

import com.allocation.dto.ResourceDto;
import com.allocation.model.ResourceModel;
import com.allocation.populator.IAllocationPopulator;

/**
 * @author Team
 *
 */
public class ResourceDtoPopulatorImpl implements
		IAllocationPopulator<ResourceModel, ResourceDto> {

	public ResourceDto populate(ResourceModel model) {
		
		ResourceDto dto = new ResourceDto();
		try {
			
			BeanUtils.copyProperties(dto, model);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return dto;
	}
}
