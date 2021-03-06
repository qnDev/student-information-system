/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hust.soict.ui;

import java.awt.Toolkit;

/**
 *View info about HUST SIS.
 * @author quangnd
 */
public class AboutUs extends javax.swing.JFrame {

    /**
     * Creates new form AboutUs
     */
    public AboutUs() {
        initComponents();
        setIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textArea1 = new java.awt.TextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("About Us");

        textArea1.setBackground(new java.awt.Color(255, 255, 255));
        textArea1.setEditable(false);
        textArea1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        textArea1.setText("\nGIỚI THIỆU CHUNG \n\nTrường Đại học Bách khoa Hà Nội là trường đại học đa ngành về kỹ thuật được thành lập ngày 15 tháng 10 năm 1956. \nTrường luôn là một trong những trường đại học kỹ thuật hàng đầu của nền giáo dục Việt Nam. \nVới nhiều đóng góp cho công cuộc xây dựng và bảo vệ Tổ quốc, \nTrường đã được Đảng và Nhà nước tặng nhiều danh hiệu và phần thưởng quý giá cho các cá nhân và tập thể Trường.  \nTên tiếng Việt: Trường Đại học Bách khoa Hà Nội  Tên tiếng Anh: Hanoi University of Science and Technology  \nĐịa chỉ: Số 01, Đại Cồ Việt, Hai Bà Trưng, Hà Nội  \nCơ sở vật chất:  Khuôn viên Trường có tổng diện tích 26 ha (lớn nhất trong các trường đại học khu vực nội thành Hà Nội) \nThư viện điện tử Tạ Quang Bửu với diện tích 37.000 m2, có thể phục vụ đồng thời 2.000 sinh viên với 600.000 cuốn sách, 130.000 đầu sách điện tử. \nSinh viên được  truy cập miễn phí  CSDL từ các nguồn như Science Driect, Scopus… \nHệ thống 400 phòng học và phòng thí nghiệm, trong đó có 12 phòng thí nghiệm trọng điểm và đầu tư tập trung, phục vụ hiệu quả công tác đào tạo và nghiên cứu. \nToàn bộ giảng đường được trang bị đầy đủ điều hòa và thiết bị giảng dạy cùng với hệ thống wifi miễn phí trong khuôn viên Trường. \nTrung tâm ký túc xá khang trang đáp ứng nhu cầu lưu trú của gần 4.500 sinh viên. \nKhu liên hợp thể thao có diện tích 20.000 m2 với hệ thống cơ sở vật chất hiện đại, bao gồm: sân bóng, bể bơi, sân tennis tiêu chuẩn quốc gia và nhà thi đấu đa năng tiêu chuẩn Đông Nam Á. \nTrung tâm Y tế hoạt động theo mô hình phòng khám đa khoa chăm sóc sức khỏe thường xuyên cho các cán bộ và sinh viên Trường.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(textArea1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(textArea1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AboutUs().setVisible(true);
//            }
//        });
//    }

    private void setIcon() {
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/edu/hust/soict/resources/HUST.png")));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private java.awt.TextArea textArea1;
    // End of variables declaration//GEN-END:variables
}
