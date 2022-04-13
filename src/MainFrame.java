import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MainFrame extends JFrame {
  JLabel appLabel;
  JLabel radiusLabel;
  JLabel heightLabel;
  JLabel areaLabel;
  JLabel aboutLabel;
  JTextField radiusField;
  JTextField heightField;
  JTextField areaField;
  JButton calcButton;


  public MainFrame() {
    this.setComponent();
    this.setFrame();
  }


  private void setComponent() {
    appLabel = new JLabel("Kör alapú kúp térfogata");
    appLabel.setBounds(30, 30, 200, 30);

    radiusLabel = new JLabel("Sugár");
    radiusLabel.setBounds(30, 70, 100, 30);

    heightLabel = new JLabel("Magasság");
    heightLabel.setBounds(30, 110, 100, 30);

    areaLabel = new JLabel("Térfogat");
    areaLabel.setBounds(30, 190, 100, 30);

    aboutLabel = new JLabel("Juhász Roland 2022-04-13");
    aboutLabel.setBounds(30, 230, 250, 30);

    radiusField = new JTextField();
    radiusField.setBounds(150, 70, 250, 30);

    heightField = new JTextField();
    heightField.setBounds(150, 110, 100, 30);

    areaField = new JTextField();
    areaField.setBounds(150, 190, 100, 30);

    calcButton = new JButton("Számít");
    calcButton.setBounds(150, 150, 100, 30);
    
  }


  private void setFrame() {
    add(appLabel);
    add(radiusLabel);
    add(heightLabel);
    add(areaLabel);
    add(aboutLabel);
    add(radiusField);
    add(heightField);
    add(areaField);
    add(calcButton);

    this.setLayout(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(300, 400);
    this.setVisible(true);

    
  }
}
