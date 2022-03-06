package apresentacao;

import java.awt.Desktop;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author iapereira
 */
public class Main extends javax.swing.JFrame {

    private File[] vetFotos;
    private int posAtualVetFoto;
    private String pastaSelecionada;
    private int largura;
    private int altura;

    /**
     * Creates new form Tela
     */
    public Main() {
        initComponents();
        this.imagem.setText("");
        this.largura = 400;
        this.altura = 400;
        this.setResizable(false);
        
        this.testarPasta("./pescoco/");
        this.testarPasta("./coxa/");
        this.testarPasta("./costa/");
        this.testarPasta("./perna/");
        this.testarPasta("./braco/");

//            System.exit(0);
//            for (File imagem : vetFile) {
//                if (imagem.getName().contains(".jpg") || imagem.getName().contains(".png")) {                   
//                   
//                    latex += "\n\n"
//                            + " \\section{"+ imagem.getName().substring(0, 1).toUpperCase() +  imagem.getName().substring(1, imagem.getName().indexOf("."))+"} \n\n"
//                            + " \\begin{frame} \n"
//                            + "\\frametitle{" + imagem.getName().substring(0, 1).toUpperCase() +  imagem.getName().substring(1, imagem.getName().indexOf(".")) + "}\n"
//                            + "\\begin{figure}\n"
//                            + "\\centering\n"
//                            + "\\includegraphics[width=1\\linewidth]{" + imagem.getAbsoluteFile() + "}\n"
//                            + "\\caption{" +imagem.getName().substring(0, imagem.getName().indexOf("."))+ "}\n"
//                            + "\\label{fig:" + imagem.getName().substring(0, imagem.getName().indexOf(".")) + "}\n"
//                            + "\\end{figure}\n"
//                            + "\\end{frame} \n\n\n";
//                }
//            }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        button = new javax.swing.JButton();
        braco = new javax.swing.JRadioButton();
        pescoco = new javax.swing.JRadioButton();
        btn_registrar = new javax.swing.JButton();
        imagem = new javax.swing.JLabel();
        btn_anterior = new javax.swing.JButton();
        btn_proxima = new javax.swing.JButton();
        coxa = new javax.swing.JRadioButton();
        perna = new javax.swing.JRadioButton();
        costa = new javax.swing.JRadioButton();
        btn_abrirPastaCoxa = new javax.swing.JButton();
        btn_abrirPastaPescoco = new javax.swing.JButton();
        btn_abrirPastaCosta = new javax.swing.JButton();
        btn_abrirPastaPerna = new javax.swing.JButton();
        btn_abrirPastaBraco = new javax.swing.JButton();
        label_NroFoto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        button.setText("Diretório");
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        braco.setText("Braço");

        pescoco.setText("Pescoço");

        btn_registrar.setText("Classificar");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        imagem.setText("jLabel1");

        btn_anterior.setText("anterior");
        btn_anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anteriorActionPerformed(evt);
            }
        });

        btn_proxima.setText("proxima");
        btn_proxima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_proximaActionPerformed(evt);
            }
        });

        coxa.setText("Coxa");

        perna.setText("Perna");

        costa.setText("Costa");

        btn_abrirPastaCoxa.setText("Pasta Coxa");
        btn_abrirPastaCoxa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_abrirPastaCoxaActionPerformed(evt);
            }
        });

        btn_abrirPastaPescoco.setText("Pasta Pescoço");
        btn_abrirPastaPescoco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_abrirPastaPescocoActionPerformed(evt);
            }
        });

        btn_abrirPastaCosta.setText("Pasta Costa");
        btn_abrirPastaCosta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_abrirPastaCostaActionPerformed(evt);
            }
        });

        btn_abrirPastaPerna.setText("Pasta Perna");
        btn_abrirPastaPerna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_abrirPastaPernaActionPerformed(evt);
            }
        });

        btn_abrirPastaBraco.setText("Pasta Braço");
        btn_abrirPastaBraco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_abrirPastaBracoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_registrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btn_abrirPastaCoxa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_abrirPastaPerna))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_abrirPastaBraco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_abrirPastaPescoco, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_abrirPastaCosta))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_proxima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(coxa)
                                .addGap(9, 9, 9)
                                .addComponent(pescoco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(costa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(braco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(perna)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_NroFoto)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_anterior)
                            .addComponent(btn_proxima))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(coxa)
                            .addComponent(pescoco)
                            .addComponent(costa)
                            .addComponent(braco)
                            .addComponent(perna))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_registrar)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_abrirPastaCoxa)
                            .addComponent(btn_abrirPastaPescoco)
                            .addComponent(btn_abrirPastaCosta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_abrirPastaPerna)
                            .addComponent(btn_abrirPastaBraco))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button)
                        .addGap(0, 243, Short.MAX_VALUE))
                    .addComponent(imagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_NroFoto)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void copyDirectory(File sourceLocation, File targetLocation)
            throws IOException {

        if (sourceLocation.isDirectory()) {
            if (!targetLocation.exists()) {
                targetLocation.mkdir();
            }

            String[] children = sourceLocation.list();
            for (int i = 0; i < children.length; i++) {
                copyDirectory(new File(sourceLocation, children[i]),
                        new File(targetLocation, children[i]));
            }
        } else {

            InputStream in = new FileInputStream(sourceLocation);
            OutputStream out = new FileOutputStream(targetLocation);
            // Copy the bits from instream to outstream
            byte[] buf = new byte[1024];
            int len;
            while ((len = in.read(buf)) > 0) {
                out.write(buf, 0, len);
            }
            in.close();
            out.close();
        }
    }

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        this.jFileChooser1.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        try {
            this.jFileChooser1.setCurrentDirectory(new File(Main.class.getProtectionDomain().getCodeSource().getLocation().toURI()));
//          this.jFileChooser1.setCurrentDirectory(new File("/home"));
        } catch (URISyntaxException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        int res = this.jFileChooser1.showOpenDialog(null);
        if (res == JFileChooser.APPROVE_OPTION) {
            File diretorio = this.jFileChooser1.getSelectedFile();
            String dir = diretorio.getAbsolutePath();
            System.out.println(diretorio.getAbsolutePath());
            JOptionPane.showMessageDialog(this, "Diretório Selecionado: " + diretorio.getAbsolutePath());
            this.pastaSelecionada = diretorio.getName();
//          JOptionPane.showMessageDialog(null, "Você escolheu o diretório: " + diretorio.getCanonicalPath());
//          JOptionPane.showMessageDialog(null, "Você escolheu o diretório: " + diretorio.getPath());
            File caminho = new File(dir);
            File caminhoCompleto = caminho.getAbsoluteFile();
            this.vetFotos = caminhoCompleto.listFiles();
            ImageIcon imageIcon = new ImageIcon(this.vetFotos[0].getAbsolutePath());
            this.posAtualVetFoto = 0;
            Image image = imageIcon.getImage();
            Image newimg = image.getScaledInstance(this.largura, this.altura, java.awt.Image.SCALE_SMOOTH);
            ImageIcon newImageIcon = new ImageIcon(newimg);
            this.imagem.setIcon(newImageIcon);
        }
    }//GEN-LAST:event_buttonActionPerformed

    private void btn_proximaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_proximaActionPerformed
        this.proximaFoto();
    }//GEN-LAST:event_btn_proximaActionPerformed

    private void btn_anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anteriorActionPerformed
        this.anteriorFoto();
    }//GEN-LAST:event_btn_anteriorActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        String pasta = "";
        if (this.pescoco.isSelected()) {
            pasta = "./pescoco/";
        } else if (this.braco.isSelected()) {
            pasta = "./braco/";
        } else if (this.perna.isSelected()) {
            pasta = "./perna/";
        } else if (this.coxa.isSelected()) {
            pasta = "./coxa/";
        } else if (this.costa.isSelected()) {
            pasta = "./costa/";
        }
        if (!"".equals(pasta) && this.vetFotos != null) {
            try {
                this.copyDirectory(new File(this.vetFotos[this.posAtualVetFoto].getAbsolutePath()), new File(pasta + this.pastaSelecionada + "_" + this.vetFotos[this.posAtualVetFoto].getName()));
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.proximaFoto();
        } else if (this.vetFotos == null) {
            JOptionPane.showMessageDialog(this, "Selecione alguma pasta com fotos!!!");
        } else if (pasta.equals("")) {
            JOptionPane.showMessageDialog(this, "Qual parte do corpo seria?");
        }
        this.pescoco.setSelected(false);
        this.braco.setSelected(false);
        this.perna.setSelected(false);
        this.coxa.setSelected(false);
        this.costa.setSelected(false);
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void btn_abrirPastaCoxaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_abrirPastaCoxaActionPerformed
        this.abrirPasta("./coxa/");
    }//GEN-LAST:event_btn_abrirPastaCoxaActionPerformed

    private void btn_abrirPastaPescocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_abrirPastaPescocoActionPerformed
        this.abrirPasta("./pescoco/");

    }//GEN-LAST:event_btn_abrirPastaPescocoActionPerformed

    private void btn_abrirPastaCostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_abrirPastaCostaActionPerformed
        this.abrirPasta("./costa/");

    }//GEN-LAST:event_btn_abrirPastaCostaActionPerformed

    private void btn_abrirPastaPernaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_abrirPastaPernaActionPerformed
        this.abrirPasta("./perna/");

    }//GEN-LAST:event_btn_abrirPastaPernaActionPerformed

    private void btn_abrirPastaBracoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_abrirPastaBracoActionPerformed
        this.abrirPasta("./braco/");

    }//GEN-LAST:event_btn_abrirPastaBracoActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton braco;
    private javax.swing.JButton btn_abrirPastaBraco;
    private javax.swing.JButton btn_abrirPastaCosta;
    private javax.swing.JButton btn_abrirPastaCoxa;
    private javax.swing.JButton btn_abrirPastaPerna;
    private javax.swing.JButton btn_abrirPastaPescoco;
    private javax.swing.JButton btn_anterior;
    private javax.swing.JButton btn_proxima;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JButton button;
    private javax.swing.JRadioButton costa;
    private javax.swing.JRadioButton coxa;
    private javax.swing.JLabel imagem;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel label_NroFoto;
    private javax.swing.JRadioButton perna;
    private javax.swing.JRadioButton pescoco;
    // End of variables declaration//GEN-END:variables

    private void proximaFoto() {
        if (this.vetFotos == null){
            JOptionPane.showMessageDialog(this, "Selecione alguma pasta com fotos!!!");            
        } else if (this.posAtualVetFoto + 1 < this.vetFotos.length) {
            this.posAtualVetFoto++;
            ImageIcon imageIcon = new ImageIcon(this.vetFotos[this.posAtualVetFoto].getAbsolutePath());
            Image image = imageIcon.getImage();
            Image newimg = image.getScaledInstance(this.largura, this.altura, java.awt.Image.SCALE_SMOOTH);
            ImageIcon newImageIcon = new ImageIcon(newimg);
            this.imagem.setIcon(newImageIcon);
        } else {
            this.btn_proxima.setEnabled(false);
            this.btn_anterior.setEnabled(true);
        }
    }

    private void anteriorFoto() {
           if (this.vetFotos == null){
            JOptionPane.showMessageDialog(this, "Selecione alguma pasta com fotos!!!");            
        } else if (this.posAtualVetFoto != 0) {
            if (this.posAtualVetFoto == 1) {
                this.btn_anterior.setEnabled(false);
            }
            this.btn_proxima.setEnabled(true);
            this.posAtualVetFoto--;
            ImageIcon imageIcon = new ImageIcon(this.vetFotos[this.posAtualVetFoto].getAbsolutePath());
            Image image = imageIcon.getImage(); // transform it 
            Image newimg = image.getScaledInstance(this.largura, this.altura, java.awt.Image.SCALE_SMOOTH); // scale it smoothly  
            ImageIcon newImageIcon = new ImageIcon(newimg);  // assign to a new I
            this.imagem.setIcon(newImageIcon);
        } else {
            this.btn_anterior.setEnabled(false);
//            this.btn_proxima.setEnabled(true);
        }
    }

    private void abrirPasta(String pasta) {
        try {
            // TODO add your handling code here:
            Desktop.getDesktop().open(new File(pasta));
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void testarPasta(String pasta) {
       File theDir = new File(pasta);
        if (!theDir.exists()){
//            theDir.mkdirs();
            theDir.mkdir();
        }
    }
}
