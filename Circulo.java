public class Circulo{
  private float radio;  //Atributo

/**
*Constructor
*/
public Circulo(){}
/**
*Perimetro del circulo
*@return  Perimetro del circulo
*/
public float perimetro(){
  return 2*(float)Math.PI*radio;
}
/**
*Area del circulo
*@return Area del circulo
*/
public float area(){
  return (float)Math.PI*radio*radio;
}
/**
*Getter radio.
*@return  radio: radio del circulo
*/
public float getRadio(){
  return radio;
}
/**
*Setter radio
*@param radio Flotante equivalente al radio de un circulo
*/
public void setRadio(float radio){
  if(radio<0){
    this.radio=Math.abs(radio);
  }else{
  this.radio=radio;
  }
}
@Override
public String toString(){
  return "Circulo{radio="+radio+"}";
}

}