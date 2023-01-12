package Vistas;

import Modelos.Alumno;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.RowSorter.SortKey;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class VentanaPrincipal extends javax.swing.JFrame {
    
    ArrayList<Alumno> alumnos;
    DefaultTableModel modelo;
    TableRowSorter<TableModel> modeloOrdenado;
    int row;
    
    public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Información Alumnos");
        //Inicializo mis variables necesarias en todo el archivo
        modelo = (DefaultTableModel) jTable1.getModel();
        alumnos = new ArrayList<>();
        //Cargo los primeros datos
        cargarDatosPrincipio();
        
        //Añadimos al combo box las columnas
        for(int i = 0; i < jTable1.getColumnCount(); i++){
            cbColumnas.addItem(jTable1.getColumnName(i).toString());
        }
        
        //Para que no se pueda seleccionar mas de uno en la tabla
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        //Listener para cuando se pinche en la tabla obtener que fila se pulsó
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                row = jTable1.rowAtPoint(evt.getPoint());        
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btMostrar = new javax.swing.JButton();
        btModificar = new javax.swing.JButton();
        btNuevo = new javax.swing.JButton();
        btBorrar = new javax.swing.JButton();
        btFiltrar = new javax.swing.JButton();
        tfFiltrar = new javax.swing.JTextField();
        cbColumnas = new javax.swing.JComboBox<>();
        btOrdenar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "DNI", "Nombre", "Apellido", "Ciudad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        btMostrar.setText("Mostrar");
        btMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMostrarActionPerformed(evt);
            }
        });

        btModificar.setText("Modificar");
        btModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarActionPerformed(evt);
            }
        });

        btNuevo.setText("Nuevo");
        btNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevoActionPerformed(evt);
            }
        });

        btBorrar.setText("Borrar");
        btBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBorrarActionPerformed(evt);
            }
        });

        btFiltrar.setText("Filtrar");
        btFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFiltrarActionPerformed(evt);
            }
        });

        btOrdenar.setText("Ordenar");
        btOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOrdenarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(btMostrar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(tfFiltrar, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)))
                        .addGap(35, 35, 35)
                        .addComponent(btFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(cbColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btModificar)
                                .addGap(37, 37, 37)
                                .addComponent(btNuevo)
                                .addGap(45, 45, 45)
                                .addComponent(btBorrar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(btOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btMostrar)
                    .addComponent(btModificar)
                    .addComponent(btNuevo)
                    .addComponent(btBorrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btOrdenar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btFiltrar)
                    .addComponent(tfFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Evento para cuando se pulsa el boton de Filtrar
    private void btNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoActionPerformed
        //Abro el dialog que pide los datos
        PedirDatos darAlta = new PedirDatos(this, true);
        darAlta.setTitle("Alta alumno");
        darAlta.setVisible(true);
        //guardo los datos introducidos en variables auxiliares
        String dni = darAlta.tfDNI.getText();
        String nombre = darAlta.tfNombre.getText();
        String apellido = darAlta.tfApellido.getText();
        String ciudad = darAlta.tfCiudad.getText();
        double nota = 0;
        try{
            nota = Double.parseDouble(darAlta.tfNota.getText());
        }catch(NumberFormatException ex){
                
        }
        //compruebo que esas variables no esten vacías
        if(dni.equals("") || nombre.equals("") || apellido.equals("") || ciudad.equals("") || darAlta.tfNota.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Alumno no insertado, ha introducido algún campo vacio");
        }else{
            //compruebo que el dni introducido no exista
            if(consultarDNI(dni) == false){
                //añado el alumno al arrayList y actualizo
                Alumno aux = new Alumno(dni, nombre, apellido, ciudad, nota);
                alumnos.add(aux);
                actualizarTabla();
            }    
            else{
                JOptionPane.showMessageDialog(this, "DNI ya existente, alumno no insertado");
            }
        }    
    }//GEN-LAST:event_btNuevoActionPerformed
    
    //Evento para cuando se pulsa el boton de Filtrar
    private void btMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMostrarActionPerformed
        //Compruebo que haya seleccionado al menos uno en la tabla
        if(jTable1.getSelectedRowCount() > 0){
            //Obtengo que alumno se pulso
            //convertRowIndexToModel(row) -> para obtener que posición de verdad, la de del arrayList/modelo principal
            int modelRow = jTable1.convertRowIndexToModel(row);
            Alumno aux = alumnos.get(modelRow);

            PedirDatos darAlta = new PedirDatos(this, true);
            darAlta.setTitle("Mostrar alumno");
            //Muestro los datos de ese alumno y hago los campos ineditables
            darAlta.tfDNI.setText(aux.getDni());
            darAlta.tfDNI.setEditable(false);
            darAlta.tfNombre.setText(aux.getNombre());
            darAlta.tfNombre.setEditable(false);
            darAlta.tfApellido.setText(aux.getApellido());
            darAlta.tfApellido.setEditable(false);
            darAlta.tfCiudad.setText(aux.getCiudad());
            darAlta.tfCiudad.setEditable(false);
            darAlta.tfNota.setText(aux.getNota() + "");
            darAlta.tfNota.setEditable(false);

            darAlta.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(this, "Seleccione un alumno para ver su información");
        }
    }//GEN-LAST:event_btMostrarActionPerformed
    
    //Evento para cuando se pulsa el boton de Filtrar
    private void btFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFiltrarActionPerformed
        int pulsado = cbColumnas.getSelectedIndex();
        if(pulsado >= 0){
            
            String filtrar = tfFiltrar.getText();
            //Me creo el TableRowSorter con mi DefaultTableModel
            modeloOrdenado = new TableRowSorter<TableModel>(modelo);
            //Le pongo a mi tabla el RowSorter
            jTable1.setRowSorter(modeloOrdenado);
            //Le digo a mi TableRowSorter que me haga un filtro con el texto introducido y con la columna
            //del combobox pulsada
            //                                                filtro, columna
            modeloOrdenado.setRowFilter(RowFilter.regexFilter(filtrar, pulsado));
        }    
        else{
            JOptionPane.showMessageDialog(this, "Seleccione un elemento del combo box para saber por cual quiere filtrar");
        }
    }//GEN-LAST:event_btFiltrarActionPerformed
    
    //Evento para cuando se pulsa el boton de Borrar
    private void btBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBorrarActionPerformed
        //Compruebo que haya seleccionado al menos uno en la tabla
        if(jTable1.getSelectedRowCount() > 0){
            //Pregunto si desea eliminar
            int opcion = JOptionPane.showConfirmDialog(this, "¿Seguro que desea eliminar?");
            //Si pulsa YES
            if(opcion == 0){
                //Obtengo la posicion que se pulso
                int modelRow = jTable1.convertRowIndexToModel(row);
                //elimino y actualizo
                alumnos.remove(modelRow);
                actualizarTabla();
            }
            else{
                JOptionPane.showMessageDialog(this, "Alumno NO eliminado");
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Seleccione un alumno para eliminarlo");
        }
    }//GEN-LAST:event_btBorrarActionPerformed
    
    //Evento para cuando se pulsa el boton de Modificar
    private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed
        //Compruebo que haya seleccionado al menos uno en la tabla
        if(jTable1.getSelectedRowCount() > 0){   
            //Obtengo que alumno se pulso
            int modelRow = jTable1.convertRowIndexToModel(row);
            Alumno aux = alumnos.get(modelRow);
            
            PedirDatos darAlta = new PedirDatos(this, true);
            darAlta.setTitle("Modificar alumno");
            //le paso los datos del alumno
            darAlta.tfDNI.setText(aux.getDni());
            //Para que el dni no se pueda mofidicar
            darAlta.tfDNI.setEditable(false);
            darAlta.tfNombre.setText(aux.getNombre());
            darAlta.tfApellido.setText(aux.getApellido());
            darAlta.tfCiudad.setText(aux.getCiudad());
            darAlta.tfNota.setText(aux.getNota() + "");
            //muestro el dialog
            darAlta.setVisible(true);
            //obtengo los nuevos datos
            String dni = darAlta.tfDNI.getText();
            String nombre = darAlta.tfNombre.getText();
            String apellido = darAlta.tfApellido.getText();
            String ciudad = darAlta.tfCiudad.getText();
            double nota = 0;
            try{
                nota = Double.parseDouble(darAlta.tfNota.getText());
            }catch(NumberFormatException ex){

            }
            //compruebo que no haya introducido campos vacíos
            if(dni.equals("") || nombre.equals("") || apellido.equals("") || ciudad.equals("") || darAlta.tfNota.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Alumno no insertado, ha introducido algún campo vacio");
            }else{
                //Elimino primero
                alumnos.remove(modelRow);                                 
                //Despues añado a my arrayList en la misma posicion que elimine y actualizo
                Alumno aux2 = new Alumno(dni, nombre, apellido, ciudad, nota);
                alumnos.add(modelRow, aux2);
                actualizarTabla();                
            } 
        } 
        else{
            JOptionPane.showMessageDialog(this, "Seleccione un alumno para modificarlo");
        }
    }//GEN-LAST:event_btModificarActionPerformed
    
    //Evento para cuando se pulsa el boton de ordenar
    private void btOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOrdenarActionPerformed
        int pulsado = cbColumnas.getSelectedIndex();
        if(pulsado >= 0){        
            //Inicializo mi TableRowSorter
            modeloOrdenado = new TableRowSorter<TableModel>(modelo);
            //Le doy a mi tabla ese modelo
            jTable1.setRowSorter(modeloOrdenado);       
            //Me creo la lista de claves
            List<SortKey> claves = new ArrayList<>();
            //Añado a la lista de claves segun la columna pulso
            claves.add(new SortKey(pulsado,SortOrder.ASCENDING));
            //ordeno
            modeloOrdenado.setSortKeys(claves);
        }    
        else{
            JOptionPane.showMessageDialog(this, "Seleccione un elemento del combo box para saber por cual quiere filtrar");
        }
    }//GEN-LAST:event_btOrdenarActionPerformed

    
    //Métodos auxiliares
    //Para que haya unos alumnos nada mas abrir el programa
    public void cargarDatosPrincipio(){
        alumnos.add(new Alumno("88534612H", "Juan", "Lopez", "Madrid", 8.9));
        alumnos.add(new Alumno("12983612P", "Laura", "Perez", "Madrid", 9.1));
        alumnos.add(new Alumno("87356720L", "Len", "Gutierrez", "Granada", 5.4));
        alumnos.add(new Alumno("12349812O", "Gines", "Perez", "Barcelona", 5.9));
        actualizarTabla();
    }
    //Para actualizar las filas de la tabla cada vez, que añada, modifique o elimine un alumno
    public void actualizarTabla(){
        modelo.setRowCount(0);
        for(Alumno aux: alumnos){
            String dni = aux.getDni();
            String nombre = aux.getNombre();
            String apellido = aux.getApellido();
            String ciudad = aux.getCiudad();
            modelo.addRow(new Object[]{dni, nombre, apellido, ciudad});
        }
    }
    //Para comprobar que no se introducen dos dnis iguales
    public boolean consultarDNI(String dni){
        boolean existe = false;
        for(int i = 0; i < alumnos.size() && existe == false; i++){
            if(alumnos.get(i).getDni().equals(dni)){
                existe = true;
            }
        }
        return existe;
    }
    
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBorrar;
    private javax.swing.JButton btFiltrar;
    private javax.swing.JButton btModificar;
    private javax.swing.JButton btMostrar;
    private javax.swing.JButton btNuevo;
    private javax.swing.JButton btOrdenar;
    private javax.swing.JComboBox<String> cbColumnas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tfFiltrar;
    // End of variables declaration//GEN-END:variables
}
