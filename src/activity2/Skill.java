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
public class Skill {
    int damage;
    String skillName;
    int level;
    public Skill(int damage,String name,int level){
    this.damage=damage;
    this.skillName=name;
    this.level=level;
    }
    public void setLevel(){this.level++;}
    public int getLevel(){return this.level;}
    public int getDamage(){return this.damage;}
    public void setDamage(int damage){this.damage += damage;}
    public String getSkillName(){return this.skillName;}
    public void setSkillName(String name){this.skillName= name;}
}
