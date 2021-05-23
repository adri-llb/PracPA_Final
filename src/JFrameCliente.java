
import java.io.BufferedReader;
import java.io.InputStreamReader;
import static java.lang.Thread.sleep;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;
import javax.swing.JTextField;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * 
 */
public class JFrameCliente extends javax.swing.JFrame {
    private int puesto = 0;
    private Boolean cerrado = false;
    /**
     * Creates new form SalasJFrame
     */
   
    private static InterfaceComunica obj;
    public static void main(String args[]) {
        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            JFrameCliente.obj = (InterfaceComunica) Naming.lookup("//localhost/ObjetoSaludann"); //Localiza el objeto distribuido
            System.out.println("CLIENTE INICIADO");
            obj.visualizar();
            int cont = 0;
            boolean descansado;
            while(true)
            obj.actualizarFrame();
        }catch (Exception e)
        {
            System.out.println("Excepción : " + e.getMessage());
            e.printStackTrace();
        }
    }

    
    
    public JFrameCliente() {
        initComponents();
    }
   
    public JTextField getjTextFieldAux1() {
        return jTextFieldAux1;
    }

    public JTextField getjTextFieldAux2() {
        return jTextFieldAux2;
    }

    public JTextField getjTextFieldDESCANSO() {
        return jTextFieldDESCANSO;
    }

    public JTextField getjTextFieldPO1() {
        return jTextFieldPO1;
    }

    public JTextField getjTextFieldPO10() {
        return jTextFieldPO10;
    }

    public JTextField getjTextFieldPO11() {
        return jTextFieldPO11;
    }

    public JTextField getjTextFieldPO12() {
        return jTextFieldPO12;
    }

    public JTextField getjTextFieldPO13() {
        return jTextFieldPO13;
    }

    public JTextField getjTextFieldPO14() {
        return jTextFieldPO14;
    }

    public JTextField getjTextFieldPO15() {
        return jTextFieldPO15;
    }

    public JTextField getjTextFieldPO16() {
        return jTextFieldPO16;
    }

    public JTextField getjTextFieldPO17() {
        return jTextFieldPO17;
    }

    public JTextField getjTextFieldPO18() {
        return jTextFieldPO18;
    }

    public JTextField getjTextFieldPO19() {
        return jTextFieldPO19;
    }

    public JTextField getjTextFieldPO2() {
        return jTextFieldPO2;
    }

    public JTextField getjTextFieldPO20() {
        return jTextFieldPO20;
    }

    public JTextField getjTextFieldPO3() {
        return jTextFieldPO3;
    }

    public JTextField getjTextFieldPO4() {
        return jTextFieldPO4;
    }

    public JTextField getjTextFieldPO5() {
        return jTextFieldPO5;
    }

    public JTextField getjTextFieldPO6() {
        return jTextFieldPO6;
    }

    public JTextField getjTextFieldPO7() {
        return jTextFieldPO7;
    }

    public JTextField getjTextFieldPO8() {
        return jTextFieldPO8;
    }

    public JTextField getjTextFieldPO9() {
        return jTextFieldPO9;
    }

    public JTextField getjTextFieldPV1() {
        return jTextFieldPV1;
    }

    public JTextField getjTextFieldPV10() {
        return jTextFieldPV10;
    }

    public JTextField getjTextFieldPV2() {
        return jTextFieldPV2;
    }

    public JTextField getjTextFieldPV3() {
        return jTextFieldPV3;
    }

    public JTextField getjTextFieldPV4() {
        return jTextFieldPV4;
    }

    public JTextField getjTextFieldPV5() {
        return jTextFieldPV5;
    }

    public JTextField getjTextFieldPV6() {
        return jTextFieldPV6;
    }

    public JTextField getjTextFieldPV7() {
        return jTextFieldPV7;
    }

    public JTextField getjTextFieldPV8() {
        return jTextFieldPV8;
    }

    public JTextArea getjTextAreaColaEspera() {
        return jTextAreaColaEspera;
    }

    public JTextField getjTextFieldPV9() {
        return jTextFieldPV9;
    }

    public JTextField getjTextFieldPacienteRecepcion() {
        return jTextFieldPacienteRecepcion;
    }

    public JTextField getjTextFieldVacunasDisp() {
        return jTextFieldVacunasDisp;
    }

    public int getPuesto() {
        return puesto;
    }

    public Boolean getCerrado() {
        return cerrado;
    }

    public void setCerrado(Boolean cerrado) {
        this.cerrado = cerrado;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelRECEPCION = new javax.swing.JPanel();
        jLabelRececpion = new javax.swing.JLabel();
        jLabelColaEspera = new javax.swing.JLabel();
        jLabelAux1 = new javax.swing.JLabel();
        jLabelPacienteRecepcion = new javax.swing.JLabel();
        jTextFieldAux1 = new javax.swing.JTextField();
        jTextFieldPacienteRecepcion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaColaEspera = new javax.swing.JTextArea();
        jPanelDESCANSO = new javax.swing.JPanel();
        jLabelSDescanso = new javax.swing.JLabel();
        jTextFieldDESCANSO = new javax.swing.JTextField();
        jPanelVACUNACION = new javax.swing.JPanel();
        jLabelSVacunacion = new javax.swing.JLabel();
        jTextFieldVacunasDisp = new javax.swing.JTextField();
        jTextFieldAux2 = new javax.swing.JTextField();
        jLabelAux2 = new javax.swing.JLabel();
        jLabelVacunasDisp = new javax.swing.JLabel();
        jPanelPuestosV = new javax.swing.JPanel();
        jLabelPV1 = new javax.swing.JLabel();
        jLabelPV6 = new javax.swing.JLabel();
        jLabelPV5 = new javax.swing.JLabel();
        jLabelPV10 = new javax.swing.JLabel();
        jLabelPV2 = new javax.swing.JLabel();
        jLabelPV3 = new javax.swing.JLabel();
        jLabelPV4 = new javax.swing.JLabel();
        jLabelPV9 = new javax.swing.JLabel();
        jLabelPV8 = new javax.swing.JLabel();
        jLabelPV7 = new javax.swing.JLabel();
        jTextFieldPV1 = new javax.swing.JTextField();
        jTextFieldPV6 = new javax.swing.JTextField();
        jTextFieldPV2 = new javax.swing.JTextField();
        jTextFieldPV7 = new javax.swing.JTextField();
        jTextFieldPV3 = new javax.swing.JTextField();
        jTextFieldPV8 = new javax.swing.JTextField();
        jTextFieldPV4 = new javax.swing.JTextField();
        jTextFieldPV5 = new javax.swing.JTextField();
        jTextFieldPV9 = new javax.swing.JTextField();
        jTextFieldPV10 = new javax.swing.JTextField();
        JBCerrar1 = new javax.swing.JButton();
        JBCerrar6 = new javax.swing.JButton();
        JBCerrar7 = new javax.swing.JButton();
        JBCerrar2 = new javax.swing.JButton();
        JBCerrar8 = new javax.swing.JButton();
        JBCerrar3 = new javax.swing.JButton();
        JBCerrar9 = new javax.swing.JButton();
        JBCerrar4 = new javax.swing.JButton();
        JBCerrar10 = new javax.swing.JButton();
        JBCerrar5 = new javax.swing.JButton();
        jPanelVACUNACION1 = new javax.swing.JPanel();
        jLabelSObservacion = new javax.swing.JLabel();
        jPanelPuestosV1 = new javax.swing.JPanel();
        jLabelPO1 = new javax.swing.JLabel();
        jLabelPO6 = new javax.swing.JLabel();
        jLabelPO5 = new javax.swing.JLabel();
        jLabelPO10 = new javax.swing.JLabel();
        jLabelPO2 = new javax.swing.JLabel();
        jLabelPO3 = new javax.swing.JLabel();
        jLabelPO4 = new javax.swing.JLabel();
        jLabelPO9 = new javax.swing.JLabel();
        jLabelPO8 = new javax.swing.JLabel();
        jLabelPO7 = new javax.swing.JLabel();
        jTextFieldPO1 = new javax.swing.JTextField();
        jTextFieldPO6 = new javax.swing.JTextField();
        jTextFieldPO2 = new javax.swing.JTextField();
        jTextFieldPO7 = new javax.swing.JTextField();
        jTextFieldPO3 = new javax.swing.JTextField();
        jTextFieldPO8 = new javax.swing.JTextField();
        jTextFieldPO4 = new javax.swing.JTextField();
        jTextFieldPO5 = new javax.swing.JTextField();
        jTextFieldPO9 = new javax.swing.JTextField();
        jTextFieldPO10 = new javax.swing.JTextField();
        jLabelPO11 = new javax.swing.JLabel();
        jLabelPO12 = new javax.swing.JLabel();
        jLabelPO13 = new javax.swing.JLabel();
        jLabelPO14 = new javax.swing.JLabel();
        jLabelPO15 = new javax.swing.JLabel();
        jLabelPO16 = new javax.swing.JLabel();
        jLabelPO17 = new javax.swing.JLabel();
        jLabelPO18 = new javax.swing.JLabel();
        jLabelPO19 = new javax.swing.JLabel();
        jLabelPO20 = new javax.swing.JLabel();
        jTextFieldPO12 = new javax.swing.JTextField();
        jTextFieldPO11 = new javax.swing.JTextField();
        jTextFieldPO13 = new javax.swing.JTextField();
        jTextFieldPO14 = new javax.swing.JTextField();
        jTextFieldPO16 = new javax.swing.JTextField();
        jTextFieldPO15 = new javax.swing.JTextField();
        jTextFieldPO17 = new javax.swing.JTextField();
        jTextFieldPO18 = new javax.swing.JTextField();
        jTextFieldPO19 = new javax.swing.JTextField();
        jTextFieldPO20 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelRececpion.setText("RECEPCIÓN");

        jLabelColaEspera.setText("Cola de espera");

        jLabelAux1.setText("Auxiliar");

        jLabelPacienteRecepcion.setText("Paciente");

        jTextAreaColaEspera.setColumns(20);
        jTextAreaColaEspera.setRows(5);
        jScrollPane1.setViewportView(jTextAreaColaEspera);

        javax.swing.GroupLayout jPanelRECEPCIONLayout = new javax.swing.GroupLayout(jPanelRECEPCION);
        jPanelRECEPCION.setLayout(jPanelRECEPCIONLayout);
        jPanelRECEPCIONLayout.setHorizontalGroup(
            jPanelRECEPCIONLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRECEPCIONLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelRececpion)
                .addGap(246, 246, 246))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRECEPCIONLayout.createSequentialGroup()
                .addGroup(jPanelRECEPCIONLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelRECEPCIONLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelColaEspera))
                    .addGroup(jPanelRECEPCIONLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanelRECEPCIONLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelRECEPCIONLayout.createSequentialGroup()
                                .addGap(179, 179, 179)
                                .addGroup(jPanelRECEPCIONLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanelRECEPCIONLayout.createSequentialGroup()
                                        .addComponent(jLabelAux1)
                                        .addGap(22, 22, 22))
                                    .addComponent(jTextFieldAux1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelRECEPCIONLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabelPacienteRecepcion)))
                        .addGap(315, 315, 315))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelRECEPCIONLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanelRECEPCIONLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelRECEPCIONLayout.createSequentialGroup()
                                .addComponent(jTextFieldPacienteRecepcion, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(51, 51, 51))
        );
        jPanelRECEPCIONLayout.setVerticalGroup(
            jPanelRECEPCIONLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRECEPCIONLayout.createSequentialGroup()
                .addComponent(jLabelRececpion)
                .addGap(1, 1, 1)
                .addGroup(jPanelRECEPCIONLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPacienteRecepcion)
                    .addComponent(jLabelAux1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRECEPCIONLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAux1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPacienteRecepcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabelColaEspera)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabelSDescanso.setText("SALA DE DESCANSO");

        javax.swing.GroupLayout jPanelDESCANSOLayout = new javax.swing.GroupLayout(jPanelDESCANSO);
        jPanelDESCANSO.setLayout(jPanelDESCANSOLayout);
        jPanelDESCANSOLayout.setHorizontalGroup(
            jPanelDESCANSOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDESCANSOLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelDESCANSOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDESCANSOLayout.createSequentialGroup()
                        .addComponent(jLabelSDescanso)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDESCANSOLayout.createSequentialGroup()
                        .addComponent(jTextFieldDESCANSO, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanelDESCANSOLayout.setVerticalGroup(
            jPanelDESCANSOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDESCANSOLayout.createSequentialGroup()
                .addComponent(jLabelSDescanso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldDESCANSO, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelVACUNACION.setForeground(new java.awt.Color(200, 200, 200));
        jPanelVACUNACION.setDoubleBuffered(false);

        jLabelSVacunacion.setText("SALA DE VACUNACIÓN");

        jLabelAux2.setText("Auxiliar");

        jLabelVacunasDisp.setText("Vacunas Disponibles");

        jLabelPV1.setText("Puesto 1");

        jLabelPV6.setText("Puesto 6");

        jLabelPV5.setText("Puesto 5");

        jLabelPV10.setText("Puesto 10");

        jLabelPV2.setText("Puesto 2");

        jLabelPV3.setText("Puesto 3");

        jLabelPV4.setText("Puesto 4");

        jLabelPV9.setText("Puesto 9");

        jLabelPV8.setText("Puesto 8");

        jLabelPV7.setText("Puesto 7");

        jTextFieldPV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPV1ActionPerformed(evt);
            }
        });

        jTextFieldPV10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPV10ActionPerformed(evt);
            }
        });

        JBCerrar1.setText("C");
        JBCerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCerrar1ActionPerformed(evt);
            }
        });

        JBCerrar6.setText("C");
        JBCerrar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCerrar6ActionPerformed(evt);
            }
        });

        JBCerrar7.setText("C");
        JBCerrar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCerrar7ActionPerformed(evt);
            }
        });

        JBCerrar2.setText("C");
        JBCerrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCerrar2ActionPerformed(evt);
            }
        });

        JBCerrar8.setText("C");
        JBCerrar8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCerrar8ActionPerformed(evt);
            }
        });

        JBCerrar3.setText("C");
        JBCerrar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCerrar3ActionPerformed(evt);
            }
        });

        JBCerrar9.setText("C");
        JBCerrar9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCerrar9ActionPerformed(evt);
            }
        });

        JBCerrar4.setText("C");
        JBCerrar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCerrar4ActionPerformed(evt);
            }
        });

        JBCerrar10.setText("C");
        JBCerrar10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCerrar10ActionPerformed(evt);
            }
        });

        JBCerrar5.setText("C");
        JBCerrar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCerrar5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPuestosVLayout = new javax.swing.GroupLayout(jPanelPuestosV);
        jPanelPuestosV.setLayout(jPanelPuestosVLayout);
        jPanelPuestosVLayout.setHorizontalGroup(
            jPanelPuestosVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPuestosVLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPuestosVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPuestosVLayout.createSequentialGroup()
                        .addComponent(jTextFieldPV1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBCerrar1))
                    .addGroup(jPanelPuestosVLayout.createSequentialGroup()
                        .addComponent(jTextFieldPV6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBCerrar6))
                    .addComponent(jLabelPV6)
                    .addComponent(jLabelPV1))
                .addGap(39, 39, 39)
                .addGroup(jPanelPuestosVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelPV2)
                    .addComponent(jLabelPV7)
                    .addComponent(jTextFieldPV7)
                    .addComponent(jTextFieldPV2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPuestosVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBCerrar2)
                    .addComponent(JBCerrar7))
                .addGap(29, 29, 29)
                .addGroup(jPanelPuestosVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelPV3)
                    .addComponent(jTextFieldPV8)
                    .addComponent(jLabelPV8)
                    .addComponent(jTextFieldPV3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPuestosVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBCerrar3)
                    .addComponent(JBCerrar8))
                .addGap(32, 32, 32)
                .addGroup(jPanelPuestosVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelPV9)
                    .addComponent(jLabelPV4)
                    .addComponent(jTextFieldPV9)
                    .addComponent(jTextFieldPV4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPuestosVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBCerrar4)
                    .addComponent(JBCerrar9))
                .addGap(26, 26, 26)
                .addGroup(jPanelPuestosVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPuestosVLayout.createSequentialGroup()
                        .addGroup(jPanelPuestosVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPuestosVLayout.createSequentialGroup()
                                .addComponent(jLabelPV5)
                                .addGap(33, 33, 33))
                            .addComponent(jTextFieldPV10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBCerrar10))
                    .addComponent(jLabelPV10)
                    .addGroup(jPanelPuestosVLayout.createSequentialGroup()
                        .addComponent(jTextFieldPV5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBCerrar5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPuestosVLayout.setVerticalGroup(
            jPanelPuestosVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPuestosVLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPuestosVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPV1)
                    .addComponent(jLabelPV5)
                    .addComponent(jLabelPV2)
                    .addComponent(jLabelPV3)
                    .addComponent(jLabelPV4))
                .addGap(6, 6, 6)
                .addGroup(jPanelPuestosVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPV1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPV2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPV3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPV4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPV5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBCerrar1)
                    .addComponent(JBCerrar2)
                    .addComponent(JBCerrar3)
                    .addComponent(JBCerrar4)
                    .addComponent(JBCerrar5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPuestosVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPV6)
                    .addComponent(jLabelPV10)
                    .addComponent(jLabelPV9)
                    .addComponent(jLabelPV8)
                    .addComponent(jLabelPV7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPuestosVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPV6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPV7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPV8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPV9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPV10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBCerrar6)
                    .addComponent(JBCerrar7)
                    .addComponent(JBCerrar8)
                    .addComponent(JBCerrar9)
                    .addComponent(JBCerrar10))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelVACUNACIONLayout = new javax.swing.GroupLayout(jPanelVACUNACION);
        jPanelVACUNACION.setLayout(jPanelVACUNACIONLayout);
        jPanelVACUNACIONLayout.setHorizontalGroup(
            jPanelVACUNACIONLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVACUNACIONLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelVACUNACIONLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVACUNACIONLayout.createSequentialGroup()
                        .addComponent(jLabelSVacunacion)
                        .addGap(283, 283, 283))
                    .addComponent(jPanelPuestosV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelVACUNACIONLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVACUNACIONLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanelVACUNACIONLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldAux2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldVacunasDisp, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVACUNACIONLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelVACUNACIONLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVACUNACIONLayout.createSequentialGroup()
                                .addComponent(jLabelAux2)
                                .addGap(44, 44, 44))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVACUNACIONLayout.createSequentialGroup()
                                .addComponent(jLabelVacunasDisp)
                                .addContainerGap())))))
        );
        jPanelVACUNACIONLayout.setVerticalGroup(
            jPanelVACUNACIONLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVACUNACIONLayout.createSequentialGroup()
                .addGroup(jPanelVACUNACIONLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVACUNACIONLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelSVacunacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelPuestosV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelVACUNACIONLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabelAux2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldAux2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelVacunasDisp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldVacunasDisp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );

        jLabelSObservacion.setText("SALA DE OBSERVACIÓN");

        jLabelPO1.setText("Puesto 1");

        jLabelPO6.setText("Puesto 6");

        jLabelPO5.setText("Puesto 5");

        jLabelPO10.setText("Puesto 10");

        jLabelPO2.setText("Puesto 2");

        jLabelPO3.setText("Puesto 3");

        jLabelPO4.setText("Puesto 4");

        jLabelPO9.setText("Puesto 9");

        jLabelPO8.setText("Puesto 8");

        jLabelPO7.setText("Puesto 7");

        jTextFieldPO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPO1ActionPerformed(evt);
            }
        });

        jLabelPO11.setText("Puesto 11");

        jLabelPO12.setText("Puesto 12");

        jLabelPO13.setText("Puesto 13");

        jLabelPO14.setText("Puesto 14");

        jLabelPO15.setText("Puesto 15");

        jLabelPO16.setText("Puesto 16");

        jLabelPO17.setText("Puesto 17");

        jLabelPO18.setText("Puesto 18");

        jLabelPO19.setText("Puesto 19");

        jLabelPO20.setText("Puesto 20");

        jTextFieldPO12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPO12ActionPerformed(evt);
            }
        });

        jTextFieldPO11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPO11ActionPerformed(evt);
            }
        });

        jTextFieldPO13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPO13ActionPerformed(evt);
            }
        });

        jTextFieldPO14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPO14ActionPerformed(evt);
            }
        });

        jTextFieldPO16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPO16ActionPerformed(evt);
            }
        });

        jTextFieldPO15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPO15ActionPerformed(evt);
            }
        });

        jTextFieldPO17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPO17ActionPerformed(evt);
            }
        });

        jTextFieldPO18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPO18ActionPerformed(evt);
            }
        });

        jTextFieldPO19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPO19ActionPerformed(evt);
            }
        });

        jTextFieldPO20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPO20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPuestosV1Layout = new javax.swing.GroupLayout(jPanelPuestosV1);
        jPanelPuestosV1.setLayout(jPanelPuestosV1Layout);
        jPanelPuestosV1Layout.setHorizontalGroup(
            jPanelPuestosV1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPuestosV1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPuestosV1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPuestosV1Layout.createSequentialGroup()
                        .addGroup(jPanelPuestosV1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPuestosV1Layout.createSequentialGroup()
                                .addComponent(jLabelPO1)
                                .addGap(37, 37, 37)
                                .addComponent(jLabelPO2))
                            .addGroup(jPanelPuestosV1Layout.createSequentialGroup()
                                .addGroup(jPanelPuestosV1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldPO1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelPO11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelPuestosV1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldPO2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelPO12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelPuestosV1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelPO3)
                                    .addComponent(jTextFieldPO3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelPO13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelPuestosV1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelPO14)
                                    .addComponent(jLabelPO4)
                                    .addComponent(jTextFieldPO4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPuestosV1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPO5)
                            .addComponent(jTextFieldPO5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPO15)))
                    .addGroup(jPanelPuestosV1Layout.createSequentialGroup()
                        .addComponent(jTextFieldPO11, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPO12, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPO13, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPO14, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPO15, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPuestosV1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPuestosV1Layout.createSequentialGroup()
                        .addGroup(jPanelPuestosV1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPO6)
                            .addComponent(jTextFieldPO6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPO16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPuestosV1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPO7)
                            .addComponent(jTextFieldPO7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPO17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPuestosV1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPO8)
                            .addComponent(jTextFieldPO8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPO18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPuestosV1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPO9)
                            .addComponent(jTextFieldPO9, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPO19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPuestosV1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPO20)
                            .addComponent(jLabelPO10)
                            .addComponent(jTextFieldPO10, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelPuestosV1Layout.createSequentialGroup()
                        .addComponent(jTextFieldPO16, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPO17, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPO18, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPO19, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPO20, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPuestosV1Layout.setVerticalGroup(
            jPanelPuestosV1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPuestosV1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPuestosV1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPO1)
                    .addComponent(jLabelPO5)
                    .addComponent(jLabelPO2)
                    .addComponent(jLabelPO3)
                    .addComponent(jLabelPO4)
                    .addComponent(jLabelPO6)
                    .addComponent(jLabelPO7)
                    .addComponent(jLabelPO8)
                    .addComponent(jLabelPO9)
                    .addComponent(jLabelPO10))
                .addGap(7, 7, 7)
                .addGroup(jPanelPuestosV1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPO1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPO2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPO3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPO4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPO5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPO6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPO7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPO8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPO9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPO10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelPuestosV1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPO11)
                    .addComponent(jLabelPO12)
                    .addComponent(jLabelPO13)
                    .addComponent(jLabelPO14)
                    .addComponent(jLabelPO15)
                    .addComponent(jLabelPO16)
                    .addComponent(jLabelPO17)
                    .addComponent(jLabelPO18)
                    .addComponent(jLabelPO19)
                    .addComponent(jLabelPO20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPuestosV1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPO12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPO11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPO13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPO14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPO16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPO15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPO17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPO18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPO19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPO20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelVACUNACION1Layout = new javax.swing.GroupLayout(jPanelVACUNACION1);
        jPanelVACUNACION1.setLayout(jPanelVACUNACION1Layout);
        jPanelVACUNACION1Layout.setHorizontalGroup(
            jPanelVACUNACION1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVACUNACION1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelSObservacion)
                .addGap(362, 362, 362))
            .addComponent(jPanelPuestosV1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelVACUNACION1Layout.setVerticalGroup(
            jPanelVACUNACION1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVACUNACION1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSObservacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPuestosV1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelVACUNACION, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelRECEPCION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelDESCANSO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanelVACUNACION1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelVACUNACION1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanelVACUNACION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelRECEPCION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelDESCANSO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPV1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPV1ActionPerformed

    private void jTextFieldPO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPO1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPO1ActionPerformed

    private void jTextFieldPV10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPV10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPV10ActionPerformed

    private void jTextFieldPO12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPO12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPO12ActionPerformed

    private void jTextFieldPO11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPO11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPO11ActionPerformed

    private void jTextFieldPO13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPO13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPO13ActionPerformed

    private void jTextFieldPO14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPO14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPO14ActionPerformed

    private void jTextFieldPO16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPO16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPO16ActionPerformed

    private void jTextFieldPO15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPO15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPO15ActionPerformed

    private void jTextFieldPO17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPO17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPO17ActionPerformed

    private void jTextFieldPO18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPO18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPO18ActionPerformed

    private void jTextFieldPO19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPO19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPO19ActionPerformed

    private void jTextFieldPO20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPO20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPO20ActionPerformed

    private void JBCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCerrar1ActionPerformed
        cerrado = true;
        puesto = 0;              
    }//GEN-LAST:event_JBCerrar1ActionPerformed

    private void JBCerrar9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCerrar9ActionPerformed
        cerrado = true;
        puesto = 8;
    }//GEN-LAST:event_JBCerrar9ActionPerformed

    private void JBCerrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCerrar2ActionPerformed
        cerrado = true;
        puesto = 1;
    }//GEN-LAST:event_JBCerrar2ActionPerformed

    private void JBCerrar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCerrar3ActionPerformed
       cerrado = true;
        puesto = 2;
    }//GEN-LAST:event_JBCerrar3ActionPerformed

    private void JBCerrar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCerrar4ActionPerformed
        cerrado = true;
        puesto = 3;
    }//GEN-LAST:event_JBCerrar4ActionPerformed

    private void JBCerrar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCerrar5ActionPerformed
        cerrado = true;
        puesto = 4;
    }//GEN-LAST:event_JBCerrar5ActionPerformed

    private void JBCerrar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCerrar6ActionPerformed
        cerrado = true;
        puesto = 5;
    }//GEN-LAST:event_JBCerrar6ActionPerformed

    private void JBCerrar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCerrar7ActionPerformed
        cerrado = true;
        puesto = 6;
    }//GEN-LAST:event_JBCerrar7ActionPerformed

    private void JBCerrar8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCerrar8ActionPerformed
        cerrado = true;
        puesto = 7;
    }//GEN-LAST:event_JBCerrar8ActionPerformed

    private void JBCerrar10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCerrar10ActionPerformed
       cerrado = true;
        puesto = 9;
    }//GEN-LAST:event_JBCerrar10ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCerrar1;
    private javax.swing.JButton JBCerrar10;
    private javax.swing.JButton JBCerrar2;
    private javax.swing.JButton JBCerrar3;
    private javax.swing.JButton JBCerrar4;
    private javax.swing.JButton JBCerrar5;
    private javax.swing.JButton JBCerrar6;
    private javax.swing.JButton JBCerrar7;
    private javax.swing.JButton JBCerrar8;
    private javax.swing.JButton JBCerrar9;
    private javax.swing.JLabel jLabelAux1;
    private javax.swing.JLabel jLabelAux2;
    private javax.swing.JLabel jLabelColaEspera;
    private javax.swing.JLabel jLabelPO1;
    private javax.swing.JLabel jLabelPO10;
    private javax.swing.JLabel jLabelPO11;
    private javax.swing.JLabel jLabelPO12;
    private javax.swing.JLabel jLabelPO13;
    private javax.swing.JLabel jLabelPO14;
    private javax.swing.JLabel jLabelPO15;
    private javax.swing.JLabel jLabelPO16;
    private javax.swing.JLabel jLabelPO17;
    private javax.swing.JLabel jLabelPO18;
    private javax.swing.JLabel jLabelPO19;
    private javax.swing.JLabel jLabelPO2;
    private javax.swing.JLabel jLabelPO20;
    private javax.swing.JLabel jLabelPO3;
    private javax.swing.JLabel jLabelPO4;
    private javax.swing.JLabel jLabelPO5;
    private javax.swing.JLabel jLabelPO6;
    private javax.swing.JLabel jLabelPO7;
    private javax.swing.JLabel jLabelPO8;
    private javax.swing.JLabel jLabelPO9;
    private javax.swing.JLabel jLabelPV1;
    private javax.swing.JLabel jLabelPV10;
    private javax.swing.JLabel jLabelPV2;
    private javax.swing.JLabel jLabelPV3;
    private javax.swing.JLabel jLabelPV4;
    private javax.swing.JLabel jLabelPV5;
    private javax.swing.JLabel jLabelPV6;
    private javax.swing.JLabel jLabelPV7;
    private javax.swing.JLabel jLabelPV8;
    private javax.swing.JLabel jLabelPV9;
    private javax.swing.JLabel jLabelPacienteRecepcion;
    private javax.swing.JLabel jLabelRececpion;
    private javax.swing.JLabel jLabelSDescanso;
    private javax.swing.JLabel jLabelSObservacion;
    private javax.swing.JLabel jLabelSVacunacion;
    private javax.swing.JLabel jLabelVacunasDisp;
    private javax.swing.JPanel jPanelDESCANSO;
    private javax.swing.JPanel jPanelPuestosV;
    private javax.swing.JPanel jPanelPuestosV1;
    private javax.swing.JPanel jPanelRECEPCION;
    private javax.swing.JPanel jPanelVACUNACION;
    private javax.swing.JPanel jPanelVACUNACION1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaColaEspera;
    private javax.swing.JTextField jTextFieldAux1;
    private javax.swing.JTextField jTextFieldAux2;
    private javax.swing.JTextField jTextFieldDESCANSO;
    private javax.swing.JTextField jTextFieldPO1;
    private javax.swing.JTextField jTextFieldPO10;
    private javax.swing.JTextField jTextFieldPO11;
    private javax.swing.JTextField jTextFieldPO12;
    private javax.swing.JTextField jTextFieldPO13;
    private javax.swing.JTextField jTextFieldPO14;
    private javax.swing.JTextField jTextFieldPO15;
    private javax.swing.JTextField jTextFieldPO16;
    private javax.swing.JTextField jTextFieldPO17;
    private javax.swing.JTextField jTextFieldPO18;
    private javax.swing.JTextField jTextFieldPO19;
    private javax.swing.JTextField jTextFieldPO2;
    private javax.swing.JTextField jTextFieldPO20;
    private javax.swing.JTextField jTextFieldPO3;
    private javax.swing.JTextField jTextFieldPO4;
    private javax.swing.JTextField jTextFieldPO5;
    private javax.swing.JTextField jTextFieldPO6;
    private javax.swing.JTextField jTextFieldPO7;
    private javax.swing.JTextField jTextFieldPO8;
    private javax.swing.JTextField jTextFieldPO9;
    private javax.swing.JTextField jTextFieldPV1;
    private javax.swing.JTextField jTextFieldPV10;
    private javax.swing.JTextField jTextFieldPV2;
    private javax.swing.JTextField jTextFieldPV3;
    private javax.swing.JTextField jTextFieldPV4;
    private javax.swing.JTextField jTextFieldPV5;
    private javax.swing.JTextField jTextFieldPV6;
    private javax.swing.JTextField jTextFieldPV7;
    private javax.swing.JTextField jTextFieldPV8;
    private javax.swing.JTextField jTextFieldPV9;
    private javax.swing.JTextField jTextFieldPacienteRecepcion;
    private javax.swing.JTextField jTextFieldVacunasDisp;
    // End of variables declaration//GEN-END:variables
}
