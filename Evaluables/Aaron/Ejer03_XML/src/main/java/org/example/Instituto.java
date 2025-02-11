package org.example;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.io.Serializable;
import java.util.List;
@XStreamAlias("instituto")
public class Instituto implements Serializable {

    private String nombre;
    @XStreamImplicit(itemFieldName="persona")
    List<Persona> persona;

    public Instituto(String nombre, List<Persona> persona) {
        this.nombre = nombre;
        this.persona = persona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Persona> getPersona() {
        return persona;
    }

    public void setPersona(List<Persona> persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Instituto{" +
                "nombre='" + nombre + '\'' +
                ", persona=" + persona +
                '}';
    }
}
