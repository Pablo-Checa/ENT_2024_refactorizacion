package ejercicio3;

public abstract class CalculadoraImpuestos {
	
/**
 * Atributos estáticos los cuales nos ayudarán a identificar el tipo de impuesto.
 */
	public static final int TIPO_IVA = 1000; //Siempre es mejor crear estas variables a usar Strings, ya que son inestables.
	public static final int TIPO_ISR = 2000;
	public static final int TIPO_IEPS = 3000;
	
	/**
	 * 
	 * @param ingresos Indica los ingresos que tiene el usuario.
	 * @param tipoImpuesto Indica el tipo de impuesto que se le pone al usuario. 
	 * @return Devuelve el calculo del impuesto, utilizando las operaciones necesarias para cada tipoImpuesto.
	 * @throws Exception En caso de que el impuesto no sea válido.
	 */
	public abstract double calcularImpuestoTotal(double ingresos, int tipoImpuesto) throws Exception;

}
