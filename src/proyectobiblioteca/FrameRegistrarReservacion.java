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
public class FrameRegistrarReservacion extends javax.swing.JInternalFrame {
    static Principal principal;
    /**
     * Creates new form FrameRegistrarVenta
     */
    public FrameRegistrarReservacion() {
        initComponents();
    }
    
    public FrameRegistrarReservacion(Principal principal) {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCodigoReservacion = new javax.swing.JTextField();
        txtISBNReservacion = new javax.swing.JTextField();
        txtCIReservacion = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        txaMostrar = new javax.swing.JScrollPane();
        txaMostrarRegistroReservacion = new javax.swing.JTextArea();
        cmbDia = new javax.swing.JComboBox<String>();
        cmbAnio = new javax.swing.JComboBox<String>();
        cmbMes = new javax.swing.JComboBox<String>();

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 105, Short.MAX_VALUE)
        );

        jLabel6.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel6.setText("REGISTRAR RESERVACIONES");

        jLabel1.setText("Código");

        jLabel2.setText("ISBN del Libro");

        jLabel3.setText("Cédula del Cliente");

        jLabel4.setText("Fecha (dd/mm/aaaa)");

        btnAgregar.setText("Registrar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        txaMostrarRegistroReservacion.setColumns(20);
        txaMostrarRegistroReservacion.setRows(5);
        txaMostrar.setViewportView(txaMostrarRegistroReservacion);

        cmbDia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        cmbAnio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "2020", "2021", "2022" }));

        cmbMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtISBNReservacion, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                    .addComponent(txtCIReservacion)
                                    .addComponent(txtCodigoReservacion))
                                .addGap(27, 27, 27)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbDia, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(cmbAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(txaMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAgregar)
                .addGap(237, 237, 237))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel6)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtCodigoReservacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtISBNReservacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtCIReservacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(cmbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txaMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        //Se valida que los campos no estén vacíos y que la cédula y el ISBN
        //corresponda a un cliente y a un libro de la biblioteca, respectivamente
        if (!txtCodigoReservacion.getText().isEmpty()
                && !txtISBNReservacion.getText().isEmpty()
                && !txtCIReservacion.getText().isEmpty()
                && !cmbDia.getSelectedItem().toString().equals("-")
                && !cmbMes.getSelectedItem().toString().equals("-")
                && !cmbAnio.getSelectedItem().toString().equals("-")){
            
            if (principal.libros.buscarLibro(txtISBNReservacion.getText()) == null){
                txaMostrarRegistroReservacion.setText("El ISBN ingresado no corresponde"
                        + " a ningún libro ingresado en la biblioteca.\nPor favor, "
                        + "ingrese un ISBN válido.");
            }
            else {
                if (principal.clientes.buscarNodo(txtCIReservacion.getText()) == null){
                    txaMostrarRegistroReservacion.setText("La cédula ingresada no corresponde"
                            + " a ningún cliente registrado en la biblioteca.\nPor favor, "
                            + "ingrese una cédula válida.");
                }
                else {
                    if (principal.reservaciones.estaRegistrada(Integer.parseInt(txtCodigoReservacion.getText()))){
                        txaMostrarRegistroReservacion.setText("Ya existe una reservación con el código indicado."
                                + "\nPor favor, ingrese otro código.");
                    }
                    Reservacion reservacion1 = new Reservacion();
                    reservacion1.setCodigo(Integer.parseInt(txtCodigoReservacion.getText()));
                    reservacion1.setIsbnLibro(txtISBNReservacion.getText());
                    reservacion1.setCedulaCliente(txtCIReservacion.getText());
                    reservacion1.setFecha(new Fecha(Integer.parseInt(cmbDia.getSelectedItem().toString()), 
                                                    Integer.parseInt(cmbMes.getSelectedItem().toString()), 
                                                    Integer.parseInt(cmbAnio.getSelectedItem().toString())));
                    NodoReservacion nuevoNodoReservacion = new NodoReservacion(reservacion1);
                    principal.reservaciones.ingresarNodo(nuevoNodoReservacion);
                    txaMostrarRegistroReservacion.setText("¡Reservación registrada!\n" + reservacion1.toString());

                    limpiarCasillas();
                }
            }
        }
        else {
            txaMostrarRegistroReservacion.setText("No se ha ingresado información suficiente"
                    + " para realizar el registro.\nPor favor, llene todos los campos");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    //Método para limpiar todos los campos
    public void limpiarCasillas(){
        txtCIReservacion.setText(null);
        txtCodigoReservacion.setText(null);
        cmbDia.setSelectedIndex(0);
        cmbMes.setSelectedIndex(0);
        cmbAnio.setSelectedIndex(0);
        txtISBNReservacion.setText(null);
    }

    //Método para limpiar el área de texto
    public void limpiarAreaDeTexto(){
        txaMostrarRegistroReservacion.setText(null);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JComboBox<String> cmbAnio;
    private javax.swing.JComboBox<String> cmbDia;
    private javax.swing.JComboBox<String> cmbMes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane txaMostrar;
    private javax.swing.JTextArea txaMostrarRegistroReservacion;
    private javax.swing.JTextField txtCIReservacion;
    private javax.swing.JTextField txtCodigoReservacion;
    private javax.swing.JTextField txtISBNReservacion;
    // End of variables declaration//GEN-END:variables
}