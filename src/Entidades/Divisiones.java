/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;
import Conexion.ConexionBase;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Usuario
 */
public class Divisiones {
    int iddivision;
    int idcursos;
    int idpreceptor;
    int idturno;
    String nombredivision;
    int idaula;
    
    public Divisiones(int iddivision, int idcursos, int idpreceptor, int idturno, String nombredivision, int idaula) {
        this.iddivision = iddivision;
        this.idcursos = idcursos;
        this.idpreceptor = idpreceptor;
        this.idturno = idturno;
        this.nombredivision = nombredivision;
        this.idaula = idaula;
    }
     public Divisiones(int idcursos, int idpreceptor, int idturno, String nombredivision, int idaula) {
        this.idcursos = idcursos;
        this.idpreceptor = idpreceptor;
        this.idturno = idturno;
        this.nombredivision = nombredivision;
        this.idaula = idaula;
    }

    public int getIddivision() {
        return iddivision;
    }

    public void setIddivision(int iddivision) {
        this.iddivision = iddivision;
    }

    public int getIdcursos() {
        return idcursos;
    }

    public void setIdcursos(int idcursos) {
        this.idcursos = idcursos;
    }

    public int getIdpreceptor() {
        return idpreceptor;
    }

    public void setIdpreceptor(int idpreceptor) {
        this.idpreceptor = idpreceptor;
    }

    public int getIdturno() {
        return idturno;
    }

    public void setIdturno(int idturno) {
        this.idturno = idturno;
    }

    public String getNombredivision() {
        return nombredivision;
    }

    public void setNombredivision(String nombredivision) {
        this.nombredivision = nombredivision;
    }

    public int getIdaula() {
        return idaula;
    }

    public void setIdaula(int idaula) {
        this.idaula = idaula;
    }
    
     public void registrarDivision(){
         
        try {
            Connection base=con.getConection();
            
            PreparedStatement valores=base.prepareStatement("INSERT INTO divisiones (iddivision, idcursos, idpreceptor, idturno, nombredivision, idaula)"
                    + " VALUES (?,?,?,?,?,?)");
            valores.setInt(1,iddivision);
            valores.setInt(2,idcursos);
            valores.setInt(3,idpreceptor);
            valores.setInt(4,idturno);
            valores.setString(5,nombredivision);
            valores.setInt(6,idaula);
            valores.executeUpdate();
             JOptionPane.showMessageDialog(null,"Se registro la Division con exito");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex);;
        }
    
}
