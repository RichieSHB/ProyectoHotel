/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import controlMySQL.MySqlConn;

/**
 *
 * @author gama5
 */
public class main {
    MySqlConn objconn = new MySqlConn();

    public main() {
        //new Ventana().setVisible(true);
        //new Login(objconn).setVisible(true);
        new Portada(objconn).setVisible(true);
    }
    
    
    
    public static void main(String[] args) {
        new main();
    }

}

//hola como estas?
//Hola soy Chocotecocolor 