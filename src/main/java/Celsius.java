
public class Celsius extends Temperatura{
    //CONTRUTOR
    public Celsius (double graus) {
        super(graus);
    }
    
    //CONVERTER PARA KELVIN
    public double paraKelvin(){
        return getGraus()+273.15;
    }
    
    //CONVERTER PARA FAHRENHEIT
    public double paraFarenheit(){
        return (getGraus()*9/5)+32;
    }
}
