/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DbBroker;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import model.Kristal;

/**
 *
 * @author Runelord
 */
public class DbBroker {
    
    Connection konekcija;
    
        public void uspostaviKonekciju() {
        try {
            Class.forName("org.postgresql.Driver");
            konekcija = DriverManager.getConnection("jdbc:postgresql://localhost:5432/kristal","kristal","kristal");
            System.out.println("USPESNO USPOSTAVLJENA KONEKCIJA!!!");
            konekcija.setAutoCommit(false);
        } catch (ClassNotFoundException ex) {
            System.out.println("Nepostojeci driver!");
        } catch (SQLException ex) {
            System.out.println("Neuspesno povezivanje na bazu podataka!Sifra");
        }
    }

    public void potvrdaTransakcije() {
        try {
            konekcija.commit();            
            System.out.println("TRANSAKCIJA POTVRDJENA!!!");
        } catch (SQLException ex) {
            System.out.println("Transakcija nije potvrdjena!");
        }
    }

    public void opozivTransakcije(){
        try {
            konekcija.rollback();
        } catch (SQLException ex) {
            System.out.println("Neuspesan opoziv transakcije!");
        }
    }

    public void zatvoriKonekciju() {
        try {    
                    
            konekcija.close();
            System.out.println("KONEKCIJA ZATVORENA!!!");
        } catch (SQLException ex) {
            System.out.println("Konekcija nije uspesno zatvorena!");
        }
    }
    
    public void promeniKristal(Kristal k) throws RuntimeException {
try {
String sql = "UPDATE kristal SET x1 = (?), x2 = (?), x3 = (?), x4 = (?), x5 = (?), x6 = (?), x7 = (?), x8 = (?), x9 = (?), x10 = (?), x11 = (?), x12 = (?) where id = (?)";
PreparedStatement sqlNaredba = konekcija.prepareStatement(sql);

sqlNaredba.setDouble(1, k.getX(0));
sqlNaredba.setDouble(2, k.getX(1));
sqlNaredba.setDouble(3, k.getX(2));
sqlNaredba.setDouble(4, k.getX(3));
sqlNaredba.setDouble(5, k.getX(4));
sqlNaredba.setDouble(6, k.getX(5));
sqlNaredba.setDouble(7, k.getX(6));
sqlNaredba.setDouble(8, k.getX(7));
sqlNaredba.setDouble(9, k.getX(8));
sqlNaredba.setDouble(10, k.getX(9));
sqlNaredba.setDouble(11, k.getX(10));
sqlNaredba.setDouble(12, k.getX(11));

sqlNaredba.setDouble(13, k.getId());

sqlNaredba.executeUpdate();//Izvrsava naredbu i unosi novi red u bazu podataka
sqlNaredba.close();//naredba se zatvara, to je pravilo
} catch (SQLException ex) {
ex.printStackTrace();//govori gde se desila greska ako do nje dodje
throw new RuntimeException("Korisnik isn't updated!");
}

}

    public void dodajKristal(int id) throws RuntimeException {
try {
String sql = "INSERT INTO kristal VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
PreparedStatement sqlNaredba = konekcija.prepareStatement(sql);

sqlNaredba.setDouble(1, 0);
sqlNaredba.setDouble(2, 0);
sqlNaredba.setDouble(3, 0);
sqlNaredba.setDouble(4, 0);
sqlNaredba.setDouble(5, 0);
sqlNaredba.setDouble(6, 0);
sqlNaredba.setDouble(7, 0);
sqlNaredba.setDouble(8, 0);
sqlNaredba.setDouble(9, 0);
sqlNaredba.setDouble(10, 0);
sqlNaredba.setDouble(11, 0);
sqlNaredba.setDouble(12, 0);

sqlNaredba.setInt(13, id);

sqlNaredba.executeUpdate();//Izvrsava naredbu i unosi novi red u bazu podataka
sqlNaredba.close();//naredba se zatvara, to je pravilo
} catch (SQLException ex) {
ex.printStackTrace();//govori gde se desila greska ako do nje dodje
throw new RuntimeException("Korisnici isn't saved!");
        
}
    }

    public LinkedList<Kristal> nadjiSveKristale() throws RuntimeException {//KORISTIO LINKED LIST A NE LIST!!!!
try {
LinkedList<Kristal> listaKristala=new LinkedList<Kristal>() {};
String sql = "SELECT * FROM kristal";
Statement statement = konekcija.createStatement();
ResultSet rs = statement.executeQuery(sql);
while (rs.next()) {
Kristal k = new Kristal();

k.setX(0, rs.getDouble("x1"));
k.setX(1, rs.getDouble("x2"));
k.setX(2, rs.getDouble("x3"));
k.setX(3, rs.getDouble("x4"));
k.setX(4, rs.getDouble("x5"));
k.setX(5, rs.getDouble("x6"));
k.setX(6, rs.getDouble("x7"));
k.setX(7, rs.getDouble("x8"));
k.setX(8, rs.getDouble("x9"));
k.setX(9, rs.getDouble("x10"));
k.setX(10, rs.getDouble("x11"));
k.setX(11, rs.getDouble("x12"));

k.setId(rs.getInt("id"));

listaKristala.add(k);
}
return listaKristala;
} catch (SQLException ex) {
ex.printStackTrace();
throw new RuntimeException("Korisnici list not exist!");
}
}

       public void izbrisiKristal(int id) throws RuntimeException {
try {
String sql = "DELETE FROM kristal WHERE id = (?)";
PreparedStatement sqlNaredba = konekcija.prepareStatement(sql);
sqlNaredba.setInt(1, id);
sqlNaredba.executeUpdate();//Izvrsava naredbu i unosi novi red u bazu podataka
sqlNaredba.close();//naredba se zatvara, to je pravilo
} catch (SQLException ex) {
ex.printStackTrace();//govori gde se desila greska ako do nje dodje
throw new RuntimeException("Korisnik isn't deleted!");
}

}     

}