package com.parkus.propertyplaceholder;

public class MyDAO {
    
    private String dbServer;
    private String dbUser;
    private String dbPass;

    MyDAO(String dbServer, String dbUser, String dbPass) {
        this.dbServer = dbServer;
        this.dbUser = dbUser;
        this.dbPass = dbPass;
    }

    @Override
    public String toString() {
        return "MyDAO [dbServer=" + dbServer + ", dbUser=" + dbUser + ", dbPass=" + dbPass + "]";
    }

}
