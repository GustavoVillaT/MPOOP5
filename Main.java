/**
* @author BRIGADA 4
*/


public class Main {
  public static void main(String[] args) {
    Circulo cir = new Circulo();
    System.out.println(cir);
    cir.setRadio(5.6f);  //->primera solucion
    System.out.println(cir);
    cir.setRadio((float)7.33);
    System.out.println(cir);
    float var=-8.66f;
    cir.setRadio(var);
    System.out.println(cir);
    System.out.println("##############Composicion##############");
    Persona persona1=new Persona();
    System.out.println(persona1);
    persona1.setNombre("Susana");
    persona1.setApellido("Vazquez");
    Fecha fecha=new Fecha(2,1,2021);
    persona1.setFNacimiento(fecha);
    System.out.println(persona1);
    System.out.println(persona1.getfNacimiento().getanio());
    System.out.println("##############Composicion2##############");
    Persona persona2=new Persona("Rafel","Zavala",5,11,2001);
    System.out.println(persona2);
    System.out.println("##############Actividad extra##############");
    Persona persona3=new Persona("Sebastian","Vazquez",9,5,2002);
    Persona persona4=new Persona("Legle","Lopez",2,9,2002);
    Coche coche1=new Coche("Audi",2016,"Negro",4,true,400,persona1,persona2,persona3,persona4);
    System.out.println(coche1);
    Coche coche2=new Coche("BMW",2018,"Azul",4,false,350,"Sebastian","Varela",2,5,2002,"Legle","Escanuela",5,10,2003,"Alejandro","Villasenor",11,6,2002,"Gustavo","Villa",8,11,2001);
    System.out.println(coche2);
  }
}