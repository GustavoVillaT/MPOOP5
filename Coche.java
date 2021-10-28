class Coche{
//Seleción de atributos 
private String color;
private String marca;
private int numPuerta;
private int aniomod;
private int potencia;
private boolean automatico;
//ATRIBUTOS PERSONA
private Persona chofer;
private Persona copiloto;
private Persona pasajero1;
private Persona pasajero2;
private Fecha fecha; //Guardar fechas pivote
/**
*Constructor con todos los datos
*@param marca Marca del coche
*@param aniomod Año de creacion del coche
*@param color Color del coche
*@param numPuerta Numero de puertas del coche
*@param automatico Booleano si el coche es automatico
*@param potencia Potencia del coche(Entero)
*@param nombre Nombre del chofer(String)
*@param apellido  Apelldio del chofer(String)
*@param dia Dia de nacimiento del chofer(Int)
*@param mes Mes de nacimiento del chofer(int)
*@param año Año de nacimiento del chofer(int)
*@param nombre2 Nombre del copiloto(String)
*@param apellido2  Apelldio del copiloto(String)
*@param dia2 Dia de nacimiento del copiloto(Int)
*@param mes2 Mes de nacimiento del copiloto(int)
*@param año2 Año de nacimiento del copiloto(int)
*@param nombre3 Nombre del pasajero1(String)
*@param apellido3  Apelldio del pasajero1(String)
*@param dia3 Dia de nacimiento del pasajero1(Int)
*@param mes3 Mes de nacimiento del pasajero1(int)
*@param año3 Año de nacimiento del pasajero1(int)
*@param nombre4 Nombre del pasajero2(String)
*@param apellido4  Apelldio del pasajero2(String)
*@param dia4 Dia de nacimiento del pasajero2(Int)
*@param mes4 Mes de nacimiento del pasajero2(int)
*@param año4 Año de nacimiento del pasajero2(int)
*/
public Coche(String marca, int aniomod, String color, int numPuerta, boolean automatico, int potencia,String nombre,String apellido, int dia,int mes,int año,String nombre2,String apellido2, int dia2,int mes2,int año2,String nombre3,String apellido3, int dia3,int mes3,int año3,String nombre4,String apellido4, int dia4,int mes4,int año4){
  this.marca=marca;
  this.aniomod=aniomod;
  this.color=color;
  this.numPuerta=numPuerta;
  this.automatico=automatico;
  this.potencia=potencia;
  chofer=new Persona(nombre,apellido,fecha=new Fecha(dia,mes,año));
  copiloto=new Persona(nombre2,apellido2,fecha=new Fecha(dia2,mes2,año2));
  pasajero1=new Persona(nombre3,apellido3,fecha=new Fecha(dia3,mes3,año3));
  pasajero2=new Persona(nombre4,apellido4,fecha=new Fecha(dia4,mes4,año4));
}
/**
*Constructor con objetos
*@param marca Marca del coche
*@param aniomod Año de creacion del coche
*@param color Color del coche
*@param numPuerta Numero de puertas del coche
*@param automatico Booleano si el coche es automatico
*@param potencia Potencia del coche(Entero)
*@param chofer Objeto de tipo persona llamado Chofer
*@param copiloto Objeto de tipo persona llamado copiloto
*@param pasajero1 Objeto de tipo persona llamado pasajero1
*@param pasajero2 Objeto de tipo persona llamado pasajero2
*/
public Coche(){}
public Coche(String marca, int aniomod, String color, int numPuerta, boolean automatico, int potencia,Persona chofer,Persona copiloto, Persona pasajero1, Persona pasajero2){
this.marca=marca;
this.aniomod=aniomod;
this.color=color;
this.numPuerta=numPuerta;
this.automatico=automatico;
this.potencia=potencia;
this.chofer=chofer;
this.copiloto=copiloto;
this.pasajero1=pasajero1;
this.pasajero2=pasajero2;
}
/**
*Getter marca.
*@return  marca: nombre de la marca del coche
*/
public String getMarca(){
  return marca;
}
/**
*Setter marca.
*@param marca Recibe el modelo del coche(String)
*/
public void setMarca(String marca){
  this.marca=marca;
}
/**
*Getter marca.
*@return  aniomod: Año del coche(int)
*/
public int gedAniomod(){
  return aniomod;
}
/**
*Setter Año del modelo.
*@param aniomod Recibe el año del modelo del coche(int)
*/
public void setAniomod(int aniomod){
  if(aniomod<0){
    System.out.println("No, hay coches en años negativos");
  }else{
    this.aniomod=aniomod;
  }
/**
*Getter color.
*@return  color: Color del coche
*/
}
public String getColor(){
  return color;
}
/**
*Setter Color del coche.
*@param aniomod Recibe el color del coche(int)
*/
public void setColor(String color){
  this.color=color;
}
/**
*Getter Numero de puertas.
*@return  marca: regresa el numero de puertas
*/
public int getNumpuerta(){
  return numPuerta;
}
/**
*Setter Numero de puertas.
*@param numPuerta Recibe numero de puertas del coche(int)
*/
public void setNumpuerta(int numPuerta){
  this.numPuerta=numPuerta;
}
/**
*Getter Automatico.
*@return  automatico: Regresa si el coche es automatico o no
*/
public boolean getAutomatico(){
  return automatico;
}
/**
*Setter Automatico.
*@param aniomod Recibe si el coche es automatico o no(booleano)
*/
public void setAutomatico(boolean automatico){
  this.automatico=automatico;
}
/**
*Getter potencia.
*@return  potencia: Potencia del coche
*/
public int getPotencia(){
  return potencia;
}/**
*Setter Potencia del coche.
*@param potencia Recibe la potencia del coche(int)
*/
public void setPotencia(int potencia){
  this.potencia=potencia;
}
/**
*Getter chofer.
*@return  chofer: Datos personales del objeto chofer
*/
public Persona getChofer(){
  return chofer;
}
/**
*Setter chofer.
*@param chofer Recibe los datos del objeto chofer
*/
public void setChofer(Persona chofer){
  this.chofer=chofer;
}
/**
*Getter copiloto.
*@return  copiloto: Datos personales del objeto copiloto
*/
public Persona getCopiloto(){
  return copiloto;
}
/**
*Setter copiloto.
*@param copiloto Recibe los datos del objeto copiloto
*/
public void setCopiloto(Persona copiloto){
  this.copiloto=copiloto;
}
/**
*Getter pasajero1.
*@return  pasajero1: Datos personales del objeto pasajero1
*/
public Persona getPasajero1(){
  return pasajero1;
}
/**
*Setter Pasajero1.
*@param pasajero1 Recibe los datos del objeto pasajero1
*/
public void setPasajero1(Persona pasajero1){
  this.pasajero1=pasajero1;
}
/**
*Getter pasajero2.
*@return  pasajero2: Datos personales del objeto pasajero2
*/
public Persona getPasajero2(){
  return pasajero2;
}
/**
*Setter Pasajero2.
*@param pasajero2 Recibe los datos del objeto pasajero2
*/
public void setPasajero2(Persona pasajero2){
  this.pasajero2=pasajero2;
}
//Metodos viejos
/**
*Encender
*@return Mensaje que se refiere a que el coche esta encendido
*/
public void encender(){
  System.out.println("Soy el coche de la marca "+marca+"y estoy encendiendo");
}
/**
*Avanzar
*@param avanza Boleano con informacion del estado del coche
*@return Mensaje dependiendo del parametro
*/
public void avanzar(boolean avanza){
  if(avanza){
    System.out.println("Estoy avanzando a 10 km/h");
  }else{
    System.out.println("Voy a 0 km/h");
  }
}
/**
*Apagar
*@return Mensaje que se refiere a que el coche esta apagadose
*/
public void apagar(){
  System.out.println("Soy el coche de "+marca+" y estoy apagandome");
}
/**
*Frenado
*@param frena Recibe un boleano que define si el coche esta frenando
*@return Mensaje dependiendo del parametro
*/
public void frenar(boolean frena){
  if(frena){
    System.out.println("Estoy frenando");
  }else{
    System.out.println("No estoy frenando");
  }
}
/**
*Apagar
*@param numPuertaAbrir Numero de puertas a abrir 
*@return Mensaje dependiendo del parametro
*/
public void abrirpuertas(int numPuertaAbir){
if(numPuertaAbir>numPuerta){
  System.out.println("El numero de puertas a abrir es mayor al numero de puertas del coche");
}else{
  System.out.println("Abriendo "+ numPuertaAbir+" Puertas");
}
}


@Override
public String toString(){
  return "Coche{"+"+marca="+marca+", año="+aniomod+", color="+color+", numPuerta="+numPuerta+", automatico="+automatico+", potencia="+potencia+"Chofer="+chofer+" copiloto="+copiloto+" pasajero1="+pasajero1+" pasajero2="+pasajero2+"}";
}
}