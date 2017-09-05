package org.scriptonbasestar.tool.core.exception;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author archmagece
 * @CreatedAt 2016-12-07 18
 */
@Slf4j
public class BSDisabledException extends BSRuntimeBaseException {
	public BSDisabledException(String message) {
		super(message);
	}
}