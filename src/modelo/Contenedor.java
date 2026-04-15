package modelo;

// Clase que representa un contenedor del puerto DataBay.
// Se usa para guardar los datos básicos del manifiesto: id, peso y prioridad.
public class Contenedor{
    private String id;
    private double peso;
    private int prioridad;

    public Contenedor(String id, double peso, int prioridad) {
        this.id = id;
        this.peso = peso;
        this.prioridad = prioridad;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }
    public int getPrioridad() { return prioridad; }
    public void setPrioridad(int prioridad) { this.prioridad = prioridad; }

    @Override
    public String toString() {
        return "Contenedor{id='" + id + "', peso=" + peso + ", prioridad=" + prioridad + "}";
    }
}