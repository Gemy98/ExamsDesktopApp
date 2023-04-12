/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mgamal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static mgamal.first.name ; 
public class exam1 extends javax.swing.JFrame {

    public void finishtime()
    {
     
       
        qq11a1.setEnabled(false);
        qq11a2.setEnabled(false);
        qq11a3.setEnabled(false);
         qq11a4.setEnabled(false);
          qq12a4.setEnabled(false);
           qq12a3.setEnabled(false);
            qq12a2.setEnabled(false);
             qq12a1.setEnabled(false);
              qq13a4.setEnabled(false);
               qq13a3.setEnabled(false);
                qq13a2.setEnabled(false);
                 qq13a1.setEnabled(false);
                  qq14a4.setEnabled(false);
                   qq14a3.setEnabled(false);
                    qq14a2.setEnabled(false);
                     qq14a1.setEnabled(false);
                      qq15a4.setEnabled(false);
                       qq15a3.setEnabled(false);
                        qq15a2.setEnabled(false);
                         qq15a1.setEnabled(false);
                          qq16a4.setEnabled(false);
                           qq16a3.setEnabled(false);
                            qq16a2.setEnabled(false);
                             qq16a1.setEnabled(false);
                             qq21a1.setEnabled(false);
                             qq21a2.setEnabled(false);
                            qq22a1.setEnabled(false);
                           qq22a2.setEnabled(false);
                          qq23a1.setEnabled(false);
                         qq23a2.setEnabled(false);
                        qq24a1.setEnabled(false);
                       qq24a2.setEnabled(false);
                      qq25a1.setEnabled(false);
                     qq25a2.setEnabled(false);
                    qq26a1.setEnabled(false);
                   qq26a2.setEnabled(false);
                  qq27a1.setEnabled(false);
                 qq27a2.setEnabled(false);
                qq28a1.setEnabled(false);
               qq28a2.setEnabled(false);
              qq29a1.setEnabled(false);
             qq29a2.setEnabled(false);
            qq210a1.setEnabled(false);
           qq210a2.setEnabled(false);                  
                      
           
    correcting();     
    stp = true ; 
            
    
    }
    
