
public class Bebida {
	private String bebida;
	private float precio;
	
	public Bebida(String bebida, float precio) {
		this.bebida = bebida;
		this.precio = precio;
	}
	
	
	//SobreCarga de Constructores  (En este caso no se usa)
	public Bebida() {
		this.bebida = bebida;
		this.precio = precio;
		}

	
	public float getPrecio() {
		return this.precio;
	}
	public String getBebida() {
		return this.bebida;
	}
	
	
	//Sobreescritura del metodo toString
	@Override
	public String toString() {
	  return "Servicio [ bebida= " + bebida + ", precio=" + precio + " ]";
	}	
	
	
	
	
}