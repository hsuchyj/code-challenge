import javax.swing.JOptionPane;

public class Elevator
{
    public static void main(String [] args)
    {
        int maxFloor = 20;
        int minFloor = 1;
        int f1 = 1;
        String f = "1";
        int curFloor = 1;
        while(f != "exit")
        {
            f = JOptionPane.showInputDialog("Which floor? 1 thru 20");
            try
            {
                curFloor = Integer.parseInt(f);
                if(curFloor <= maxFloor && curFloor >= minFloor)
                {
                    JOptionPane.showMessageDialog(null, "You are on floor "+curFloor);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Not available. Try again.");
                }
            }
            catch(Exception ex)
            {
                if(f.equals("exit"))
                {
                    break;
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Not available. Try again.");
                }
            }
            
        }
    }

}