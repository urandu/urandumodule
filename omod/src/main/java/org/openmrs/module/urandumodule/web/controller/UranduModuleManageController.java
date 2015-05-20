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
package org.openmrs.module.urandumodule.web.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.openmrs.api.context.Context;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * The main controller.
 */
@Controller
public class  UranduModuleManageController {

    SessionFactory sessionFactory;
	protected final Log log = LogFactory.getLog(getClass());


	@RequestMapping(value = "/module/urandumodule/manage", method = RequestMethod.GET)
	public void manage(ModelMap model) {
		model.addAttribute("user", Context.getAuthenticatedUser());
       // Context.getPatientService().savePatient( new Patient());
	}

    @RequestMapping(value = "/module/urandumodule/patientForm", method = RequestMethod.GET)
    public void patientForm(ModelMap model) {






    }


    @RequestMapping(value = "/module/urandumodule/submitForm", method = RequestMethod.GET)
    public void submitForm(ModelMap model,
                           @RequestParam(value = "fname", required = false) String fname,
                           @RequestParam(value = "fname", required = false) String fname,
                           @RequestParam(value = "fname", required = false) String fname,
                           @RequestParam(value = "fname", required = false) String fname,
                           @RequestParam(value = "fname", required = false) String fname) {






    }

}
