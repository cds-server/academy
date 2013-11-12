package com.edcore.security;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class MySqlConexion{
    
    private String server;
    private String port;
    private String user;
    private String password;
    private String bd;
    private Connection conexion;
    private Statement stmt;

    /**
     * Establece la Bade de datos a ser conectado
     */
    public MySqlConexion()
    {
        this.server = "200.78.237.214";
        this.bd = "edcore";
        this.port = "3306";
        this.user = "cds02";
        this.password = "123";
        this.conexion = null;
        this.stmt = null;
    }

    /**
     * Abre conexion a la Base de datos
     * @return 
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public Connection open() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.jdbc.Driver");
        conexion = DriverManager.getConnection("jdbc:mysql://" + this.server + ":" + this.port + "/" + this.bd + "?useUnicode=true&characterEncoding=UTF-8", this.user, this.password);
        stmt = conexion.createStatement();
        return conexion;
    }
    /**
     * Cierra conexion a la Base de datos
     * @throws java.sql.SQLException
     */
    public  void close() throws SQLException
    {
        if (this.conexion != null)
            this.conexion.close();
        this.conexion = null;
    }
}
