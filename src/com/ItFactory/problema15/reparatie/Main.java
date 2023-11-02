package com.ItFactory.problema15.reparatie;

import com.ItFactory.problema15.componente.CutieDeViteze;
import com.ItFactory.problema15.componente.Motor;

public class Main {
    public static void main(String[] args) {
        Reparatie reparatie=new Reparatie();
        CutieDeViteze cutieDeViteze=new CutieDeViteze();
        Motor motor=new Motor();

        double costFinal=0;
        reparatie.setMarcaProductie("opel");
        reparatie.setCostReparatie(15000.50);
        cutieDeViteze.setMarcaProducitie("opel");
        motor.setMarcaProductie("audi");
        cutieDeViteze.setAutomata(true);

        reparatie.setMotor(motor);
        reparatie.setCutieDeViteze(cutieDeViteze);

        if(reparatie.verificareMarcaProductie()==true && reparatie.verificareMarcaProductie2()==true){
            System.out.println(reparatie.getCostReparatie());
            if(cutieDeViteze.isAutomata()){
                costFinal=reparatie.getCostReparatie()+2150.75;
                System.out.println(costFinal);
            }else{
                System.out.println(reparatie.getCostReparatie());
            }
        }else{
            System.out.println("Costul de productie nu poate fi stabilit.Componente gresite");
        }



    }
}
