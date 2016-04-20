package anamed.controller;

import org.apache.log4j.Logger;

/**
 * Base class for all web controllers
 *
 * @author pma
 *
 */
public class BaseController {

	protected Logger logger = Logger.getLogger(getClass());

	protected void logCalledMethod() {
		if (logger.isDebugEnabled()) {
			logger.debug(String.format("%s.%s()", getClass().getSimpleName(),
					Thread.currentThread().getStackTrace()[2].getMethodName()));
		}
	}

}
