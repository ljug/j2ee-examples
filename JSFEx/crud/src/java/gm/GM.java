/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gm;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author pascalfares
 */
public class GM {

    public static DataSource getTestDB() throws NamingException {
        Context c = new InitialContext();
        return (DataSource) c.lookup("java:comp/env/jdbc/TestDB");
    }
    
}
