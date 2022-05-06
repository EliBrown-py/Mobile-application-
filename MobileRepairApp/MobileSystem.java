//Elijah Ibidayyo 
//Project Java SDEV  200
//Ivy Tech Community College 

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import javax.swing.table.*;

public class MobileSystem extends javax.swing.JFrame {
    

    
     // Creates new form MobileSystem
    
    public MobileSystem() {
        initComponents();
        AutoID();
    }
    // This method is called from within the constructor to initialize the form.
    @SuppressWarnings("unchecked")
            
    //This method uses an "if statement" to aggrgate and increment repair ID       
    int id = 0;
    private void AutoID()
    {
        
        if (txtRNo.getText() == null || id == 0)
        {  
            id++;
            txtRNo.setText("RE00"+ id);
        }
        else 
        {
              id++;
              txtRNo.setText("RE00"+id);
            
        }
    }
    
  //an array that collect data and passes it into the method "print"   
   public void Print()
    {
     String repairno = txtRNo.getText();
     String custname = txtCustName.getText();
     String phone = txtPhone.getText();
     String model = txtDeviceModel.getText();
     String sn = txtSN.getText();
     String problemDescription = txtPDesc.getText();
     
     String fee = txtRFee.getText();
     String paid = txtPaid.getText();
     String bal = txtBalDue.getText(); 
     String status = txtStatus.getSelectedItem().toString();
    new Print(repairno, custname, phone, model, sn, problemDescription,
              fee, paid, bal ).setVisible(true);
    }
   
   // Method that clears text fields once the user prints data
   private void clearFields(){
       txtCustName.setText(null);
       txtPhone.setText(null);
       txtDeviceModel.setText(null);
       txtSN.setText(null);
       txtPDesc.setText(null);
       txtRFee.setText(null);
       txtPaid.setText(null);
       txtBalDue.setText(null);
       
       }
    //method that closes the whole program when the user hits close button
   public void close(){
    WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
            
    //form design component                        
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtRNo = new javax.swing.JLabel();
        txtCustName = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtDeviceModel = new javax.swing.JTextField();
        txtSN = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPDesc = new javax.swing.JTextPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtRFee = new javax.swing.JTextField();
        txtPaid = new javax.swing.JTextField();
        txtBalDue = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); 
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Mobile Repair App");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder
        (null, "Repair Infomation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
         javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        jLabel2.setText("Repair #");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        jLabel3.setText("Phone Number");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        jLabel4.setText("Device Model");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        jLabel5.setText("Customer Name ");
        
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        jLabel6.setText("Device Serial Number ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        jLabel8.setText("Problem Description");

        txtRNo.setFont(new java.awt.Font("Tahoma", 1, 12));
        txtRNo.setForeground(new java.awt.Color(255, 0, 0));
        txtRNo.setText("00000");

        txtPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPhoneKeyPressed(evt);
            }
        });

        jScrollPane1.setViewportView(txtPDesc);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSN, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtRNo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCustName, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                        .addComponent(txtPhone)
                        .addComponent(txtDeviceModel)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRNo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCustName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDeviceModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder
        (null, "Bill Information ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
         javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); 

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        jLabel7.setText("Repair Fee");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        jLabel10.setText("Paid");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        jLabel11.setText("Balance Due");

        txtRFee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRFeeActionPerformed(evt);
            }
        });
        txtRFee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRFeeKeyPressed(evt);
            }
        });

        txtPaid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPaidKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPaidKeyReleased(evt);
            }
        });

        txtBalDue.setEditable(false);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        jLabel12.setText("Status");

        txtStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "In Process", "Completed" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBalDue)
                    .addComponent(txtPaid)
                    .addComponent(txtRFee)
                    .addComponent(txtStatus, 0, 125, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtRFee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(txtBalDue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Repair#", "Customer", "Phone Model", "S/N", "Repair Price", "Paid", "Due", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jLabel1)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(411, 411, 411))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }  //End of from design component method
                     
   //Balance due is subtracted from amount paid and 
    private void txtPaidKeyReleased(java.awt.event.KeyEvent evt) {                                    
            int fee = Integer.parseInt(txtRFee.getText());    
            int paid = Integer.parseInt(txtPaid.getText());  
            
            int total = fee - paid;
            txtBalDue.setText(String.valueOf(total));
    } 
                                      
   //Print the data collected to the swing panel print class 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
   //Validation to display error if user submit a blank code 
        if (txtCustName.getText().equals("")||txtPhone.getText().equals("")
            ||txtPhone.getText().equals("")||txtDeviceModel.getText().equals("")
            ||txtSN.getText().equals("")||txtPDesc.getText().equals("")
            ||txtRFee.getText().equals("")||txtPaid.getText().equals("")||txtRNo.getText() == null)
        {
        JOptionPane.showMessageDialog(this, "Please enter Data in all fields!");
        } 
        //After all fields validated populate all data into table using array
        else
        { 
        String Print[] = { txtRNo.getText(),txtCustName.getText(), 
                          txtDeviceModel.getText(), txtSN.getText(),
                          txtRFee.getText(),txtPaid.getText(),
                          txtBalDue.getText(), 
                          txtStatus.getSelectedItem().toString()};
        DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
        tblModel.addRow(Print);
        Print();
        AutoID();
        clearFields();
        }
    }   
                                          
   //Close the window when user hit the clos button 
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        close();
    }                                        

    private void txtPhoneKeyPressed(java.awt.event.KeyEvent evt) {                                    
            // Phone Number Validation:
            String phoneNum = txtPhone.getText();
            int length = phoneNum.length();
            
            char c = evt.getKeyChar();
            if (evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
            {
                if (length < 10)
                {
                    txtPhone.setEditable(true);
              
                }
                else {
                    
                    JOptionPane.showMessageDialog(this, "Error! phone number character exceeded");
                    txtPhone.setEditable(false);
                    
                }
            }
                else
                {
                       if(evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE ||evt.getExtendedKeyCode() == KeyEvent.VK_DELETE){
                           txtPhone.setEditable(true);
                       }
                       else{
                            txtPhone.setEditable(false);
                            JOptionPane.showMessageDialog(this, "Error! only numbers are accepted");
                       }
                        
                    }
    }                                   
   
    private void txtRFeeKeyPressed(java.awt.event.KeyEvent evt) {                                   
        //Fee validation to only accept number
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)){
            txtRFee.setEditable(false);
            //Error Message 
            JOptionPane.showMessageDialog(this, "Error! only numbers are accepted");
        }
        else 
        {
            txtRFee.setEditable(true);
        }
    }                                  

    private void txtRFeeActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void txtPaidKeyPressed(java.awt.event.KeyEvent evt) {                                   
        //Valadation for paid textbox to only accept numerical values 
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)){
            txtPaid.setEditable(false);
            //Display error message
             JOptionPane.showMessageDialog(this, "Error! only numbers are accepted");
        }
        else {
            txtPaid.setEditable(true);
        }
    }                                  
    
        
    //Main class running the form 
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MobileSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MobileSystem().setVisible(true);
            }
        });
    }

    // Variables declaration                    
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtBalDue;
    private javax.swing.JTextField txtCustName;
    private javax.swing.JTextField txtDeviceModel;
    private javax.swing.JTextPane txtPDesc;
    private javax.swing.JTextField txtPaid;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtRFee;
    private javax.swing.JLabel txtRNo;
    private javax.swing.JTextField txtSN;
    private javax.swing.JComboBox<String> txtStatus;                 
}

