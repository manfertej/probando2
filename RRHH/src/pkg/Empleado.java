package pkg;



public class Empleado {

	public float calculoNominaBruta(TipoEmpleado tipo, float ventasMes, float horasExtra) {
		
		float salario = 0;
		
		if (tipo == TipoEmpleado.Vendedor) salario = 2000;
		if (tipo == TipoEmpleado.Encargado) salario  = 2500;
		
		if(ventasMes > 1000 && ventasMes < 1500) {
			salario += 100;
		}
		if (ventasMes >= 1500) {
			salario += 200;
		}
		
		salario += horasExtra*30;
		
		return salario;
	}
	
	
	
	public float calculoNominaNeta(float nominaBruta) {
		
		float retencion = 0;
		
		if (nominaBruta < 2100) {
			retencion = 0;
		}
		
		if (nominaBruta < 2500) {
			retencion = 0.15f;
		}
		
		if (nominaBruta > 2500) {
			retencion = 0.18f;
		}
		
		return nominaBruta*(1-retencion);
	}
	
}
