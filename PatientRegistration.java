import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.GridLayout;

public class PatientRegistration extends JFrame{
    public PatientRegistration(){
        setTitle("Hospital - Patient Registration");
        setSize(500,600);
        setLayout(new GridLayout(11, 2, 10, 10));

        add(new JLabel("Full Name:")); add(new JTextField());
        add(new JLabel("ID Number:")); add(new JTextField());
        add(new JLabel("Date of Birth:")); add(new JTextField("DD/MM/YYYY"));
        add(new JLabel("Gender:"));
        JPanel genderPanel = new JPanel();
        genderPanel.add(new JRadioButton("Male"));
        genderPanel.add(new JRadioButton("Female"));
        add(genderPanel);
        add(new JLabel("Phone:")); add(new JTextField());
        add(new JLabel("Address:")); add(new JTextField());
        add(new JLabel("Blood Group:"));
        add(new JComboBox<>(new String[]{"A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"}));
        add(new JLabel("Allergies:")); add(new JTextField());
        add(new JLabel("Next of Kin:")); add(new JTextField());
        add(new JLabel("Insurance No:")); add(new JTextField());

        add(new JButton("Save")); add(new JButton("Clear"));
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args){
        new PatientRegistration();
    }
}
