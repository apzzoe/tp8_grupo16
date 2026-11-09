package ar.edu.unju.escmi.tp8.model;

import org.springframework.stereotype.Component;

@Component
public class Empresa {
	private int id;
	private String nombre;//nomre de la empresa
	private String rubro;// a que se dedica la empresa
	private boolean estado;//Activo, Inactivo
	private int cantidadEmpleados; //Nro de empleados de la empresa
	private int nroSedes; // cantidad de sedes
	private String telefono; //numero de contacto
	private String direccion; // ubicacion de la empresa
	
	
	public Empresa() {
		
	}
	
	public Empresa(int id, String nombre, String rubro, boolean estado, int cantidadEmpleados, int nroSedes, String telefono, String direccion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.rubro = rubro;
		this.estado = estado;
		this.cantidadEmpleados = cantidadEmpleados; 
		this.nroSedes= nroSedes;
		this.telefono = telefono; 
		this.direccion = direccion;
		
	}
	
	//ID
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	//NOMBRE
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//RUBRO
	public String getRubro() {
		return rubro;
	}

	public void setRubro(String rubro) {
		this.rubro = rubro;
	}
	
	//ESTADO
	public boolean getEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	//CANT EMPLEADOS
	public int getCantidadEmpleados() {
		return cantidadEmpleados;
	}

	public void setCantidadEmpleados(int cantidadEmpleados) {
		this.cantidadEmpleados = cantidadEmpleados;
	}

	//NRO DE SEDES
	public int getNroSedes() {
		return nroSedes;
	}

	public void setNroSedes(int nroSedes) {
		this.nroSedes = nroSedes;
	}

	//TELEFONO
	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	//DIRECCION
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Empresa [id=" + id + ", nombre=" + nombre + ", rubro=" + rubro + ", estado=" + estado + ", cantidada de empleados=" + cantidadEmpleados + ", Nro de sedes=" + nroSedes + ", telefono=" + telefono + ", direccion=" + direccion + "]";
	}
	
	

}
