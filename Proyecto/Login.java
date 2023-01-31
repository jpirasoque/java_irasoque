import javax.swing.*;
import java.awt.event.*;
 
 public class Login extends JFrame implements ActionListener{

 private JTextField textfield1,textfield2 ;
 private JLabel label1,label2;
 private JButton boton1;
   

 public Login(){
 setLayout(null);
 label1= new JLabel("Usuario");
 label1.setBounds(10,10,100,30);
 add(label1);


 textfield1 = new JTextField();
 textfield1.setBounds(120,17,150,20);
 add(textfield1);

label2= new JLabel("Password");
 label2.setBounds(10,40,100,30);
 add(label2);

 textfield2 = new JTextField();
 textfield2.setBounds(120,47,150,20);
 add(textfield2);

 

 boton1= new JButton("Aceptar");
 boton1.setBounds(10,80,100,30);
 add(boton1);
 boton1.addActionListener(this);



}
public void actionPerformed(ActionEvent e){
String usuario = "";
String password = "";
if(e.getSource()== boton1){
 usuario = textfield1.getText().trim();
 password = textfield2.getText().trim();
 if(usuario.equals("itec")&&password.equals("123456")){
  
    Bienvenida ventanabienvenida = new Bienvenida();
   ventanabienvenida.setBounds(0,0,350,450);
   ventanabienvenida.setVisible(true);
   ventanabienvenida.setResizable(false);
   ventanabienvenida.setLocationRelativeTo(null);
    this.setVisible(false);
}else{
JOptionPane.showMessageDialog(null,"usuario o password incorrectos");
}
}
}

public static void main(String args[]){

 Login ventanalogin = new Login();
 ventanalogin.setBounds(0,0,300,150);
 ventanalogin.setVisible(true);
 ventanalogin.setResizable(false);
 ventanalogin.setLocationRelativeTo(null);




}

}