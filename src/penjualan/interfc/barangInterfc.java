/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan.interfc;
import penjualan.entity.barang;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author Rahadian Permana
 */
public interface barangInterfc {
    barang insert(barang o) throws SQLException;
    void update (barang o) throws  SQLException;
    void delete (String Kode_Barang) throws SQLException;
    List getAll() throws SQLException; 
}
