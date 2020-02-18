/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jem.firstee.bus;

import javax.ejb.Stateless;

/**
 *
 * @author james
 */
@Stateless
public class DoubleServer {

    public Integer doubler(Integer num) {
        return num * 2;
    }
}
