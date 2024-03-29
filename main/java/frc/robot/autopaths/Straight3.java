//straight path!

package frc.robot.autopaths;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
/**
 * Add your docs here.
 */
public class Straight3 extends Command {

    private boolean completed;
    private double starttime;

    public void initialize() {
        starttime = Timer.getFPGATimestamp();
    }
    public void execute() {
        if(Timer.getFPGATimestamp() - starttime <= 8.6
        ){
            Robot.drivetrain.leftMaster.set(-0.6);
            Robot.drivetrain.rightMaster.set(0.7);
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