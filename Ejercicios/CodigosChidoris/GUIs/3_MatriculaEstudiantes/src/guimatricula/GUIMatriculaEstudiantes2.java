
package guimatricula;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.table.*;
import javax.swing.*;


public class GUIMatriculaEstudiantes2 extends javax.swing.JFrame {
    
    ImageIcon fondoEstudiantes, fondoManterias, fondoMatriculas;
    ImageIcon imagenEstudiantes, imagenMaterias, imagenMatriculas;

    //Estudiantes
    int contadorEstudiantes = 0;
    String[][] estudiantes;
    DefaultTableModel modeloTablaEstudiantes;
    ArrayList<Estudiantes> listaEstudiantes = new ArrayList();
    DefaultComboBoxModel modeloComboBoxEstudiantes = new DefaultComboBoxModel(listaEstudiantes.toArray());
    
    //Materias
    int contadorMaterias = 0;
    String[][] materias;
    DefaultTableModel modeloTablaMaterias;
    ArrayList<Materias> listaMaterias = new ArrayList();
    DefaultComboBoxModel modeloComboBoxMaterias = new DefaultComboBoxModel(listaMaterias.toArray());
    
    //Matriculas
    int contadorMatriculas = 0;
    String [][] matriculas;
    DefaultTableModel modeloTablaMatriculas;
    //ArrayList<Estudiantes> estudiantesDeLaMateria = new ArrayList(); //Mi clase materias deberá tener un arreglo de estudiantes..
                                                                     //O...
    ArrayList<Materias> listaMateriasDelEstudiante = new ArrayList(); //Mi clase estudiantes debería tener un arreglo de materias, por eso hice esto
        
    
    
    
    public GUIMatriculaEstudiantes2() {
        initComponents();
        //Imagenes de fondo
        fondoEstudiantes = new ImageIcon(getClass().getResource("/imagenes/Naruto.gif"));
        imagenEstudiantes = new ImageIcon(fondoEstudiantes.getImage().getScaledInstance(labelFondoEstudiantes.getWidth(), labelFondoEstudiantes.getHeight(), Image.SCALE_DEFAULT));
        labelFondoEstudiantes.setIcon(imagenEstudiantes);
        
        fondoManterias = new ImageIcon(getClass().getResource("/imagenes/natsu.gif"));
        imagenMaterias = new ImageIcon(fondoManterias.getImage().getScaledInstance(labelFondoMaterias.getWidth(), labelFondoMaterias.getHeight(), Image.SCALE_DEFAULT));
        labelFondoMaterias.setIcon(imagenMaterias);
        
        fondoMatriculas = new ImageIcon(getClass().getResource("/imagenes/Dbz.gif"));
        imagenMatriculas = new ImageIcon(fondoMatriculas.getImage().getScaledInstance(labelFondoMatriculas.getWidth(), labelFondoMatriculas.getHeight(), Image.SCALE_DEFAULT));
        labelFondoMatriculas.setIcon(imagenMatriculas);
  
        
        //Estudiantes
        String[] tituloTablaEstudiantes = new String[]{"N°","Apellido","Nombre"};
        modeloTablaEstudiantes = new DefaultTableModel(estudiantes, tituloTablaEstudiantes);
        tableEstudiantes.setModel(modeloTablaEstudiantes);
        //ComboBox Estudiantes
        //Colocar el modelo creado en la GUI a nuestro comboBox
        comboBoxEstudiante.setModel(modeloComboBoxEstudiantes);
    
        
        //Materias
        String[] titulosTablaMaterias = new String[]{"N°","Materia"};
        modeloTablaMaterias = new DefaultTableModel(materias, titulosTablaMaterias);
        tableMaterias.setModel(modeloTablaMaterias);
        //ComboBoxMaterias
        comboBoxMateria.setModel(modeloComboBoxMaterias);
        
        
        //Matriculas
        String [] titulosTablaMatriculas = new String[]{"N°","Materia","Estudiante","Edad"};
        modeloTablaMatriculas = new DefaultTableModel(matriculas, titulosTablaMatriculas);
        tableMatricula.setModel(modeloTablaMatriculas);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        pestañaEstudiantes = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEstudiantes = new javax.swing.JTable();
        labelNombreEstudiante = new javax.swing.JLabel();
        labelApellidoEstudiante = new javax.swing.JLabel();
        labelEdadEstudiante = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        textApellido = new javax.swing.JTextField();
        textEdad = new javax.swing.JTextField();
        buttonRegistrarEstudiante = new javax.swing.JButton();
        labelFondoEstudiantes = new javax.swing.JLabel();
        pestañaMaterias = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableMaterias = new javax.swing.JTable();
        labelNombreMateria = new javax.swing.JLabel();
        textMateria = new javax.swing.JTextField();
        buttonRegistrarMateria = new javax.swing.JButton();
        labelFondoMaterias = new javax.swing.JLabel();
        pestañaMatricula = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableMatricula = new javax.swing.JTable();
        labelMateria = new javax.swing.JLabel();
        labelEstudiante = new javax.swing.JLabel();
        comboBoxMateria = new javax.swing.JComboBox();
        comboBoxEstudiante = new javax.swing.JComboBox();
        buttonMatricular = new javax.swing.JButton();
        labelFondoMatriculas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pestañaEstudiantes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableEstudiantes);

