/*******************************************************************************
 * Copyright (c) 2012, Robotoworks Limited
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 *******************************************************************************/
package com.robotoworks.mechanoid.net;

public class ServiceException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public ServiceException(Throwable cause) {
		initCause(cause);
	}
	
	@Override
	public String getMessage() {
		return getCause().getMessage();
	}
}
