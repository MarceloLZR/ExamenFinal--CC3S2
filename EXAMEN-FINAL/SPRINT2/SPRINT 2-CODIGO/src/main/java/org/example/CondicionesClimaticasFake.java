
package org.example;

public class CondicionesClimaticasFake {
    private TemperaturaStub temperatura;
    private LluviaStub lluvia;
    private VientoStub viento;

    public CondicionesClimaticasFake(int tempValor, int lluviaValor, int vientoValor) {
        this.temperatura = new TemperaturaStub(tempValor);
        this.lluvia = new LluviaStub(lluviaValor);
        this.viento = new VientoStub(vientoValor);
    }

    public void verificarCondiciones() {
        if (temperatura.esMayorQue()) {
            System.out.println("Alerta: Temperatura Alta!");
        }
        if (lluvia.esMayorQue()) {
            System.out.println("Alerta: Lluvia Intensa!");
        }
        if (viento.esMayorQue()) {
            System.out.println("Alerta: Viento Fuerte!");
        }
    }
}
