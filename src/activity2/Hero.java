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
public abstract class Hero {
    String name;
    int hp;
    Skill []skill=new Skill[3];
    String type;
 
    public void setName(String s){this.name=s;}
    public String getName(){return this.name;}
    
    public void setType(String type){this.type=type;}
    public String getType(){return this.type;}
    
    public void setHP(int hp){this.hp=hp;}
    public int getHP(){return this.hp;}
    public abstract String getSkills();
    public void takeDamage(Hero hero, int damage){
     hero.hp-=damage;}
    public abstract void attack(Hero target,Skill skill);
    public abstract void block(Hero attacker, Skill attackingSkill, Skill defendingSkill);
    public abstract void upgradeSkillLevel(Skill skill,int damage);
    
    public String toString(Hero hero){
    return("Name: " +hero.getName() + "\nHP: "+hero.getHP()+ "\nType: "+ hero.getType()+ "\nSkills - Level - Damage: "+ hero.getSkills());
    }
}

