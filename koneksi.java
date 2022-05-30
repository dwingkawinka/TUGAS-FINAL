/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apk_restoran;

import java.sql.connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.swing.JoptionPane;


/**
 *
 * @author HP
 */
public class koneksi {
    private String url="jdbc:mysql://localhost/db_penjualan";
    private String username_xampp = "root";
    private String password_xampp = "";
    private connection con;
    
    public void connect() throws SQLException{
        try(
            con = DriverManager.getConnection(url, username_xampp, password_xampp);
            System.out.println ("Koneksi Berhasil");
        ) catch (Exception e) {
                joptionPane showMessageDialog(null,e.getMassage());
                }
    }
    
    public connection getCon(){
        return con;
    } 
}
