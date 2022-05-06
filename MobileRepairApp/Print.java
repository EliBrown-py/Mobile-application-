//Elijah Ibidayo 
//Final Project Java SDEV  200
//Ivy tech Community College 

public class Print extends javax.swing.JFrame {

 // Creates new form Print and call component 
    
    public Print() {
        initComponents();
    }
    String rpno;
    String custnme;
    String mphone;
    String mod;
    String snno;
    String Pdesc; 
    String mfee;
    String payd;
    String mbal;
       
   //Loads data collected form mobile.java class 
    public Print(String repairno, String custname, String phone, String model, String sn, String problemDescription, String fee, String paid, String bal) {
       initComponents();
       this.rpno = repairno;
       this.custnme = custname;
       this.mphone = phone;
       this.mod   = model;
       this.snno = sn;
       this.Pdesc = problemDescription;
       this.mfee = fee;
       this.payd = paid;
       this.mbal = bal;
      //Displays infomation collected 
       txtPrint.setText(txtPrint.getText()+"********************************\n");
       txtPrint.setText(txtPrint.getText()+"*****Mobile Repair Shop*********\n");
       txtPrint.setText(txtPrint.getText()+"\n");
       
        txtPrint.setText(txtPrint.getText()+ " " + "Repair No: " + rpno + "\n");
        txtPrint.setText(txtPrint.getText()+ " " + "Customer Name: " + custnme + "\n");
        txtPrint.setText(txtPrint.getText()+ " " + "Customer Number: " + mphone + "\n");
        txtPrint.setText(txtPrint.getText()+ " " + "Phone Model: " + mod + "\n");
        txtPrint.setText(txtPrint.getText()+ " " + "Serial Number: " + sn + "\n");
        txtPrint.setText(txtPrint.getText()+ " " + "Problem Descriprion: " +  Pdesc + "\n");
        txtPrint.setText(txtPrint.getText()+"\n");
        
        txtPrint.setText(txtPrint.getText()+ " " + "Repair Fee:  " +"$"+ mfee + "\n");
        txtPrint.setText(txtPrint.getText()+ " " + "Amount Paid: " +"$"+ payd + "\n");
        txtPrint.setText(txtPrint.getText()+ " " + "Balance Due: " +"$"+ mbal + "\n");
        
        txtPrint.setText(txtPrint.getText()+"******************************\n");
        txtPrint.setText(txtPrint.getText()+"Please bring back this reciept\n");
        txtPrint.setText(txtPrint.getText()+"in order to retrive your device\n");
        txtPrint.setText(txtPrint.getText()+"**Thanks for your Patronage***\n");
    }
    @SuppressWarnings("unchecked")
    //Form component method                       
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtPrint = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtPrint.setFont(new java.awt.Font("Monospaced", 1, 12)); 
        jScrollPane1.setViewportView(txtPrint);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }
    
      //print class form main method
        public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Print.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        // Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Print().setVisible(true);
            }
        });
    }

    // Variables declaration                    
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane txtPrint;
                       
}