    public void correcting()
    {
        this.qq11a1.setActionCommand(qq11a1.getText());
        this.qq11a2.setActionCommand(qq11a2.getText());
        this.qq11a3.setActionCommand(qq11a3.getText());
        this.qq11a4.setActionCommand(qq11a4.getText());
        
        
        
        
        this.qq12a1.setActionCommand(qq12a1.getText());
        this.qq12a2.setActionCommand(qq12a2.getText());
        this.qq12a3.setActionCommand(qq12a3.getText());
        this.qq12a4.setActionCommand(qq12a4.getText());
        
        
        
        this.qq13a1.setActionCommand(qq13a1.getText());
        this.qq13a2.setActionCommand(qq13a2.getText());
        this.qq13a3.setActionCommand(qq13a3.getText());
        this.qq13a4.setActionCommand(qq13a4.getText());
        
        
        
        
        this.qq14a1.setActionCommand(qq14a1.getText());
        this.qq14a2.setActionCommand(qq14a2.getText());
        this.qq14a3.setActionCommand(qq14a3.getText());
        this.qq14a4.setActionCommand(qq14a4.getText());
        
        
        
        
        this.qq15a1.setActionCommand(qq15a1.getText());
        this.qq15a2.setActionCommand(qq15a2.getText());
        this.qq15a3.setActionCommand(qq15a3.getText());
        this.qq15a4.setActionCommand(qq15a4.getText());
        
        
        
        this.qq16a1.setActionCommand(qq16a1.getText());
        this.qq16a2.setActionCommand(qq16a2.getText());
        this.qq16a3.setActionCommand(qq16a3.getText());
        this.qq16a4.setActionCommand(qq16a4.getText());
        
        
        
        
        
        
                 String q11ans =   q11.getSelection().getActionCommand();
                 String q12ans =   q12.getSelection().getActionCommand();
                 String q13ans =   q13.getSelection().getActionCommand();
                 String q14ans =   q14.getSelection().getActionCommand();
                 String q15ans =   q15.getSelection().getActionCommand();
                 String q16ans =   q16.getSelection().getActionCommand();
                 
             
                 this.qq21a1.setActionCommand(qq21a1.getText());
                 this.qq21a2.setActionCommand(qq21a2.getText());
                 
                 
                 this.qq22a1.setActionCommand(qq22a1.getText());
                 this.qq22a2.setActionCommand(qq22a2.getText());
                 
                 
           
                 this.qq23a1.setActionCommand(qq23a1.getText());
                 this.qq23a2.setActionCommand(qq23a2.getText());
                 
                 
                 
                 this.qq24a1.setActionCommand(qq24a1.getText());
                 this.qq24a2.setActionCommand(qq24a2.getText());
                 
                 
                 
                 this.qq25a1.setActionCommand(qq25a1.getText());
                 this.qq25a2.setActionCommand(qq25a2.getText());



                 this.qq26a1.setActionCommand(qq26a1.getText());
                 this.qq26a2.setActionCommand(qq26a2.getText());



                 this.qq27a1.setActionCommand(qq27a1.getText());
                 this.qq27a2.setActionCommand(qq27a2.getText());



                 this.qq28a1.setActionCommand(qq28a1.getText());
                 this.qq28a2.setActionCommand(qq28a2.getText());



                 this.qq29a1.setActionCommand(qq29a1.getText());
                 this.qq29a2.setActionCommand(qq29a2.getText());



                 this.qq210a1.setActionCommand(qq210a1.getText());
                 this.qq210a2.setActionCommand(qq210a2.getText());



                 
                 String q21ans =   q21.getSelection().getActionCommand();
                 String q22ans =   q22.getSelection().getActionCommand();
                 String q23ans =   q23.getSelection().getActionCommand();
                 String q24ans =   q24.getSelection().getActionCommand();
                 String q25ans =   q25.getSelection().getActionCommand();
                 String q26ans =   q26.getSelection().getActionCommand();
                 String q27ans =   q27.getSelection().getActionCommand();
                 String q28ans =   q28.getSelection().getActionCommand();
                 String q29ans =   q29.getSelection().getActionCommand();
                 String q210ans = q210.getSelection().getActionCommand();
                 
                 
                 System.out.println(q21.getSelection().getActionCommand());
               
                 try {
            PreparedStatement stmt = con.prepareStatement
                    ("select q11a,q12a,q13a,q14a,q15a,q16a from edu.examq1 where idexam > 0 ");
      
             ResultSet rs = stmt.executeQuery();
           
                      while (rs.next()){  
                 
                 // = rs.getString(1); 
                        
       // qq21e.setText(rs.getString(2));
               
                 
                   Q11ans =   rs.getString(1);
                   Q12ans =   rs.getString(2);
                   Q13ans =   rs.getString(3);
                   Q14ans =   rs.getString(4);
                   Q15ans =   rs.getString(5);
                   Q16ans =   rs.getString(6);
                     }
           
        } catch (SQLException ex) {
            Logger.getLogger(makingExam1.class.getName()).log(Level.SEVERE, null, ex);
             
        }
         
                  try {
            PreparedStatement stmt = con.prepareStatement
                    ("select q21a,q22a,q23a,q24a,q25a,q26a,q27a,q28a,q29a,q210a  from edu.examq2 where idexamq2 > 0 ");
 
             ResultSet rs = stmt.executeQuery();
           
                      while (rs.next()){  
                 
                 // = rs.getString(1); 
                        
       // qq21e.setText(rs.getString(2));
                   Q21ans =   rs.getString(1);
                   Q22ans =   rs.getString(2);
                   Q23ans =   rs.getString(3);
                   Q24ans =   rs.getString(4);
                   Q25ans =   rs.getString(5);
                   Q26ans =   rs.getString(6);
                   Q27ans =   rs.getString(7);
                   Q28ans =   rs.getString(8);
                   Q29ans =   rs.getString(9);
                   Q210ans =   rs.getString(10);
                  
                      }
           
        } catch (SQLException ex) {
            Logger.getLogger(makingExam1.class.getName()).log(Level.SEVERE, null, ex);
             
        }
              
                if (q11ans.equals(Q11ans))
                 {
                   q1_m ++ ;       
                 }
                  if (q12ans.equals(Q12ans))
                 {
                   q1_m ++ ;       
                 }
                 
                 if (q13ans.equals(Q13ans))
                 {
                   q1_m ++ ;   
                 }
                   if (q14ans.equals(Q14ans))
                 {
                   q1_m ++ ;   
                 } 
                     if (q15ans.equals(Q15ans))
                 {
                   q1_m ++ ; 
                 } 
                   if (q16ans.equals(Q16ans))
                 {
                   q1_m ++ ;   
                 }
                  
                ////////
                
                   if (q21ans.equals(Q21ans))
                 {
                   q1_m ++ ;   
                 }
                  if (q22ans.equals(Q22ans))
                 {
                   q1_m ++ ;   
                 }
                  if (q23ans.equals(Q23ans))
                 {
                   q1_m ++ ;   
                 }
                         
                  if (q24ans.equals(Q24ans))
                 {
                   q1_m ++ ;   
                 }
                  if (q25ans.equals(Q25ans))
                 {
                   q1_m ++ ;
                 }
                  if (q26ans.equals(Q26ans))
                 {
                   q1_m ++ ;
                 }                 
                  if (q27ans.equals(Q27ans))
                 {
                   q1_m ++ ;   
                 }
                  if (q28ans.equals(Q28ans))
                 {
                   q1_m ++ ;   
                 }                                          
                  if (q29ans.equals(Q29ans))
                 {
                   q1_m ++ ;   
                 }                         
                   if (q210ans.equals(Q210ans))
                 {
                   q1_m ++ ;
                 }
                                              
                
        System.out.println(q1_m);
        
        
             jLabel12.setVisible(true);
             jLabel12.setEditable(false);
             jLabel12.setEnabled(true);
        
        jLabel12.setText(String.valueOf(q1_m)+"\n"+jLabel4.getText()+"\n"+(q1_m/16)*100+"%");
        

        
    }
    
    
    
