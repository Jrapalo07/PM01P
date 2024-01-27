package Configuracion;

public class Transacciones
{
    // NOmbre de la base de datos
    public static final String DBName = "PM012024";

    // Creacion de las tablas de base de datos
    public static final String TablePersonas = "personas";

    // crecion de los campos de la base de datos
    public static final String id  = "id";
    public static final String nombres  = "nombres";
    public static final String apellidos  = "apellidos";
    public static final String edad  = "edad";
    public static final String correo  = "correo";

    // DDL para poder crear el create

    public static final String CreateTablePersonas = "Create Table "+ TablePersonas +" ("+
            "id INTEGER PRIMARY KEY AUTOINCREMENT, nombres TEXT, apellidos TEXT, edad INTEGER, "+
            "correo TEXT )";

    //DDL DROP

    public static final String DropTablePersonas = "DROP TABLE IF EXIST "+ TablePersonas;

    //DML

    public static final String SelectAllPersonas = "SELECT * FROM " + TablePersonas;

}
