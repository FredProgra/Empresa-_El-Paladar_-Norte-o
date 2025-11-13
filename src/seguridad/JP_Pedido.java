package seguridad;


import Model.AppContext;
import clientes.ClienteService;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import javax.swing.JOptionPane;
import clientes.ClienteService;
import clientes.Cliente;
import clientes.Cliente;
import clientes.ClienteService;
import inventario.UnidadMedida;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import menu.Plato;
import pedidos.TipoPedido;


public class JP_Pedido extends javax.swing.JPanel {

  
    private DefaultTableModel modelo;
    private ClienteService clienteserv= new ClienteService();
    
    public JP_Pedido() {
        initComponents();
        cbotipodepedido.removeAllItems();
        cbotipodepedido.addItem(""+TipoPedido.LOCAL);
        cbotipodepedido.addItem(""+TipoPedido.DELIVERY);
        cbotipodepedido.addItem(""+TipoPedido.PARA_LLEVAR);
        
        
        
        
       
        
        
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
        lblC = new javax.swing.JLabel();
        jp1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jbtnGuardar = new javax.swing.JButton();
        jbtnEditar = new javax.swing.JButton();
        jbtnEliminar = new javax.swing.JButton();
        jbtnLimpiar = new javax.swing.JButton();
        cbotipodepedido = new javax.swing.JComboBox<>();
        txtcliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jbtnEliminarTodo = new javax.swing.JButton();
        btnverplatos = new javax.swing.JButton();
        jbtnBuscar = new javax.swing.JButton();
        lblF = new javax.swing.JLabel();
        jtxtQueryBuscar = new javax.swing.JTextField();
        jcmbQueryFiltrar = new javax.swing.JComboBox<>();
        jbtnFiltrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Buscar:");

        lblC.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        lblC.setText("Gestión del Pedido");

        jp1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel2.setText("Datos del Pedido");

        jLabel3.setText("ID");

        jLabel4.setText("Cliente");

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

        cbotipodepedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbotipodepedidoActionPerformed(evt);
            }
        });

        jLabel6.setText("Tipo de pedido");

        jbtnEliminarTodo.setBackground(new java.awt.Color(204, 204, 204));
        jbtnEliminarTodo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jbtnEliminarTodo.setText("Eliminar todo");

        btnverplatos.setBackground(new java.awt.Color(0, 204, 255));
        btnverplatos.setText("Ver Platos");
        btnverplatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnverplatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp1Layout = new javax.swing.GroupLayout(jp1);
        jp1.setLayout(jp1Layout);
        jp1Layout.setHorizontalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp1Layout.createSequentialGroup()
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jp1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jbtnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp1Layout.createSequentialGroup()
                                .addComponent(jbtnEditar)
                                .addGap(18, 18, 18)
                                .addComponent(jbtnEliminar)
                                .addGap(18, 18, 18)
                                .addComponent(jbtnLimpiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbtnEliminarTodo))
                            .addGroup(jp1Layout.createSequentialGroup()
                                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbotipodepedido, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)))))
                    .addGroup(jp1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnverplatos)))
                .addContainerGap())
        );
        jp1Layout.setVerticalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp1Layout.createSequentialGroup()
                        .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbotipodepedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)))
                .addComponent(btnverplatos)
                .addGap(46, 46, 46)
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnEliminar)
                    .addComponent(jbtnLimpiar)
                    .addComponent(jbtnEditar)
                    .addComponent(jbtnGuardar)
                    .addComponent(jbtnEliminarTodo))
                .addContainerGap())
        );

        jbtnBuscar.setBackground(new java.awt.Color(0, 0, 0));
        jbtnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnBuscar.setText("Ver");
        jbtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 537, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 142, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblC, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblF, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcmbQueryFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtQueryBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblC, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jp1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcmbQueryFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnFiltrar)
                    .addComponent(jLabel1)
                    .addComponent(jtxtQueryBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnBuscar))
                .addGap(37, 37, 37)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimpiarActionPerformed
        txtid.setText("");
  
        txtcliente.setText("");
        cbotipodepedido.setSelectedIndex(0);
       
    }//GEN-LAST:event_jbtnLimpiarActionPerformed

    private void jbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarActionPerformed
        try {
        if (txtid.getText().trim().isEmpty() ||
            
            txtcliente.getText().trim().isEmpty()) {

                JOptionPane.showMessageDialog(this, "Todos los campos deben ser completados.");
                return;
            }
        }catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_jbtnGuardarActionPerformed

    private void jtxtQueryBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtQueryBuscarKeyReleased
        
    }//GEN-LAST:event_jtxtQueryBuscarKeyReleased

    private void jbtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnBuscarActionPerformed

    private void cbotipodepedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbotipodepedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbotipodepedidoActionPerformed

    private void btnverplatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnverplatosActionPerformed
        // TODO add your handling code here:
        
         String[] columnas = {"Nombre","precio","Disponible"};
        modelo=new DefaultTableModel(columnas,0);
        JTable tabla=new JTable(modelo);
        tabla.setFillsViewportHeight(true);
        tabla.setRowHeight(25);
        
       JScrollPane scroll=new JScrollPane(tabla);
       jPanel1.add(scroll, java.awt.BorderLayout.CENTER);
       
    
    
       
      
          List<Plato> ListaPlatos=AppContext.menuservice.listaplatos();
          
        
        
        for(Plato p:ListaPlatos){
           Object[] fila={p.getNombre(),p.getPrecio(),p.isDisponible()};
          
           modelo.addRow(fila);
        }
        jPanel1.removeAll();
        jPanel1.setLayout(new java.awt.BorderLayout());
        
     javax.swing.JLabel titulo = new javax.swing.JLabel("MENU DEL DIA", javax.swing.SwingConstants.CENTER);
        titulo.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));

        jPanel1.add(titulo, java.awt.BorderLayout.NORTH);
        jPanel1.add(scroll, java.awt.BorderLayout.CENTER);

    
        jPanel1.validate();
        jPanel1.repaint();
    }//GEN-LAST:event_btnverplatosActionPerformed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnverplatos;
    private javax.swing.JComboBox<String> cbotipodepedido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnBuscar;
    private javax.swing.JButton jbtnEditar;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JButton jbtnEliminarTodo;
    private javax.swing.JButton jbtnFiltrar;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JButton jbtnLimpiar;
    private javax.swing.JComboBox<String> jcmbQueryFiltrar;
    private javax.swing.JPanel jp1;
    private javax.swing.JTextField jtxtQueryBuscar;
    private javax.swing.JLabel lblC;
    private javax.swing.JLabel lblF;
    private javax.swing.JTextField txtcliente;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
   /* private void initTable()
    {
        String[] header = {"DNI", "Nombre", "Tipo", "Celular", "Correo"};
        modelo = new DefaultTableModel(header,0){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        jtableClientes.setModel(modelo);
    }*/
}
