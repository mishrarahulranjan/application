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
public class ResourceModelPopulatorImpl implements
		IAllocationPopulator<ResourceDto, ResourceModel> {

	public ResourceModel populate(ResourceDto dto) {

		ResourceModel model = new ResourceModel();
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
