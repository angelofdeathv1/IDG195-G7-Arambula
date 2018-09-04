package mx.cetys.arambula.angel.myfirstapp;

import com.google.gson.annotations.SerializedName;

public class Tutor {
    @SerializedName("Nombre")
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tutor{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
