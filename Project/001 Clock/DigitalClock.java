import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

class MyWindow extends JFrame {

    private JLabel heading;
    private JLabel clockLabel;;
    Calendar calendar;
    SimpleDateFormat timeFormat;
    String time;

    MyWindow() {
        super.setTitle("Clock");
        super.setSize(400, 200);
        super.setLocation(900 / 2, 100);
        this.createGUI();
        this.setVisible(true);
        this.setResizable(false);
        setTime();
    }

    // GUI
    public void createGUI() {
        heading = new JLabel("My Clock");
        clockLabel = new JLabel("Clock");
        clockLabel.setFont(new Font("Poppins", Font.PLAIN, 50));
        clockLabel.setForeground(new Color(0xbbea22));
        clockLabel.setBackground(Color.black);
        clockLabel.setOpaque(true);
        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        // this.setLayout(new GridLayout(2, 1));
        this.add(heading);
        this.add(clockLabel);
    }
    
    public void setTime() {
        while (true) {
            time = timeFormat.format(Calendar.getInstance().getTime());
            clockLabel.setText(time);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class DigitalClock {

    public static void main(String[] args) {
        MyWindow w = new MyWindow();
    }
}
