package HospitalBercario;

import java.util.Collection;

public class TestaHospital {

	public static void main(String[] args) {

		Hospital hospital = new Hospital(02, "Hospital Maternidade Nova");
		System.out.println(hospital.toString());

		Unidade unidade = new Unidade(02, "Unidade Santa Nova", 1232);
		System.out.println(unidade.toString());

		Mamae mamae = new Mamae(02, "Florinda Matos", "MG", "21 909090900", "08/08/80");
		System.out.println(mamae);
		
		Baby babys = new Baby(02, "Baby beef", "30/08/2001", 30.5, 1.30);
		System.out.println(babys);

	}

}
