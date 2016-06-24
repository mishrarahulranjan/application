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
public class OpeningDtoPopulatorImpl implements
		IAllocationPopulator<OpeningModel, OpeningDto> {

	public OpeningDto populate(OpeningModel model) {

		OpeningDto dto = new OpeningDto();

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
