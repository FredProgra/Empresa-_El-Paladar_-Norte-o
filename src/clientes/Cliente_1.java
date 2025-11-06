
import clientes.ClienteService;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import javax.swing.JOptionPane;
import clientes.ClienteService;
import clientes.Cliente;


public class Cliente_1 extends javax.swing.JPanel {

  
    private DefaultTableModel modelo;
    private ClienteService clienteserv= new ClienteService();
    
    public Cliente_1() {
        initComponents();
        initTable();
        cargarDatos("");
    }
    
    private void cargarDatos(String filtro){
        modelo.setRowCount(0);
        
        List<Cliente> lista= clienteserv.listarclienteXfiltro(filtro);
        for (Cliente c : lista) {
            modelo.addRow(new Object[]{
                c.getNombre(), c.getId(), c.getDni(), c.getTelefono(), c.getCorreo(), c.getDni()
            });
    }
}

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtableClientes = new javax.swing.JTable();
        lblC = new javax.swing.JLabel();
        jp1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxtNombre = new javax.swing.JTextField();
        jbtnGuardar = new javax.swing.JButton();
        jbtnEditar = new javax.swing.JButton();
        jbtnEliminar = new javax.swing.JButton();
        jbtnLimpiar = new javax.swing.JButton();
        jcmbTipo = new javax.swing.JComboBox<>();
        jtxtCorreo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtxtDniRuc = new javax.swing.JTextField();
        jtxtCelular = new javax.swing.JTextField();
        jbtnEliminarTodo = new javax.swing.JButton();
        jbtnBuscar = new javax.swing.JButton();
        lblF = new javax.swing.JLabel();
        jtxtQueryBuscar = new javax.swing.JTextField();
        jcmbQueryFiltrar = new javax.swing.JComboBox<>();
        jbtnFiltrar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Buscar:");

        jtableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "DNI", "Nombre", "Tipo", "Celular", "Correo"
            }
        ));
        jScrollPane2.setViewportView(jtableClientes);

        lblC.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        lblC.setText("Gestión de Cliente");

        jp1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel2.setText("Datos de Cliente");

        jLabel3.setText("Nombre");

        jLabel4.setText("Correo");

        jLabel5.setText("DNI/RUC");

        jbtnGuardar.setBackground(new java.awt.Color(204, 204, 204));
        jbtnGuardar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jbtnGuardar.setText("Guardar");
        jbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarActionPerformed(evt);
            }
        });

        jbtnEditar.setBackground(new java.awt.Color(204, 204, 204));
        jbtnEditar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jbtnEditar.setText("Actualizar");

        jbtnEliminar.setBackground(new java.awt.Color(204, 204, 204));
        jbtnEliminar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jbtnEliminar.setText("Eliminar");

        jbtnLimpiar.setBackground(new java.awt.Color(204, 204, 204));
        jbtnLimpiar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jbtnLimpiar.setText("Limpiar");
        jbtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimpiarActionPerformed(evt);
            }
        });

        jLabel6.setText("Tipo");

        jLabel7.setText("Teléfono");

        jbtnEliminarTodo.setBackground(new java.awt.Color(204, 204, 204));
        jbtnEliminarTodo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jbtnEliminarTodo.setText("Eliminar todo");

        javax.swing.GroupLayout jp1Layout = new javax.swing.GroupLayout(jp1);
        jp1.setLayout(jp1Layout);
        jp1Layout.setHorizontalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp1Layout.createSequentialGroup()
                        .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtDniRuc, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jcmbTipo, 0, 117, Short.MAX_VALUE)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtNombre))
                .addGap(12, 12, 12)
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jtxtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90))
            .addGroup(jp1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jbtnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnEditar)
                .addGap(18, 18, 18)
                .addComponent(jbtnEliminar)
                .addGap(18, 18, 18)
                .addComponent(jbtnLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnEliminarTodo)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jp1Layout.setVerticalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtDniRuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnEliminar)
                    .addComponent(jbtnLimpiar)
                    .addComponent(jbtnEditar)
                    .addComponent(jbtnGuardar)
                    .addComponent(jbtnEliminarTodo))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jbtnBuscar.setBackground(new java.awt.Color(0, 0, 0));
        jbtnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnBuscar.setText("Ver");

        lblF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblF.setText("Filtrar:");

        jtxtQueryBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtQueryBuscarKeyReleased(evt);
            }
        });

        jbtnFiltrar.setBackground(new java.awt.Color(0, 0, 0));
        jbtnFiltrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnFiltrar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnFiltrar.setText("Ver");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblC, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblF, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcmbQueryFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbtnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtQueryBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblC, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtxtQueryBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbtnBuscar)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jcmbQueryFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbtnFiltrar))))
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimpiarActionPerformed
        jtxtNombre.setText("");
        jtxtDniRuc.setText("");
        jtxtCelular.setText("");
        jtxtCorreo.setText("");
        jcmbTipo.setSelectedIndex(0);
        jtableClientes.clearSelection();
    }//GEN-LAST:event_jbtnLimpiarActionPerformed

    private void jbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarActionPerformed
        try {
        if (jtxtNombre.getText().trim().isEmpty() ||
            jtxtDniRuc.getText().trim().isEmpty() ||
            jtxtCelular.getText().trim().isEmpty() ||
            jtxtCorreo.getText().trim().isEmpty()) {

                JOptionPane.showMessageDialog(this, "Todos los campos deben ser completados.");
                return;
            }
        }catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_jbtnGuardarActionPerformed

    private void jtxtQueryBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtQueryBuscarKeyReleased
        
    }//GEN-LAST:event_jtxtQueryBuscarKeyReleased
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtnBuscar;
    private javax.swing.JButton jbtnEditar;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JButton jbtnEliminarTodo;
    private javax.swing.JButton jbtnFiltrar;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JButton jbtnLimpiar;
    private javax.swing.JComboBox<String> jcmbQueryFiltrar;
    private javax.swing.JComboBox<String> jcmbTipo;
    private javax.swing.JPanel jp1;
    private javax.swing.JTable jtableClientes;
    private javax.swing.JTextField jtxtCelular;
    private javax.swing.JTextField jtxtCorreo;
    private javax.swing.JTextField jtxtDniRuc;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtQueryBuscar;
    private javax.swing.JLabel lblC;
    private javax.swing.JLabel lblF;
    // End of variables declaration//GEN-END:variables
    private void initTable()
    {
        String[] header = {"DNI", "Nombre", "Tipo", "Celular", "Correo"};
        modelo = new DefaultTableModel(header,0){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        jtableClientes.setModel(modelo);
    }
}
