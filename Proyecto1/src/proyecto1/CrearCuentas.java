
package proyecto1;

public class CrearCuentas extends javax.swing.JInternalFrame {

    public int indice;
    Clientes[] infoPersona = new Clientes[5];

    public CrearCuentas(Clientes[] personas) {
        initComponents();
        this.infoPersona = personas;
        //instanciar cada objeto del arreglo
        mostarInformacion();
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
        combo1 = new javax.swing.JComboBox<>();
        BTMAsignar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Asignacion de cuentas");

        jLabel1.setText("SELECCIONE AL CLIENTE QUE SE ASIGNARA LA CUENTA");

        combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        BTMAsignar.setText("ASIGNAR");
        BTMAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTMAsignarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(107, 107, 107))
            .addGroup(layout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addComponent(BTMAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(BTMAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void mostarInformacion() {
        combo1.removeAllItems();
        for (int i = 0; i < infoPersona.length; i++) {
            if (infoPersona[i].getNombre() != null) {
                combo1.addItem(infoPersona[i].getDPI() + " - " + infoPersona[i].getNombre() + " " + infoPersona[i].getApellido());
            }
        }
    }
    
    private void BTMAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTMAsignarActionPerformed
        indice = combo1.getSelectedIndex();

        switch (indice) {
            case 0: // cliente 1
                infoPersona[0].AsociarCuenta(Proyecto1.ContadorCuentas);
                Proyecto1.ContadorCuentas++;
                break;
            case 1: // cliente 2
                infoPersona[1].AsociarCuenta(Proyecto1.ContadorCuentas);
                Proyecto1.ContadorCuentas++;
                break;
            case 2: //cliente 3
                infoPersona[2].AsociarCuenta(Proyecto1.ContadorCuentas);
                Proyecto1.ContadorCuentas++;
                break;
            case 3: //cliente 4
                infoPersona[3].AsociarCuenta(Proyecto1.ContadorCuentas);
                Proyecto1.ContadorCuentas++;

                break;
            case 4: //cliente 5
                infoPersona[4].AsociarCuenta(Proyecto1.ContadorCuentas);
                Proyecto1.ContadorCuentas++;
                break;
        }

    }//GEN-LAST:event_BTMAsignarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTMAsignar;
    private javax.swing.JComboBox<String> combo1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
