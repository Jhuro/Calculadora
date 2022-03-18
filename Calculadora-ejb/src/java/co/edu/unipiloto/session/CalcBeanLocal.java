/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.session;

import javax.ejb.Local;

/**
 *
 * @author jupbc
 */
@Local
public interface CalcBeanLocal {
    
    Integer suma(int a, int b);

    Integer multiplicar(int a, int b);

    Integer restar(int a, int b);

    Integer dividir(int a, int b);

    Integer modulo(int a, int b);

    Integer elevarAlCuadrado(int a);
    
}
