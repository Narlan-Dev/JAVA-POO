package schedule;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Table extends javax.swing.JFrame implements BackgroudColor{
    
    public Table() {
        initComponents();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jTextField3 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        
        setUndecorated(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(45, 118, 232));

        jLabel7.setBackground(new java.awt.Color(45, 118, 232));
        jLabel7.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("x");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(45, 118, 232));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schedule/Imagens/icons8_book_50px_2.png"))); // NOI18N

        jLabel10.setBackground(new java.awt.Color(45, 118, 232));
        jLabel10.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Schedule");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addGap(115, 115, 115))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(45, 118, 232));

        jPanel5.setBackground(new java.awt.Color(240, 240, 240));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel5MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel5MousePressed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(240, 240, 240));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schedule/Imagens/icons8_Edit_50px.png"))); // NOI18N

        jLabel6.setBackground(new java.awt.Color(45, 118, 232));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(45, 118, 232));
        jLabel6.setText("EDIT");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(23, 23, 23))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(240, 240, 240));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel6MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel6MousePressed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(240, 240, 240));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schedule/Imagens/icons8_delete_user_male_50px.png"))); // NOI18N

        jLabel11.setBackground(new java.awt.Color(45, 118, 232));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(45, 118, 232));
        jLabel11.setText("DELETE");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel12.setBackground(new java.awt.Color(45, 118, 232));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("*Name");

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel13.setBackground(new java.awt.Color(45, 118, 232));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("*Phone");

        jTextField2.setBackground(new java.awt.Color(45, 118, 232));
        jTextField2.setForeground(new Color(255, 255, 255));
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField2.setBorder(null);
        jTextField2.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        jTextField2.setSelectionColor(new java.awt.Color(240, 240, 240));
        jTextField2.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField2CaretUpdate(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        jTextField3.setBackground(new java.awt.Color(45, 118, 232));
        jTextField3.setForeground(new Color(255, 255, 255));
        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField3.setBorder(null);
        jTextField3.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        jTextField3.setSelectionColor(new java.awt.Color(240, 240, 240));
        jTextField3.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField3CaretUpdate(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(45, 118, 232));
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Description");

        jScrollPane1.setBackground(new java.awt.Color(45, 118, 232));

        jTextArea1.setBackground(new java.awt.Color(45, 118, 232));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(240, 240, 240));
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jTextArea1.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        jTextArea1.setSelectionColor(new java.awt.Color(240, 240, 240));
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTextField3))
                .addGap(31, 31, 31))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jScrollPane2.setBackground(new java.awt.Color(45, 118, 232));
        jScrollPane2.setBorder(null);
        jScrollPane2.setToolTipText("");

        jTable2.setBackground(new java.awt.Color(45, 118, 232));
        jTable2.setForeground(new Color(255, 255, 255));
        jTable2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Id"
            }
        ));
        if(jTable2.getColumnModel().getColumnCount() > 0){
            jTable2.getColumnModel().getColumn(1).setMinWidth(0);
            jTable2.getColumnModel().getColumn(1).setMaxWidth(0);
        }
        jTable2.setGridColor(new java.awt.Color(45, 188, 232));
        jTable2.setSelectionBackground(new java.awt.Color(45, 118, 232));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(356, 356, 356))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 4, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        
    private void jLabel7MousePressed(java.awt.event.MouseEvent evt){                                     
        jLabel12.setText("*Name");
        resetColor(jLabel12);
        jLabel13.setText("*Phone");
        resetColor(jLabel13);
        jTextArea1.setText("");
        jTextArea1.setForeground(new Color(255, 255, 255));
        jTextField2.setText("");
        jTextField3.setText("");
        jTable2.clearSelection();
        this.dispose();
    }                                    
    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt){                                     
        setColor(jPanel5);
    }                                    
    private void jPanel5MouseExited(java.awt.event.MouseEvent evt){                                    
        resetColor(jPanel5);
    }                                   
    private void jPanel6MouseEntered(java.awt.event.MouseEvent evt){                                     
        setColor(jPanel6);
    }                                    
    private void jPanel6MouseExited(java.awt.event.MouseEvent evt){                                    
        resetColor(jPanel6);
    }
    private void jPanel6MousePressed(java.awt.event.MouseEvent evt){                                     
        DefaultTableModel tblModel = (DefaultTableModel) jTable2.getModel();
        
        if(jTable2.getSelectedRowCount() == 1){
            String tblId = (String) tblModel.getValueAt(jTable2.getSelectedRow(), 1);
            Registration.remove(Registration.searchById(tblId));
            clearJTexts();
        }else{
            if(jTable2.getRowCount() == 0){
                jTextArea1.setText("List is Empty");
                jTextArea1.setForeground(new Color(255, 0, 51));
            }else{
                try{
                    jLabel12.setText("*Name");
                    resetColor(jLabel12);
                    jLabel13.setText("*Phone");
                    resetColor(jLabel13);
                    Registration.remove(Registration.searchByNamePhone(jTextField2.getText(), jTextField3.getText()));
                    clearJTexts();
                    jTextArea1.setText("");
                    jTextArea1.setForeground(new Color(255, 255, 255));
                }catch(InvalidCustomer e){
                    jTextArea1.setText(e.getMessage());
                    jTextArea1.setForeground(new Color(255, 0, 51));
                }catch(RequiredFieldExcecption e){
                    jLabel12.setText("*Name");
                    resetColor(jLabel12);
                    jLabel13.setText("*Phone");
                    resetColor(jLabel13);
                    if(jTextField2.getText().equals("")){
                        jLabel12.setText("");
                        jLabel12.setText("*Nome"+e.getMessage());
                        setColor(jLabel12);
                    }
                    if(jTextField3.getText().equals("")){
                        jLabel13.setText("");
                        jLabel13.setText("*Phone"+e.getMessage());
                        setColor(jLabel13);
                    }
                }  
            }
        }
    }
    private void jPanel5MousePressed(java.awt.event.MouseEvent evt){                                     
        DefaultTableModel tblModel = (DefaultTableModel) jTable2.getModel();
        
        if(jTable2.getSelectedRowCount() == 1){
            String tblId = (String) tblModel.getValueAt(jTable2.getSelectedRow(), 1);
            Registration.update(Registration.searchById(tblId), jTextField2.getText(), jTextField3.getText(), jTextArea1.getText());
            clearJTexts();
        }else{
            if(jTable2.getRowCount() == 0){
                jTextArea1.setText("List is Empty");
                jTextArea1.setForeground(new Color(255, 0, 51));
            }else{
                try{
                    jLabel12.setText("*Name");
                    resetColor(jLabel12);
                    jLabel13.setText("*Phone");
                    resetColor(jLabel13);
                    Registration.update(Registration.searchByNamePhone(jTextField2.getText(), jTextField3.getText()), jTextField2.getText(), jTextField3.getText(), jTextArea1.getText());
                    clearJTexts();
                    jTextArea1.setText("");
                    jTextArea1.setForeground(new Color(255, 255, 255));
                }catch(InvalidCustomer e){
                    jTextArea1.setText(e.getMessage());
                    jTextArea1.setForeground(new Color(255, 0, 51));
                }catch(RequiredFieldExcecption e){
                    jLabel12.setText("*Name");
                    resetColor(jLabel12);
                    jLabel13.setText("*Phone");
                    resetColor(jLabel13);
                    if(jTextField2.getText().equals("")){
                        jLabel12.setText("");
                        jLabel12.setText("*Nome"+e.getMessage());
                        setColor(jLabel12);
                    }
                    if(jTextField3.getText().equals("")){
                        jLabel13.setText("");
                        jLabel13.setText("*Phone"+e.getMessage());
                        setColor(jLabel13);
                    }
                }  
            }
        }
    }
    private void jTable2MouseClicked(java.awt.event.MouseEvent evt){
        DefaultTableModel tblModel = (DefaultTableModel) jTable2.getModel();
        String tblId = (String) tblModel.getValueAt(jTable2.getSelectedRow(), 1);
        Client costumer;

        costumer = Registration.searchById(tblId);
        jTextField2.setText(costumer.getName());
        jTextField3.setText(costumer.getPhone());
        jTextArea1.setText(costumer.getDescription());
        jLabel12.setText("*Name");
        resetColor(jLabel12);
        jLabel13.setText("*Phone");
        resetColor(jLabel13);
    }
    private void jTextField2CaretUpdate(javax.swing.event.CaretEvent evt) {                                        
        jLabel12.setText("*Name");
        resetColor(jLabel12);
    }
    private void jTextField3CaretUpdate(javax.swing.event.CaretEvent evt) {                                        
        jLabel13.setText("*Phone");
        resetColor(jLabel13);
    }  
    public void addToTable(String name, String id){
        String data[] = {name, id}; 
        DefaultTableModel tblModel = (DefaultTableModel) jTable2.getModel();
        tblModel.addRow(data);
        jTextArea1.setText("");
        jTextArea1.setForeground(new Color(255, 255, 255));
    }
    public void clearTable(){
        ((DefaultTableModel) jTable2.getModel()).setRowCount(0);
    }
    public void clearJTexts(){
        jTextField2.setText("");
        jTextField3.setText("");
        jTextArea1.setText("");
    }
    public void setColor(JLabel label){
        label.setForeground(new Color(255, 0, 51));
    }
    public void resetColor(JLabel label){
        label.setForeground(new Color(255, 255, 255));
    }                                 
    public void setColor(JPanel panel){
        panel.setBackground(new java.awt.Color(155, 163, 239));
    }
    public void resetColor(JPanel panel){
        panel.setBackground(new java.awt.Color(240, 240, 240));
    }  
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Table().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration                   
}

