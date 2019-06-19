//LeftTurn!

package frc.robot.autopaths;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
/**
 * Add your docs here.
 */
public class LeftTurn extends Command {

    private boolean completed;
    private double starttime;

    public void initialize() {
        starttime = Timer.getFPGATimestamp();
    }
    public void execute() {
        if(Timer.getFPGATimestamp() - starttime <= 4.7
        ){
            Robot.drivetrain.leftMaster.set(-0.3);
            Robot.drivetrain.rightMaster.set(1);
        }else {
            Robot.drivetrain.leftMaster.set(0);
            Robot.drivetrain.rightMaster.set(0);
            completed = true;
        }
    }
    
    @Override
    protected boolean isFinished() {
        return completed;
    }

}