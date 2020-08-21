package com.company;

public class Main {

    public static void main(String[] args) {
        Weapon weapon = new Weapon();
        weapon.setWeaponType("Firearms");
        weapon.setWeaponName("Rifle");
        Boss boss = new Boss();
        boss.setWeaponBoss(weapon);//.setWeaponName("Rifle"), weapon.setWeaponType("Firearms"),);
        boss.setDamage(50);
        boss.setHealth(800);
        boss.setDefenseType("Physical");

        System.out.println("Тип урона Босса - " + boss.getDefenseType() + ";  " + "Урон Босса - " + boss.getDamage() +
                ";  " + "Здоровье Босса - " + boss.getHealth() + ";  " +
                "Имя оружия Босса - " + boss.getWeaponBoss().getWeaponName() + ";  " +
                "Тип оружия Босса - " + boss.getWeaponBoss().getWeaponType());

        System.out.println("Тип урона Босса - " + boss.getDefenseType());
        System.out.println("Урон Босса - " + boss.getDamage());
        System.out.println("Здоровье Босса - " + boss.getHealth());
        System.out.println("Тип оружия Босса - " + boss.getWeaponBoss().getWeaponType());
        System.out.println("Имя оружия Босса - " + boss.getWeaponBoss().getWeaponName());








    }
}
