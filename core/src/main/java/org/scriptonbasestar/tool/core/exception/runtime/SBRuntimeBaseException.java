package org.scriptonbasestar.tool.core.exception.runtime;

/**
 * @author archmagece
 * @date 2016-03-04
 */
public abstract class SBRuntimeBaseException extends RuntimeException {
	protected SBRuntimeBaseException(String message) {
		super(message);
	}
}