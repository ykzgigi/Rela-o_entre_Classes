package RelacaoEntreClasses;

public class PrincipalAgreExercicio {

	public static void main(String[] args) {
		
		
		
		Departamento departamento = new Departamento("Finanças");
		Empresa empresa = new Empresa("InvestFair", departamento);
		
		
		System.out.println("A empresa é: " + empresa.getNome() + "\nDepartamento: " + empresa.getDepartamento());

	}

}
