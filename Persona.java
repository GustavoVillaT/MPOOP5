public class Persona{
  //Atributos
  private String nombre;
  private String apellido;
  private Fecha fNacimiento;
  //Constructores
  /**
*Constructor vacio
*/
  public Persona(){}
/**
*Constructor
*@param nombre Recibe el nombre
*@param apellido Recibe el apellio de la persona
*@param dia Recibe el dia de nacimiento de la persona
*@param mes Recibe el mes de nacimiento de la persona
*@param anio Recibe el año de nacimiento de la persona
*/
  public Persona(String nombre,String apellido,int dia,int mes, int anio){
    this.nombre=nombre;
    this.apellido=apellido;
    /*   //Opcion1
    fNacimiento=new Fecha();
    this.fNacimiento.setDia(dia);
    this.fNacimiento.setMes(mes);
    this.fNacimiento.setAnio(anio);
    */
    //Opcion2
    fNacimiento=new Fecha(dia,mes,anio);
  }
/**
*Constructor
*@param nombre Recibe el nombre
*@param apellido Recibe el apellio de la persona
*@param fNacimiento Recibe la fecha de nacimiento de la presona
*/
  public Persona(String nombre,String apellido, Fecha fNacimiento){
    this.nombre=nombre;
    this.apellido=apellido;
    this.fNacimiento=fNacimiento;
  }
    //Metodos
    /**
*Getter nombre.
*@return  nombre: Nombre de la persona
*/
  public String getNombre(){
    return nombre;
  }
  /**
*Setter Nombre
*@param nombre Recibe el nombre  de la persona
*/
  public void setNombre(String nombre){
    this.nombre=nombre;
  }
      /**
*Getter apellido.
*@return  apellido: apellido de la persona
*/
  public String getApellido(){
    return apellido;
  }
/**
*Setter Apellido
*@param apellido Recibe el apellido de la persona
*/
  public void setApellido(String apellido){
    this.apellido=apellido;
  }
/**
*Getter Fecha de nacimiento.
*@return  fNacimiento: Fecha de nacimietno de la persona 
*/
  public Fecha getfNacimiento(){
    return fNacimiento;
  }
/**
*Setter Fecha de nacimietno
*@param fNacimiento Recibe la fecha de nacimiento de la persona
*/
  public void setFNacimiento(Fecha fNacimiento){
    this.fNacimiento=fNacimiento;
  }


  @Override
  public String toString(){
    return "Persona{nombre="+nombre+" apellido="+apellido+" fNacimiento="+fNacimiento+"}";
  }
}