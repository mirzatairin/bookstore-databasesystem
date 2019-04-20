import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ShowTables extends javax.swing.JFrame {
 Connection connect;
  String tableName;
  String table;
    
    public ShowTables(Connection c) {
        this.connect = c;
        initComponents();
        showTable();   
    }

    ShowTables()
    {
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnInsert1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        TableComboBox = new javax.swing.JComboBox<>();
        btnInsert = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        txtInput = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        btnInsert1.setBackground(new java.awt.Color(0, 0, 0));
        btnInsert1.setForeground(new java.awt.Color(255, 255, 255));
        btnInsert1.setText("Insert");
        btnInsert1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsert1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 204));

        jTable1.setBackground(new java.awt.Color(0, 204, 153));
        jTable1.setBorder(new javax.swing.border.MatteBorder(null));
        jTable1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "null", "null", "null", "null"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SELECT TABLES:");

        TableComboBox.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        TableComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TableComboBoxActionPerformed(evt);
            }
        });

        btnInsert.setBackground(new java.awt.Color(0, 0, 0));
        btnInsert.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        btnInsert.setForeground(new java.awt.Color(255, 255, 255));
        btnInsert.setText("INSERT");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(0, 0, 0));
        btnDelete.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(0, 0, 0));
        btnUpdate.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(0, 0, 0));
        btnExit.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("QUIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Click on a value. Type new value in the box, then UPDATE:");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        jLabel3.setText("BOOKSTORE MANAGEMENT SYSTEM");

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("QUERY");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(348, 348, 348)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(629, 629, 629)
                        .addComponent(btnExit))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1)
                            .addGap(18, 18, 18)
                            .addComponent(btnInsert)
                            .addGap(18, 18, 18)
                            .addComponent(btnUpdate)
                            .addGap(16, 16, 16)
                            .addComponent(btnDelete))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 836, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(TableComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(btnInsert)
                        .addComponent(btnUpdate)
                        .addComponent(btnDelete))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TableComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(39, 39, 39)
                .addComponent(btnExit)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TableComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TableComboBoxActionPerformed
        // TODO add your handling code here:
        tableName = TableComboBox.getSelectedItem().toString();

        try{
            Statement statement = connect.createStatement();
            ResultSet rs = statement.executeQuery("select * from "+tableName);

            jTable1.setModel(buildTableModel(rs));
        }
        catch(Exception e){
        }
        
    }//GEN-LAST:event_TableComboBoxActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        tableName =(String) TableComboBox.getSelectedItem();
        if("user".equals(tableName)){
        User u = new User(connect,tableName);
        u.setVisible(true);
        }
        
        if("selects".equals(tableName)){
        Selects select= new Selects(connect,tableName);
        select.setVisible(true);
        }
        if("category".equals(tableName)){
        Category cat = new Category(connect,tableName);
        cat.setVisible(true);
        }
        if("has".equals(tableName)){
        Has h = new Has(connect,tableName);
        h.setVisible(true);
        }
        
        if("orders".equals(tableName)){
        Orders order = new Orders(connect,tableName);
        order.setVisible(true);
        }
        if("books".equals(tableName)){
        Books b = new Books(connect,tableName);
        b.setVisible(true);
        }
        
        
        if("manager".equals(tableName)){
        Manager m = new Manager(connect,tableName);
        m.setVisible(true);
        }
        if("manages".equals(tableName)){
        Manages ms = new Manages(connect,tableName);
        ms.setVisible(true);
        }
        
        
        if("parcel".equals(tableName)){
        Parcel parc = new Parcel(connect,tableName);
        parc.setVisible(true);
        }
        if("contains".equals(tableName)){
        Contains con = new Contains(connect,tableName);
        con.setVisible(true);
        }
        
        if("publisher".equals(tableName)){
        Publisher p= new Publisher(connect,tableName);
        p.setVisible(true);
        }
        if("publishes".equals(tableName)){
        Publishes ps = new Publishes(connect,tableName);
        ps.setVisible(true);
        }
        
        
        if("shop".equals(tableName)){
        Shop sh = new Shop(connect,tableName);
        sh.setVisible(true);
        }
        if("sells".equals(tableName)){
        Sells sale= new Sells(connect,tableName);
        sale.setVisible(true);
        }
        
        if("stuff".equals(tableName)){
        Stuff st = new Stuff(connect,tableName);
        st.setVisible(true);
        }
        if("works".equals(tableName)){
        Works w= new Works(connect,tableName);
        w.setVisible(true);
        }
        
        if("writer".equals(tableName)){
        Writer wr = new Writer(connect,tableName);
        wr.setVisible(true);
        }
        if("writes".equals(tableName)){
        Writes wrs = new Writes(connect,tableName);
        wrs.setVisible(true);
        }
        
        
        
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       try{
            int row = jTable1.getSelectedRow();
            int col = 0;
            Object value = jTable1.getValueAt( row, col);

            String colName= jTable1.getModel().getColumnName(col);

            String query2="SET FOREIGN_KEY_CHECKS=1;";
            PreparedStatement pStatement =  connect.prepareStatement(query2);
            //Statement pStatement2=(Statement) connection.createStatement();
            ResultSet  res  = pStatement.executeQuery();
           
            try {
                 String query ="delete from "+tableName+" where "+colName+" = '"+value+"'";
                System.out.println(query);
                PreparedStatement preparedStmt = connect.prepareStatement(query);
                preparedStmt.execute();

                JOptionPane.showMessageDialog(null, "Selected Row Deleted!!!");
                System.out.println("has been Deleted !");

                try{
                    tableName = TableComboBox.getSelectedItem().toString();
                    Statement statement = connect.createStatement();
                    ResultSet rs = statement.executeQuery("select * from "+tableName);
                    jTable1.setModel(buildTableModel(rs));
                }
                catch(Exception e){

                }

            }catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error! No Row Selected!!!!");
                System.out.println("has not been Deleted !");

            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error! No Row Selected!!!!");
            System.out.println("No Row Selected!!!");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int row = jTable1.getSelectedRow();
        int col = jTable1.getSelectedColumn();
        String cname= jTable1.getModel().getColumnName(col);
        System.out.println("row= "+row+" col = "+col+"column name= "+cname);
        Object value = jTable1.getValueAt( row, col );
        System.out.println("value = "+value);
        try{
            String query2="SET FOREIGN_KEY_CHECKS=1;";
            PreparedStatement pStatement =  connect.prepareStatement(query2);
            //Statement pStatement2=(Statement) connection.createStatement();
            pStatement.executeQuery();

            String query ="update "+TableComboBox.getSelectedItem()
            +" set "+cname+"='"+ txtInput.getText().toString()
            +"' where "+cname+" = '"+ value+"' ;";
            System.out.println("query= "+query);
            pStatement=connect.prepareStatement(query) ;

            //Statement pStatement2=(Statement) connection.createStatement();
            pStatement.executeUpdate();
            try{
                    tableName = TableComboBox.getSelectedItem().toString();
                    Statement statement = connect.createStatement();
                    ResultSet rs = statement.executeQuery("select * from "+tableName);
                    jTable1.setModel(buildTableModel(rs));
                    JOptionPane.showMessageDialog(null, "Sucessfully Updated");
                }
                catch(Exception e){

                }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        txtInput.setText(null);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
     try {
         // TODO add your handling code here:
         this.dispose();
         connect.close();
     } catch (SQLException ex) {
         Logger.getLogger(ShowTables.class.getName()).log(Level.SEVERE, null, ex);
     }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnInsert1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsert1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInsert1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
          Query q = new Query(connect);
           q.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
 
    public static DefaultTableModel buildTableModel(ResultSet rs)
        throws SQLException {

        ResultSetMetaData metaData = rs.getMetaData();

        // names of columns
        Vector<String> columnNames = new Vector<String>();
        int columnCount = metaData.getColumnCount();
        for (int column = 1; column <= columnCount; column++) {
            columnNames.add(metaData.getColumnName(column));
        }

        // data of the table
        Vector<Vector<Object>> data = new Vector<Vector<Object>>();
        while (rs.next()) {
            Vector<Object> vector = new Vector<Object>();
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                vector.add(rs.getObject(columnIndex));
            }
            data.add(vector);
        }

        return new DefaultTableModel(data, columnNames);

    }
    
    ArrayList<String> tbName = new ArrayList<String>();
    
    public void showTable() {
        try {
            DatabaseMetaData md = connect.getMetaData();
            
            ResultSet rst = md.getTables(null, null," ",null);
            while (rst.next()) {
              tbName.add(rst.getString(3));
              System.out.println(rst.getString(3));
            }
            
            TableComboBox.setModel(new DefaultComboBoxModel( tbName.toArray()));
           // Jcombobox1.setModel(new DefaultComboBoxModel( tbName.toArray()));
        }
        catch(Exception e){
            e.printStackTrace();
        }    
        
        
    }
    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ShowTables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowTables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowTables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowTables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowTables().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> TableComboBox;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnInsert1;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtInput;
    // End of variables declaration//GEN-END:variables
}
