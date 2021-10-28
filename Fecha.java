public class Fecha{
  private int dia;
  private int mes;
  private int anio;

/**
*Constructor con todos los datos
*@param dia Dia de la fecha 
*@param mes Mes de la fecha
*@param año de la fecha
*/
  public Fecha(){}
  public Fecha(int dia, int mes, int anio){
    this.dia=dia;
    this.mes=mes;
    this.anio=anio;
  }
  /**
*Getter Dia.
*@return  dia: Dia de la fecha
*/
  public int getDia(){
    return dia;
  }
/**
*Setter Dia
*@param dia Recibe el dia de la fecha (int)
*/
  public void setDia(int dia){
    if(dia>31 || dia<1){
      System.out.println("Error, dia incorrecto");
    }else{
      this.dia=dia;
    }
  }
/**
*Getter Mes.
*@return  mes: Mes de la fecha
*/
  public int getMes(){
    return mes;
  }
  /**
*Setter Mes
*@param mes Recibe el mes de la fecha (int)
*/
  public void setMes(int mes){
    if(mes<1 || mes>12){
      System.out.println("Error, mes incorrecto");
    }else{
      this.mes=mes;
    }
  }
  /**
*Getter año.
*@return getanio: Año de la fecha
*/
  public int getanio(){
    return anio;
  }
/**
*Setter año
*@param anio Recibe el año de la fecha (int)
*/
  public void setAnio(int anio){
    if(anio<0){
      System.out.println("Error, no puede haber años negativos");
    }else{
    this.anio=anio;
    }
  }
  @Override
  public String toString(){
    return "Fecha{dia="+dia+" mes="+mes+" anio="+anio+"}";
  }

}