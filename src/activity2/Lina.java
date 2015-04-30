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
public  class Lina extends Hero{

 
   public Lina(String name,int hp, String type, Skill one,Skill two, Skill three){
   this.hp=hp;
   this.name=name;
   this.skill[0]=one;
   this.skill[1] = two;
   this.skill[2] = three;
   this.type=type;
   }
  
   public void attack(Hero hero,Skill skill){
   hero.hp-=skill.getDamage();
   System.out.println("Lina attacked " + hero.getName() + " with "+skill.getSkillName()+ " and dealt "+skill.getDamage()+" damage.");
   }
   /*
   public void takeDamage(Hero hero, int damage){
       hero.hp-=damage;
   }*/
   public void block(Hero attacker, Skill attackingSkill, Skill defendingSkill){
   if(attackingSkill.getDamage()>= defendingSkill.getDamage())
       takeDamage(this,(attackingSkill.getDamage() - defendingSkill.getDamage()));
   else
      takeDamage(attacker,(defendingSkill.getDamage() - attackingSkill.getDamage()));
   
 
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