   public String Q11ans ;
   public String Q12ans ;
   public String Q13ans ;
   public String Q14ans ;
   public String Q15ans ;
   public String Q16ans ;
   
   public String Q21ans ;
   public String Q22ans ;
   public String Q23ans ;
   public String Q24ans ;
   public String Q25ans ;
   public String Q26ans ;
   public String Q27ans ;
   public String Q28ans ;
   public String Q29ans ;
   public String Q210ans ;
   
  
    public double q1_m = 0.0; 
   
  
    long x = System.currentTimeMillis() ;
    
    
    boolean stp = false ;
    boolean onetime = false ; 
  
    static int ms = 0 ; 
    static int s = 0 ; 
    static int m = 0 ; 
    static int h = 0 ; 
    boolean q = true ;
    
    
   // String qq11a ;
  //  String qq12a ;
   // String qq13a ;
  //  String qq14a ;
   // String qq15a ;
   // String qq16a ;
    
    
    
    Thread t = new Thread(){
    
         public void run(){
             jLabel4.setText(name);
             
    for (;;)
    {
        
        if(stp != true){
        
        if (q = true){     
            try
            {
            sleep(1) ; 



             long v =  System.currentTimeMillis() - x ;
              if (v > 1000)
                {
                    s ++ ;
                    x = System.currentTimeMillis() ; 
                } 
              if (s > 60)
                {
                    ms = 0 ; 
                    s = 0 ; 
                    m ++ ; 

                } 
             if (m > 60)
                {
                    ms = 0 ; 
                    s = 0 ; 
                    m = 0 ; 
                    h ++ ; 
                } 

            ms ++ ;         

            seconds.setText(" : "+s);
            hours.setText("  "+h);
            mins.setText(" : "+m);
            
            if (m == 2)
            {
                finishtime();
                break ; 
            }
            }
            catch(Exception e)
            {
            }
        }
        }
        else 
        {
            break ; 
        }
    }
         }
         
    };
    
