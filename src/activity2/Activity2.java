/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity2;

/**
 *
 * @author asi
 */
public class Activity2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UI ui=new UI();
        ui.show(true);
        // LINA SKILLS
      Skill lina1= new Skill(120,"Fissure",1);
      Skill lina2= new Skill(80,"Fireblast",1);
      Skill lina3= new Skill(200,"Rupture",1);
      Lina lina= new Lina("Lina",550,"Intelligence",lina1,lina2,lina3);
      // lina.upgradeSkillLevel(lina1,50);
      
      Skill invo1= new Skill(100,"Meat Hook",1);
      Skill invo2= new Skill(50,"Rot",1);
      Skill invo3= new Skill(200,"Assasinate",1);
      Invoker invoker= new Invoker("Invoker",600,"Intelligence",invo1,invo2,invo3);
      
         
      Skill axe1= new Skill(90,"Burrowstrike",1);
      Skill axe2= new Skill(30,"Sandstorm",1);
      Skill axe3= new Skill(300,"Finger",1);
      Axe axe= new Axe("Axe",650,"Strength",axe1,axe2,axe3);
      
      Skill wr1= new Skill(100,"Sunstrike",1);
      Skill wr2= new Skill(90,"Impale",1);
      Skill wr3= new Skill(250,"Powershot",1);
      Windranger wr= new Windranger("Windranger",500,"Agility",wr1,wr2,wr3);
      
      Skill wd1= new Skill(20,"Echo Slam",1);
      Skill wd2= new Skill(90,"Berserker's Call",1);
      Skill wd3= new Skill(350,"Focus Fire",1);
      WitchDoctor wd= new WitchDoctor("WitchDoctor",450,"Strength",wd1,wd2,wd3);
      
      lina.block(invoker, invo3, lina1);
      System.out.println("Current Stats: \n" + lina.toString(lina));
      System.out.println("\nCurrent Stats:: \n" + invoker.toString(invoker));
      System.out.println("\nCurrent Stats:: \n" + axe.toString(axe));
      System.out.println("\nCurrent Stats:: \n" + wr.toString(wr));
      System.out.println("\nCurrent Stats:: \n" + wd.toString(wr));
    }
    
}
