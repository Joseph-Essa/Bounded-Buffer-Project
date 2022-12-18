
package pc;

import java.io.IOException;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.WindowConstants;


import Producer_Consumer.consumer_producer;



/**
 *
 * @author joseph
 */



public class pc extends Thread{
        
 static String Interrupt_mess;       

	public static class GUI extends JFrame {
                       
		public static void main(String[] args) throws InterruptedException {
                
//////////////////* Creating the frame and the panel *////////////////////////

			JFrame frame = new JFrame("test");
			JPanel panel = new JPanel();
                        panel.setBackground(new java.awt.Color(0, 120, 212));
                        
//////////////////* creating the labels */////////////////////////////////////
                    //////////////////icons//////////////////////   
                        JLabel icon = new JLabel();
                        icon.setBounds(50,180,110, 60);
                        icon.setIcon(new javax.swing.ImageIcon("D:\\FCAI\\Year (3)\\Operating system 2\\Project\\test\\Git\\Project (with switch)_1\\src\\icons\\صورة1.png"));
                        
			JLabel icon2 = new JLabel();
                        icon2.setBounds(560,180,110, 60);
                        icon2.setIcon(new javax.swing.ImageIcon("D:\\FCAI\\Year (3)\\Operating system 2\\Project\\test\\Git\\Project (with switch)_1\\src\\icons\\صورة1.png"));
                        
			 JLabel icon3 = new JLabel();
                        icon3.setBounds(590,455,170,30);
                        icon3.setIcon(new javax.swing.ImageIcon("D:\\FCAI\\Year (3)\\Operating system 2\\Project\\test\\Git\\Project (with switch)_1\\src\\icons\\boo.png"));

			 JLabel icon4 = new JLabel();
                        icon4.setBounds(590,500,170,30);
                        icon4.setIcon(new javax.swing.ImageIcon("D:\\FCAI\\Year (3)\\Operating system 2\\Project\\test\\Git\\Project (with switch)_1\\src\\icons\\boo.png"));

                        JLabel icon5 = new JLabel();
                        icon5.setBounds(590,550,170,30);
                        icon5.setIcon(new javax.swing.ImageIcon("D:\\FCAI\\Year (3)\\Operating system 2\\Project\\test\\Git\\Project (with switch)_1\\src\\icons\\صورة2.png"));

                                   //////////////////lables//////////////////////
                        
                        JLabel N_of_elements = new JLabel("consumer 1 ");
			N_of_elements.setBounds(20, 250,110, 40);
                        N_of_elements.setFont(new java.awt.Font("Tahoma", 0, 20));
                        
                        JLabel avilable = new JLabel("consumer 2 ");
			avilable.setBounds(20,310,110, 40);
                        avilable.setFont(new java.awt.Font("Tahoma", 0, 20));
                      
                        JLabel avilable2 = new JLabel("consumer 3");
			avilable2.setBounds(20, 370, 240, 40);
                        avilable2.setFont(new java.awt.Font("Tahoma", 0, 20));

                        JLabel avilable3 = new JLabel("consumer 4");
			avilable3.setBounds(530,250,110, 40);
                        avilable3.setFont(new java.awt.Font("Tahoma", 0, 20));

                        JLabel avilable4 = new JLabel("consumer 5");
			avilable4.setBounds(530,310,110, 40);
                        avilable4.setFont(new java.awt.Font("Tahoma", 0, 20));

                        JLabel avilable5 = new JLabel("consumer 6");
			avilable5.setBounds(530,370, 240, 40);
                        avilable5.setFont(new java.awt.Font("Tahoma", 0, 20));
                        
                       
                        
                        JLabel avilable7 = new JLabel(" Tickets Num");
			avilable7.setBounds(180,200,120,20);
                        avilable7.setFont(new java.awt.Font("Tahoma", 0, 20));
                        
                        JLabel avilable8 = new JLabel("prosess state");
			avilable8.setBounds(350,195,120,30);
                        avilable8.setFont(new java.awt.Font("Tahoma", 0, 20));
                        
                       
                        
                        JLabel avilable10 = new JLabel("Tickets Num");
			avilable10.setBounds(690,200,120,20);
                        avilable10.setFont(new java.awt.Font("Tahoma", 0, 20));
                        
                        JLabel avilable11 = new JLabel("prosess state");
			avilable11.setBounds(870,195,120,30);
                        
                        avilable11.setFont(new java.awt.Font("Tahoma", 0, 20));
                        
                         JLabel avilable12 = new JLabel("Total Avilable Tickets");
			avilable12.setBounds(640,450,170,30);
                        avilable12.setFont(new java.awt.Font("Tahoma", 0, 18));
                        
                         JLabel avilable13 = new JLabel("Total Booked Tickets");
			avilable13.setBounds(640,500,170,30);
                        avilable13.setFont(new java.awt.Font("Tahoma", 0, 18));
                        
                         JLabel avilable14 = new JLabel("Total Time Elapsed (In Sec)");
			avilable14.setBounds(640,550,250,30);
                        avilable14.setFont(new java.awt.Font("Tahoma", 0, 18));
                        
                        JLabel avilable16 = new JLabel("Tickets State");
			avilable16.setBounds(330,460,280, 30);
                        avilable16.setFont(new java.awt.Font("Tahoma", 0, 18));

                        
                        JLabel mess = new JLabel(" Book Tickets System");
			mess.setBounds(320, 0, 360, 80);
			mess.setFont(new java.awt.Font("Tahoma", 0, 36));
                        
                        JLabel mess2 = new JLabel(" Enter Tickets Number");
			mess2.setBounds(30,30,210,30);
			mess2.setFont(new java.awt.Font("Tahoma", 0, 20));
                        
                        JLabel mess3 = new JLabel("consumer Controler");
			mess3.setBounds(750,15,210,30);
			mess3.setFont(new java.awt.Font("Tahoma", 0,22));
                        
                        
/////////////* creating the button *//////////////////////////////////////////

			JButton Button = new JButton();
			Button.setText("    Start Threads ");
			Button.setBounds(350,90,280,60);
                        Button.setFont(new java.awt.Font("Tahoma", 0, 22));
                        Button.setIcon(new javax.swing.ImageIcon("D:\\FCAI\\Year (3)\\Operating system 2\\Project\\test\\Git\\Project (with switch)_1\\src\\icons\\th.png")); // NOI18N
                        Button.setBackground(new java.awt.Color(0, 120, 212));
                        Button.setContentAreaFilled(false);
                        Button.setDefaultCapable(false);
                        Button.setFocusable(false);
                        
                        
                        JButton Button1 = new JButton();
                        Button1.setText("Exit");
                        Button1.setFont(new java.awt.Font("Tahoma", 0, 18));
                        Button1.setBounds(30,520,110,40);
                        Button1.setIcon(new javax.swing.ImageIcon("D:\\FCAI\\Year (3)\\Operating system 2\\Project\\test\\Git\\Project (with switch)_1\\src\\icons\\ee.png")); // NOI18N
                        Button1.addActionListener(f -> {System.exit(0);});
                        Button1.setContentAreaFilled(false);
                        Button1.setDefaultCapable(false);
                        Button1.setFocusable(false);

                        
///////////////////////concumer Ctrl/////////////////////////

                        JButton Button2 = new JButton();
                        Button2.setText("Stop 1");
                        Button2.setFont(new java.awt.Font("Tahoma", 0, 18));
                        Button2.setBounds(700,60,90,35);
                        Button2.setContentAreaFilled(false);
                        Button2.setDefaultCapable(false);
                        Button2.setFocusable(false);
                        
                        JButton Button3 = new JButton();
                        Button3.setText("Stop 2");
                        Button3.setFont(new java.awt.Font("Tahoma", 0, 18));
                        Button3.setBounds(800,60,90,35);
                        Button3.setContentAreaFilled(false);
                        Button3.setDefaultCapable(false);
                        Button3.setFocusable(false);

                        
                        JButton Button4 = new JButton();
                        Button4.setText("Stop 3");
                        Button4.setFont(new java.awt.Font("Tahoma", 0, 18));
                        Button4.setBounds(910,60,90,35);
                        Button4.setContentAreaFilled(false);
                        Button4.setDefaultCapable(false);
                        Button4.setFocusable(false);
                        
                        
                         JButton Button5 = new JButton();
                        Button5.setText("Stop 4");
                        Button5.setFont(new java.awt.Font("Tahoma", 0, 18));
                        Button5.setBounds(700,110,90,35);
                        Button5.setContentAreaFilled(false);
                        Button5.setDefaultCapable(false);
                        Button5.setFocusable(false);
                        
                        
                         JButton Button6 = new JButton();
                        Button6.setText("Stop 5");
                        Button6.setFont(new java.awt.Font("Tahoma", 0, 18));
                        Button6.setBounds(800,110,90,35);
                        Button6.setContentAreaFilled(false);
                        Button6.setDefaultCapable(false);
                        Button6.setFocusable(false);
                        
                        
                        
                        JButton Button7 = new JButton();
                        Button7.setText("Stop 6");
                        Button7.setFont(new java.awt.Font("Tahoma", 0, 18));
                        Button7.setBounds(910,110,90,35);
                        Button7.setContentAreaFilled(false);
                        Button7.setDefaultCapable(false);
                        Button7.setFocusable(false);
                        
                        
/////////////* creating Textpane -input places- *///////////////////////////

                        JTextPane elements1 = new JTextPane();
			elements1.setBounds(70,80,90,25);
                        elements1.setFont(new java.awt.Font("Tahoma", 0, 16));			
                       
                        
/////////////* creating Textpane -output places- *///////////////////////////

       

			
			JTextPane elements = new JTextPane();
			elements.setBounds(350, 260,120, 30);
			elements.setText("prosess state");
                        elements.setFont(new java.awt.Font("Tahoma", 0, 16));
			elements.setEditable(false);
                        
                        
                        JTextPane elements2 = new JTextPane();
			elements2.setBounds(350,320,120, 30);
			elements2.setText("prosess state");
                        elements2.setFont(new java.awt.Font("Tahoma", 0, 16));
			elements2.setEditable(false);

                        JTextPane elements3 = new JTextPane();
			elements3.setBounds(350,380,120, 30);
			elements3.setText("prosess state");
                        elements3.setFont(new java.awt.Font("Tahoma", 0, 16));
			elements3.setEditable(false);

                        JTextPane elements4 = new JTextPane();
			elements4.setBounds(870,260,120, 30);
			elements4.setText("prosess state");
                        elements4.setFont(new java.awt.Font("Tahoma", 0, 16));
			elements4.setEditable(false);

                        JTextPane elements5 = new JTextPane();
			elements5.setBounds(870, 320,120, 30);
			elements5.setText("prosess state");
                        elements5.setFont(new java.awt.Font("Tahoma", 0, 16));
			elements5.setEditable(false);

                        
                        JTextPane elements6 = new JTextPane();
			elements6.setBounds(870, 380,120, 30);
			elements6.setText("prosess state");
                        elements6.setFont(new java.awt.Font("Tahoma", 0, 16));
			elements6.setEditable(false);
                        
                        
                        JTextPane elements7 = new JTextPane();
			elements7.setBounds(200, 260,70, 30);
			elements7.setText("num");
                        elements7.setFont(new java.awt.Font("Tahoma", 0, 16));
			elements7.setEditable(false);
                        
                        JTextPane elements8 = new JTextPane();
			elements8.setBounds(200,320,70, 30);
			elements8.setText("num");
                        elements8.setFont(new java.awt.Font("Tahoma", 0, 16));
			elements8.setEditable(false);
                        
                        JTextPane elements9 = new JTextPane();
			elements9.setBounds(200,380,70, 30);
			elements9.setText("num");
                        elements9.setFont(new java.awt.Font("Tahoma", 0, 16));
			elements9.setEditable(false);
                        
                        
                        
                         JTextPane elements13 = new JTextPane();
			elements13.setBounds(710, 260,70, 30);
			elements13.setText("num");
                        elements13.setFont(new java.awt.Font("Tahoma", 0, 16));
			elements13.setEditable(false);
                        
                         JTextPane elements14 = new JTextPane();
			elements14.setBounds(710,320,70, 30);
			elements14.setText("num");
                        elements14.setFont(new java.awt.Font("Tahoma", 0, 16));
			elements14.setEditable(false);
                        
                         JTextPane elements15 = new JTextPane();
			elements15.setBounds(710,380,70, 30);
			elements15.setText("num");
                        elements15.setFont(new java.awt.Font("Tahoma", 0, 16));
			elements15.setEditable(false);
                        
                        
                        
                         JTextPane elements19 = new JTextPane();
			elements19.setBounds(870,450,90, 30);
			elements19.setText("total");
                        elements19.setFont(new java.awt.Font("Tahoma", 0, 16));
			elements19.setEditable(false);
                        
                         JTextPane elements20 = new JTextPane();
			elements20.setBounds(870,500,90, 30);
			elements20.setText("total");
                        elements20.setFont(new java.awt.Font("Tahoma", 0, 16));
			elements20.setEditable(false);
                        
                        JTextPane elements21 = new JTextPane();
			elements21.setBounds(870,550,90, 30);
			elements21.setText("time");
                        elements21.setFont(new java.awt.Font("Tahoma", 0, 16));
			elements21.setEditable(false);
                        
                        JTextPane elements22 = new JTextPane();
			elements22.setBounds(240,510,295, 30);
			elements22.setText("");
                        elements22.setFont(new java.awt.Font("Tahoma", 0, 20));
			elements22.setEditable(false);
                        
                        JTextPane elements23 = new JTextPane();
			elements23.setBounds(750,160,210,30);
			elements23.setText("No Interrupted Threads");
                        elements23.setFont(new java.awt.Font("Tahoma", 0, 18));
			elements23.setEditable(false);
                        
                        
/////////////* adding all elements to the panel *///////////////////////////
			panel.setLayout(null);
			panel.add(elements);
                        panel.add(elements1);
                        panel.add(elements2);
                        panel.add(elements3); 
                        panel.add(elements4); 
                        panel.add(elements5); 
                        panel.add(elements6);
                        panel.add(elements7);
                        panel.add(elements8);
                        panel.add(elements9);

                        panel.add(elements13);
                        panel.add(elements14);
                        panel.add(elements15);
                        panel.add(elements19);
                        panel.add(elements20);
                        panel.add(elements21);
                        panel.add(elements22);
                        panel.add(elements23);
			panel.add(Button);
                        panel.add(Button1);
                        panel.add(Button2);
                        panel.add(Button3);
                        panel.add(Button4);
                        panel.add(Button5);
                        panel.add(Button6);
                        panel.add(Button7);
                        
			panel.add(N_of_elements);
                        panel.add(avilable);
                        panel.add(avilable2);
                        panel.add(avilable3);
                        panel.add(avilable4);
                        panel.add(avilable5);
                        panel.add(avilable7);
                        panel.add(avilable8);                      
                        panel.add(avilable10);
                        panel.add(avilable11);
                        panel.add(avilable12);
                        panel.add(avilable13);
                        panel.add(avilable14);
                        panel.add(avilable16);
                        panel.add(mess);
                        panel.add(mess2);
                        panel.add(mess3);
			panel.add(icon);
                        panel.add(icon2);
                        panel.add(icon3);
                        panel.add(icon4);
                        panel.add(icon5);
                        
/////////////* setting the frame and adding the panel *///////////////////////////

			frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			frame.add(panel);
                        frame.setLocation(220, 55);
			frame.setSize(1050,640);
			frame.setVisible(true);
/////////////* time elapsed method -timer works when you hit the button- *///////////////////////////
                         
                        consumer_producer pro=new consumer_producer();
                        

			Timer timer = new Timer();
			TimerTask timertask = new TimerTask() {
                           
				public void run() {
                                    
                                    	
			           	elements.setText(String.valueOf(pro.mess));
                                        elements2.setText(String.valueOf(pro.mess2));
                                        elements3.setText(String.valueOf(pro.mess3));
                                        elements4.setText(String.valueOf(pro.mess4));
                                        elements5.setText(String.valueOf(pro.mess5));
                                        elements6.setText(String.valueOf(pro.mess6));
                                        elements7.setText(String.valueOf(pro.c1));
                                        elements8.setText(String.valueOf(pro.c2));
                                        elements9.setText(String.valueOf(pro.c3));
                                        elements13.setText(String.valueOf(pro.c4));
                                        elements14.setText(String.valueOf(pro.c5));
                                        elements15.setText(String.valueOf(pro.c6));
                                        elements19.setText(String.valueOf(pro.Avilable_tik));
                                        elements20.setText(String.valueOf(pro.tik_count)); 
                                        elements21.setText(String.valueOf(pro.time())); 
                                        elements22.setText(String.valueOf(pro.mess7));
                                        elements23.setText(String.valueOf(Interrupt_mess));
                                        
				}
                                
			};
/////////////*Actions done on pressing the button*///////////////////////////

//////////////////////concumer Controler///////////////////
 
Button2.addActionListener(a -> {

    pro.Ctrl_1=false;
});

Button3.addActionListener(a -> {

    pro.Ctrl_2=false;
});

Button4.addActionListener(a -> {

    pro.Ctrl_3=false;
});

Button5.addActionListener(a -> {

    pro.Ctrl_4=false;
});

Button6.addActionListener(a -> {

    pro.Ctrl_5=false;
});
Button7.addActionListener(a -> {

    pro.Ctrl_6=false;
});

//////////////////////////////////// create start threads button  ////////////////////////

Button.addActionListener(a -> {
    
    
pro.Max_tik_num =  Integer.parseInt(elements1.getText());
pro.Avilable_tik=pro.Max_tik_num;
                            

timer.scheduleAtFixedRate(timertask,0, 1);  
                            
                            
Thread t1 = new Thread(new Runnable() {
 @Override
public void run() {
                                              
         try {

	pro.producerr();
                                                         
	} catch (InterruptedException e) {
		e.printStackTrace();
		}
                                               	
		}
	});
                                
Thread t2 = new Thread(new Runnable() {
 @Override
public void run() {
                                           
         try {
                                                    
           pro.producerr();
	} catch (InterruptedException e) {
          e.printStackTrace();
		}
                                                
                                          					
	}
		});
                                

Thread t3 = new Thread(new Runnable() {
@Override
public void run() {						

                                                    
          try { 
                                                            
            pro.consumerr();
          } catch (InterruptedException e) {
	   Interrupt_mess="Thread 1 Is Interrupted ";
		}
                                                                
                    }
                                     
	});
                                
Thread t4 = new Thread(new Runnable() {
@Override
public void run() {						
                                                    
        try {

        pro.consumerr();
      } catch (InterruptedException e) {
        Interrupt_mess="Thread 2 Is Interrupted ";
		}      
		}
                                     
		});
                                
Thread t5 = new Thread(new Runnable() {
@Override
	public void run() {						
                                                    
             try {
             pro.consumerr();
             } catch (InterruptedException e) {
	Interrupt_mess="Thread 3 Is Interrupted ";
           }      
		}
                                     
	});
            

Thread t6 = new Thread(new Runnable() {
@Override
public void run() {						
                                                    
                                                    
  try {
       pro.consumerr();
       } catch (InterruptedException e) {
	Interrupt_mess="Thread 4 Is Interrupted ";
		}      
		}
                                     
	});
                                
Thread t7 = new Thread(new Runnable() {
@Override
public void run() {						
                                                    
             try {
                  pro.consumerr();
                 } catch (InterruptedException e) {
		  Interrupt_mess="Thread 5 Is Interrupted ";
			}      
		}
                                     
		});
                                
Thread t8 = new Thread(new Runnable() {
@Override
	public void run() {						
                                                    
                    try {
                      pro.consumerr();
                        } catch (InterruptedException e) {
		Interrupt_mess="Thread 6 Is Interrupted ";
			}      
			}
                                     
			});
                                
                                
   /////////////////// *Starting the threads*//////////////////////////////
                                                               
                                t1.start();
                                t2.start();
                                t3.start();
                                t4.start();
                                t5.start();
                                t6.start();
                                t7.start();
                                t8.start(); 
                               
                          
                                
			}); // End Of Button
                                 
		}// End of Main
                
	}// End of Class GUI
        
}// End of Class pc
















                      