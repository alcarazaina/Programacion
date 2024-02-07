package segunda_evaluacion.tema06colecciones.poo.ejerciciosuml.eltacondeoro;

public class Pedido {

    private Socio socio;
    public boolean comprobarTarjeta() {
        boolean valida = false;
        if(socio.getTarjeta().equals("")){
            valida = true;
        }
        return valida;
    }
}
