
package portiappp;
import javax.swing.JOptionPane;
import java.io.FileInputStream;
import javax.swing.table.TableColumnModel;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Jorge Loredo
 */
public class VentanaIngredientes extends javax.swing.JFrame {
 public int numero;
    public Double Suma;
    
    public VentanaIngredientes() {
        initComponents();
              this.setLocationRelativeTo(null);
              
       
              }
    
    
    public String excel(int a, int b){
        try{
                FileInputStream File = new FileInputStream("C:\\Users\\Jorge Loredo\\Documents\\NetBeansProjects\\PortiAppp\\src\\portiappp\\Costos PortiCrepas.xlsx");
                XSSFWorkbook  hoja = new XSSFWorkbook(File);
            if (hoja.getSheetAt(0).getRow(a).getCell(b).getCellType() == XSSFCell.CELL_TYPE_STRING)
                return hoja.getSheetAt(0).getRow(a).getCell(b).getStringCellValue();

            else if(hoja.getSheetAt(0).getRow(a).getCell(b).getCellType()== XSSFCell.CELL_TYPE_NUMERIC){
                return Double.toString(hoja.getSheetAt(0).getRow(a).getCell(b).getNumericCellValue());}
                hoja.close();
                File.close();
        }catch(Exception e){
                 System.out.println("No se puede leer");
        } return "";
        }
    
    public Double excelNumeric(int a, int b){
        try{
                FileInputStream File = new FileInputStream("C:\\Users\\Jorge Loredo\\Documents\\NetBeansProjects\\PortiAppp\\src\\portiappp\\Costos PortiCrepas.xlsx");
                XSSFWorkbook  hoja = new XSSFWorkbook(File);
            if (hoja.getSheetAt(0).getRow(a).getCell(b).getCellType() == XSSFCell.CELL_TYPE_STRING)
                return Double.parseDouble(hoja.getSheetAt(0).getRow(a).getCell(b).getStringCellValue());

            else if(hoja.getSheetAt(0).getRow(a).getCell(b).getCellType()== XSSFCell.CELL_TYPE_NUMERIC){
                return hoja.getSheetAt(0).getRow(a).getCell(b).getNumericCellValue();}
            
                hoja.close();
                File.close();
        }catch(Exception e){
                System.out.println("chale");
        } return -1.00;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("¿Cuántas crepas tienes en");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("mente vender?");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, 110, 30));

        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 540, 150, 30));

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, 170, 40));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Los costos totales son de:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 330, 30));

        jTextField3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 540, 170, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Los ingresos máximos son de:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 540, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("ENTER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 60, 130, 40));

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "PRODUCTO", "INGREDIENTES", "CANTIDAD", "PRECIO", "SOBRA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(255, 0, 0));
        jTable1.setRowHeight(26);
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 920, 370));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Digite el # de crepas que quieras");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 110, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/portiappp/red-wallpaper-background.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/portiappp/red-wallpaper-background.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, -40, 570, 460));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/portiappp/red-wallpaper-background.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/portiappp/red-wallpaper-background.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 600, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      VentanaEmpleado a = new VentanaEmpleado();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     this.Suma = 0.0;
        try{
        this.numero = Integer.parseInt(jTextField1.getText());
        }
       catch(NumberFormatException e){
       JOptionPane.showMessageDialog(null,"Inserta un número entero");
       }
               String Mat[][] = new String [13][5];
               for(int i =0; i<13; i++){
        Mat [i][0]= excel(i+7,1);
        Mat [i][1] = excel(i+7,4);
        }
        double Ingrediente[] = new double [13];
        for(int a = 0; a<13; a++){
            Ingrediente[a] = excelNumeric(a+7,4); 
        }
        double Cantidad[] = new double [13];
        for(int x = 0; x < 13; x++){
            Cantidad[x] = (Math.ceil((Ingrediente[x]*this.numero)/excelNumeric(x+7,2)));
        }
        int Cantidadd[] = new int [13];
        for(int l = 0; l<13;l++){
            Cantidadd[l] = (int)Cantidad [l];
        }
        
        for(int h = 0; h<13; h++){
            Mat[h][2] = Integer.toString(Cantidadd [h]);
        }
        
        Double Precio [] = new Double [13];
        for(int j = 0; j<13; j++){
            Precio[j] = excelNumeric(j+7,3);
        }
        for(int sac = 0; sac<13; sac++){
            Precio[sac] = Precio[sac]*Cantidadd[sac];
            Precio[sac] = (double)Math.round(Precio[sac]);
            this.Suma = this.Suma + Precio[sac];
        }
        
        for(int yo = 0; yo<13; yo++){
           Mat[yo][3] = "$" +Double.toString(Precio[yo]);
       }
        int Sobra[] = new int[13];
        for(int aux = 0; aux<13; aux++){
            Sobra[aux] = (int) (Cantidadd[aux]*excelNumeric(aux+7,2) - (Math.ceil((Ingrediente[aux]*this.numero))));
        }
        for(int alt = 0; alt<Precio.length; alt++){
           Mat[alt][4] = Integer.toString(Sobra[alt]);}
        
       jTextField1.setText("");   
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            Mat,
            new String [] {
                "PRODUCTO", "INGREDIENTES", "CANTIDAD", "PRECIO", "SOBRA"
            }
        ));  
TableColumnModel columnModel = jTable1.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(300);
        columnModel.getColumn(1).setPreferredWidth(50);
        columnModel.getColumn(2).setPreferredWidth(50);
        columnModel.getColumn(3).setPreferredWidth(50);
        columnModel.getColumn(4).setPreferredWidth(50);
        
        
        
        jTextField2.setText("$" + this.Suma);
     jTextField1.setText("");
     jTextField3.setText("$" + this.numero*25);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        
    }//GEN-LAST:event_jTextField2ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaIngredientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaIngredientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaIngredientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaIngredientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaIngredientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
