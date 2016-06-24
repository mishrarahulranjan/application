package com.allocation.facade;

import java.util.List;

/**
 * @author Team
 *
 * @param <Source>
 * @param <Target>
 */
public interface IAllocationFacade<Source,Target> {

	public List<Target> suggest(Source source);
}
