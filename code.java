

/**
 *
 * @author wende
 */
public class TelaEquação extends javax.swing.JFrame {

    /**
     * Creates new form TelaEquação
     */
    public TelaEquação() {
        initComponents();
        panresultado.setVisible(false);
    }                  

    private void txtAStateChanged(javax.swing.event.ChangeEvent evt) {                                  
        // TODO add your handling code here:
        lblA.setText(txtA.getValue().toString());
    }                                 

    private void txtBStateChanged(javax.swing.event.ChangeEvent evt) {                                  
        // TODO add your handling code here:
        lblB.setText(txtB.getValue().toString());
    }                                 

    private void txtCStateChanged(javax.swing.event.ChangeEvent evt) {                                  
        // TODO add your handling code here:
        lblC.setText(txtC.getValue().toString());
    }                                 

    private void btncalcActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        int a = Integer.parseInt(txtA.getValue().toString());
        int b = Integer.parseInt(txtB.getValue().toString());
        int c = Integer.parseInt(txtC.getValue().toString());
        // "math.pow " é a exponeciação
        double d = Math.pow(b , 2) - 4 * a * c;
        lbldelta.setText(String.format("%.1f", d));
        if (d<0) {
            lblraiz.setText("Não existem raizes reais ");
        } else {
            lblraiz.setText ("Existem raizes reais");
        }
        
        panresultado.setVisible(true);
    }                                       