    Connection con ; 
    public exam1() {
        initComponents();
        
        
        jButton2.setEnabled(false);
        
        jLabel12.setVisible(false);
        
        
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/edu","root","root");
        } catch (SQLException ex) {
            Logger.getLogger(first.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
         try {
            PreparedStatement stmt = con.prepareStatement
                    ("select * from edu.examq1 where idexam > 0 ");
            
             ResultSet rs = stmt.executeQuery();
           
                      while (rs.next()){  
                 
                 // = rs.getString(1); 
            
        qq11.setText(rs.getString(2));
        qq11a1.setText(rs.getString(3));
        qq11a2.setText(rs.getString(4));
        qq11a3.setText(rs.getString(5));
        qq11a4.setText(rs.getString(6));
        qq12.setText(rs.getString(7));
        qq12a4.setText(rs.getString(8));
        qq12a3.setText(rs.getString(9));
        qq12a2.setText(rs.getString(10));
        qq12a1.setText(rs.getString(11));
        qq13.setText(rs.getString(12)); 
        qq13a4.setText(rs.getString(13));
        qq13a3.setText(rs.getString(14));
        qq13a2.setText(rs.getString(15));
        qq13a1.setText(rs.getString(16));
        qq14.setText(rs.getString(17));
        qq14a4.setText(rs.getString(18));
        qq14a3.setText(rs.getString(19));
        qq14a2.setText(rs.getString(20));
        qq14a1.setText(rs.getString(21));
        qq15 .setText(rs.getString(22));
        qq15a4.setText(rs.getString(23));
        qq15a3.setText(rs.getString(24));
        qq15a2.setText(rs.getString(25));
        qq15a1.setText(rs.getString(26));
        qq16.setText(rs.getString(27));
        qq16a4.setText(rs.getString(28));
        qq16a3.setText(rs.getString(29));
        qq16a2.setText(rs.getString(30));
        qq16a1.setText(rs.getString(31));
                
                      }
            
           
            JOptionPane.showMessageDialog(this, "اضغط OK لبدء الامتحان");
        } catch (SQLException ex) {
            Logger.getLogger(makingExam1.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(this, "فشلة عملية البدء");
        }
        
         try {
            PreparedStatement stmt = con.prepareStatement
                    ("select * from edu.examq2 where idexamq2 > 0 ");
            
             ResultSet rs = stmt.executeQuery();
           
                      while (rs.next()){  
                 
                 // = rs.getString(1); 
                        
        qq21e.setText(rs.getString(2));
        qq22e.setText(rs.getString(3));
        qq23e.setText(rs.getString(4));
        qq24e.setText(rs.getString(5));
        qq25e.setText(rs.getString(6));
        qq26e.setText(rs.getString(7));
        qq27e.setText(rs.getString(8));
        qq28e.setText(rs.getString(9));
        qq29e.setText(rs.getString(10));
        qq210e.setText(rs.getString(11));     
                      }
           
        } catch (SQLException ex) {
            Logger.getLogger(makingExam1.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(this, "فشلة عملية البدء");
        } 
       
        t.start();  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        q11 = new javax.swing.ButtonGroup();
        q12 = new javax.swing.ButtonGroup();
        q13 = new javax.swing.ButtonGroup();
        q14 = new javax.swing.ButtonGroup();
        q15 = new javax.swing.ButtonGroup();
        q16 = new javax.swing.ButtonGroup();
        q21 = new javax.swing.ButtonGroup();
        q22 = new javax.swing.ButtonGroup();
        q23 = new javax.swing.ButtonGroup();
        q24 = new javax.swing.ButtonGroup();
        q25 = new javax.swing.ButtonGroup();
        q26 = new javax.swing.ButtonGroup();
        q27 = new javax.swing.ButtonGroup();
        q28 = new javax.swing.ButtonGroup();
        q29 = new javax.swing.ButtonGroup();
        q210 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        seconds = new javax.swing.JLabel();
        mins = new javax.swing.JLabel();
        hours = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        qq11 = new javax.swing.JLabel();
        qq11a1 = new javax.swing.JRadioButton();
        qq11a2 = new javax.swing.JRadioButton();
        qq11a3 = new javax.swing.JRadioButton();
        qq11a4 = new javax.swing.JRadioButton();
        qq12 = new javax.swing.JLabel();
        qq12a4 = new javax.swing.JRadioButton();
        qq12a3 = new javax.swing.JRadioButton();
        qq12a2 = new javax.swing.JRadioButton();
        qq12a1 = new javax.swing.JRadioButton();
        qq13 = new javax.swing.JLabel();
        qq13a4 = new javax.swing.JRadioButton();
        qq13a3 = new javax.swing.JRadioButton();
        qq13a2 = new javax.swing.JRadioButton();
        qq13a1 = new javax.swing.JRadioButton();
        qq14 = new javax.swing.JLabel();
        qq14a4 = new javax.swing.JRadioButton();
        qq14a3 = new javax.swing.JRadioButton();
        qq14a2 = new javax.swing.JRadioButton();
        qq14a1 = new javax.swing.JRadioButton();
        qq15 = new javax.swing.JLabel();
        qq15a4 = new javax.swing.JRadioButton();
        qq15a3 = new javax.swing.JRadioButton();
        qq15a2 = new javax.swing.JRadioButton();
        qq15a1 = new javax.swing.JRadioButton();
        qq16 = new javax.swing.JLabel();
        qq16a4 = new javax.swing.JRadioButton();
        qq16a3 = new javax.swing.JRadioButton();
        qq16a2 = new javax.swing.JRadioButton();
        qq16a1 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        panel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        qq21e = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        qq23e = new javax.swing.JLabel();
        qq22e = new javax.swing.JLabel();
        qq24e = new javax.swing.JLabel();
        qq25e = new javax.swing.JLabel();
        qq26e = new javax.swing.JLabel();
        qq27e = new javax.swing.JLabel();
        qq210e = new javax.swing.JLabel();
        qq28e = new javax.swing.JLabel();
        qq29e = new javax.swing.JLabel();
        qq21a1 = new javax.swing.JRadioButton();
        qq21a2 = new javax.swing.JRadioButton();
        qq22a1 = new javax.swing.JRadioButton();
        qq22a2 = new javax.swing.JRadioButton();
        qq23a1 = new javax.swing.JRadioButton();
        qq23a2 = new javax.swing.JRadioButton();
        qq24a1 = new javax.swing.JRadioButton();
        qq24a2 = new javax.swing.JRadioButton();
        qq25a1 = new javax.swing.JRadioButton();
        qq25a2 = new javax.swing.JRadioButton();
        qq26a1 = new javax.swing.JRadioButton();
        qq26a2 = new javax.swing.JRadioButton();
        qq27a1 = new javax.swing.JRadioButton();
        qq27a2 = new javax.swing.JRadioButton();
        qq28a1 = new javax.swing.JRadioButton();
        qq28a2 = new javax.swing.JRadioButton();
        qq29a1 = new javax.swing.JRadioButton();
        qq29a2 = new javax.swing.JRadioButton();
        qq210a1 = new javax.swing.JRadioButton();
        qq210a2 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel12 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(153, 204, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        seconds.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        seconds.setForeground(new java.awt.Color(255, 0, 0));
        seconds.setText("00");
        jPanel5.add(seconds, new org.netbeans.lib.awtextra.AbsoluteConstraints(824, 8, 57, 44));

        mins.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        mins.setForeground(new java.awt.Color(255, 0, 0));
        mins.setText("00 : ");
        jPanel5.add(mins, new org.netbeans.lib.awtextra.AbsoluteConstraints(737, 6, 81, 44));

        hours.setFont(new java.awt.Font("Tahoma", 0, 27)); // NOI18N
        hours.setForeground(new java.awt.Color(255, 0, 0));
        hours.setText("00 : ");
        jPanel5.add(hours, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 6, 87, 44));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("1");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(895, 74, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 6, 424, 46));

        qq11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        qq11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel5.add(qq11, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 152, 788, 22));

        q11.add(qq11a1);
        qq11a1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel5.add(qq11a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(768, 192, 115, 30));

        q11.add(qq11a2);
        qq11a2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel5.add(qq11a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(634, 192, 116, 30));

        q11.add(qq11a3);
        qq11a3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel5.add(qq11a3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 192, 116, 30));

        q11.add(qq11a4);
        qq11a4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel5.add(qq11a4, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 192, 116, 30));

