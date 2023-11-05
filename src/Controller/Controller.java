/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DbBroker.DbBroker;
import java.util.LinkedList;
import model.Kristal;

/**
 *
 * @author Runelord
 */
public class Controller {
    private static Controller controler;
    DbBroker db;
    
    private Controller(){
    db=new DbBroker();
    }
    
    
    
    public static Controller vratiObjekat(){
    if(controler==null) controler=new Controller();
            
    return controler;
    }
    
    public synchronized LinkedList<Kristal> vratiSveKristale(){
            db.uspostaviKonekciju();
            LinkedList<Kristal> korisnikList=db.nadjiSveKristale();
            db.zatvoriKonekciju();
            return korisnikList;
        }
    
    public synchronized void promeniKristal(Kristal k){
          try{  db.uspostaviKonekciju();
            db.promeniKristal(k);
            db.potvrdaTransakcije();
            }
           catch(Exception ex){
        db.opozivTransakcije();
        }
        finally {db.zatvoriKonekciju();}
      }
    
    public synchronized void izbrisiKristal(int id) {
        try{
            db.uspostaviKonekciju();
            db.izbrisiKristal(id); 
            db.potvrdaTransakcije(); 
        }
        catch(Exception ex){
        db.opozivTransakcije();
        }
        finally {db.zatvoriKonekciju();}
    }
    
    public synchronized void dodajKristal(int id) {
        try{
            db.uspostaviKonekciju();
            db.dodajKristal(id);
            db.potvrdaTransakcije(); 
        }
        catch(Exception ex){
        db.opozivTransakcije();
        }
        finally {db.zatvoriKonekciju();}
    }
    
}
