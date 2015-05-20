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
import org.openmrs.*;
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
                           @RequestParam(value = "family_name", required = false) String family_name,
                           @RequestParam(value = "middle_name", required = false) String middle_name,
                           @RequestParam(value = "given_name", required = false) String given_name,
                         /*  @RequestParam(value = "dob", required = false) String dob,*/
                           @RequestParam(value = "gender", required = false) String gender,
                           @RequestParam(value = "address", required = false) Integer address,
                           @RequestParam(value = "postal_code", required = false) Integer postal_code,
                           @RequestParam(value = "town", required = false) String town,
                           @RequestParam(value = "country", required = false) String country) {

        Person person=new Person();


        PersonName personName=new PersonName();
        personName.setFamilyName(family_name);
        personName.setMiddleName(middle_name);
        personName.setGivenName(given_name);
        //name added to person
        person.addName(personName);
        PersonAddress personAddress=new PersonAddress();
        personAddress.setAddress1(address.toString());
        personAddress.setCityVillage(town);
        personAddress.setCountry(country);
        personAddress.setPostalCode(postal_code.toString());
        //address added to person
        person.addAddress(personAddress);
        //gender added to person
        person.setGender(gender);


        /*person.setBirthdate();*/


        PatientIdentifierType patientIdentifierType=new PatientIdentifierType();
        patientIdentifierType.setId(1254);
        Patient patient=new Patient(person);


        //Identifier issues
        PatientIdentifier patientIdentifier=new PatientIdentifier();

        patientIdentifier.setIdentifier();


        Context.getPatientService().savePatient(patient);













    }

}
