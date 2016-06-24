package com.allocation.populator;

/**
 * @author Team
 *
 * @param <Source>
 * @param <Target>
 */
public interface IAllocationPopulator<Source,Target>{
	
	public Target populate(Source source);

}
