
package calculadora;

/**
 *
 * @author ph
 */
public class Cal extends javax.swing.JFrame {

    /**
     * Creates new form Cal
     */
    double num, ans;
    int calculadora;
    
    
    public Cal() {
        initComponents();
        entrar.setEnabled(false);
        
       
        
    }
    public void aritmatica_operacional()
    {
       switch(calculadora)
       {
           case 1:
               ans = num + Double.parseDouble(jTextField1.getText());
               jTextField1.setText(Double.toString(ans));
               break;
            case 2:
               ans = num - Double.parseDouble(jTextField1.getText());
               jTextField1.setText(Double.toString(ans));
               break;
            case 3:
               ans = num * Double.parseDouble(jTextField1.getText());
               jTextField1.setText(Double.toString(ans));
               break;
            case 4:
               ans = num / Double.parseDouble(jTextField1.getText());
               jTextField1.setText(Double.toString(ans));
               break;
               
               
               
       } 
    }
    
    public void habilitar(){
       sair.setEnabled(true);
       entrar.setEnabled(false);
       jTextField1.setEnabled(true);
       numero0.setEnabled(true);
       numero1.setEnabled(true);
       numero2.setEnabled(true);
       numero3.setEnabled(true);
       numero4.setEnabled(true);
       numero5.setEnabled(true);
       numero6.setEnabled(true);
       numero7.setEnabled(true);
       numero8.setEnabled(true);
       numero9.setEnabled(true);
       seta.setEnabled(true);
       soma.setEnabled(true);
       dividir.setEnabled(true);
       subtrair.setEnabled(true);
       multiplicar.setEnabled(true);
       resultado.setEnabled(true);
       apagar.setEnabled(true);
       ponto.setEnabled(true);
    }
    public  void desabilitar(){
        entrar.setEnabled(true);
        sair.setEnabled(false);
        jTextField1.setEnabled(false);
        
       numero0.setEnabled(false);
       numero1.setEnabled(false);
       numero2.setEnabled(false);
       numero3.setEnabled(false);
       numero4.setEnabled(false);
       numero5.setEnabled(false);
       numero6.setEnabled(false);
       numero7.setEnabled(false);
       numero8.setEnabled(false);
       numero9.setEnabled(false);
       seta.setEnabled(false);
       soma.setEnabled(false);
       dividir.setEnabled(false);
       subtrair.setEnabled(false);
       multiplicar.setEnabled(false);
       resultado.setEnabled(false);
       apagar.setEnabled(false);
       ponto.setEnabled(false);
       
       
       
       
    }