        pestañaEstudiantes.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 143, 376, 146));

        labelNombreEstudiante.setText("Nombre:");
        pestañaEstudiantes.add(labelNombreEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 32, -1, -1));

        labelApellidoEstudiante.setText("Apellido:");
        pestañaEstudiantes.add(labelApellidoEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 71, -1, -1));

        labelEdadEstudiante.setText("Edad:");
        pestañaEstudiantes.add(labelEdadEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 111, -1, -1));
        pestañaEstudiantes.add(textNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 29, 80, -1));
        pestañaEstudiantes.add(textApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 68, 80, -1));
        pestañaEstudiantes.add(textEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 108, 30, -1));

        buttonRegistrarEstudiante.setText("Registrar");
        buttonRegistrarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistrarEstudianteActionPerformed(evt);
            }
        });
        pestañaEstudiantes.add(buttonRegistrarEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 67, -1, -1));
        pestañaEstudiantes.add(labelFondoEstudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 320));

        jTabbedPane1.addTab("Estudiantes", pestañaEstudiantes);

        tableMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tableMaterias);

        labelNombreMateria.setText("Materia:");

        buttonRegistrarMateria.setText("Registrar");
        buttonRegistrarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistrarMateriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pestañaMateriasLayout = new javax.swing.GroupLayout(pestañaMaterias);
        pestañaMaterias.setLayout(pestañaMateriasLayout);
        pestañaMateriasLayout.setHorizontalGroup(
            pestañaMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestañaMateriasLayout.createSequentialGroup()
                .addGroup(pestañaMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pestañaMateriasLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pestañaMateriasLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(labelNombreMateria)
                        .addGap(18, 18, 18)
                        .addGroup(pestañaMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonRegistrarMateria)
                            .addComponent(textMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(pestañaMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pestañaMateriasLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(labelFondoMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pestañaMateriasLayout.setVerticalGroup(
            pestañaMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pestañaMateriasLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(pestañaMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombreMateria)
                    .addComponent(textMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(buttonRegistrarMateria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(pestañaMateriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pestañaMateriasLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(labelFondoMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Materias", pestañaMaterias);

        tableMatricula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tableMatricula);

        labelMateria.setText("Materia:");

        labelEstudiante.setText("Estudiante:");

        buttonMatricular.setText("Registrar");
        buttonMatricular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMatricularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pestañaMatriculaLayout = new javax.swing.GroupLayout(pestañaMatricula);
        pestañaMatricula.setLayout(pestañaMatriculaLayout);
        pestañaMatriculaLayout.setHorizontalGroup(
            pestañaMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pestañaMatriculaLayout.createSequentialGroup()
                .addGroup(pestañaMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pestañaMatriculaLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pestañaMatriculaLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(pestañaMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelMateria)
                            .addComponent(labelEstudiante))
                        .addGap(84, 84, 84)
                        .addGroup(pestañaMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pestañaMatriculaLayout.createSequentialGroup()
                                .addComponent(comboBoxEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonMatricular))
                            .addComponent(comboBoxMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(pestañaMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pestañaMatriculaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(labelFondoMatriculas, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pestañaMatriculaLayout.setVerticalGroup(
            pestañaMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pestañaMatriculaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pestañaMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMateria)
                    .addComponent(comboBoxMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pestañaMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pestañaMatriculaLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(pestañaMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelEstudiante)
                            .addComponent(comboBoxEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pestañaMatriculaLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(buttonMatricular)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(pestañaMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pestañaMatriculaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(labelFondoMatriculas, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Matricula", pestañaMatricula);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRegistrarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistrarEstudianteActionPerformed
        // TODO add your handling code here:
        
        //Conversiones
        String nombre = textNombre.getText();
        String apellido = textApellido.getText();
        String edad = textEdad.getText();
        int edadToInt = Integer.parseInt(edad);
        //contadorEstudiantes++;
        //String contadorToString = String.valueOf(contadorEstudiantes);
       
        //Tabla
        //modeloTablaEstudiantes.addRow(new String[] {contadorToString,apellido,nombre,edad});
        
        //ComboBox...
        Estudiantes alumnos = new Estudiantes(apellido, nombre, edadToInt); //El oden en el que van a ir los combobox
        //modeloComboBoxEstudiantes.addElement(alumnos);
        
        //Comparacion
        boolean existencia = false;
        int iconoAdvertencia = JOptionPane.WARNING_MESSAGE;
        for(Estudiantes item: listaEstudiantes){
            if(item.getNombre().equals(alumnos.getNombre())){
                if(item.getApellido().equals(alumnos.getApellido())){
                    if(item.getEdad() == alumnos.getEdad()){
                    existencia = true;
                    break;
                    }
                }
            }
        }
        
        if(existencia == false){
          contadorEstudiantes++;
          String contadorToString = String.valueOf(contadorEstudiantes);
            
            listaEstudiantes.add(alumnos);
            modeloTablaEstudiantes.addRow(new String[] {contadorToString,apellido,nombre,edad});
            modeloComboBoxEstudiantes.addElement(alumnos); //Me va a salir en el combo box solo el apellido y el nombre, no la edad, es por el ToString.
            
        }else{
        
             JOptionPane.showMessageDialog(rootPane, "Ese estudiante ya fue registrado...", "INFORMACION", iconoAdvertencia);
        }
        
        
    }//GEN-LAST:event_buttonRegistrarEstudianteActionPerformed

    private void buttonRegistrarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistrarMateriaActionPerformed
        // TODO add your handling code here:
        //Conversiones
        String nombre = textMateria.getText();
        //contadorMaterias++;
        //String contadorToInt = String.valueOf(contadorMaterias); //Comenté para poner dentro del if no se repite, porque cada vez quepresiono el boton..se sumaba, pero ahora solo se suma cada vez que se añade
        
        //Tabla..
        //modeloTablaMaterias.addRow(new String[]{contadorToInt, nombre}); //Le voy a poner en la comparacion...
        
        //ComboBox..
        Materias asignaturas = new Materias(nombre);
       // modeloComboBoxMaterias.addElement(asignaturas); //Este tambine... para que me filtre al combobox solo una vez esa materia
        
        //Comparacion...
        boolean existencia = false;
        int iconoInformacion = JOptionPane.INFORMATION_MESSAGE;
        for(Materias item: listaMaterias){
        
            if(item.getNombre().equals(asignaturas.getNombre())){
                existencia = true;
                break;
            }
        
        }
        
        if(existencia == false){ 
         contadorMaterias++;
         String contadorToInt = String.valueOf(contadorMaterias);
         
         listaMaterias.add(asignaturas);
         modeloTablaMaterias.addRow(new String[]{contadorToInt, nombre});
         modeloComboBoxMaterias.addElement(asignaturas);
         
        }else{
        JOptionPane.showMessageDialog(rootPane, "Esa materia ya fue registrada.", "INFORMACION", iconoInformacion);
        }
        
    }//GEN-LAST:event_buttonRegistrarMateriaActionPerformed

    private void buttonMatricularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMatricularActionPerformed
        // TODO add your handling code here:
        //Conversion... !
        Estudiantes estudianteSeleccionado = (Estudiantes)comboBoxEstudiante.getSelectedItem();
        Materias materiaSeleccionada = (Materias)comboBoxMateria.getSelectedItem();
        //contadorMatriculas++;
        //String contadorMatriculasToString = String.valueOf(contadorMatriculas);
        
        //Para esto me servian los getter y setter
        String nombreEstudiante = estudianteSeleccionado.getNombre();
        String apellidoEstudiante = estudianteSeleccionado.getApellido();
        int edadEstudiante = estudianteSeleccionado.getEdad();
   
        String nombreMateria = materiaSeleccionada.getNombre();
        //Tabla..
        // modeloTablaMatriculas.addRow(new String[]{contadorMatriculasToString, nombreMateria, apellidoEstudiante+" "+nombreEstudiante});
      
        //Comparacion
        listaMateriasDelEstudiante = estudianteSeleccionado.getMaterias(); //De mi lista de materias que tenga el estudiante, extraeme la seleccionada
        int cantidadMaterias = listaMateriasDelEstudiante.size(); //la cantidad de materias se determina por
        boolean existe = false;
        int iconoError = JOptionPane.ERROR_MESSAGE;
        
        for(Materias item: listaMateriasDelEstudiante){
                if(item.getNombre().equals(materiaSeleccionada.getNombre())){
                    existe = true;
                   break;
                }
            
        }
        
        if(existe == false){
         contadorMatriculas++;
          String contadorMatriculasToString = String.valueOf(contadorMatriculas);
          
          listaMateriasDelEstudiante.add(materiaSeleccionada);
          modeloTablaMatriculas.addRow(new String[]{contadorMatriculasToString, nombreMateria, apellidoEstudiante+" "+nombreEstudiante});
          //No agrego nada porque no hice un comboBox para esto...
        }else{
        
            JOptionPane.showMessageDialog(rootPane, "Este estudiante ya tiene esa materia registrada.", "ERROR", iconoError);
        }
        
        
    }//GEN-LAST:event_buttonMatricularActionPerformed

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
            java.util.logging.Logger.getLogger(GUIMatriculaEstudiantes2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIMatriculaEstudiantes2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIMatriculaEstudiantes2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIMatriculaEstudiantes2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIMatriculaEstudiantes2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonMatricular;
    private javax.swing.JButton buttonRegistrarEstudiante;
    private javax.swing.JButton buttonRegistrarMateria;
    private javax.swing.JComboBox comboBoxEstudiante;
    private javax.swing.JComboBox comboBoxMateria;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelApellidoEstudiante;
    private javax.swing.JLabel labelEdadEstudiante;
    private javax.swing.JLabel labelEstudiante;
    private javax.swing.JLabel labelFondoEstudiantes;
    private javax.swing.JLabel labelFondoMaterias;
    private javax.swing.JLabel labelFondoMatriculas;
    private javax.swing.JLabel labelMateria;
    private javax.swing.JLabel labelNombreEstudiante;
    private javax.swing.JLabel labelNombreMateria;
    private javax.swing.JPanel pestañaEstudiantes;
    private javax.swing.JPanel pestañaMaterias;
    private javax.swing.JPanel pestañaMatricula;
    private javax.swing.JTable tableEstudiantes;
    private javax.swing.JTable tableMaterias;
    private javax.swing.JTable tableMatricula;
    private javax.swing.JTextField textApellido;
    private javax.swing.JTextField textEdad;
    private javax.swing.JTextField textMateria;
    private javax.swing.JTextField textNombre;
    // End of variables declaration//GEN-END:variables
}
