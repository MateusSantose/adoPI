/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemapadaria.dao;

import com.mycompany.sistemapadaria.models.RelatorioSintetico;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author eduardo.mcjesus
 */
public class RelatorioSinteticoDAO {
     public static String url = "jdbc:mysql://localhost:3306/sistemaPadaria";
    public static String usuario = "root";
    public static String senha = "";
    
    public static ArrayList<RelatorioSintetico> listarPorPeriodo(Date dtInicio, Date dtTermino){
        Connection conexao = null;
        ResultSet rs = null;
        
        try {
            
        }catch(Exception e){       
        }
        
        
    }
}