    /
    @SuppressWarnings("unchecked")
                        
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        entrar = new javax.swing.JRadioButton();
        sair = new javax.swing.JRadioButton();
        seta = new javax.swing.JButton();
        apagar = new javax.swing.JButton();
        numero7 = new javax.swing.JButton();
        soma = new javax.swing.JButton();
        numero9 = new javax.swing.JButton();
        subtrair = new javax.swing.JButton();
        numero8 = new javax.swing.JButton();
        numero4 = new javax.swing.JButton();
        numero6 = new javax.swing.JButton();
        multiplicar = new javax.swing.JButton();
        numero5 = new javax.swing.JButton();
        numero1 = new javax.swing.JButton();
        numero3 = new javax.swing.JButton();
        dividir = new javax.swing.JButton();
        numero2 = new javax.swing.JButton();
        numero0 = new javax.swing.JButton();
        resultado = new javax.swing.JButton();
        ponto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setLocation(new java.awt.Point(500, 250));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jTextField1.setFont(new java.awt.Font("Liberation Mono", 1, 22)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(entrar);
        entrar.setFont(new java.awt.Font("Liberation Mono", 1, 18)); // NOI18N
        entrar.setText("ON");
        entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarActionPerformed(evt);
            }
        });

        buttonGroup1.add(sair);
        sair.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        sair.setText("OFF");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        seta.setText("<-");
        seta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setaActionPerformed(evt);
            }
        });

        apagar.setFont(new java.awt.Font("Liberation Sans", 1, 19)); // NOI18N
        apagar.setText("c");
        apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarActionPerformed(evt);
            }
        });

        numero7.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        numero7.setText("7");
        numero7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero7ActionPerformed(evt);
            }
        });

        soma.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        soma.setText("+");
        soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                somaActionPerformed(evt);
            }
        });

        numero9.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        numero9.setText("9");
        numero9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero9ActionPerformed(evt);
            }
        });

        subtrair.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        subtrair.setText("-");
        subtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtrairActionPerformed(evt);
            }
        });

        numero8.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        numero8.setText("8");
        numero8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero8ActionPerformed(evt);
            }
        });

        numero4.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        numero4.setText("4");
        numero4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero4ActionPerformed(evt);
            }
        });

        numero6.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        numero6.setText("6");
        numero6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero6ActionPerformed(evt);
            }
        });

        multiplicar.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        multiplicar.setText("*");
        multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicarActionPerformed(evt);
            }
        });

        numero5.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        numero5.setText("5");
        numero5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero5ActionPerformed(evt);
            }
        });

        numero1.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        numero1.setText("1");
        numero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero1ActionPerformed(evt);
            }
        });

        numero3.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        numero3.setText("3");
        numero3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero3ActionPerformed(evt);
            }
        });

        dividir.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        dividir.setText("/");
        dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dividirActionPerformed(evt);
            }
        });

        numero2.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        numero2.setText("2");
        numero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero2ActionPerformed(evt);
            }
        });

        numero0.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        numero0.setText("0");
        numero0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero0ActionPerformed(evt);
            }
        });

        resultado.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        resultado.setText("=");
        resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadoActionPerformed(evt);
            }
        });

        ponto.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        ponto.setText(".");
        ponto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pontoActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 0, 51));
        jLabel1.setForeground(new java.awt.Color(255, 0, 102));
        jLabel1.setText("1+");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(numero7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(numero8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(numero9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(subtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(numero4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(numero5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(numero6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(multiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(numero1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(numero2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(numero3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dividir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(numero0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ponto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(entrar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(sair)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seta, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(soma, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(entrar)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(seta))
                            .addComponent(soma)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numero7)
                    .addComponent(numero9)
                    .addComponent(subtrair)
                    .addComponent(numero8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numero4)
                    .addComponent(numero6)
                    .addComponent(multiplicar)
                    .addComponent(numero5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numero1)
                    .addComponent(numero3)
                    .addComponent(dividir)
                    .addComponent(numero2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numero0)
                    .addComponent(resultado)
                    .addComponent(ponto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void entrarActionPerformed(java.awt.event.ActionEvent evt) {                                       
       habilitar();
    }                                      

    private void numero9ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        jTextField1.setText(jTextField1.getText()+"4");
    }                                       

    private void numero6ActionPerformed(java.awt.event.ActionEvent evt) {                                        
       jTextField1.setText(jTextField1.getText()+"6");
    }                                       

    private void numero3ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        jTextField1.setText(jTextField1.getText()+"3");
        
    }                                       

    private void resultadoActionPerformed(java.awt.event.ActionEvent evt) {                                          
        aritmatica_operacional();
    }                                         

    private void numero1ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        jTextField1.setText(jTextField1.getText()+"1");
    }                                       

    private void numero2ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        jTextField1.setText(jTextField1.getText()+"2");
    }                                       

    private void numero4ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        jTextField1.setText(jTextField1.getText()+"4");
    }                                       

    private void numero5ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        jTextField1.setText(jTextField1.getText()+ "5");
    }                                       

    private void numero7ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        jTextField1.setText(jTextField1.getText()+"7");
    }                                       

    private void numero8ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        jTextField1.setText(jTextField1.getText()+"8");
    }                                       

    private void pontoActionPerformed(java.awt.event.ActionEvent evt) {                                      
       jTextField1.setText(jTextField1.getText()+".");
    }                                     

    private void multiplicarActionPerformed(java.awt.event.ActionEvent evt) {                                            
         num = Double.parseDouble(jTextField1.getText());
        calculadora = 3;
        jTextField1.setText("");
        jLabel1.setText(num + "*");
    }                                           

    private void dividirActionPerformed(java.awt.event.ActionEvent evt) {                                        
        num = Double.parseDouble(jTextField1.getText());
        calculadora = 4;
        jTextField1.setText("");
        jLabel1.setText(num + "/");
    }                                       

    private void somaActionPerformed(java.awt.event.ActionEvent evt) {                                     
        num = Double.parseDouble(jTextField1.getText());
        calculadora = 1;
        jTextField1.setText("");
        jLabel1.setText(num + "+");
               
    }                                    

    private void apagarActionPerformed(java.awt.event.ActionEvent evt) {                                       
        jTextField1.setText("");
    }                                      

    private void numero0ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        jTextField1.setText(jTextField1.getText()+"0");
    }                                       

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {                                     
        desabilitar();
    }                                    

    
    
    private void setaActionPerformed(java.awt.event.ActionEvent evt) {                                     
       
        int lenght = jTextField1.getText().length();
       int number = jTextField1.getText().length() - 1;
       String store;
       
       if(lenght > 0){
           StringBuilder back= new StringBuilder(jTextField1.getText());
           back.deleteCharAt(number);
           store = back.toString();
           jTextField1.setText(store);
       }
       
       
    }                                    

    private void subtrairActionPerformed(java.awt.event.ActionEvent evt) {                                         
         num = Double.parseDouble(jTextField1.getText());
        calculadora = 2;
        jTextField1.setText("");
        jLabel1.setText(num + "-");
    }                                        

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
            java.util.logging.Logger.getLogger(Cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton apagar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton dividir;
    private javax.swing.JRadioButton entrar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton multiplicar;
    private javax.swing.JButton numero0;
    private javax.swing.JButton numero1;
    private javax.swing.JButton numero2;
    private javax.swing.JButton numero3;
    private javax.swing.JButton numero4;
    private javax.swing.JButton numero5;
    private javax.swing.JButton numero6;
    private javax.swing.JButton numero7;
    private javax.swing.JButton numero8;
    private javax.swing.JButton numero9;
    private javax.swing.JButton ponto;
    private javax.swing.JButton resultado;
    private javax.swing.JRadioButton sair;
    private javax.swing.JButton seta;
    private javax.swing.JButton soma;
    private javax.swing.JButton subtrair;
    // End of variables declaration                   
}
