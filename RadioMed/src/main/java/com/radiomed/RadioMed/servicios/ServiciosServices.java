package com.radiomed.RadioMed.servicios;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiciosServices {

    public final ArrayList<Servicios> lista = new ArrayList<>();

    public ServiciosServices() {
        lista.add(new Servicios("Curso Básico de Protección Radiológica Nivel Personal Ocupacionalmente Expuesto (POE)",
                "Curso dirigido a técnicos radiólogos, médicos radiólogos, enfermeras, cirujanos dentistas, médicos de diferentes especialidades y cualquier personal ocupacionalmente expuesto (POE) que haga uso de algún equipo de rayos X para diagnóstico médico.",
                "Este curso está diseñado para que el alumno comprenda fácilmente y de forma didáctica qué son las radiaciones ionizantes y cuáles son los principios de protección radiológica que puede aplicar en su lugar de trabajo.",
                "El contenido del curso se basa en lo estipulado en las Normas Oficiales Mexicanas NOM-229-SSA1-2002 y NOM-031-NUCL-2011.",
                "Duración del curso: 40 horas."));
        lista.add(new Servicios("Curso Medio de Protección Radiológica Nivel Personal Ocupacionalmente Expuesto (POE)",
                "Curso dirigido a técnicos radiólogos, médicos radiólogos, enfermeras, cirujanos dentistas, médicos de diferentes especialidades y cualquier personal ocupacionalmente expuesto (POE) que haga uso de algún equipo de rayos X para diagnóstico médico.",
                "Este curso está diseñado para que el alumno comprenda fácilmente y de forma didáctica qué son las radiaciones ionizantes y cuáles son los principios de protección radiológica que puede aplicar en su lugar de trabajo.",
                "El contenido del curso se basa en lo estipulado en las Normas Oficiales Mexicanas NOM-229-SSA1-2002 y NOM-031-NUCL-2011.",
                "Duración del curso: 40 horas."));
    }

    public List<Servicios> getServicios(){
        return lista;
    }

    public Servicios getServicio(Long arg_srvID){
            return lista.get(arg_srvID.intValue()-1);
    }

    public void deleteServicio(Long arg_srvID){
        if( arg_srvID <= lista.size()){
            lista.remove(arg_srvID.intValue()-1);
        }
    }

    public void addServicio(Servicios arg_srv){
        lista.add(arg_srv);
    }

    public void updateServicio(Long arg_srvID,
                               String titulo,
                               String parrafo1,
                               String parrafo2,
                               String parrafo3,
                               String parrafoBlack){
        if(arg_srvID <= lista.size()){
            Servicios tmpSrv = lista.get(arg_srvID.intValue()-1);
            if(titulo != null) tmpSrv.setTitulo(titulo);
            if(parrafo1 != null) tmpSrv.setParrafo1(parrafo1);
            if(parrafo2 != null) tmpSrv.setParrafo2(parrafo2);
            if(parrafo3 != null) tmpSrv.setParrafo3(parrafo3);
            if(parrafoBlack != null) tmpSrv.setParrafoBlack(parrafoBlack);
        }
    }

}
/*
{
		"imagen": "./img/services/img-service1.jpg",
		"titulo": "Curso Básico de Protección Radiológica Nivel Personal Ocupacionalmente Expuesto (POE)",
		"parrafo1": "Curso dirigido a técnicos radiólogos, médicos radiólogos, enfermeras, cirujanos dentistas, médicos de diferentes especialidades y cualquier personal ocupacionalmente expuesto (POE) que haga uso de algún equipo de rayos X para diagnóstico médico.",
		"parrafo2": "Este curso está diseñado para que el alumno comprenda fácilmente y de forma didáctica qué son las radiaciones ionizantes y cuáles son los principios de protección radiológica que puede aplicar en su lugar de trabajo.",
		"parrafo3": "El contenido del curso se basa en lo estipulado en las Normas Oficiales Mexicanas NOM-229-SSA1-2002 y NOM-031-NUCL-2011.",
		"parrafoBlack": "Duración del curso: 40 horas.",
		"id": "1"
	},
	{
		"imagen": "./img/services/img-service2.jpg",
		"titulo": "Curso de Actualización en Protección Radiológica para Personal Ocupacionalmente Expuesto (POE)",
		"parrafo1": "Curso dirigido al personal ocupacionalmente expuesto (POE) que labora en establecimientos de diagnóstico médico con rayos X y cuenta con un Curso Básico de Protección Radiológica Nivel POE. ",
		"parrafo2": "RadioMed le ofrece un Curso de Actualización personalizado, de acuerdo al tipo de establecimiento médico que lo solicita, con el fin de reforzar en el alumno los conocimientos prácticos de protección radiológica que le serán útiles en sus actividades laborales diarias.",
		"parrafo3": "El Curso de Actualización se imparte de forma anual de acuerdo a lo establecido en las Normas Oficiales Mexicanas NOM-229-SSA1-200 y NOM-031-NUCL-2011.",
		"parrafoBlack": "Duración del curso: 8 a 16 horas.",
		"id": "2"
	}
 */
