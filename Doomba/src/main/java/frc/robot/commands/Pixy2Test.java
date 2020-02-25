
package frc.robot.commands;

import java.util.ArrayList;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.Robot;
import io.github.pseudoresonance.pixy2api.Pixy2;
import io.github.pseudoresonance.pixy2api.Pixy2CCC;
import io.github.pseudoresonance.pixy2api.Pixy2CCC.Block;

/**
 * Describe what the class does here
 */
public class Pixy2Test extends Command {

  public Pixy2Test(){

    
  }

  @Override
  protected void initialize() {

  }

  @Override
  protected void execute() {
    int blockCount = Robot.pixy.getCCC().getBlocks(false, Pixy2CCC.CCC_SIG1, 25);
    ArrayList<Block> blocks = Robot.pixy.getCCC().getBlocks();

    Block largestBlock = null;

    for (int i=0; i<blocks.size(); i++){
      Block block = blocks.get(i);
      if (largestBlock == null) {

       largestBlock = block; 
      } else if (block.getWidth() > 
      largestBlock.getWidth()) {
        largestBlock = block;
      }


    }

    SmartDashboard.putString("Block detection", "running");
    int xCoord = largestBlock.getX();
    SmartDashboard.putNumber("X", xCoord);
    int yCoord = largestBlock.getY();
    SmartDashboard.putNumber("Y", yCoord);
        
  }

  @Override
  protected boolean isFinished() {
      return false;
  }

  @Override
  protected void end() {
        
  }

  @Override
  protected void interrupted() {
      end();
  }

  


}