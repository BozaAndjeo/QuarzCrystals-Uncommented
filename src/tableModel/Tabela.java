/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableModel;

import Controller.Controller;
import java.util.LinkedList;
import javax.swing.table.AbstractTableModel;
import model.Kristal;

/**
 *
 * @author Runelord
 */
public class Tabela extends AbstractTableModel{

    LinkedList<Kristal> listaKristala=new LinkedList<Kristal>();

    public Tabela(LinkedList <Kristal> listaKristala) {
        this.listaKristala=listaKristala;
    }
    
    

    @Override
    public String getColumnName(int column) {
        if (column==12) return "ID";
        return "x"+String.valueOf(column+1); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public int getRowCount() {
        return listaKristala.size(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        return 13; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Kristal k=listaKristala.get(rowIndex);
        switch (columnIndex){
            case 0: return k.getX(columnIndex);
            case 1: return k.getX(columnIndex);
            case 2: return k.getX(columnIndex);
            case 3: return k.getX(columnIndex);
            case 4: return k.getX(columnIndex);
            case 5: return k.getX(columnIndex);
            case 6: return k.getX(columnIndex);
            case 7: return k.getX(columnIndex);
            case 8: return k.getX(columnIndex);
            case 9: return k.getX(columnIndex);
            case 10: return k.getX(columnIndex);
            case 11: return k.getX(columnIndex);
            case 12: return k.getId();
            default: return "greska";            
        }
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Kristal k=listaKristala.get(rowIndex);
        switch (columnIndex) {
            case 0: k.setX(columnIndex, Double.valueOf((String) aValue));
                    for (int i=0; i<12; i++){
                    k.setX(i, (i+1)*Double.valueOf((String) aValue)/(columnIndex+1));
                    fireTableCellUpdated(0, i);    
                    k.setX(columnIndex, -Double.valueOf((String) aValue));
                    }
                    break;
            case 1: k.setX(columnIndex, Double.valueOf((String) aValue));
                    for (int i=0; i<12; i++){
                    k.setX(i, (i+1)*Double.valueOf((String) aValue)/(columnIndex+1));
                    fireTableCellUpdated(0, i);    
                    k.setX(columnIndex, -Double.valueOf((String) aValue));
                    }
                    break;
            case 2: k.setX(columnIndex, Double.valueOf((String) aValue));
                    for (int i=0; i<12; i++){
                    k.setX(i, (i+1)*Double.valueOf((String) aValue)/(columnIndex+1));
                    fireTableCellUpdated(0, i);    
                    k.setX(columnIndex, -Double.valueOf((String) aValue));
                    }
                    break;
            case 3: k.setX(columnIndex, Double.valueOf((String) aValue));
                    for (int i=0; i<12; i++){
                    k.setX(i, (i+1)*Double.valueOf((String) aValue)/(columnIndex+1));
                    fireTableCellUpdated(0, i);    
                    k.setX(columnIndex, -Double.valueOf((String) aValue));
                    }
                    break;
            case 4: k.setX(columnIndex, Double.valueOf((String) aValue));
                    for (int i=0; i<12; i++){
                    k.setX(i, (i+1)*Double.valueOf((String) aValue)/(columnIndex+1));
                    fireTableCellUpdated(0, i);    
                    k.setX(columnIndex, -Double.valueOf((String) aValue));
                    }
                    break;
            case 5: k.setX(columnIndex, Double.valueOf((String) aValue));
                    for (int i=0; i<12; i++){
                    k.setX(i, (i+1)*Double.valueOf((String) aValue)/(columnIndex+1));
                    fireTableCellUpdated(0, i);    
                    k.setX(columnIndex, -Double.valueOf((String) aValue));
                    }
                    break;
            case 6: k.setX(columnIndex, Double.valueOf((String) aValue));
                    for (int i=0; i<12; i++){
                    k.setX(i, (i+1)*Double.valueOf((String) aValue)/(columnIndex+1));
                    fireTableCellUpdated(0, i);    
                    k.setX(columnIndex, -Double.valueOf((String) aValue));
                    }
                    break;
            case 7: k.setX(columnIndex, Double.valueOf((String) aValue));
                    for (int i=0; i<12; i++){
                    k.setX(i, (i+1)*Double.valueOf((String) aValue)/(columnIndex+1));
                    fireTableCellUpdated(0, i);    
                    k.setX(columnIndex, -Double.valueOf((String) aValue));
                    }
                    break;
            case 8: k.setX(columnIndex, Double.valueOf((String) aValue));
                    for (int i=0; i<12; i++){
                    k.setX(i, (i+1)*Double.valueOf((String) aValue)/(columnIndex+1));
                    fireTableCellUpdated(0, i);    
                    k.setX(columnIndex, -Double.valueOf((String) aValue));
                    }
                    break;
            case 9: k.setX(columnIndex, Double.valueOf((String) aValue));
                    for (int i=0; i<12; i++){
                    k.setX(i, (i+1)*Double.valueOf((String) aValue)/(columnIndex+1));
                    fireTableCellUpdated(0, i);    
                    k.setX(columnIndex, -Double.valueOf((String) aValue));
                    }
                    break;
            case 10: k.setX(columnIndex, Double.valueOf((String) aValue));
                    for (int i=0; i<12; i++){
                    k.setX(i, (i+1)*Double.valueOf((String) aValue)/(columnIndex+1));
                    fireTableCellUpdated(0, i);    
                    k.setX(columnIndex, -Double.valueOf((String) aValue));
                    }
                    break;
            case 11: k.setX(columnIndex, Double.valueOf((String) aValue));
                    for (int i=0; i<12; i++){
                    k.setX(i, (i+1)*Double.valueOf((String) aValue)/(columnIndex+1));
                    fireTableCellUpdated(0, i);    
                    k.setX(columnIndex, -Double.valueOf((String) aValue));
                    }
                    break;
                
    }
    Controller.vratiObjekat().promeniKristal(k);
    }


    
}
