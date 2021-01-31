package pe.ds.pagoapp.service;

import pe.ds.pagoapp.dto.PagoDto;

public class PagoService {
    
    public PagoDto procesarPago(PagoDto dto){
        //variables 
        double salario, asignacion, bono, ingresos, renta, salarioNeto;
        //proceso
        if (dto.getHorasTrabajadas() >= 160) {
            salario = 160 * dto.getPagoxHora();
        }else{
            salario = dto.getHorasTrabajadas() * dto.getPagoxHora();
        }
        
        asignacion = 60 * dto.getCantidadHijos();
        bono =0;
        if (dto.getHorasTrabajadas() >= 160) {
            bono = (dto.getHorasTrabajadas()-160)* dto.getPagoxHora()*2;
        }
        ingresos = salario + asignacion + bono;
        renta = 0;
        if (ingresos >=1500) {
            renta = ingresos * 0.08;
        }
        salarioNeto = ingresos - renta;
        //reporte
        dto.setSalario(salario);
        dto.setAsignacion(asignacion);
        dto.setBono(bono);
        dto.setIngresos(ingresos);
        dto.setRenta(renta);
        dto.setSalarioNeto(salarioNeto);
        
        return dto;
    }

}
