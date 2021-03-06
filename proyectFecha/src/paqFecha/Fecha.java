/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqFecha;

/**
 *
 * @author alumno
 */
public class Fecha {
    
    private int dia;
    private int mes;
    private int year;
    private static int diasMeses[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
    private final static String nombreMeses[]={"","Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
    
    public Fecha(int dia, int mes, int year) throws IllegalArgumentException {
        if (!Fecha.fechaCorrecta(dia,mes,year)){                
             throw new IllegalArgumentException("Error, fecha incorrecta");
        }
            this.dia = dia;
            this.mes = mes;
            this.year = year;
        }   
    

    public Fecha() { this(1,1,1900);
    }
    public Fecha(Fecha other){ this(other.dia, other.mes, other.year);}

    public int getDia() {
        return this.dia;
    }

    public int getMes() {
        return this.mes;
    }

    public int getYear() {
        return this.year;
    }

    public void setDia(int dia) throws IllegalArgumentException {
        if (!Fecha.fechaCorrecta(dia,this.mes,this.year))
           throw new IllegalArgumentException("Error, el día no es correcto");
        else
        this.dia=dia;           
    }

    public void setMes(int mes) throws IllegalArgumentException {
        if (!Fecha.fechaCorrecta(this.dia,mes,this.year))
           throw new IllegalArgumentException("Error, el mes no es correcto");
        this.mes=mes;         
    }

    public void setYear(int year) throws IllegalArgumentException {
       if (!Fecha.fechaCorrecta(this.dia,this.mes,year))
           throw new IllegalArgumentException("Error, el año no es correcto");
        this.year=year;        
    }
    
    public void setFecha(int dia, int mes, int year)throws IllegalArgumentException {
        if (!Fecha.fechaCorrecta(dia,mes,year))
           throw new IllegalArgumentException("Error, fecha incorrecta");
        this.dia=dia;
        this.mes=mes;
        this.year=year;
    }
    public void setFecha(Fecha other){
        this.setFecha(other.dia, other.mes,other.year);
    }
    
    public boolean equals(int dia,int mes, int year){
        if (this.dia==dia && this.mes==mes && this.year==year) return true;
        else return false;
    }
    public boolean equals(Fecha other){
        return this.equals(other.dia, other.mes, other.year);
    }

    @Override
    public String toString(){
        return "";
    }
     public String toString(int x) {
        String cadena=null; 
        String dia="";
        if (this.dia>9) dia=Integer.toString(this.dia);
        else dia="0"+Integer.toString(this.dia);
        
        String mes=(this.mes>9)?Integer.toString(this.mes):"0"+Integer.toString(this.mes);
        
        String year2=Integer.toString(this.year).substring(2);
        
        switch(x){
            case 1: cadena=dia + "-" + mes + "-" + year2; break;
            case 2: cadena=dia + "-" + mes + "-" + this.year; break;
            case 3: cadena=dia+"-"+Fecha.nombreMeses[this.mes]+"-"+this.year; break;
            case 4: cadena=dia+"-"+Fecha.nombreMeses[this.mes]+"-"+year2; break;
            case 5: cadena=dia + "/" + mes + "/" + year2; break;
            case 6: cadena=dia + "/" + mes + "/" + this.year;
        }   
            return cadena;
     }
     
    @Override
     public Fecha clone(){
         return new Fecha(this);     
    }
     
    @Override
    public void finalize(){
        System.out.println("Se ha destruido la fecha= "+this.toString(1));
    } 
     
    public static boolean bisiesto(int anio){
        if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
                return true;
        else return false;
    }
    
    private static boolean fechaCorrecta(int dia,int mes,int year){
        boolean esCorrecta=false;
        if ((mes>0 && mes<13) && year>=1900){
            if (Fecha.bisiesto(year)) Fecha.diasMeses[2]=29;
            if (dia>0 && dia<=Fecha.diasMeses[mes]) {
                Fecha.diasMeses[2]=28;
                esCorrecta=true;
            }           
        }
        return esCorrecta;        
    }
    
    public int toDias()
    {
        int totalDias=this.dia;
        if (Fecha.bisiesto(this.year)) Fecha.diasMeses[2]=29;
        for(int i=0;i<this.mes-1;i++) totalDias+=Fecha.diasMeses[i];
        if (this.year>1900){
            totalDias+=(this.year-1901)*365;
            int contBisiestos=0;
            for (int i=1900;i<this.year;i++)
            {
                if (Fecha.bisiesto(i)) contBisiestos++;
            }
            totalDias+=contBisiestos;
        }
        Fecha.diasMeses[2]=28;
        return totalDias;
    }
    
    public Fecha fechaMayor(Fecha other){
      if (this.toDias() > other.toDias())
          return new Fecha(this);
      else
          return new Fecha(other);
    }
    
    public Fecha fechaMenor(Fecha other){
        if (this.toDias() < other.toDias()) 
            return new Fecha(this);
        else
            return new Fecha(other);
    }
   
    public int diasEntreFechas(Fecha other){
        int diasFechaActual=this.toDias();
        int diasFechaOther=other.toDias();
        return diasFechaActual - diasFechaOther;
    }
    
    public Fecha fechaSiguiente(){
        Fecha f=new Fecha(this);
        f.dia++;
        if (bisiesto(f.year)) Fecha.diasMeses[2]=29;
        
        if (f.dia > Fecha.diasMeses[f.mes])
        {
            f.dia=1;
            f.mes++;
            if (f.mes>12){
                f.mes=1;
                f.year++;
            }    
         }
        Fecha.diasMeses[2]=28;
        return f;
        }
        
    public Fecha fechaAnterior()throws IllegalArgumentException {
        Fecha f=new Fecha(this);
        if (f.dia==1 && f.mes==1 && f.year==1900) throw new IllegalArgumentException("Error, fecha incorrecta");
        f.dia--;
        if (Fecha.bisiesto(f.year)) Fecha.diasMeses[2]=29;
        
        if (f.dia ==0)
        {
            if (f.mes==1) 
            {
                f.dia=31;
                f.mes=12;
                f.year--;
            }
            else
            {
               f.dia=Fecha.diasMeses[f.mes -1];
               f.mes--;
            }   
        }    
        Fecha.diasMeses[2]=28;
        return f;
   }
 
    public void addAnios(int cant){
        this.year+=cant;
    }
    
    public void addMeses(int cant){
        int y=(this.mes + cant)/12;
        this.addAnios(y);
        this.mes+=(this.mes+cant)%12;        
    }
    
    
}
