public class Hospital{
	public static void main(String args []){
			//TODO LO DE PACIENTE
			Paciente paciente1 =new Paciente("catalina", 20,"femenino");
	
			for (int i = 1; i <= 3; i++) {
            		Paciente paciente = new Paciente("paciente " + i, 20 + i, "femenino");
            		paciente.entrada("15:0" + i);

			String medico = "medico " + i;  
            		paciente.asignarmedico(medico);
			//ACA LO DE DIAGNOSTICO
			int Ingresosdias= 4;
		 	Diagnostico diag = new Diagnostico(
                    							"dolor cabeza " + i,
                   							"reposo y líquidos",
                    							"gripe leve " + i,
		    							Ingresosdias + i);
            		TratamientoMedico tratamientop = new TratamientoMedico(
    									"Neumologo " + i,
    									3+i,                     									    
									"Reposo grado "	+i);

			Medicamentos medicina = new Medicamentos(true, 2+i, "acetaminofem 500 mg");

			//AHORA EXAMENES MEDICOS
			int dias = diag.duracionenfermedad();
			System.out.println("Duracion aprox de enfermedad "+ dias +" dias");			  
			ExamenesMedicos examen = new ExamenesMedicos(true, true, true, false);
			tratamientop.asignarMedicamentos(medicina);	
			examen.asignartratamiento(tratamientop);
		  	paciente.asignardiagnostico(diag);
			diag.asignarExamenes(examen);
 			String detalles = paciente.detallepaciente();
            		System.out.println(detalles);	
            		System.out.println("------------------");	
        	}
	}	
}