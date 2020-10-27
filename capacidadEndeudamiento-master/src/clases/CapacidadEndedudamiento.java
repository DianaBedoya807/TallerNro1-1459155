package clases;

public class CapacidadEndedudamiento {
    private Integer ingresosTotales;
    private Integer gastosFijos;
    private Integer gastoVaribales;

    final double POR_FIJO = 0.35;

    public CapacidadEndedudamiento(Integer ingresosTotales, Integer gastosFijos, Integer gastoVaribales) {
        this.ingresosTotales = ingresosTotales;
        this.gastosFijos = gastosFijos;
        this.gastoVaribales = gastoVaribales;
    }

    //Metodos getter and setter para la clase
    public Integer getIngresosTotales() {
        return this.ingresosTotales;
    }
    public void setIngresosTotales(Integer ingresosTotales) {
        this.ingresosTotales = ingresosTotales;
    }

    public Integer getGastosFijos() {
        return this.gastosFijos;
    }
    public void setGastosFijos(Integer gastosFijos) {
        this.gastosFijos = gastosFijos;
    }

    public Integer getGastoVaribales() {
        return this.gastoVaribales;
    }
    public void setGastoVaribales(Integer gastoVaribales) {
        this.gastoVaribales = gastoVaribales;
    }

    //Construye un metodo que retorne una cadena con las propiedades de la clase

    public String getCapacidadEndeudamiento(Integer ingresosTotales, Integer gastoVaribales, Integer gastosFijos) {
        // retornar la capacidad de endeudamiento puede ser una cadena con el valor
        String valor;
        int deducido = ingresosTotales - (gastoVaribales + gastosFijos);
        System.out.println("Valor Total: " + deducido);
        Double capEnd = (double) (deducido * 0.35D);
        if (capEnd > 0.0D) {
            valor = "La Capacidad de Endeudamiento Es: " + capEnd;
        } else {
            valor = "La Capacidad de Endeudamiento es Insuficiente.";
        }

        return valor;
    }
}
