/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parent_dao_interface;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author abanoub samy
 * @param <T>
 */
public interface ParentDao <T>{
    
    
    public boolean insert(T t);
    public T select(T t);
    public boolean update(T t);
    public ArrayList<T> convertResultSetToArrayList(ResultSet rs);
    
}
