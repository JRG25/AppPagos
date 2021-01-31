/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.ds.pagoapp.prueba;

import pe.ds.pagoapp.dto.PagoDto;
import pe.ds.pagoapp.service.PagoService;

/**
 *
 * @author S145-15API-R5
 */
public class Prueba01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PagoDto dto = new PagoDto(180, 60, 2);
        
        PagoService service = new PagoService();
        
        dto = service.procesarPago(dto);
        
        //reporte
        System.out.println(""+dto.getSalario()); 
        System.out.println(""+dto.getAsignacion());
        System.out.println(""+dto.getBono());
        System.out.println(""+dto.getIngresos());
        System.out.println(""+dto.getRenta());
        System.out.println(""+dto.getSalarioNeto());
        
    }
    
}
