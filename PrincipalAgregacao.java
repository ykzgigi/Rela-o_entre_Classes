package RelacaoEntreClasses;

public class PrincipalAgregacao {

	public static void main(String[] args) {
		
		
		Motor motor = new Motor("V8");
		Carro carro = new Carro("Mustang", motor);
		
		System.out.println("O Carro é: " + carro.getModelo() + "\nMotor: " + motor.getTipo());

	}

}
