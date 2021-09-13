package mvc.entity;

import javax.persistence.*;


import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import validaciones.CPostalPichincha;

@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@NotNull(message = "* campo requerido")
	@Pattern(regexp = "[a-zA-Z]+", message="* no valido")
	@Column(name="nombre")
	private String nombre;
	
	@NotNull(message = "* campo requerido")
	@Pattern(regexp = "[a-zA-Z]+", message="* no valido")
	@Column(name="apellido")
	private String apellido;
	
	@Min(value=18,message="No menores de 18 años")
	@Max(value=100,message="No mayores de 100 años")
	@NotNull(message = "* campo requerido")
	@Column(name="edad")
	private Integer edad;
	
	@NotNull(message = "* campo requerido")
	@Email(message = "* email no valido")
	@Column(name="email")
	private String email;
	
	@NotNull(message = "* campo requerido")
	@Pattern(regexp = "[0-9]{10}", message="* numero no valido")
	@Column(name="telefono")
	private String telefono;
	
	@NotNull(message = "* campo requerido")
	@Column(name="direccion")
	private String direccion;
	
	@Column(name="provincia")
	private String provincia;
	@Column(name="estado_civil")
	private String estadoCivil;
	
	@NotNull(message = "* campo requerido")
	@Pattern(regexp = "[0-9]{6}", message="Ingrese 6 valores numericos")
	@CPostalPichincha
	@Column(name="codigo_postal")
	private String codigoPostal;	

	public Usuario() {
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", email="
				+ email + ", telefono=" + telefono + ", direccion=" + direccion + ", provincia=" + provincia
				+ ", estadoCivil=" + estadoCivil + ", codigoPostal=" + codigoPostal + "]";
	}
	
}
