/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hust.soict.ui.admin;

import com.mysql.jdbc.Connection;
import edu.hust.soict.dao.AddUserDAO;
import edu.hust.soict.dao.DBConnect;
import static edu.hust.soict.dao.DBConnect.cnn;
import edu.hust.soict.dao.IAddUserDAO;
import edu.hust.soict.logic.Check;
import edu.hust.soict.objects.AddUser;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Pannel view modify users(create, delete, update, read).
 *
 * @author quangnd
 */
public class FormAddUser extends javax.swing.JPanel {

    private DefaultTableModel dtm;
    private DefaultComboBoxModel dcbm;
    ArrayList<AddUser> listuser = null;
    private AddUserDAO userDAO;

    /**
     * Creates new form frmAddUser
     */
//    public frmAddUser() {
//        try {
//
//            initComponents();
//            dcbm = new DefaultComboBoxModel();
//            dtm = new DefaultTableModel();
//            IAddUserDAO addDAO = (IAddUserDAO) Class.forName("AddUser.AddUserDAO").newInstance();
//            listuser = addDAO.getAll();
//            for (AddUser a : listuser) {
//                dcbm.addElement(a.getIs_admin());
//            }
//            jComboBox1.setModel(dcbm);
//            dtm.addColumn("Tên Đăng Nhập");
//            dtm.addColumn("Mật Khẩu");
//            dtm.addColumn("Họ Và Tên");
//            dtm.addColumn("Email");
//            dtm.addColumn("Vai Trò");
//            showAll();
//        } catch (Exception e) {
//        }
//    }
    public FormAddUser() {
        initComponents();
        PreparedStatement ps = null;
        Connection cnn = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.cnn.prepareStatement("SELECT user_name, password, is_admin FROM dang_nhap");
                rs = ps.executeQuery();

                while (jTable1.getRowCount() > 0) {
                    ((DefaultTableModel) jTable1.getModel()).removeRow(0);
                }
                int col = rs.getMetaData().getColumnCount();
                while (rs.next()) {
                    Object[] rows = new Object[col];
                    for (int i = 1; i <= col; i++) {
                        rows[i - 1] = rs.getObject(i);
                    }
                    ((DefaultTableModel) jTable1.getModel()).insertRow(rs.getRow() - 1, rows);
                }
                rs.close();
            } catch (SQLException e) {
                Logger.getLogger(Tuition.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }

    public void getData() {
        //initComponents();
        PreparedStatement ps = null;
        Connection cnn = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.cnn.prepareStatement("SELECT user_name, password, is_admin FROM dang_nhap");
                rs = ps.executeQuery();

                while (jTable1.getRowCount() > 0) {
                    ((DefaultTableModel) jTable1.getModel()).removeRow(0);
                }
                int col = rs.getMetaData().getColumnCount();
                while (rs.next()) {
                    Object[] rows = new Object[col];
                    for (int i = 1; i <= col; i++) {
                        rows[i - 1] = rs.getObject(i);
                    }
                    ((DefaultTableModel) jTable1.getModel()).insertRow(rs.getRow() - 1, rows);
                }
                rs.close();
            } catch (SQLException e) {
                Logger.getLogger(Tuition.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("quan_ly_sinh_vien?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        dangNhapQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT d FROM DangNhap d");
        dangNhapList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : dangNhapQuery.getResultList();
        dangNhapQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT d FROM DangNhap d");
        dangNhapList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : dangNhapQuery1.getResultList();
        entityManager0 = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("quan_ly_sinh_vien?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        dangNhapQuery2 = java.beans.Beans.isDesignTime() ? null : entityManager0.createQuery("SELECT d FROM DangNhap d");
        dangNhapList2 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : dangNhapQuery2.getResultList();
        dangNhapQuery3 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT d FROM DangNhap d");
        dangNhapList3 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : dangNhapQuery3.getResultList();
        dangNhapQuery4 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT d FROM DangNhap d");
        dangNhapList4 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : dangNhapQuery4.getResultList();
        dangNhapQuery5 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT d FROM DangNhap d");
        dangNhapList5 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : dangNhapQuery5.getResultList();
        dangNhapQuery6 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT d FROM DangNhap d");
        dangNhapList6 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : dangNhapQuery6.getResultList();
        dangNhapQuery7 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT d FROM DangNhap d");
        dangNhapList7 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : dangNhapQuery7.getResultList();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtfTenDangNhap = new javax.swing.JTextField();
        jtfMatKhau = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButtonAddNew = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        setPreferredSize(new java.awt.Dimension(843, 472));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(856, 472));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1 = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        };
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên đăng nhập", "Pasword", "Vai trò"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("Tên Đăng Nhập");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 170, 0, 0);
        jPanel4.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("Mật Khẩu");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 170, 0, 0);
        jPanel4.add(jLabel3, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("Vai Trò");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 47, 0, 0);
        jPanel4.add(jLabel6, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 137;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(26, 47, 0, 0);
        jPanel4.add(jtfTenDangNhap, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 355;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 47, 0, 176);
        jPanel4.add(jtfMatKhau, gridBagConstraints);

        jComboBox1.setForeground(new java.awt.Color(204, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin", "student" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(23, 24, 0, 176);
        jPanel4.add(jComboBox1, gridBagConstraints);

        jButtonAddNew.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonAddNew.setForeground(new java.awt.Color(204, 0, 0));
        jButtonAddNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/hust/soict/resources/add.png"))); // NOI18N
        jButtonAddNew.setText("AddNew");
        jButtonAddNew.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAddNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddNewActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(22, 170, 14, 0);
        jPanel4.add(jButtonAddNew, gridBagConstraints);

        jButtonUpdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonUpdate.setForeground(new java.awt.Color(204, 0, 0));
        jButtonUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/hust/soict/resources/bar-chart-reload.png"))); // NOI18N
        jButtonUpdate.setText("Update");
        jButtonUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(22, 34, 14, 0);
        jPanel4.add(jButtonUpdate, gridBagConstraints);

        jButtonDelete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonDelete.setForeground(new java.awt.Color(153, 0, 0));
        jButtonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/hust/soict/resources/delete (1).png"))); // NOI18N
        jButtonDelete.setText("Delete");
        jButtonDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(22, 38, 14, 0);
        jPanel4.add(jButtonDelete, gridBagConstraints);

        jButtonReset.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonReset.setForeground(new java.awt.Color(204, 0, 0));
        jButtonReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/hust/soict/resources/refresh.png"))); // NOI18N
        jButtonReset.setText("Reset");
        jButtonReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(22, 29, 14, 176);
        jPanel4.add(jButtonReset, gridBagConstraints);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Reset value of TextField to null.
     */
    public void ResetForm() {
        jtfTenDangNhap.setText("");
        jtfMatKhau.setText("");
        jtfTenDangNhap.requestFocus();
    }

    /**
     * Add New User (check if not exists user then add new user to database).
     *
     * @param evt event action performed when clicked button AddNew User.
     */

    private void jButtonAddNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddNewActionPerformed
        AddUserDAO ad = new AddUserDAO();
        try {
            // TODO add your handling code here:
            String tendangnhap = jtfTenDangNhap.getText();
            String matkhau = jtfMatKhau.getText();
            String vaitro = (String) jComboBox1.getSelectedItem();
            if (!checkinfo()) {
                return;
            }
            AddUser au = new AddUser(tendangnhap, matkhau, vaitro);
            ArrayList<AddUser> listCheck = new AddUserDAO().checkID(tendangnhap);
            if (listCheck.size() > 0) {
                JOptionPane.showMessageDialog(this, "User đã tồn tại, vui lòng kiểm tra lại!", "Thông báo!", JOptionPane.ERROR_MESSAGE);
                jtfTenDangNhap.setText("");
                jtfTenDangNhap.requestFocus();
            } else {
                AddUser insert = new AddUserDAO().addNew(au);
                JOptionPane.showMessageDialog(FormAddUser.this, "Đã tạo mới User thành công.", "Thông báo!", JOptionPane.INFORMATION_MESSAGE);
                if (insert != null) {
                    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                    model.setRowCount(0);
                    userDAO.getAll();
                }
                getData();

            }

        } catch (Exception ex) {
            Logger.getLogger(FormAddUser.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButtonAddNewActionPerformed
//    private void saveUser() throws Exception {
//
//        String user_name = jtfTenDangNhap.getText();
//        String password = jtfMatKhau.getText();
//        String name = jtfHoTen.getText();
//        String email = jtfEmail.getText();
//        String vaitro = (String) jComboBox1.getSelectedItem();
//
//        AddUser au = new AddUser(user_name, password, name, email, vaitro);
//        ArrayList<AddUser> listCheck = new AddUserDAO().checkID(user_name);
//        if (listCheck.size() > 0) {
//            JOptionPane.showMessageDialog(this, "Tên đăng nhập bị trùng", "vui lòng kiểm tra lại", JOptionPane.ERROR_MESSAGE);
//            jtfTenDangNhap.setText("");
//            jtfTenDangNhap.requestFocus();
//        } else {
//            AddUser insert = new AddUserDAO().addNew(au);
//            if (insert != null) {
//                showAll();
//            }
//        }
//
//    }

    /**
     * Delete user(ask confirm delete before delete).
     *
     * @param evt event action performed when clicked button Delete User.
     */

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(FormAddUser.this, "Bạn chưa chọn User cần xóa!", "Thông báo!", JOptionPane.WARNING_MESSAGE);
        } else {
            int b = JOptionPane.showConfirmDialog(FormAddUser.this, "Bạn chắc chắn muốn xóa dữ liệu này?", "Thông báo!", JOptionPane.YES_NO_OPTION);
            if (b == JOptionPane.YES_OPTION) {
                try {
                    String tendangnhap = jtfTenDangNhap.getText();
                    new AddUserDAO().deleteUser(tendangnhap);
                } catch (SQLException | ClassNotFoundException ex) {
                    Logger.getLogger(FormAddUser.class.getName()).log(Level.SEVERE, null, ex);
                }
//                while (dtm.getRowCount() > 0) {
//                    dtm.removeRow(0);
//                }
//                while (dtm.getRowCount() > 0) {
//                    dtm.removeRow(0);
//                }
            }

            ResetForm();
//            loaddata();
            //showAll();
//            showAll();
            jButtonAddNew.setEnabled(true);
            jButtonDelete.setEnabled(true);
            jButtonUpdate.setEnabled(false);
            jButtonReset.setEnabled(true);
            jtfTenDangNhap.setEnabled(true);
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed
    /**
     * Reset all data in Text field when after update, delete or add new User.
     *
     * @param evt event action performed when clicked button Reset User.
     */
    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        // TODO add your handling code here:
        this.resetForm();
        //refresh();
        this.getData();
    }//GEN-LAST:event_jButtonResetActionPerformed
    /**
     *
     * Update User.
     *
     * @param evt event action performed when clicked button Update User.
     */
    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();

        // make sure a row is selected
        if (row < 0) {
            JOptionPane.showMessageDialog(FormAddUser.this, "Bạn chưa chọn User cần thay đổi!", "Thông báo!",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        String tendangnhap = jtfTenDangNhap.getText();
        String matkhau = jtfMatKhau.getText();
        String vaitro = (String) jComboBox1.getSelectedItem();
//        if (!checkinfo()) {
//            return;
//        }
        AddUser user = new AddUser(tendangnhap, matkhau, vaitro);
        boolean update = new AddUserDAO().updateUser2(user);
        if (update == true) {
            //showAll();
            JOptionPane.showMessageDialog(FormAddUser.this, "Đã cập nhật dữ liệu thành công!", "Updated", JOptionPane.INFORMATION_MESSAGE);
            getData();
        }
        jButtonAddNew.setEnabled(false);
        jButtonDelete.setEnabled(true);
        jButtonUpdate.setEnabled(true);
        jButtonReset.setEnabled(true);
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        // TODO add your handling code here:
        jtfTenDangNhap.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
        jtfMatKhau.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
        jComboBox1.setSelectedItem(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
        jButtonAddNew.setEnabled(false);
        jButtonDelete.setEnabled(true);
        jButtonUpdate.setEnabled(true);
        jButtonReset.setEnabled(true);
        jtfTenDangNhap.setEditable(false);
    }//GEN-LAST:event_jTable1MouseReleased
    /**
     * Get value from table when selected row of table User to Text Fields,
     * ComboBox.
     *
     * @param evt event action performed when clicked to row of table
     * information of User.
     */
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        jtfTenDangNhap.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
        jtfMatKhau.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
        jComboBox1.setSelectedItem(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
        jButtonAddNew.setEnabled(false);
        jButtonDelete.setEnabled(true);
        jButtonUpdate.setEnabled(true);
        jButtonReset.setEnabled(true);
        jtfTenDangNhap.setEditable(false);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    /**
     * Change User Password.
     */
    protected void changePassword() {
        // get the selected item

        int row = jTable1.getSelectedRow();

        // make sure a row is selected
        if (row < 0) {
            JOptionPane.showMessageDialog(FormAddUser.this, "Bạn chưa chọn User cần cập nhật!", "Thông báo",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        // get the current user
        AddUser tempUser = (AddUser) jTable1.getValueAt(row, 4);

        // create dialog
       // ChangePassword changePasswordDialog = new ChangePassword(tempUser, userDAO);

        // show dialog
       // changePasswordDialog.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.util.List<edu.hust.soict.objects.DangNhap> dangNhapList;
    private java.util.List<edu.hust.soict.objects.DangNhap> dangNhapList1;
    private java.util.List<edu.hust.soict.objects.DangNhap> dangNhapList2;
    private java.util.List<edu.hust.soict.objects.DangNhap> dangNhapList3;
    private java.util.List<edu.hust.soict.objects.DangNhap> dangNhapList4;
    private java.util.List<edu.hust.soict.objects.DangNhap> dangNhapList5;
    private java.util.List<edu.hust.soict.objects.DangNhap> dangNhapList6;
    private java.util.List<edu.hust.soict.objects.DangNhap> dangNhapList7;
    private javax.persistence.Query dangNhapQuery;
    private javax.persistence.Query dangNhapQuery1;
    private javax.persistence.Query dangNhapQuery2;
    private javax.persistence.Query dangNhapQuery3;
    private javax.persistence.Query dangNhapQuery4;
    private javax.persistence.Query dangNhapQuery5;
    private javax.persistence.Query dangNhapQuery6;
    private javax.persistence.Query dangNhapQuery7;
    private javax.persistence.EntityManager entityManager;
    private javax.persistence.EntityManager entityManager0;
    private javax.swing.JButton jButtonAddNew;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    private javax.swing.JTextField jtfMatKhau;
    private javax.swing.JTextField jtfTenDangNhap;
    // End of variables declaration//GEN-END:variables

    /**
     * Define column(Object) of table to show information of User.
     *
     * @param user have user name, password, name, email, role.
     */
    private Object[] toObjectsData(AddUser user) {
        Object[] objectsData = {user.getUser_name(), user.getPassword(), user.getIs_admin()};
        return objectsData;
    }

    private void resetForm() {
        jtfTenDangNhap.setText("");
        jtfMatKhau.setText("");
        jButtonAddNew.setEnabled(true);
        jtfTenDangNhap.setEditable(true);
        jtfTenDangNhap.requestFocus();
    }

    /**
     * Check validation of user name, email, password,...
     *
     */
    private boolean checkinfo() {
        Check c = new Check();
        if (!c.checkID(jtfTenDangNhap.getText())) {
            JOptionPane.showMessageDialog(this, "Nhập tên đăng nhập sai", "Hãy nhập lại!", JOptionPane.ERROR_MESSAGE);
            jtfTenDangNhap.setText("");
            jtfTenDangNhap.requestFocus();
            return false;
        } else if (!c.checkSpace(jtfMatKhau.getText()) || !c.check(jtfMatKhau.getText())) {
            JOptionPane.showMessageDialog(this, "Nhập mật khẩu sai!", "Hãy nhập lại!", JOptionPane.ERROR_MESSAGE);
            jtfMatKhau.setText("");
            jtfMatKhau.requestFocus();
            return false;

        }
//        else if (!c.checkSpace(jtfHoTen.getText()) || !c.check(jtfHoTen.getText())) {
//            JOptionPane.showMessageDialog(this, "Nhập họ tên sai!", "Hãy nhập lại!", JOptionPane.ERROR_MESSAGE);
//            jtfHoTen.setText("");
//            jtfHoTen.requestFocus();
//            return false;
//        } else if (!c.checkSpace(jtfEmail.getText()) || !c.check(jtfEmail.getText())) {
//            JOptionPane.showMessageDialog(this, "Nhập email sai!", "Hãy nhập lại!", JOptionPane.ERROR_MESSAGE);
//            jtfEmail.setText("");
//            jtfEmail.requestFocus();
//            return false;
//        } else if (!Check.checkEmail(jtfEmail.getText())) {
//            JOptionPane.showMessageDialog(this, "Nhập email sai!", "Hãy nhập lại!", JOptionPane.ERROR_MESSAGE);
//            jtfEmail.setText("");
//            jtfEmail.requestFocus();
//        }
        return true;
    }

    private void showAll() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        userDAO.getAll();

        while (dtm.getRowCount() > 0) {
            dtm.removeRow(0);
        }
        ArrayList<AddUser> adds = new AddUserDAO().getAll();
        for (AddUser au : adds) {
            Vector v = new Vector();
            v.add(au.getUser_name());
            v.add(au.getPassword());
            v.add(au.getIs_admin());
            dtm.addRow(v);
        }
        ResetForm();
    }
//
//    private void refresh() {
//
//        while (dtm.getRowCount() > 0) {
//            dtm.removeRow(0);
//        }
//
//        AddUserDAO stdao = new AddUserDAO();
//        ArrayList<AddUser> list = null;
//
//        list = stdao.getAll();
//        for (AddUser sv : list) {
//            dtm.addRow(toObjectData(sv));
//        }
//    }
//
//    public Set getAllUsers() {
//        if (DBConnect.open()) {
//            try {
//                AddUser addUser = new AddUser();
//                AddUserDAO stdao = new AddUserDAO();
//                PreparedStatement ps = cnn.prepareStatement("SELECT * FROM dang_nhap");
//                ResultSet rs = ps.executeQuery();
//                ArrayList<AddUser> list = stdao.getAll();
//                for (AddUser sv : list) {
//
//                    dtm.addRow(toObjectData(sv));
//                }
//            } catch (SQLException ex) {
//                ex.printStackTrace();
//            }
//            // return null;
//        }
//        return null;
//    }

    private static Object[] toObjectData(AddUser sv) {
        Object[] objectData = {sv.getUser_name(), sv.getPassword(), sv.getIs_admin()};
        return objectData;
    }

}
