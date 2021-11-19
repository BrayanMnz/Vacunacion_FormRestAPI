// var requestOptions = {
//     method: 'GET',
//     redirect: 'follow'
//   };
  

//   async function funcion() {

//     const prueba = await (await fetch("http://localhost:7000/2?key=<API Key>", requestOptions)).json();
    
//     return prueba;

//   }

//   let otro = {}
//   funcion().then((response)=> {
//       console.log(response);
//       json.triggers[0].setValue = response.nombre;
//     otro = response;    
//   });

Survey
.StylesManager
.applyTheme("modern");

var json = {
//"title": "Minimum data reporting form – for suspected and probable cases of COVID-19",
"title": "Formulario de notificación de datos mínimos: para personas que han recibido la vacuna contra el COVID-19",//

triggers: [
    {
        type: "setvalue",
        expression: "{copy} = 'Yes'",
        setToName: "name",
        setValue: "Hola"
    }, {
        type: "setvalue",
        expression: "{copy} = 'Yes'",
        setToName: "email",
        setValue: "jon.snow@nightwatch.com"
    }, {
        type: "setvalue",
        expression: "{copy} = 'Yes'",
        setToName: "tempvar",
        isVariable: true,
        setValue: "You have decided to use your current information."
    }, {
        type: "setvalue",
        expression: "{copy} = 'No'",
        setToName: "name",
        setValue: ""
    }, {
        type: "setvalue",
        expression: "{copy} = 'No'",
        setToName: "email",
        setValue: ""
    }, {
        type: "setvalue",
        expression: "{copy} = 'No'",
        setToName: "tempvar",
        isVariable: true,
        setValue: "You have decided not to use your current information."
    }
],

"pages": [

    
    
            // {
            //     title: "Customer information",
            //     questions: [
            //         {
            //             type: "radiogroup",
            //             name: "copy",
            //             title: "Use your current data",
            //             choices: [
            //                 "Yes", "No"
            //             ],
            //             isRequired: true,
            //             colCount: 0
            //         }, {
            //             type: "text",
            //             name: "name",
            //             title: "Name:",
            //             isRequired: true
            //         }, {
            //             type: "text",
            //             name: "email",
            //             title: "Your e-mail",
            //             isRequired: true,
            //             validators: [
            //                 {
            //                     type: "email"
            //                 }
            //             ]
            //         }
            //     ]
            // },

    // {
    //     "name": "page1",
    //     "navigationTitle": "Collector",
    //     "navigationDescription": "Collector's info",
    //     "elements": [
    //         {
    //             "type": "image",
    //             "name": "first_page_image",
    //             "imageLink": "https://marvel-b1-cdn.bc0a.com/f00000000191542/images.squarespace-cdn.com/content/v1/5db0d70f2c73984a41453820/1588707044687-97B80KWGFUKDLSH5SDNR/Screen+Shot+2020-05-05+at+2.27.47+PM.png?format=1000w",
    //             "imageFit": "none",
    //             "imageHeight": 726,
    //             "imageWidth": 500,
    //             "width": "600px"
    //         }, {
    //             "type": "panel",
    //             "name": "first_page_container_panel",
    //             "elements": [
    //                 {
    //                     "type": "text",
    //                     "name": "unique_case_id_textbox",
    //                     "startWithNewLine": false,
    //                     "title": "Unique Case ID / Cluster Number (if applicable):",
    //                     "inputType": "number",
    //                     "hideNumber": true
    //                 }, {
    //                     "type": "panel",
    //                     "name": "current_status_panel",
    //                     "elements": [
    //                         {
    //                             "type": "boolean",
    //                             "name": "current_status",
    //                             "titleLocation": "hidden",
    //                             "labelTrue": "Alive",
    //                             "labelFalse": "Dead",
    //                             "hideNumber": true
    //                         }
    //                     ],
    //                     "title": "Current Status",
    //                     "showNumber": true
    //                 }, {
    //                     "type": "panel",
    //                     "name": "data_collector_information",
    //                     "elements": [
    //                         {
    //                             "type": "text",
    //                             "name": "name_of_data_collector",
    //                             "title": "Name of data collector"
    //                         }, {
    //                             "type": "text",
    //                             "name": "data_collector_institution",
    //                             "title": "Data collector Institution"
    //                         }, {
    //                             "type": "text",
    //                             "name": "data_collector_telephone_number",
    //                             "title": "Data collector telephone number",
    //                             "inputType": "tel"
    //                         }, {
    //                             "type": "text",
    //                             "name": "email",
    //                             "title": "Email",
    //                             "inputType": "email"
    //                         }, {
    //                             "type": "text",
    //                             "name": "form_completion_date",
    //                             "title": "Form completion date",
    //                             "inputType": "date"
    //                         }
    //                     ],
    //                     "title": "Data Collector Information",
    //                     "showNumber": true,
    //                     "showQuestionNumbers": "off"
    //                 }
    //             ],
    //             "startWithNewLine": false
    //         }
    //     ]
    // }, {
        {
        "name": "page2",
        "navigationTitle": "Persona",
        "navigationDescription": "Info de la Persona",
        "elements": [
            {
                "type": "boolean",
                "name": "is_the_person_providing_the_information_is_the_patient",
                "title": "La persona llenando este formulario es el Paciente ?",
                "isRequired": true,
                "labelTrue": "Yes",
                "labelFalse": "No",
                "hideNumber": true
            }, {
                "type": "panel",
                "name": "case_identifier_information ",
                "elements": [
                    {
                        "type": "text",
                        "name": "dni_paciente",
                        "title": "Documento identificación del Paciente",
                        "isRequired": true,
                        "inputFormat": "###-#######-#",
                        "text": "Debe colocar una cédula válida",
                        "validators": [
                            {
                             "type": "regex",
                             "regex": "^[0-9]{3}-?[0-9]{7}-?[0-9]{1}$",
                             "text": "Introduzca una cédula válida"
                            } ]           
                        
                    },                    
                    {
                        "type": "text",
                        "isRequired": true,
                        "startWithNewLine": true,
                        "name": "nombre_paciente",
                        "title": "Nombre Completo del Paciente ",
                        "placeHolder": "Brayan Munoz"
                        
                    
                    }, {
                        "type": "text",
                        "isRequired": true,
                        requiredErrorText: "Teléfono de contacto, requerido",
                        "name": "telefono_paciente",
                        "startWithNewLine": true,
                        "inputFormat": "8##-###-####",
                        "title": "Teléfono",
                        "inputType": "tel",
                        "validators": [
                            {
                             "type": "regex",
                             "regex": "[0-9]{3}-?[0-9]{3}-?[0-9]{4}$",
                             "text": "Introduzca un número de Teléfono válido"
                            } ]  
                    },  
                    {
                        "type": "text",
                        "name": "paciente_mail",
                        "startWithNewLine": false,
                        "title": "Correo Electrónico del Paciente",
                        "isRequired": true,

                        validators: [
                            {
                                type: "email",
                                text: "Debe colocar un correo electrónico válido"
                            }
                        ]
                    },
                    
                ],
                "visibleIf": "{is_the_person_providing_the_information_is_the_patient} = true",
                "title": "Información del Paciente",
                "showNumber": true,
                "showQuestionNumbers": "off"
            }, {
                "type": "panel",
                "name": "interview_respondent_information_if_the_persons_providing_the_information_is_not_the_patient",
                "elements": [
                    {
                        "type": "text",
                        "name": "dni_paciente",
                        "title": "Documento identificación del Paciente",
                        "isRequired": true,
                        "inputFormat": "8##-#######-#",
                        "text": "Debe colocar una cédula válida",
                        "validators": [
                            {
                             "type": "regex",
                             "regex": "^[0-9]{3}-?[0-9]{7}-?[0-9]{1}$",
                             "text": "Introduzca un número de Teléfono válido"
                            } ]           
                        
                    },                    
                    {
                        "type": "text",
                        "isRequired": true,
                        "name": "nombre_paciente",
                        "title": "Nombre Completo del Paciente ",
                        "placeHolder": "Brayan Munoz"
                        
                    }, {
                        "type": "text",
                        "isRequired": true,
                        "name": "nombre_ayudante",
                        "startWithNewLine": false,
                        "title": "Nombre Completo de quien llena la ficha",
                        "placeHolder": "Brayan Munoz"
                    },  {
                        "type": "text",
                        "name": "paciente_mail",
                        "startWithNewLine": true,
                        "title": "Email del Paciente",
                        "isRequired": true,

                        validators: [
                            {
                                type: "email",
                                text: "Debe colocar un correo electrónico válido"
                            }
                        ]
                    }, 
                    
                    {
                        "type": "text",
                        "name": "paciente_mail",
                        "startWithNewLine": false,
                        "title": "Email de quien llena la ficha",
                        "isRequired": true,

                        validators: [
                            {
                                type: "email",
                                text: "Debe colocar un correo electrónico válido"
                            }
                        ]
                    },
                    
                    
                    
                    {
                        "type": "text",
                        "isRequired": true,
                        "name": "relationship_to_patient",
                        "startWithNewLine": true,
                        "title": "Relación con el Paciente"
                    },
                     {
                        "type": "text",
                        "isRequired": true,
                        requiredErrorText: "Teléfono de contacto, requerido",
                        "name": "interview_respondent_information_patient_telephone_mobile_number",
                        "startWithNewLine": false,
                        "inputFormat": "8##-###-####",
                        "title": "Telefono de quien llena la ficha",
                        "inputType": "tel",
                        "validators": [
                            {
                             "type": "regex",
                             "regex": "[0-9]{3}-?[0-9]{3}-?[0-9]{4}$",
                             "text": "Introduzca un número de Teléfono válido"
                            } ]  
                    }
                ],
                "visibleIf": "{is_the_person_providing_the_information_is_the_patient} = false",
                "title": "Información del Paciente ",
                "showNumber": true,
                "showQuestionNumbers": "off"
            }
        ]
    }, {
        "name": "page3",
        "navigationTitle": "Síntomas",
        "navigationDescription": "Síntomas Paciente",
        "elements": [
            {
                "type": "image",
                "name": "third_page_image",
                "imageLink": "https://previews.123rf.com/images/jemastock/jemastock1704/jemastock170409768/76402963-patient-monitor-icon-image-vector-illustration-design.jpg",
                "imageHeight": 690,
                "imageWidth": 325,
                "width": "340px"
            }, {
                "type": "panel",
                "name": "patient_symptoms_from_disease_onset",
                "elements": [
                    {
                        "type": "panel",
                        "name": "date_of_first_symptom_onset",
                        "elements": [
                            {
                                "type": "text",
                                "name": "date_of_first_symptom_onset_date",
                                "enableIf": "{date_of_first_symptom_onset_checkbox} empty",
                                "titleLocation": "hidden",
                                "inputType": "date",
                                "width": "314px"
                            }, {
                                "type": "checkbox",
                                "name": "date_of_first_symptom_onset_checkbox",
                                "startWithNewLine": false,
                                "titleLocation": "hidden",
                                "choices": [
                                    {
                                        "value": "item1",
                                        "text": "Sin síntomas",
                                        "enableIf": "{date_of_first_symptom_onset_checkbox} <> ['item2']"
                                    }, {
                                        "value": "item2",
                                        "text": "Fecha Desconocida",
                                        "enableIf": "{date_of_first_symptom_onset_checkbox} <> ['item1']"
                                    }
                                ],
                                "colCount": 3
                            }, {
                                "type": "radiogroup",
                                "name": "question1",
                                "title": "Fiebre (≥38 °C) o antecedentes de fiebre ",
                                "titleLocation": "left",
                                "choices": [
                                    {
                                        "value": "item1",
                                        "text": "Sí"
                                    }, {
                                        "value": "item2",
                                        "text": "No"
                                    }, {
                                        "value": "item3",
                                        "text": "Desconocido"
                                    }
                                ],
                                "colCount": 3
                            }
                        ],
                        "title": "Fecha de inicio del primer síntoma"
                    }, {
                        "type": "radiogroup",
                        "name": "sore_throat",
                        "title": "Dolor de Garganta",
                        "titleLocation": "left",
                        "choices": [
                            {
                                "value": "item1",
                                "text": "Sí"
                            }, {
                                "value": "item2",
                                "text": "No"
                            }, {
                                "value": "item3",
                                "text": "Desconocido"
                            }
                        ],
                        "colCount": 3
                    }, {
                        "type": "radiogroup",
                        "name": "runny_nose",
                        "title": "Secreción Nasal",
                        "titleLocation": "left",
                        "choices": [
                            {
                                "value": "item1",
                                "text": "Sí"
                            }, {
                                "value": "item2",
                                "text": "No"
                            }, {
                                "value": "item3",
                                "text": "Desconocido"
                            }
                        ],
                        "colCount": 3
                    }, {
                        "type": "radiogroup",
                        "name": "cough",
                        "title": "Tos",
                        "titleLocation": "left",
                        "choices": [
                            {
                                "value": "item1",
                                "text": "Sí"
                            }, {
                                "value": "item2",
                                "text": "No"
                            }, {
                                "value": "item3",
                                "text": "Desconocido"
                            }
                        ],
                        "colCount": 3
                    }, {
                        "type": "radiogroup",
                        "name": "shortness_of_Breath",
                        "title": "Dificultad para respirar",
                        "titleLocation": "left",
                        "choices": [
                            {
                                "value": "item1",
                                "text": "Sí"
                            }, {
                                "value": "item2",
                                "text": "No"
                            }, {
                                "value": "item3",
                                "text": "Desconocido"
                            }
                        ],
                        "colCount": 3
                    }, {
                        "type": "radiogroup",
                        "name": "vomiting",
                        "title": "Vomitos",
                        "titleLocation": "left",
                        "choices": [
                            {
                                "value": "item1",
                                "text": "Sí"
                            }, {
                                "value": "item2",
                                "text": "No"
                            }, {
                                "value": "item3",
                                "text": "Desconocido"
                            }
                        ],
                        "colCount": 3
                    }, {
                        "type": "radiogroup",
                        "name": "nausea",
                        "title": "Nauseas",
                        "titleLocation": "left",
                        "choices": [
                            {
                                "value": "item1",
                                "text": "Sí"
                            }, {
                                "value": "item2",
                                "text": "No"
                            }, {
                                "value": "item3",
                                "text": "Desconocido"
                            }
                        ],
                        "colCount": 3
                    }, {
                        "type": "radiogroup",
                        "name": "diarrhea",
                        "title": "Diarrea",
                        "titleLocation": "left",
                        "choices": [
                            {
                                "value": "item1",
                                "text": "Sí"
                            }, {
                                "value": "item2",
                                "text": "No"
                            }, {
                                "value": "item3",
                                "text": "Desconocido"
                            }
                        ],
                        "colCount": 3
                    }
                ],
                "title": "Síntomas del paciente (desde el inicio de la enfermedad)",
                "startWithNewLine": false,
                "showNumber": true,
                "showQuestionNumbers": "off"
            }
        ]
    }, 
    // {
    //     "name": "page4",
    //     "navigationTitle": "Sample",
    //     "navigationDescription": "Initial sample",
    //     "elements": [
    //         {
    //             "type": "image",
    //             "name": "fouth_page_image",
    //             "width": "600px",
    //             "imageLink": "/Content/Images/examples/covid/04.png",
    //             "imageHeight": 567,
    //             "imageWidth": 500
    //         }, {
    //             "type": "panel",
    //             "name": "initial_sample_collection",
    //             "elements": [
    //                 {
    //                     "type": "text",
    //                     "name": "date_respiratory_sample_collected",
    //                     "title": "Date respiratory sample collected",
    //                     "inputType": "date"
    //                 }, {
    //                     "type": "radiogroup",
    //                     "name": "what_type_of_respiratory_sample_was_collected",
    //                     "title": "What type of respiratory sample was collected?",
    //                     "hasOther": true,
    //                     "choices": [
    //                         {
    //                             "value": "item1",
    //                             "text": "Nasal swab"
    //                         }, {
    //                             "value": "item2",
    //                             "text": "Throat swab "
    //                         }, {
    //                             "value": "item3",
    //                             "text": "Nasopharyngeal swab"
    //                         }
    //                     ],
    //                     "otherText": "Other, specify",
    //                     "colCount": 2
    //                 }, {
    //                     "type": "panel",
    //                     "name": "has_baseline_serum_been_taken_panel",
    //                     "elements": [
    //                         {
    //                             "type": "radiogroup",
    //                             "name": "has_baseline_serum_been_taken_radio",
    //                             "titleLocation": "hidden",
    //                             "choices": [
    //                                 {
    //                                     "value": "item1",
    //                                     "text": "Yes"
    //                                 }, {
    //                                     "value": "item2",
    //                                     "text": "No"
    //                                 }, {
    //                                     "value": "item3",
    //                                     "text": "Unknown"
    //                                 }
    //                             ],
    //                             "colCount": 3
    //                         }, {
    //                             "type": "text",
    //                             "name": "has_baseline_serum_been_taken_date",
    //                             "visibleIf": "{has_baseline_serum_been_taken_radio} = 'item1'",
    //                             "startWithNewLine": false,
    //                             "title": "Date baseline serum taken",
    //                             "titleLocation": "left",
    //                             "inputType": "date"
    //                         }
    //                     ],
    //                     "title": "Has baseline serum been taken?"
    //                 }, {
    //                     "type": "panel",
    //                     "name": "were_other_samples_collected_panel",
    //                     "elements": [
    //                         {
    //                             "type": "radiogroup",
    //                             "name": "were_other_samples_collected_radio",
    //                             "titleLocation": "hidden",
    //                             "choices": [
    //                                 {
    //                                     "value": "item1",
    //                                     "text": "Yes"
    //                                 }, {
    //                                     "value": "item2",
    //                                     "text": "No"
    //                                 }, {
    //                                     "value": "item3",
    //                                     "text": "Unknown"
    //                                 }
    //                             ],
    //                             "colCount": 3
    //                         }, {
    //                             "type": "text",
    //                             "name": "were_other_samples_collected_textbox",
    //                             "visibleIf": "{were_other_samples_collected_radio} = 'item1'",
    //                             "startWithNewLine": false,
    //                             "title": "Which samples:"
    //                         }, {
    //                             "type": "text",
    //                             "name": "were_other_samples_collected_date",
    //                             "visibleIf": "{were_other_samples_collected_radio} = 'item1'",
    //                             "startWithNewLine": false,
    //                             "title": "Date taken",
    //                             "inputType": "date"
    //                         }
    //                     ],
    //                     "title": "Were other samples collected? "
    //                 }
    //             ],
    //             "title": "Initial sample collection",
    //             "startWithNewLine": false,
    //             "showNumber": true,
    //             "showQuestionNumbers": "off"
    //         }
    //     ]
    // }, 
    {
        "name": "page5",
        "navigationTitle": "Complicaciones",
        "navigationDescription": "Cuadro Clinico",
        "elements": [
            {
                "type": "image",
                "name": "fifth_image",
                "width": "600px",
                "imageLink": "/Content/Images/examples/covid/05.png",
                "imageHeight": 713,
                "imageWidth": 500
            }, {
                "type": "panel",
                "name": "clinical_course_complications_panel",
                "elements": [
                    {
                        "type": "panel",
                        "name": "hospitalization_required_panel",
                        "elements": [
                            {
                                "type": "radiogroup",
                                "name": "hospitalization_required_radio",
                                "width": "49%",
                                "titleLocation": "hidden",
                                "choices": [
                                    {
                                        "value": "item1",
                                        "text": "Yes"
                                    }, {
                                        "value": "item2",
                                        "text": "No"
                                    }, {
                                        "value": "item3",
                                        "text": "Unknown"
                                    }
                                ],
                                "colCount": 3
                            }, {
                                "type": "text",
                                "name": "hospitalization_required_hospital",
                                "enableIf": "{hospitalization_required_radio} = 'item1'",
                                "startWithNewLine": false,
                                "title": "Name of hospital",
                                "width": "313px",
                                "titleLocation": "left"
                                
                            }
                        ],
                        "title": "Hospitalization required?"
                    }, {
                        "type": "radiogroup",
                        "name": "icu_Intensive_Care_Unit_admission_required",
                        "title": "ICU (Intensive Care Unit) admission required",
                        "titleLocation": "left",
                        "choices": [
                            {
                                "value": "item1",
                                "text": "Yes"
                            }, {
                                "value": "item2",
                                "text": "No"
                            }, {
                                "value": "item3",
                                "text": "Unknown"
                            }
                        ],
                        "colCount": 3
                    }, {
                        "type": "radiogroup",
                        "name": "acute_respiratory_distress_syndrome_ards",
                        "title": "Acute Respiratory Distress Syndrome (ARDS)",
                        "titleLocation": "left",
                        "choices": [
                            {
                                "value": "item1",
                                "text": "Yes"
                            }, {
                                "value": "item2",
                                "text": "No"
                            }, {
                                "value": "item3",
                                "text": "Unknown"
                            }
                        ],
                        "colCount": 3
                    }, {
                        "type": "panel",
                        "name": "pneumonia_by_chest_xray_panel",
                        "elements": [
                            {
                                "type": "radiogroup",
                                "name": "pneumonia_by_chest_xray_radio",
                                "width": "49%",
                                "titleLocation": "hidden",
                                "choices": [
                                    {
                                        "value": "item1",
                                        "text": "Yes"
                                    }, {
                                        "value": "item2",
                                        "text": "No"
                                    }, {
                                        "value": "item3",
                                        "text": "Not applicable (no X-ray performed)"
                                    }
                                ],
                                "colCount": 3
                            }, {
                                "type": "text",
                                "name": "pneumonia_by_chest_xray_date",
                                "enableIf": "{pneumonia_by_chest_xray_radio} = 'item1'",
                                "startWithNewLine": false,
                                "title": "Date",
                                "titleLocation": "left",
                                "width": "313px",
                                "inputType": "date"
                            }
                        ],
                        "title": "Pneumonia by chest X-ray "
                    }, {
                        "type": "panel",
                        "name": "other_severe_or_life_threatening_illness_suggestive_of_an_infection_panel",
                        "elements": [
                            {
                                "type": "radiogroup",
                                "name": "other_severe_or_life_threatening_illness_suggestive_of_an_radio",
                                "width": "49%",
                                "titleLocation": "hidden",
                                "choices": [
                                    {
                                        "value": "item1",
                                        "text": "Yes"
                                    }, {
                                        "value": "item2",
                                        "text": "No"
                                    }, {
                                        "value": "item3",
                                        "text": "Unknown"
                                    }
                                ],
                                "colCount": 3
                            }, {
                                "type": "text",
                                "name": "other_severe_or_life_threatening_illness_suggestive_of_an_specify",
                                "enableIf": "{other_severe_or_life_threatening_illness_suggestive_of_an_radio} = 'item1'",
                                "startWithNewLine": false,
                                "title": "Specify:",
                                "width": "313px",
                                "titleLocation": "left"
                            }
                        ],
                        "title": "Other severe or life-threatening illness suggestive of an infection"
                    }, {
                        "type": "radiogroup",
                        "name": "mechanical_ventilation_required",
                        "title": "Mechanical ventilation required",
                        "titleLocation": "left",
                        "choices": [
                            {
                                "value": "item1",
                                "text": "Yes"
                            }, {
                                "value": "item2",
                                "text": "No"
                            }, {
                                "value": "item3",
                                "text": "Unknown"
                            }
                        ],
                        "colCount": 3
                    }, {
                        "type": "radiogroup",
                        "name": "extracorporeal_membrane_oxygenation_emo",
                        "title": "Extracorporeal membrane oxygenation (EMO)",
                        "titleLocation": "left",
                        "choices": [
                            {
                                "value": "item1",
                                "text": "Yes"
                            }, {
                                "value": "item2",
                                "text": "No"
                            }, {
                                "value": "item3",
                                "text": "Unknown"
                            }
                        ],
                        "colCount": 3
                    }
                ],
                "title": "Clinical Course: Complications",
                "startWithNewLine": false,
                "showNumber": true,
                "showQuestionNumbers": "off"
            }
        ]
    }, {
        "name": "page6",
        "navigationTitle": "Exposiciones",
        "navigationDescription": "Before illness",
        "elements": [
            {
                "type": "panel",
                "name": "human_exposures_in_the_days_before_illness_onset",
                "elements": [
                    {
                        "type": "panel",
                        "name": "have_you_travelled_within_the_last_days_domestically_panel",
                        "elements": [
                            {
                                "type": "radiogroup",
                                "name": "have_you_travelled_within_the_last_days_domestically_radio",
                                "width": "50%",
                                "titleLocation": "hidden",
                                "choices": [
                                    {
                                        "value": "item1",
                                        "text": "Yes"
                                    }, {
                                        "value": "item2",
                                        "text": "No"
                                    }, {
                                        "value": "item3",
                                        "text": "Unknown"
                                    }
                                ],
                                "colCount": 3
                            }, {
                                "type": "panel",
                                "name": "have_you_travelled_within_the_last_days_domestically_date_panel",
                                "elements": [
                                    {
                                        "type": "text",
                                        "name": "have_you_travelled_within_the_last_days_domestically_date_from",
                                        "title": "from",
                                        "titleLocation": "left",
                                        "inputType": "date"
                                    }, {
                                        "type": "text",
                                        "name": "have_you_travelled_within_the_last_days_domestically_date_to",
                                        "startWithNewLine": false,
                                        "title": "to",
                                        "titleLocation": "left",
                                        "inputType": "date"
                                    }
                                ],
                                "visibleIf": "{have_you_travelled_within_the_last_days_domestically_radio} = 'item1'",
                                "title": "Dates of travel"
                            }, {
                                "type": "text",
                                "name": "have_you_travelled_within_the_last_days_domestically_regions",
                                "visibleIf": "{have_you_travelled_within_the_last_days_domestically_radio} = 'item1'",
                                "title": "Regions:",
                                "titleLocation": "left"
                            }, {
                                "type": "text",
                                "name": "have_you_travelled_within_the_last_days_domestically_cities_visited",
                                "visibleIf": "{have_you_travelled_within_the_last_days_domestically_radio} = 'item1'",
                                "startWithNewLine": false,
                                "title": "Cities visited:",
                                "titleLocation": "left"
                            }
                        ],
                        "title": "Have you travelled within the last 14 days domestically?",
                        "showQuestionNumbers": "off"
                    }, {
                        "type": "panel",
                        "name": "have_you_travelled_within_the_last_days_internationall_panel",
                        "elements": [
                            {
                                "type": "radiogroup",
                                "name": "have_you_travelled_within_the_last_days_internationall_radio",
                                "width": "50%",
                                "titleLocation": "hidden",
                                "choices": [
                                    {
                                        "value": "item1",
                                        "text": "Yes"
                                    }, {
                                        "value": "item2",
                                        "text": "No"
                                    }, {
                                        "value": "item3",
                                        "text": "Unknown"
                                    }
                                ],
                                "colCount": 3
                            }, {
                                "type": "panel",
                                "name": "have_you_travelled_within_the_last_days_internationall_date_panel",
                                "elements": [
                                    {
                                        "type": "text",
                                        "name": "have_you_travelled_within_the_last_days_internationall_date_from",
                                        "title": "from",
                                        "titleLocation": "left",
                                        "inputType": "date"
                                    }, {
                                        "type": "text",
                                        "name": "have_you_travelled_within_the_last_days_internationall_date_to",
                                        "startWithNewLine": false,
                                        "title": "to",
                                        "titleLocation": "left",
                                        "inputType": "date"
                                    }
                                ],
                                "visibleIf": "{have_you_travelled_within_the_last_days_internationall_radio} = 'item1'",
                                "title": "Dates of travel"
                            }, {
                                "type": "text",
                                "name": "have_you_travelled_within_the_last_days_internationall_countries",
                                "visibleIf": "{have_you_travelled_within_the_last_days_internationall_radio} = 'item1'",
                                "title": "Countries visited:",
                                "titleLocation": "left"
                            }, {
                                "type": "text",
                                "name": "have_you_travelled_within_the_last_days_internationall_cities",
                                "visibleIf": "{have_you_travelled_within_the_last_days_internationall_radio} = 'item1'",
                                "startWithNewLine": false,
                                "title": "Cities visited:",
                                "titleLocation": "left"
                            }
                        ],
                        "title": "Have you travelled within the last 14 days internationally?",
                        "showQuestionNumbers": "off"
                    }, {
                        "type": "panel",
                        "name": "in_the_past_days_have_you_had_contact_with_a_anyone_with_suspected_or_confirmed_ncov_infection_panel",
                        "elements": [
                            {
                                "type": "radiogroup",
                                "name": "in_the_past_days_have_you_had_contact_with_a_anyone_with_suspected_or_confirmed_ncov_infection_radio",
                                "width": "50%",
                                "titleLocation": "hidden",
                                "choices": [
                                    {
                                        "value": "item1",
                                        "text": "Yes"
                                    }, {
                                        "value": "item2",
                                        "text": "No"
                                    }, {
                                        "value": "item3",
                                        "text": "Unknown"
                                    }
                                ],
                                "colCount": 3
                            }, {
                                "type": "text",
                                "name": "in_the_past_days_have_you_had_contact_with_a_anyone_with_suspected_or_confirmed_ncov_infection_date",
                                "enableIf": "{in_the_past_days_have_you_had_contact_with_a_anyone_with_suspected_or_confirmed_ncov_infection_radio} = 'item1'",
                                "startWithNewLine": false,
                                "title": "Date of last contact",
                                "titleLocation": "left",
                                "inputType": "date"
                            }
                        ],
                        "title": "In the past 14 days, have you had contact with a anyone with suspected or confirmed 2019-nCoV infection?",
                        "showQuestionNumbers": "off"
                    }, {
                        "type": "panel",
                        "name": "patient_attended_festival_or_mass_gathering_panel",
                        "elements": [
                            {
                                "type": "radiogroup",
                                "name": "patient_attended_festival_or_mass_gathering_radio",
                                "width": "50%",
                                "titleLocation": "hidden",
                                "choices": [
                                    {
                                        "value": "item1",
                                        "text": "Yes"
                                    }, {
                                        "value": "item2",
                                        "text": "No"
                                    }, {
                                        "value": "item3",
                                        "text": "Unknown"
                                    }
                                ],
                                "colCount": 3
                            }, {
                                "type": "text",
                                "name": "patient_attended_festival_or_mass_gathering_specify",
                                "enableIf": "{patient_attended_festival_or_mass_gathering_radio} = 'item1'",
                                "startWithNewLine": false,
                                "title": "Specify:",
                                "titleLocation": "left"
                            }
                        ],
                        "title": "Patient attended festival or mass gathering",
                        "showQuestionNumbers": "off"
                    }, {
                        "type": "radiogroup",
                        "name": "patient_exposed_to_person_with_similar_illness",
                        "title": "Patient exposed to person with similar illness",
                        "width": "50%",
                        "hideNumber": true,
                        "choices": [
                            {
                                "value": "item1",
                                "text": "Yes"
                            }, {
                                "value": "item2",
                                "text": "No"
                            }, {
                                "value": "item3",
                                "text": "Unknown"
                            }
                        ],
                        "colCount": 3
                    }, {
                        "type": "radiogroup",
                        "name": "location_of_exposure",
                        "title": "Location of exposure",
                        "width": "50%",
                        "hideNumber": true,
                        "hasOther": true,
                        "choices": [
                            {
                                "value": "item1",
                                "text": "Home"
                            }, {
                                "value": "item2",
                                "text": "Hospital"
                            }, {
                                "value": "item3",
                                "text": "Workplace"
                            }, {
                                "value": "item4",
                                "text": "Tour group"
                            }, {
                                "value": "item5",
                                "text": "Unknown"
                            }
                        ],
                        "otherText": "Other, specify:",
                        "colCount": 3
                    }, {
                        "type": "panel",
                        "name": "patient_visited_or_was_admitted_to_inpatient_health_facility_panel",
                        "elements": [
                            {
                                "type": "radiogroup",
                                "name": "patient_visited_or_was_admitted_to_inpatient_health_facility_radio",
                                "width": "50%",
                                "titleLocation": "hidden",
                                "choices": [
                                    {
                                        "value": "item1",
                                        "text": "Yes"
                                    }, {
                                        "value": "item2",
                                        "text": "No"
                                    }, {
                                        "value": "item3",
                                        "text": "Unknown"
                                    }
                                ],
                                "colCount": 3
                            }, {
                                "type": "text",
                                "name": "patient_visited_or_was_admitted_to_inpatient_health_facility_specify",
                                "enableIf": "{patient_visited_or_was_admitted_to_inpatient_health_facility_radio} = 'item1'",
                                "startWithNewLine": false,
                                "title": "Specify:",
                                "titleLocation": "left"
                            }, {
                                "type": "panel",
                                "name": "patient_visited_outpatient_treatment_facility_panel",
                                "elements": [
                                    {
                                        "type": "radiogroup",
                                        "name": "patient_visited_outpatient_treatment_facility_radio",
                                        "width": "50%",
                                        "titleLocation": "hidden",
                                        "choices": [
                                            {
                                                "value": "item1",
                                                "text": "Yes"
                                            }, {
                                                "value": "item2",
                                                "text": "No"
                                            }, {
                                                "value": "item3",
                                                "text": "Unknown"
                                            }
                                        ],
                                        "colCount": 3
                                    }, {
                                        "type": "text",
                                        "name": "patient_visited_outpatient_treatment_facility_specify",
                                        "enableIf": "{patient_visited_outpatient_treatment_facility_radio} = 'item1'",
                                        "startWithNewLine": false,
                                        "title": "Specify:",
                                        "titleLocation": "left"
                                    }
                                ],
                                "title": "Patient visited outpatient treatment facility"
                            }, {
                                "type": "panel",
                                "name": "patient_visited_traditional_healer_panel",
                                "elements": [
                                    {
                                        "type": "radiogroup",
                                        "name": "patient_visited_traditional_healer_radio",
                                        "width": "50%",
                                        "titleLocation": "hidden",
                                        "choices": [
                                            {
                                                "value": "item1",
                                                "text": "Yes"
                                            }, {
                                                "value": "item2",
                                                "text": "No"
                                            }, {
                                                "value": "item3",
                                                "text": "Unknown"
                                            }
                                        ],
                                        "colCount": 3
                                    }, {
                                        "type": "text",
                                        "name": "patient_visited_traditional_healer_specify",
                                        "enableIf": "{patient_visited_traditional_healer_radio} = 'item1'",
                                        "startWithNewLine": false,
                                        "title": "Specify:",
                                        "titleLocation": "left"
                                    }, {
                                        "type": "panel",
                                        "name": "patient_occupation_specify_location_facility_panel",
                                        "elements": [
                                            {
                                                "type": "checkbox",
                                                "name": "patient_occupation_specify_location_facility_checkbox",
                                                "titleLocation": "hidden",
                                                "hasOther": true,
                                                "choices": [
                                                    {
                                                        "value": "item1",
                                                        "text": "Health care worker"
                                                    }, {
                                                        "value": "item2",
                                                        "text": "Working with animals "
                                                    }, {
                                                        "value": "item3",
                                                        "text": "Health laboratory worker"
                                                    }, {
                                                        "value": "item4",
                                                        "text": "Student"
                                                    }
                                                ],
                                                "otherText": "Other, specify:",
                                                "colCount": 3
                                            }, {
                                                "type": "text",
                                                "name": "patient_occupation_specify_location_facility_specify",
                                                "visibleIf": "{patient_occupation_specify_location_facility_checkbox} notempty",
                                                "title": "For each occupation, please specify location or facility:",
                                                "titleLocation": "left"
                                            }
                                        ],
                                        "title": "Patient occupation (specify location/facility)",
                                        "showQuestionNumbers": "off"
                                    }
                                ],
                                "title": "Patient visited traditional healer"
                            }
                        ],
                        "title": "Patient visited or was admitted to inpatient health facility",
                        "showQuestionNumbers": "off"
                    }
                ],
                "title": "Human exposures in the 14 days before illness onset",
                "showNumber": true
            }
        ]
    }, {
        "name": "page7",
        "navigationTitle": "Completion",
        "navigationDescription": "Status of form",
        "elements": [
            {
                "type": "image",
                "name": "seventh_image",
                "width": "600",
                "imageLink": "/Content/Images/examples/covid/07.png",
                "imageHeight": 441,
                "imageWidth": 500
            }, {
                "type": "panel",
                "name": "status_of_form_completion_panel",
                "elements": [
                    {
                        "type": "boolean",
                        "name": "status_of_form_completion_boolean",
                        "title": "Form completed",
                        "isRequired": true,
                        "labelTrue": "Yes",
                        "labelFalse": "No or partially"
                    }, {
                        "type": "radiogroup",
                        "name": "status_of_form_completion_radio",
                        "visibleIf": "{status_of_form_completion_boolean} = false",
                        "title": "Reason:",
                        "hasOther": true,
                        "choices": [
                            {
                                "value": "item1",
                                "text": "Missed"
                            }, {
                                "value": "item2",
                                "text": "Not attempted"
                            }, {
                                "value": "item3",
                                "text": "Not performed"
                            }, {
                                "value": "item4",
                                "text": "Refusal"
                            }
                        ],
                        "otherText": "Other, specific:"
                    }
                ],
                "title": "Status of form completion",
                "startWithNewLine": false,
                "showNumber": true,
                "showQuestionNumbers": "off"
            }
        ]
    }
],
"showProgressBar": "top",
"progressBarType": "buttons"
};




 window.survey = new Survey.Model(json);

survey
.onComplete
.add(function (sender) {
    document
        .querySelector('#surveyResult')
        .textContent = "Result JSON:\n" + JSON.stringify(sender.data, null, 3);

        console.log(sender.data);
});

$("#surveyElement").Survey({model: survey});