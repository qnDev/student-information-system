/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hust.soict.dao;

import edu.hust.soict.objects.AddUser;
import java.sql.ResultSet;
import java.util.ArrayList;



/**
 *
 * @author BKHN
 */
public interface IAddUserDAO {

    /**
     *
     * @return
     */
    public ArrayList<AddUser> getAll();

    /**
     *
     * @param userName
     * @return
     */
    public ArrayList<AddUser> findUserName(String userName);

    /**
     *
     * @param user
     * @return
     */
    public AddUser addNew(AddUser user);

    /**
     *
     * @param user
     * @return
     */
    public AddUser updateByID(AddUser user);

    /**
     *
     * @param tenDangNhap
     * @return
     */
    public ArrayList<AddUser> checkID(String tenDangNhap);
   
    public boolean updateUser2(AddUser user);
    public AddUser extractUserFromResultSet(ResultSet rs);
   
}
