package org.javabuilders.test;

import org.javabuilders.Builder;
import org.javabuilders.BuilderConfig;

/**
 * Simple BuilderConfig for core unit tests
 * @author Jacek Furmankiewicz
 *
 */
public class TestBuilderConfig extends BuilderConfig {

	/**
	 * @param types Tyoes
	 */
	public TestBuilderConfig(Class<?>... types) {
		super(null,null,null, Builder.NAME);
		
		addType(types);
	}

}
