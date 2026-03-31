int damage_amount = 0;
damage_amount = player_base_attack + weapon_attack;
damage_amount = damage_amount - ((enemy_base_attack + enemy_armor_defense) / 2);
if (damage_amount < 0) {
    damage_amount = 0;
}

/*
damage_amount ダメージ量
player_base_attack プレイヤー本体の攻撃力
weapon_attack プレイヤーの武器の攻撃力
enemy_base_attack 敵本体の攻撃力
enemy_armor_defense 敵の防具の防御力
 */