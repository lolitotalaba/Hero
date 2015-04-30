/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity2;

/**
 *
 * @author Talab-PC
 */
public class Windranger extends Hero{
      
   public Windranger(String name,int hp, String type, Skill one,Skill two, Skill three){
   this.hp=hp;
   this.name=name;
   this.skill[0]=one;
   this.skill[1] = two;
   this.skill[2] = three;
   this.type=type;
   }
 
   public void attack(Hero hero,Skill skill){
   hero.hp-=skill.getDamage();
   System.out.println("Windranger attacked " + hero.getName() + " with "+skill.getSkillName()+ " and dealt "+skill.getDamage()+" damage.");
   }
   public void block(Hero attacker,Skill attackingSkill, Skill defendingSkill){
   if(attackingSkill.getDamage()>= defendingSkill.getDamage()){
       takeDamage(this,(attackingSkill.getDamage() - defendingSkill.getDamage()));
   System.out.println("Return damage");}
   else{
      takeDamage(attacker,(defendingSkill.getDamage() - attackingSkill.getDamage()));
   System.out.println(" damage");
   }
   }
   public void upgradeSkillLevel(Skill skill, int damage){
       skill.setLevel();
       skill.setDamage(damage);
   }
   
   public  String getSkills(){
   String s=" ";
   for(int i=0;i<3;i++){
       s+="\n" + skill[i].getSkillName() + " - " + skill[i].getLevel() + " - " + skill[i].getDamage();   
   }
   return s;
   }

}
