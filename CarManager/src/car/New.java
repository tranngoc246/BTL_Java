/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package car;

import carDetail.*;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class New extends javax.swing.JFrame {

    ListCar list = new ListCar();
    ListCarDetail listDetail = new ListCarDetail();

    /**
     * Creates new form New
     */
    public New() {
        initComponents1();
        setLocationRelativeTo(null);

    }
    private void initComponents1() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        tfBrand = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfYear = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfAmount = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfCost = new javax.swing.JTextField();
        btAdd = new javax.swing.JButton();
        btExit = new javax.swing.JButton();
        btReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Thêm mới");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thêm mới");

        jLabel2.setText("Mã sản phẩm:");

        jLabel3.setText("Tên sản phẩm:");

        jLabel4.setText("Hãng sản xuất:");

        jLabel5.setText("Năm sản xuất:");

        jLabel6.setText("Số lượng:");

        jLabel7.setText("Đơn giá:");

        btAdd.setText("Thêm");
        btAdd.addActionListener(this::btAddActionPerformed);

        btExit.setText("Thoát");
        btExit.addActionListener(this::btExitActionPerformed);

        btReset.setText("Reset");
        btReset.addActionListener(this::btResetActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btReset, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btExit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfYear, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfCost, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btExit)
                    .addComponent(btReset)
                    .addComponent(btAdd))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        tfBrand = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfYear = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfAmount = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfCost = new javax.swing.JTextField();
        btAdd = new javax.swing.JButton();
        btExit = new javax.swing.JButton();
        btReset = new javax.swing.JButton();
        btThem = new javax.swing.JButton();
        btClose = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Thêm mới");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thêm mới");

        jLabel2.setText("Mã sản phẩm:");

        jLabel3.setText("Tên sản phẩm:");

        jLabel4.setText("Hãng sản xuất:");

        jLabel5.setText("Năm sản xuất:");

        jLabel6.setText("Số lượng:");

        jLabel7.setText("Đơn giá:");

        btAdd.setText("Thêm");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        btExit.setText("Thoát");
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });

        btReset.setText("Reset");
        btReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResetActionPerformed(evt);
            }
        });

        btThem.setText("jButton1");
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });

        btClose.setText("jButton2");

        btXoa.setText("jButton3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfYear, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfCost, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btXoa)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btThem))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btReset, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btExit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btClose))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btExit)
                    .addComponent(btReset)
                    .addComponent(btAdd))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btThem)
                    .addComponent(btClose)
                    .addComponent(btXoa))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResetActionPerformed
        fillData();
    }//GEN-LAST:event_btResetActionPerformed

    private void fillData() {
        // TODO add your handling code here:
        tfID.setText("");
        tfName.setText("");
        tfYear.setText("");
        tfBrand.setText("");
        tfAmount.setText("");
        tfCost.setText("");
    }

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        // TODO add your handling code here:

        StringBuilder sb = new StringBuilder();
        boolean flag = false;

        String id = tfID.getText();
        String name = tfName.getText();
        String year = tfYear.getText();
        int year1 = 0;
        String brand = tfBrand.getText();
        String amount = tfAmount.getText();
        int amount1 = 0;
        String cost = tfCost.getText();
        double cost1 = 0;

        // kiem tra textField co duoc nhap ko
        if ("".equals(id)) {
            flag = true;
        } else if ("".equals(name)) {
            flag = true;
        } else if ("".equals(year)) {
            flag = true;
        } else if ("".equals(brand)) {
            flag = true;
        } else if ("".equals(amount)) {
            flag = true;
        } else {
            flag = "".equals(cost);
        }

        if (flag) {
            JOptionPane.showMessageDialog(this, "Dữ liệu không được để trống!");
            return;
        }

        // kiem tra du lieu nhap vao co hon le ko
        try {
            year1 = Integer.parseInt(year);
        } catch (NumberFormatException e) {
            sb.append("\"Năm sản xuất\" phải là một chữ số!\n");
        }
        if(year1>LocalDate.now().getYear()){
            sb.append("\"Năm sản xuất\" phải nhỏ hơn năm hiện tại!\n");
        }
        try {
            amount1 = Integer.parseInt(amount);
        } catch (NumberFormatException e) {
            sb.append("\"Số lượng\" phải là một chữ số!\n");
        }
        try {
            cost1 = Double.parseDouble(cost);
        } catch (NumberFormatException e) {
            sb.append("\"Đơn giá\" phải là một chữ số!\n");
        }
        if (!sb.isEmpty()) {
            JOptionPane.showMessageDialog(this, sb);
            return;
        }

        // kiem tra id da ton tai chua
        try {
            list.loadFile();
        } catch (Exception ex) {
            Logger.getLogger(New.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (list.findById(id) != null) {
            JOptionPane.showMessageDialog(this, "\"Mã sản phẩm\" đã tồn tại!");
            return;
        }

        Car car = new Car(id,name,brand,year1,amount1,cost1);
        try {
            list.add(car);
            list.writeToFile();
        } catch (Exception ex) {
            Logger.getLogger(New.class.getName()).log(Level.SEVERE, null, ex);
        }
        CarDetail cdt = new CarDetail(id, LocalDate.now(), null, amount1, amount1 * car.getCost());
        try {
                listDetail.loadFile();
                listDetail.add(cdt);
                listDetail.writeToFile();
            } catch (Exception ex) {
                Logger.getLogger(CarManager.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_btAddActionPerformed

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btExitActionPerformed

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        boolean flag = false;

        String id = tfID.getText();
        String name = tfName.getText();
        String year = tfYear.getText();
        int year1 = 0;
        String brand = tfBrand.getText();
        String amount = tfAmount.getText();
        int amount1 = 0;
        String cost = tfCost.getText();
        double cost1 = 0;

        // kiem tra textField co duoc nhap ko
        if ("".equals(id)) {
            flag = true;
        } else if ("".equals(name)) {
            flag = true;
        } else if ("".equals(year)) {
            flag = true;
        } else if ("".equals(brand)) {
            flag = true;
        } else if ("".equals(amount)) {
            flag = true;
        } else {
            flag = "".equals(cost);
        }

        if (flag) {
            JOptionPane.showMessageDialog(this, "Dữ liệu không được để trống!");
            return;
        }

        // kiem tra du lieu nhap vao co hon le ko
        try {
            year1 = Integer.parseInt(year);
        } catch (NumberFormatException e) {
            sb.append("\"Năm sản xuất\" phải là một chữ số!\n");
        }
        if(year1>LocalDate.now().getYear()){
            sb.append("\"Năm sản xuất\" phải nhỏ hơn năm hiện tại!\n");
        }
        try {
            amount1 = Integer.parseInt(amount);
        } catch (NumberFormatException e) {
            sb.append("\"Số lượng\" phải là một chữ số!\n");
        }
        try {
            cost1 = Double.parseDouble(cost);
        } catch (NumberFormatException e) {
            sb.append("\"Đơn giá\" phải là một chữ số!\n");
        }
        if (!sb.isEmpty()) {
            JOptionPane.showMessageDialog(this, sb);
            return;
        }

        // kiem tra id da ton tai chua
        try {
            list.loadFile();
        } catch (Exception ex) {
            Logger.getLogger(New.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (list.findById(id) != null) {
            JOptionPane.showMessageDialog(this, "\"Mã sản phẩm\" đã tồn tại!");
            return;
        }

        Car car = new Car(id,name,brand,year1,amount1,cost1);
        try {
            list.add(car);
            list.writeToFile();
        } catch (Exception ex) {
            Logger.getLogger(New.class.getName()).log(Level.SEVERE, null, ex);
        }
        CarDetail cdt = new CarDetail(id, LocalDate.now(), null, amount1, amount1 * car.getCost());
        try {
                listDetail.loadFile();
                listDetail.add(cdt);
                listDetail.writeToFile();
            } catch (Exception ex) {
                Logger.getLogger(CarManager.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_btThemActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btClose;
    private javax.swing.JButton btExit;
    private javax.swing.JButton btReset;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField tfAmount;
    private javax.swing.JTextField tfBrand;
    private javax.swing.JTextField tfCost;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfYear;
    // End of variables declaration//GEN-END:variables
}
