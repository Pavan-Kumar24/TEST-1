package frc.robot.autopaths;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * Add your docs here.
 */
public class StraightTurn extends CommandGroup {

    public StraightTurn(){
    {
        addSequential(new Straight());
        addSequential(new Turn());
        addSequential(new Straight3());
        addSequential(new LeftTurn());
        addSequential(new Straight3());



    
        
   
    }
    
}


}