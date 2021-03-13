/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobiblioteca;

/**
 *
 * @author danie
 */
public class FrameBuscarCliente extends javax.swing.JInternalFrame {
    static Principal principal;
    /**
     * Creates new form FrameRegistrarVenta
     */
    public FrameBuscarCliente() {
        initComponents();
    }
    
    public FrameBuscarCliente(Principal principal) {
        this.principal = principal;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        btnBuscarCliente = new javax.swing.JButton();
        panelMostrarCliente = new javax.swing.JScrollPane();
        txaMostrarCliente = new javax.swing.JTextArea();

        jLabel1.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLabel1.setText("BUSCAR CLIENTE");

        jLabel5.setText("Cédula de Identidad:");

        btnBuscarCliente.setText("Buscar");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        txaMostrarCliente.setColumns(20);
        txaMostrarCliente.setRows(5);
        panelMostrarCliente.setViewportView(txaMostrarCliente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(btnBuscarCliente))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(panelMostrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnBuscarCliente)
                .addGap(18, 18, 18)
                .addComponent(panelMostrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
    if (!txtCedula.getText().isEmpty()){
            String cedulaCliente = txtCedula.getText();
            Cliente cliente1 = principal.clientes.buscarNodo(cedulaCliente);
            if (cliente1 == null){
                txaMostrarCliente.setText("No se ha encontrado al cliente");
            }
            else {
                txaMostrarCliente.setText(cliente1.toString());
            }
            
            txtCedula.setText(null); 
        }
        else {
            txaMostrarCliente.setText("No se ha ingresado información para"
                    + " realizar la búsqueda.\nPor favor, ingrese un valor en "
                    + " el campo \"Cédula\"");
        }
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    public void limpiarAreaDeTexto(){
        txaMostrarCliente.setText(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane panelMostrarCliente;
    private javax.swing.JTextArea txaMostrarCliente;
    private javax.swing.JTextField txtCedula;
    // End of variables declaration//GEN-END:variables
}