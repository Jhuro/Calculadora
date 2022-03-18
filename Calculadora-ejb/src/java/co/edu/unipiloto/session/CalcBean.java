/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.session;

import javax.ejb.Stateless;

/**
 *
 * @author jupbc
 */
@Stateless
public class CalcBean implements CalcBeanLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    @Override
    public Integer suma(int a, int b) {
        return a+b;
    }

    @Override
    public Integer multiplicar(int a, int b) {
        return a*b;
    }

    @Override
    public Integer restar(int a, int b) {
        return a-b;
    }

    @Override
    public Integer dividir(int a, int b) {
        return a/b;
    }

    @Override
    public Integer modulo(int a, int b) {
        return a%b;
    }

    @Override
    public Integer elevarAlCuadrado(int a) {
        return a*a;
    }
}
