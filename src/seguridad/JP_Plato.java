package seguridad;


import clientes.ClienteService;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import javax.swing.JOptionPane;
import clientes.ClienteService;
import clientes.Cliente;
import clientes.Cliente;
import clientes.ClienteService;
import menu.Categoria;
import menu.Plato;
import Model.AppContext;


public class JP_Plato extends javax.swing.JPanel {

  
    private DefaultTableModel modelo;
    private ClienteService clienteserv= new ClienteService();
    
    public JP_Plato() {
        initComponents();
        cbocategoria.removeAll();
        cbocategoria.addItem(""+Categoria.CEVICHES);
        cbocategoria.addItem(""+Categoria.BEBIDAS);
        cbocategoria.addItem(""+Categoria.POSTRES);
        cbocategoria.addItem(""+Categoria.SUDADOS);
        cbocategoria.addItem(""+Categoria.OTROS);
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
        txtid = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        cbocategoria = new javax.swing.JComboBox<>();
        txtnombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtprecio = new javax.swing.JTextField();
        txtdescripcion = new javax.swing.JTextField();
        btnEliminarTodo = new javax.swing.JButton();
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
        lblC.setText("Gestión del Plato");

        jp1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel2.setText("Datos del Plato");

        jLabel3.setText("ID");

        jLabel4.setText("Nombre");

        jLabel5.setText("Precio");

        btnGuardar.setBackground(new java.awt.Color(204, 204, 204));
        btnGuardar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(204, 204, 204));
        btnEditar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        btnEditar.setText("Actualizar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(204, 204, 204));
        btnEliminar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(204, 204, 204));
        btnLimpiar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        cbocategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbocategoriaActionPerformed(evt);
            }
        });

        jLabel6.setText("Categoria");

        jLabel7.setText("Descripción");

        txtprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecioActionPerformed(evt);
            }
        });

        txtdescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdescripcionActionPerformed(evt);
            }
        });

        btnEliminarTodo.setBackground(new java.awt.Color(204, 204, 204));
        btnEliminarTodo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        btnEliminarTodo.setText("Eliminar todo");

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
                            .addGroup(jp1Layout.createSequentialGroup()
                                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtid, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtprecio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                                .addGap(26, 26, 26)
                                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jp1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(cbocategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel6)))))
                    .addGroup(jp1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jp1Layout.createSequentialGroup()
                                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jp1Layout.createSequentialGroup()
                                        .addComponent(btnEditar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEliminar)))
                                .addGap(18, 18, 18)
                                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jp1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jp1Layout.createSequentialGroup()
                                        .addComponent(btnLimpiar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnEliminarTodo)))))))
                .addContainerGap())
        );
        jp1Layout.setVerticalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jp1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp1Layout.createSequentialGroup()
                        .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jp1Layout.createSequentialGroup()
                                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jp1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(17, 17, 17)))
                        .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbocategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(46, 46, 46)
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnLimpiar)
                    .addComponent(btnEditar)
                    .addComponent(btnGuardar)
                    .addComponent(btnEliminarTodo))
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
                        .addGap(98, 98, 98)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
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
                        .addComponent(jbtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtid.setText("");
        txtprecio.setText("");
        txtdescripcion.setText("");
        txtnombre.setText("");
        cbocategoria.setSelectedIndex(0);
        jtableClientes.clearSelection();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       
        
        try {
            
            if(txtid.getText().trim().isEmpty()){
            
            JOptionPane.showMessageDialog(this,"El ID no puede estar vacio","Mensaje",JOptionPane.ERROR_MESSAGE);
            }else{
                try {
                    
        
                    
        if (
            txtnombre.getText().trim().isEmpty() ||
            txtdescripcion.getText().trim().isEmpty() ||
            txtprecio.getText().trim().isEmpty()) {

                JOptionPane.showMessageDialog(this, "Todos los campos deben ser completados.","Mensaje",JOptionPane.ERROR_MESSAGE);
                return;
            }else{
            int id =Integer.parseInt(txtid.getText().trim());
        String nombre=txtnombre.getText().trim();
        String descripcion=txtdescripcion.getText().trim();
        double precio=Double.parseDouble(txtprecio.getText());
        String categoria=cbocategoria.getSelectedItem().toString();
            Plato p= new Plato(id,nombre, descripcion, precio, categoria);
          AppContext.menuservice.registrarPlato(p);
          JOptionPane.showMessageDialog(this,"Plato Regitrado Correctamente","Mensaje",JOptionPane.INFORMATION_MESSAGE);
        
        }
        }catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: Rellenar los formularios correctamente","Mensaje",JOptionPane.ERROR_MESSAGE);
        }
            
            
            }
            
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(this,"El ID no puede estar vacio","",JOptionPane.WARNING_MESSAGE);
        }
        
          
         
        
        
        
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jtxtQueryBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtQueryBuscarKeyReleased
        
    }//GEN-LAST:event_jtxtQueryBuscarKeyReleased

    private void jbtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnBuscarActionPerformed

    private void txtdescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdescripcionActionPerformed

    private void txtprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprecioActionPerformed

    private void cbocategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbocategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbocategoriaActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:

     int id=Integer.parseInt(txtid.getText().trim());
     
     AppContext.menuservice.eliminarPlato(id);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        try {
            
            if(txtid.getText().trim().isEmpty()){
            
            JOptionPane.showMessageDialog(this,"El ID no puede estar vacio","Mensaje",JOptionPane.ERROR_MESSAGE);
            }else{
                try {
                    
        
                    
        if (
            txtnombre.getText().trim().isEmpty() ||
            txtdescripcion.getText().trim().isEmpty() ||
            txtprecio.getText().trim().isEmpty()) {

                JOptionPane.showMessageDialog(this, "Todos los campos deben ser completados.","Mensaje",JOptionPane.ERROR_MESSAGE);
                return;
            }else{
            int id =Integer.parseInt(txtid.getText().trim());
        String nombre=txtnombre.getText().trim();
        String descripcion=txtdescripcion.getText().trim();
        double precio=Double.parseDouble(txtprecio.getText());
        String categoria=cbocategoria.getSelectedItem().toString();
            
          AppContext.menuservice.actualizarPlato(id, nombre, precio, categoria, descripcion);
          JOptionPane.showMessageDialog(this,"Plato Regitrado Correctamente","Mensaje",JOptionPane.INFORMATION_MESSAGE);
        
        }
        }catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: Rellenar los formularios correctamente","Mensaje",JOptionPane.ERROR_MESSAGE);
        }
            
            
            }
            
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(this,"El ID no puede estar vacio","",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarActionPerformed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarTodo;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cbocategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtnBuscar;
    private javax.swing.JButton jbtnFiltrar;
    private javax.swing.JComboBox<String> jcmbQueryFiltrar;
    private javax.swing.JPanel jp1;
    private javax.swing.JTable jtableClientes;
    private javax.swing.JTextField jtxtQueryBuscar;
    private javax.swing.JLabel lblC;
    private javax.swing.JLabel lblF;
    private javax.swing.JTextField txtdescripcion;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtprecio;
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
