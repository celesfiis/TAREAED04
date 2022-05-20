package cuentas;

/**
 *
 * @author Celeste
 */
public class CCuenta {
    
// Propiedades de la Clase Cuenta

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /** Constructor sin argumentos
     *
     */
    public CCuenta()
    {
    }

    /** Constructor con parámetro para iniciar todas las propiedades de la clase
     *
     * @param nom  Nombre del cliente de la cuenta
     * @param cue  Número de la cuenta del cliente
     * @param sal  Saldo actual en la cuenta
     * @param tipo  Tipo de interés a aplicar a la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**Método que me devuelve el saldo disponible en cada momento
     *
     * @return 
     */
    public double estado()
    {
        return getSaldo();
    }

    /**Método para ingresar cantidades en la cuenta. Modifica el saldo.
     *
     * @param cantidad  
     * Dinero a ingresar en cuenta
     * @throws Exception  
     * Controlamos que no se introduzcan cantidades negativas
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /** Método para retirar cantidades en la cuenta. Modifica el saldo.
     *
     * @param cantidad  
     * Dinero a sacar de la cuenta
     * @throws Exception  
     * Controlamos que no se retiren cantidades negativas ni superiores al saldo
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /** Nos devuelve el nombre
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /** Asignamos nombre
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**Nos devuelve el número de cuenta
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /** Asignamos el número de la cuenta
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /** Nos devuelve el valor del saldo
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /** Asignamos el valor al saldo
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /** Nos devuelve el tipo de interés
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /** Asignamos el valor del tipo de interés
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
