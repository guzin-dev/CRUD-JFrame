import java.util.*;
import javax.swing.*;

public class Main extends javax.swing.JFrame {
 
    ArrayList<Aluno> listaDeAlunos = new ArrayList<>();
    int id = 0;
    
    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rAluno = new javax.swing.JButton();
        cAluno = new javax.swing.JButton();
        vAlunos = new javax.swing.JButton();
        eAluno = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        fundo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rAluno.setText("Remover aluno");
        rAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rAlunoActionPerformed(evt);
            }
        });
        getContentPane().add(rAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 120, -1));

        cAluno.setText("Criar aluno");
        cAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cAlunoActionPerformed(evt);
            }
        });
        getContentPane().add(cAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 120, -1));

        vAlunos.setText("Ver alunos");
        vAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vAlunosActionPerformed(evt);
            }
        });
        getContentPane().add(vAlunos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 120, -1));

        eAluno.setText("Editar aluno");
        eAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eAlunoActionPerformed(evt);
            }
        });
        getContentPane().add(eAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 120, -1));

        jLabel1.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CRUD de alunos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image 1.png"))); // NOI18N
        getContentPane().add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rAlunoActionPerformed
        boolean encontrou = false;
        if(listaDeAlunos.isEmpty()){
            JOptionPane.showMessageDialog(this, "Não existem alunos!");
        }else {
            String matriculaParaPesquisa = JOptionPane.showInputDialog(this, "Insira a matricula do(a) aluno(a) que você deseja remover");
            for (Aluno aluno : listaDeAlunos) {
                if(aluno.getMatricula().equals(matriculaParaPesquisa)){
                    int resposta = JOptionPane.showConfirmDialog(this, "Nome: " + aluno.getNome() + ", idade: " + aluno.getIdade() + ", cpf: " + aluno.getCpf() + ", matricula: " + aluno.getMatricula() + "\nTem certeza que deseja deletar esta pessoa?", "Atenção", JOptionPane.YES_NO_OPTION);
                    if (resposta == JOptionPane.YES_OPTION) {
                        listaDeAlunos.remove(aluno);
                        JOptionPane.showMessageDialog(this, "Aluno(a) deletado(a) com sucesso!");
                    }
                    encontrou = true;
                }
            }
            if(!encontrou){
                JOptionPane.showMessageDialog(this, "Nenhum(a) aluno(a) encontrado(a) com essa matricula");
            }
        }
    }//GEN-LAST:event_rAlunoActionPerformed

    private void eAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eAlunoActionPerformed
        boolean encontrou = false;
        if(listaDeAlunos.isEmpty()){
            JOptionPane.showMessageDialog(this, "Não existem alunos!");
        }else {
            String matriculaParaPesquisa = JOptionPane.showInputDialog(this, "Insira a matricula do aluno que você deseja editar");
            for (Aluno aluno : listaDeAlunos) {
                if (aluno.getMatricula().equals(matriculaParaPesquisa)) {
                    String novoNome = JOptionPane.showInputDialog(this, "Nome atual do aluno(a): " + aluno.getNome() + "\nInsira o novo nome para este(a) aluno(a)");
                    int novaIdade = Integer.parseInt(JOptionPane.showInputDialog(this, "Idade atual do(a) aluno(a): " + aluno.getIdade() + "\nInsira a nova idade para este(a) aluno(a)"));
                    String novoCpf = JOptionPane.showInputDialog(this, "CPF atual do aluno(a): " + aluno.getCpf() + "\nInsira o novo cpf para este(a) aluno(a)");
                    aluno.setNome(novoNome);
                    aluno.setIdade(novaIdade);
                    aluno.setCpf(novoCpf);
                    JOptionPane.showMessageDialog(this, "Aluno(a) editada com sucesso!");
                    encontrou = true;
                }
            }
            if(!encontrou){
                JOptionPane.showMessageDialog(this, "Nenhum(a) aluno(a) encontrado(a) com essa matricula");
            }
        }
    }//GEN-LAST:event_eAlunoActionPerformed

    private void vAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vAlunosActionPerformed
        String alunos = "";
        for (Aluno aluno : listaDeAlunos) {
            alunos += "Nome: " + aluno.getNome() + ", idade: " + aluno.getIdade() + ", cpf: " + aluno.getCpf() + ", matricula: " + aluno.getMatricula() + "\n";
        }
        if(listaDeAlunos.isEmpty()){
            JOptionPane.showMessageDialog(this, "Não existem alunos!");
        }else {
            JOptionPane.showMessageDialog(this, alunos);
        }
    }//GEN-LAST:event_vAlunosActionPerformed

    private void cAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cAlunoActionPerformed
        id++;
        String nome = JOptionPane.showInputDialog(this, "Insira o nome do aluno");
        int idade = Integer.parseInt(JOptionPane.showInputDialog(this, "Insira a idade do aluno(a) (" + nome + ")"));
        String cpf = JOptionPane.showInputDialog(this, "Insira o cpf do aluno(a) (" + nome + ")");
        String matricula = JOptionPane.showInputDialog(this, "Insira a matricula do aluno(a) (" + nome + ")");
        Aluno aluno = new Aluno(nome, idade, cpf, matricula);
        listaDeAlunos.add(aluno);
    }//GEN-LAST:event_cAlunoActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cAluno;
    private javax.swing.JButton eAluno;
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton rAluno;
    private javax.swing.JButton vAlunos;
    // End of variables declaration//GEN-END:variables
}
