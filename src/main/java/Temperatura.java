
public class Temperatura {
    //ATRIBUTO PRIVADO PARA ARMAZENAR TEMP - CELSIUS
        private double tempCelsius;
        
        //CONSTRUTOR - CRIAR O OBJETO COM UMA TEMP INICIAL
        public Temperatura(double tempInicialCelsius){
            this.tempCelsius = tempInicialCelsius;
        }
            
            
        //GETTER = PARALER A TEMPERATURA
            public double
                    getTemperaturaCelsius(){
                        return tempCelsius;
       }
                    
        //SETTER - PARA MUDAR A TEMPERATURA
                    public void setTemperaturaCelsius(double mudarTempCelsius){
                        this.tempCelsius = mudarTempCelsius;
        }
        //MÉTODO PARA CONVERTER CELSIUS PARA FAHRENHEIT
               public double converteParaFahrenheit(){
                  return (tempCelsius*9/5)+32; 
        }
               
               //METODO PRA CONVERTER CESIUS PARA KELVIN
               public double converteParaKelvin(){
                   return tempCelsius+273.15;
        }
}
