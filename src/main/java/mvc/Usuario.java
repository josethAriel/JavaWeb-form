package mvc;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import validaciones.CPostalPichincha;

public class Usuario {

	@NotNull(message = "* campo requerido")
	@Pattern(regexp = "[a-zA-Z]+", message="* no valido")
	private String nombre;
	
	@NotNull(message = "* campo requerido")
	@Pattern(regexp = "[a-zA-Z]+", message="* no valido")
	private String apellido;
	
	@Min(value=18,message="No menores de 18 años")
	@Max(value=100,message="No mayores de 100 años")
	@NotNull(message = "* campo requerido")
	private Integer edad;
	
	@NotNull(message = "* campo requerido")
	@Email(message = "* email no valido")
	private String email;
	
	@NotNull(message = "* campo requerido")
	@Pattern(regexp = "[0-9]{10}", message="* numero no valido")
	private String telefono;
	
	@NotNull(message = "* campo requerido")
	private String direccion;
	
	private String provincia;
	private String estadoCivil;
	
	@NotNull(message = "* campo requerido")
	@Pattern(regexp = "[0-9]{6}", message="Ingrese 6 valores numericos")
	@CPostalPichincha
	private String codigoPostal;
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
}
