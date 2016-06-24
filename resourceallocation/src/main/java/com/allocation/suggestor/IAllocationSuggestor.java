package com.allocation.suggestor;

import java.util.List;

/**
 * @author Team
 *
 * @param <Source>
 * @param <Target>
 */
public interface IAllocationSuggestor<Source,Target> {

	public List<Target> suggest(Source source);
}
