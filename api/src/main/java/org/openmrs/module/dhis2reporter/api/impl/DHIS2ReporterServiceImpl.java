/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.dhis2reporter.api.impl;

import org.openmrs.api.impl.BaseOpenmrsService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.module.dhis2reporter.api.DHIS2ReporterService;
import org.openmrs.module.dhis2reporter.api.db.DHIS2ReporterDAO;

/**
 * It is a default implementation of {@link DHIS2ReporterService}.
 */
public class DHIS2ReporterServiceImpl extends BaseOpenmrsService implements DHIS2ReporterService {
	
	protected final Log log = LogFactory.getLog(this.getClass());
	
	private DHIS2ReporterDAO dao;
	
	/**
     * @param dao the dao to set
     */
    public void setDao(DHIS2ReporterDAO dao) {
	    this.dao = dao;
    }
    
    /**
     * @return the dao
     */
    public DHIS2ReporterDAO getDao() {
	    return dao;
    }
}