        qq12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        qq12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel5.add(qq12, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 234, 687, 22));

        q12.add(qq12a4);
        qq12a4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel5.add(qq12a4, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 268, 116, 30));

        q12.add(qq12a3);
        qq12a3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel5.add(qq12a3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 268, 116, 30));

        q12.add(qq12a2);
        qq12a2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel5.add(qq12a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(634, 268, 116, 30));

        q12.add(qq12a1);
        qq12a1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel5.add(qq12a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(768, 268, 115, 30));

        qq13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        qq13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel5.add(qq13, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 316, 687, 22));

        q13.add(qq13a4);
        qq13a4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel5.add(qq13a4, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 356, 116, 30));

        q13.add(qq13a3);
        qq13a3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel5.add(qq13a3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 356, 116, 30));

        q13.add(qq13a2);
        qq13a2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel5.add(qq13a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(634, 356, 116, 30));

        q13.add(qq13a1);
        qq13a1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel5.add(qq13a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(768, 356, 115, 30));

        qq14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        qq14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel5.add(qq14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 680, 22));

        q14.add(qq14a4);
        qq14a4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        qq14a4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qq14a4ActionPerformed(evt);
            }
        });
        jPanel5.add(qq14a4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, 116, 30));

        q14.add(qq14a3);
        qq14a3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel5.add(qq14a3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, 116, 30));

        q14.add(qq14a2);
        qq14a2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel5.add(qq14a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 440, 116, 30));

        q14.add(qq14a1);
        qq14a1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        qq14a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qq14a1ActionPerformed(evt);
            }
        });
        jPanel5.add(qq14a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 440, 115, 30));

        qq15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        qq15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel5.add(qq15, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, 693, 22));

        q15.add(qq15a4);
        qq15a4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel5.add(qq15a4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 510, 116, 30));

        q15.add(qq15a3);
        qq15a3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel5.add(qq15a3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 510, 116, 30));

        q15.add(qq15a2);
        qq15a2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel5.add(qq15a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 510, 116, 30));

        q15.add(qq15a1);
        qq15a1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel5.add(qq15a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 510, 115, 30));

        qq16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        qq16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel5.add(qq16, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 580, 687, 22));

        q16.add(qq16a4);
        qq16a4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel5.add(qq16a4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 590, 116, 30));

        q16.add(qq16a3);
        qq16a3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel5.add(qq16a3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 590, 116, 30));

        q16.add(qq16a2);
        qq16a2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel5.add(qq16a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 590, 116, 30));

        q16.add(qq16a1);
        qq16a1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel5.add(qq16a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 590, 115, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("السؤال الاول ( اختر اجاجة من الاجابات المعطاه ) ");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 58, -1, 61));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 268, 54, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 192, 54, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 356, 54, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 496, 54, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 642, 54, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 782, 62, 30));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel4.setBackground(new java.awt.Color(153, 204, 255));
        panel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("تاكيد الاجابات");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 807, 180, 47));

        qq21e.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panel4.add(qq21e, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 67, 613, 34));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("السؤال الثاني ( صح او غلط  ) ");
        panel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(675, 6, -1, 61));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("2");
        panel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(989, 22, -1, -1));

        qq23e.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panel4.add(qq23e, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 180, 613, 34));

        qq22e.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panel4.add(qq22e, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 123, 613, 35));

        qq24e.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panel4.add(qq24e, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 236, 613, 35));

        qq25e.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panel4.add(qq25e, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 293, 613, 35));

        qq26e.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panel4.add(qq26e, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 350, 613, 35));

        qq27e.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panel4.add(qq27e, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 407, 613, 35));

        qq210e.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panel4.add(qq210e, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 584, 613, 35));

        qq28e.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panel4.add(qq28e, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 464, 613, 35));

        qq29e.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panel4.add(qq29e, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 521, 613, 35));

        q21.add(qq21a1);
        qq21a1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        qq21a1.setText("صح");
        panel4.add(qq21a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 101, 67, -1));

        q21.add(qq21a2);
        qq21a2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        qq21a2.setText("غلط");
        panel4.add(qq21a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 101, 67, -1));

        q22.add(qq22a1);
        qq22a1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        qq22a1.setText("صح");
        panel4.add(qq22a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 158, 67, -1));

        q22.add(qq22a2);
        qq22a2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        qq22a2.setText("غلط");
        panel4.add(qq22a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 158, 67, -1));

        q23.add(qq23a1);
        qq23a1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        qq23a1.setText("صح");
        panel4.add(qq23a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 214, 67, -1));

        q23.add(qq23a2);
        qq23a2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        qq23a2.setText("غلط");
        panel4.add(qq23a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 214, 67, -1));

        q24.add(qq24a1);
        qq24a1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        qq24a1.setText("صح");
        panel4.add(qq24a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 271, 67, -1));

        q24.add(qq24a2);
        qq24a2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        qq24a2.setText("غلط");
        panel4.add(qq24a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 271, 67, -1));

        q25.add(qq25a1);
        qq25a1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        qq25a1.setText("صح");
        panel4.add(qq25a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 328, 67, -1));

        q25.add(qq25a2);
        qq25a2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        qq25a2.setText("غلط");
        panel4.add(qq25a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 328, 67, -1));

        q26.add(qq26a1);
        qq26a1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        qq26a1.setText("صح");
        panel4.add(qq26a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 385, 67, -1));

        q26.add(qq26a2);
        qq26a2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        qq26a2.setText("غلط");
        panel4.add(qq26a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 385, 67, -1));

        q27.add(qq27a1);
        qq27a1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        qq27a1.setText("صح");
        panel4.add(qq27a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 442, 67, -1));

        q27.add(qq27a2);
        qq27a2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        qq27a2.setText("غلط");
        panel4.add(qq27a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 442, 67, -1));

        q28.add(qq28a1);
        qq28a1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        qq28a1.setText("صح");
        panel4.add(qq28a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 499, 67, -1));

        q28.add(qq28a2);
        qq28a2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        qq28a2.setText("غلط");
        panel4.add(qq28a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 499, 67, -1));

        q29.add(qq29a1);
        qq29a1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        qq29a1.setText("صح");
        panel4.add(qq29a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 556, 67, -1));

        q29.add(qq29a2);
        qq29a2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        qq29a2.setText("غلط");
        panel4.add(qq29a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 556, 67, -1));

        q210.add(qq210a1);
        qq210a1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        qq210a1.setText("صح");
        panel4.add(qq210a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 625, 67, -1));

        q210.add(qq210a2);
        qq210a2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        qq210a2.setText("غلط");
        panel4.add(qq210a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 625, 67, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("السؤال التالي");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 807, 147, 46));

        jLabel12.setColumns(20);
        jLabel12.setFont(new java.awt.Font("Monospaced", 1, 30)); // NOI18N
        jLabel12.setRows(5);
        jScrollPane1.setViewportView(jLabel12);

        panel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 653, 494, 229));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (onetime == false)
        {
        finishtime();
        onetime = true ; 
        }
        
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void qq14a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qq14a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qq14a1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      this.setVisible(false);
      exam2 ex2 = new exam2();
      ex2.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void qq14a4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qq14a4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qq14a4ActionPerformed

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
            java.util.logging.Logger.getLogger(exam1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(exam1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(exam1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(exam1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new exam1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hours;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JTextArea jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mins;
    private javax.swing.JPanel panel4;
    private javax.swing.ButtonGroup q11;
    private javax.swing.ButtonGroup q12;
    private javax.swing.ButtonGroup q13;
    private javax.swing.ButtonGroup q14;
    private javax.swing.ButtonGroup q15;
    private javax.swing.ButtonGroup q16;
    private javax.swing.ButtonGroup q21;
    private javax.swing.ButtonGroup q210;
    private javax.swing.ButtonGroup q22;
    private javax.swing.ButtonGroup q23;
    private javax.swing.ButtonGroup q24;
    private javax.swing.ButtonGroup q25;
    private javax.swing.ButtonGroup q26;
    private javax.swing.ButtonGroup q27;
    private javax.swing.ButtonGroup q28;
    private javax.swing.ButtonGroup q29;
    private javax.swing.JLabel qq11;
    private javax.swing.JRadioButton qq11a1;
    private javax.swing.JRadioButton qq11a2;
    private javax.swing.JRadioButton qq11a3;
    private javax.swing.JRadioButton qq11a4;
    private javax.swing.JLabel qq12;
    private javax.swing.JRadioButton qq12a1;
    private javax.swing.JRadioButton qq12a2;
    private javax.swing.JRadioButton qq12a3;
    private javax.swing.JRadioButton qq12a4;
    private javax.swing.JLabel qq13;
    private javax.swing.JRadioButton qq13a1;
    private javax.swing.JRadioButton qq13a2;
    private javax.swing.JRadioButton qq13a3;
    private javax.swing.JRadioButton qq13a4;
    private javax.swing.JLabel qq14;
    private javax.swing.JRadioButton qq14a1;
    private javax.swing.JRadioButton qq14a2;
    private javax.swing.JRadioButton qq14a3;
    private javax.swing.JRadioButton qq14a4;
    private javax.swing.JLabel qq15;
    private javax.swing.JRadioButton qq15a1;
    private javax.swing.JRadioButton qq15a2;
    private javax.swing.JRadioButton qq15a3;
    private javax.swing.JRadioButton qq15a4;
    private javax.swing.JLabel qq16;
    private javax.swing.JRadioButton qq16a1;
    private javax.swing.JRadioButton qq16a2;
    private javax.swing.JRadioButton qq16a3;
    private javax.swing.JRadioButton qq16a4;
    private javax.swing.JRadioButton qq210a1;
    private javax.swing.JRadioButton qq210a2;
    private javax.swing.JLabel qq210e;
    private javax.swing.JRadioButton qq21a1;
    private javax.swing.JRadioButton qq21a2;
    private javax.swing.JLabel qq21e;
    private javax.swing.JRadioButton qq22a1;
    private javax.swing.JRadioButton qq22a2;
    private javax.swing.JLabel qq22e;
    private javax.swing.JRadioButton qq23a1;
    private javax.swing.JRadioButton qq23a2;
    private javax.swing.JLabel qq23e;
    private javax.swing.JRadioButton qq24a1;
    private javax.swing.JRadioButton qq24a2;
    private javax.swing.JLabel qq24e;
    private javax.swing.JRadioButton qq25a1;
    private javax.swing.JRadioButton qq25a2;
    private javax.swing.JLabel qq25e;
    private javax.swing.JRadioButton qq26a1;
    private javax.swing.JRadioButton qq26a2;
    private javax.swing.JLabel qq26e;
    private javax.swing.JRadioButton qq27a1;
    private javax.swing.JRadioButton qq27a2;
    private javax.swing.JLabel qq27e;
    private javax.swing.JRadioButton qq28a1;
    private javax.swing.JRadioButton qq28a2;
    private javax.swing.JLabel qq28e;
    private javax.swing.JRadioButton qq29a1;
    private javax.swing.JRadioButton qq29a2;
    private javax.swing.JLabel qq29e;
    private javax.swing.JLabel seconds;
    // End of variables declaration//GEN-END:variables
}
