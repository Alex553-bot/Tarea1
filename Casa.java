
public class Casa{
    private char llave;
    private boolean abrirPuerta;
    private String color;
    private int nroHabitaciones;
    private String propietario;
    
    /*
     * abrirPuerta se refiere si se deja entrar a cualquiera a la casa o necesita un acceso para poder ingresar
     */

    public Casa(String propietario, char llave, boolean abrirPuerta, String color, int nroHabitaciones){
        this.propietario = propietario;
        this.llave = llave;
        this.color = color;
        this.nroHabitaciones = nroHabitaciones;
        this.abrirPuerta = abrirPuerta;
    }

    public boolean puedeEntrar(char llave){
        boolean entraConLlave;
        boolean logroIngresar;

        entraConLlave = (this.llave == llave);
        logroIngresar = entraConLlave || abrirPuerta;

        return logroIngresar;
    }

    public String nroPersonasViven()
    {
        String respuesta;

        respuesta = "El numero de personas que pueden vivir en la casa son: " + nroHabitaciones;

        return respuesta;
    }
    
    public String compararCasas(Casa casa2){
        String compara;
        
        compara = "La casa de " + getPropietario() + " es de color " + getColor() + ", mientras que la de " + casa2.getPropietario() + " es de color " + casa2.getColor();
        
        return compara;
    }

    //propietario
    public void setPropietario(String propietario){
        this.propietario = propietario;
    }
    
    public String getPropietario(){
        return propietario;
    }

    //llave
    public char getLlave(){
        return llave;
    }

    public void setLlave(char llave){
        this.llave = llave;
    }

    //Abrir Puerta
    public void setAbrirPuerta(boolean abrirPuerta){
        this.abrirPuerta = abrirPuerta;
    }

    public boolean getAbrirPuerta(){
        return abrirPuerta;
    }

    //color 
    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    //nroHabitaciones
    public void setNroHabitaciones(int nroHabitaciones){
        this.nroHabitaciones = nroHabitaciones;
    }

    public int getNroHabitaciones(){
        return nroHabitaciones;
    }
}
