package com.github.ocraft.s2client.protocol.data;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

import static com.github.ocraft.s2client.protocol.data.Target.*;
import static java.util.Arrays.asList;

public enum Abilities implements Ability {
    INVALID(0),
    SMART(1, UNIT, POINT),
    ATTACK(3674, UNIT, POINT),
    ATTACK_ATTACK(23, UNIT, POINT),
    ATTACK_ATTACK_BUILDING(2048, UNIT, POINT),
    ATTACK_REDIRECT(1682, UNIT, POINT),
    BEHAVIOR_BUILDING_ATTACK_OFF(2082, NONE),
    BEHAVIOR_BUILDING_ATTACK_ON(2081, NONE),
    BEHAVIOR_CLOAK_OFF(3677, NONE),
    BEHAVIOR_CLOAK_OFF_BANSHEE(393, NONE),
    BEHAVIOR_CLOAK_OFF_GHOST(383, NONE),
    BEHAVIOR_CLOAK_ON(3676, NONE),
    BEHAVIOR_CLOAK_ON_BANSHEE(392, NONE),
    BEHAVIOR_CLOAK_ON_GHOST(382, NONE),
    BEHAVIOR_GENERATE_CREEP_OFF(1693, NONE),
    BEHAVIOR_GENERATE_CREEP_ON(1692, NONE),
    BEHAVIOR_HOLD_FIRE_OFF(3689, NONE),
    BEHAVIOR_HOLD_FIRE_OFF_LURKER(2552, NONE),
    BEHAVIOR_HOLD_FIRE_ON(3688, NONE),
    BEHAVIOR_HOLD_FIRE_ON_GHOST(36, NONE),
    BEHAVIOR_HOLD_FIRE_ON_LURKER(2550, NONE),
    BEHAVIOR_PULSAR_BEAM_OFF(2376, NONE),
    BEHAVIOR_PULSAR_BEAM_ON(2375, NONE),
    BUILD_ARMORY(331, POINT),
    BUILD_ASSIMILATOR(882, UNIT),
    BUILD_BANELING_NEST(1162, POINT),
    BUILD_BARRACKS(321, POINT),
    BUILD_BUNKER(324, POINT),
    BUILD_COMMAND_CENTER(318, POINT),
    BUILD_CREEP_TUMOR(3691, POINT),
    BUILD_CREEP_TUMOR_QUEEN(1694, POINT),
    BUILD_CREEP_TUMOR_TUMOR(1733, POINT),
    BUILD_CYBERNETICS_CORE(894, POINT),
    BUILD_DARK_SHRINE(891, POINT),
    BUILD_ENGINEERING_BAY(322, POINT),
    BUILD_EVOLUTION_CHAMBER(1156, POINT),
    BUILD_EXTRACTOR(1154, UNIT),
    BUILD_FACTORY(328, POINT),
    BUILD_FLEET_BEACON(885, POINT),
    BUILD_FORGE(884, POINT),
    BUILD_FUSION_CORE(333, POINT),
    BUILD_GATEWAY(883, POINT),
    BUILD_GHOST_ACADEMY(327, POINT),
    BUILD_HATCHERY(1152, POINT),
    BUILD_HYDRALISK_DEN(1157, POINT),
    BUILD_INFESTATION_PIT(1160, POINT),
    BUILD_INTERCEPTORS(1042, NONE),
    BUILD_MISSILE_TURRET(323, POINT),
    BUILD_NEXUS(880, POINT),
    BUILD_NUKE(710, NONE),
    BUILD_NYDUS_NETWORK(1161, POINT),
    BUILD_NYDUS_WORM(1768, POINT),
    BUILD_PHOTON_CANNON(887, POINT),
    BUILD_PYLON(881, POINT),
    BUILD_REACTOR(3683, NONE),
    BUILD_REACTOR_BARRACKS(422, NONE),
    BUILD_REACTOR_FACTORY(455, NONE),
    BUILD_REACTOR_STARPORT(488, NONE),
    BUILD_REFINERY(320, UNIT),
    BUILD_ROACH_WARREN(1165, POINT),
    BUILD_ROBOTICS_BAY(892, POINT),
    BUILD_ROBOTICS_FACILITY(893, POINT),
    BUILD_SENSOR_TOWER(326, POINT),
    BUILD_SPAWNING_POOL(1155, POINT),
    BUILD_SPINE_CRAWLER(1166, POINT),
    BUILD_SPIRE(1158, POINT),
    BUILD_SPORE_CRAWLER(1167, POINT),
    BUILD_STARGATE(889, POINT),
    BUILD_STARPORT(329, POINT),
    BUILD_STASIS_TRAP(2505, POINT),
    BUILD_SUPPLY_DEPOT(319, POINT),
    BUILD_TECHLAB(3682, NONE),
    BUILD_TECHLAB_BARRACKS(421, NONE),
    BUILD_TECHLAB_FACTORY(454, NONE),
    BUILD_TECHLAB_STARPORT(487, NONE),
    BUILD_TEMPLAR_ARCHIVE(890, POINT),
    BUILD_TWILIGHT_COUNCIL(886, POINT),
    BUILD_ULTRALISK_CAVERN(1159, POINT),
    BURROW_DOWN(3661, NONE),
    BURROW_DOWN_BANELING(1374, NONE),
    BURROW_DOWN_DRONE(1378, NONE),
    BURROW_DOWN_HYDRALISK(1382, NONE),
    BURROW_DOWN_INFESTOR(1444, NONE),
    BURROW_DOWN_LURKER(2108, NONE),
    BURROW_DOWN_QUEEN(1433, NONE),
    BURROW_DOWN_RAVAGER(2340, NONE),
    BURROW_DOWN_ROACH(1386, NONE),
    BURROW_DOWN_SWARMHOST(2014, NONE),
    BURROW_DOWN_WIDOWMINE(2095, NONE),
    BURROW_DOWN_ZERGLING(1390, NONE),
    BURROW_UP(3662, NONE),
    BURROW_UP_BANELING(1376, NONE),
    BURROW_UP_DRONE(1380, NONE),
    BURROW_UP_HYDRALISK(1384, NONE),
    BURROW_UP_INFESTOR(1446, NONE),
    BURROW_UP_LURKER(2110, NONE),
    BURROW_UP_QUEEN(1435, NONE),
    BURROW_UP_RAVAGER(2342, NONE),
    BURROW_UP_ROACH(1388, NONE),
    BURROW_UP_SWARMHOST(2016, NONE),
    BURROW_UP_WIDOWMINE(2097, NONE),
    BURROW_UP_ZERGLING(1392, NONE),
    CANCEL(3659, NONE),
    CANCEL_SLOT_ADDON(313, NONE),
    CANCEL_SLOT_QUEUE1(305, NONE),
    CANCEL_SLOT_QUEUE5(307, NONE),
    CANCEL_SLOT_QUEUE_CANCEL_TO_SELECTION(309, NONE),
    CANCEL_SLOT_QUEUE_PASSIVE(1832, NONE),
    CANCEL_ADEPT_PHASE_SHIFT(2594, NONE),
    CANCEL_ADEPT_SHADE_PHASE_SHIFT(2596, NONE),
    CANCEL_BARRACKS_ADDON(451, NONE),
    CANCEL_BUILD_IN_PROGRESS(314, NONE),
    CANCEL_CREEP_TUMOR(1763, NONE),
    CANCEL_FACTORY_ADDON(484, NONE),
    CANCEL_GRAVITON_BEAM(174, NONE),
    CANCEL_LAST(3671, NONE),
    CANCEL_MORPH_BROODLORD(1373, NONE),
    CANCEL_MORPH_LAIR(1217, NONE),
    CANCEL_MORPH_LURKER(2333, NONE),
    CANCEL_MORPH_LURKER_DEN(2113, NONE),
    CANCEL_MORPH_MOTHERSHIP(1848, NONE),
    CANCEL_MORPH_ORBITAL(1517, NONE),
    CANCEL_MORPH_OVERLORD_TRANSPORT(2709, NONE),
    CANCEL_MORPH_OVERSEER(1449, NONE),
    CANCEL_MORPH_PLANETARY_FORTRESS(1451, NONE),
    CANCEL_MORPH_RAVAGER(2331, NONE),
    CANCEL_QUEUE1(304, NONE),
    CANCEL_QUEUE5(306, NONE),
    CANCEL_QUEUE_ADDON(312, NONE),
    CANCEL_QUEUE_CANCEL_TO_SELECTION(308, NONE),
    CANCEL_QUEUE_PASSIVE(1831, NONE),
    CANCEL_QUEUE_PASSIVE_CANCEL_TO_SELECTION(1833, NONE),
    CANCEL_SPINE_CRAWLER_ROOT(1730, NONE),
    CANCEL_STARPORT_ADDON(517, NONE),
    EFFECT_ABDUCT(2067, UNIT),
    EFFECT_ADEPT_PHASE_SHIFT(2544, POINT),
    EFFECT_AUTO_TURRET(1764, POINT),
    EFFECT_BLINDING_CLOUD(2063, POINT),
    EFFECT_BLINK(3687, POINT),
    EFFECT_BLINK_STALKER(1442, POINT),
    EFFECT_CALL_DOWN_MULE(171, UNIT, POINT),
    EFFECT_CAUSTIC_SPRAY(2324, UNIT),
    EFFECT_CHARGE(1819, UNIT),
    EFFECT_CHRONO_BOOST(261, UNIT),
    EFFECT_CONTAMINATE(1825, UNIT),
    EFFECT_CORROSIVE_BILE(2338, POINT),
    EFFECT_EMP(1628, POINT),
    EFFECT_EXPLODE(42, NONE),
    EFFECT_FEEDBACK(140, UNIT),
    EFFECT_FORCE_FIELD(1526, POINT),
    EFFECT_FUNGAL_GROWTH(74, POINT),
    EFFECT_GHOST_SNIPE(2714, UNIT),
    EFFECT_GRAVITON_BEAM(173, UNIT),
    EFFECT_GUARDIAN_SHIELD(76, NONE),
    EFFECT_HEAL(386, UNIT),
    EFFECT_HUNTER_SEEKER_MISSILE(169, UNIT),
    EFFECT_IMMORTAL_BARRIER(2328, NONE),
    EFFECT_INFESTED_TERRANS(247, POINT),
    EFFECT_INJECT_LARVA(251, UNIT),
    EFFECT_KD8CHARGE(2588, UNIT, POINT),
    EFFECT_LOCK_ON(2350, UNIT),
    EFFECT_LOCUST_SWOOP(2387, POINT),
    EFFECT_MASS_RECALL(3686, UNIT),
    EFFECT_MASS_RECALL_MOTHERSHIP(2368, UNIT),
    EFFECT_MASS_RECALL_MOTHERSHIP_CORE(1974, UNIT),
    EFFECT_MEDIVAC_IGNITE_AFTERBURNERS(2116, NONE),
    EFFECT_NEURAL_PARASITE(249, UNIT),
    EFFECT_NUKE_CALL_DOWN(1622, POINT),
    EFFECT_ORACLE_REVELATION(2146, POINT),
    EFFECT_PARASITIC_BOMB(2542, UNIT),
    EFFECT_PHOTON_OVERCHARGE(2162, UNIT),
    EFFECT_POINT_DEFENSE_DRONE(144, POINT),
    EFFECT_PSI_STORM(1036, POINT),
    EFFECT_PURIFICATION_NOVA(2346, POINT),
    EFFECT_REPAIR(3685, UNIT),
    EFFECT_REPAIR_MULE(78, UNIT),
    EFFECT_REPAIR_SCV(316, UNIT),
    EFFECT_SALVAGE(32, NONE),
    EFFECT_SCAN(399, POINT),
    EFFECT_SHADOW_STRIDE(2700, POINT),
    EFFECT_SPAWN_CHANGELING(181, NONE),
    EFFECT_SPAWN_LOCUSTS(2704, POINT),
    EFFECT_SPRAY(3684, POINT),
    EFFECT_SPRAY_PROTOSS(30, POINT),
    EFFECT_SPRAY_TERRAN(26, POINT),
    EFFECT_SPRAY_ZERG(28, POINT),
    EFFECT_STIM(3675, NONE),
    EFFECT_STIM_MARAUDER(253, NONE),
    EFFECT_STIM_MARINE(380, NONE),
    EFFECT_STIM_MARINE_REDIRECT(1683, NONE),
    EFFECT_SUPPLY_DROP(255, UNIT),
    EFFECT_TACTICAL_JUMP(2358, POINT),
    EFFECT_TEMPEST_DISRUPTION_BLAST(2698, POINT),
    EFFECT_TIME_WARP(2244, POINT),
    EFFECT_TRANSFUSION(1664, UNIT),
    EFFECT_VIPER_CONSUME(2073, UNIT),
    EFFECT_VOIDRAY_PRISMATIC_ALIGNMENT(2393, NONE),
    EFFECT_WIDOWMINE_ATTACK(2099, UNIT),
    EFFECT_YAMATO_GUN(401, UNIT),
    HALLUCINATION_ADEPT(2391, NONE),
    HALLUCINATION_ARCHON(146, NONE),
    HALLUCINATION_COLOSSUS(148, NONE),
    HALLUCINATION_DISRUPTOR(2389, NONE),
    HALLUCINATION_HIGH_TEMPLAR(150, NONE),
    HALLUCINATION_IMMORTAL(152, NONE),
    HALLUCINATION_ORACLE(2114, NONE),
    HALLUCINATION_PHOENIX(154, NONE),
    HALLUCINATION_PROBE(156, NONE),
    HALLUCINATION_STALKER(158, NONE),
    HALLUCINATION_VOIDRAY(160, NONE),
    HALLUCINATION_WARP_PRISM(162, NONE),
    HALLUCINATION_ZEALOT(164, NONE),
    HALT(3660, NONE),
    HALT_BUILDING(315, NONE),
    HALT_TERRAN_BUILD(348, NONE),
    HARVEST_GATHER(3666, UNIT),
    HARVEST_GATHER_DRONE(1183, UNIT),
    HARVEST_GATHER_PROBE(298, UNIT),
    HARVEST_GATHER_SCV(295, UNIT),
    HARVEST_RETURN(3667, NONE),
    HARVEST_RETURN_DRONE(1184, NONE),
    HARVEST_RETURN_MULE(167, NONE),
    HARVEST_RETURN_PROBE(299, NONE),
    HARVEST_RETURN_SCV(296, NONE),
    HOLD_POSITION(18, NONE),
    LAND(3678, POINT),
    LAND_BARRACKS(554, POINT),
    LAND_COMMAND_CENTER(419, POINT),
    LAND_FACTORY(520, POINT),
    LAND_ORBITAL_COMMAND(1524, POINT),
    LAND_STARPORT(522, POINT),
    LIFT(3679, NONE),
    LIFT_BARRACKS(452, NONE),
    LIFT_COMMAND_CENTER(417, NONE),
    LIFT_FACTORY(485, NONE),
    LIFT_ORBITAL_COMMAND(1522, NONE),
    LIFT_STARPORT(518, NONE),
    LOAD(3668, UNIT),
    LOAD_ALL(3663, NONE),
    LOAD_ALL_COMMAND_CENTER(416, NONE),
    LOAD_BUNKER(407, UNIT),
    LOAD_MEDIVAC(394, UNIT),
    MORPH_ARCHON(1766, NONE),
    MORPH_BROODLORD(1372, NONE),
    MORPH_GATEWAY(1520, NONE),
    MORPH_GREATER_SPIRE(1220, NONE),
    MORPH_HELLBAT(1998, NONE),
    MORPH_HELLION(1978, NONE),
    MORPH_HIVE(1218, NONE),
    MORPH_LAIR(1216, NONE),
    MORPH_LIBERATOR_AA_MODE(2560, NONE),
    MORPH_LIBERATOR_AG_MODE(2558, POINT),
    MORPH_LURKER(2332, NONE),
    MORPH_LURKER_DEN(2112, NONE),
    MORPH_MOTHERSHIP(1847, NONE),
    MORPH_ORBITAL_COMMAND(1516, NONE),
    MORPH_OVERLORD_TRANSPORT(2708, NONE),
    MORPH_OVERSEER(1448, NONE),
    MORPH_PLANETARY_FORTRESS(1450, NONE),
    MORPH_RAVAGER(2330, NONE),
    MORPH_ROOT(3680, POINT),
    MORPH_SIEGE_MODE(388, NONE),
    MORPH_SPINE_CRAWLER_ROOT(1729, POINT),
    MORPH_SPINE_CRAWLER_UPROOT(1725, NONE),
    MORPH_SPORE_CRAWLER_ROOT(1731, POINT),
    MORPH_SPORE_CRAWLER_UPROOT(1727, NONE),
    MORPH_SUPPLY_DEPOT_LOWER(556, NONE),
    MORPH_SUPPLY_DEPOT_RAISE(558, NONE),
    MORPH_THOR_EXPLOSIVE_MODE(2364, NONE),
    MORPH_THOR_HIGH_IMPACT_MODE(2362, NONE),
    MORPH_UNSIEGE(390, NONE),
    MORPH_UPROOT(3681, NONE),
    MORPH_VIKING_ASSAULT_MODE(403, NONE),
    MORPH_VIKING_FIGHTER_MODE(405, NONE),
    MORPH_WARP_GATE(1518, NONE),
    MORPH_WARP_PRISM_PHASING_MODE(1528, NONE),
    MORPH_WARP_PRISM_TRANSPORT_MODE(1530, NONE),
    MOVE(16, UNIT, POINT),
    PATROL(17, UNIT, POINT),
    RALLY_BUILDING(195, UNIT, POINT),
    RALLY_COMMAND_CENTER(203, UNIT, POINT),
    RALLY_HATCHERY_UNITS(212, UNIT, POINT),
    RALLY_HATCHERY_WORKERS(211, UNIT, POINT),
    RALLY_MORPHING_UNIT(199, UNIT, POINT),
    RALLY_NEXUS(207, UNIT, POINT),
    RALLY_UNITS(3673, UNIT, POINT),
    RALLY_WORKERS(3690, UNIT, POINT),
    RESEARCH_ADEPT_RESONATING_GLAIVES(1594, NONE),
    RESEARCH_ADVANCED_BALLISTICS(805, NONE),
    RESEARCH_BANSHEE_CLOAKING_FIELD(790, NONE),
    RESEARCH_BANSHEE_HYPER_FLIGHT_ROTORS(799, NONE),
    RESEARCH_BATTLECRUISER_WEAPON_REFIT(1532, NONE),
    RESEARCH_BLINK(1593, NONE),
    RESEARCH_BURROW(1225, NONE),
    RESEARCH_CENTRIFUGAL_HOOKS(1482, NONE),
    RESEARCH_CHARGE(1592, NONE),
    RESEARCH_CHITINOUS_PLATING(265, NONE),
    RESEARCH_COMBAT_SHIELD(731, NONE),
    RESEARCH_CONCUSSIVE_SHELLS(732, NONE),
    RESEARCH_DRILLING_CLAWS(764, NONE),
    RESEARCH_EXTENDED_THERMAL_LANCE(1097, NONE),
    RESEARCH_GLIAL_REGENERATION(216, NONE),
    RESEARCH_GRAVITIC_BOOSTER(1093, NONE),
    RESEARCH_GRAVITIC_DRIVE(1094, NONE),
    RESEARCH_GROOVED_SPINES(1282, NONE),
    RESEARCH_HIGH_CAPACITY_FUEL_TANKS(804, NONE),
    RESEARCH_HISEC_AUTOTRACKING(650, NONE),
    RESEARCH_INFERNAL_PREIGNITER(761, NONE),
    RESEARCH_INTERCEPTOR_GRAVITON_CATAPULT(44, NONE),
    RESEARCH_MAGFIELD_LAUNCHERS(766, NONE),
    RESEARCH_MUSCULAR_AUGMENTS(1283, NONE),
    RESEARCH_NEOSTEEL_FRAME(655, NONE),
    RESEARCH_NEURAL_PARASITE(1455, NONE),
    RESEARCH_PATHOGEN_GLANDS(1454, NONE),
    RESEARCH_PERSONAL_CLOAKING(820, NONE),
    RESEARCH_PHOENIX_ANION_PULSE_CRYSTALS(46, NONE),
    RESEARCH_PNEUMATIZED_CARAPACE(1223, NONE),
    RESEARCH_PROTOSS_AIR_ARMOR(3692, NONE),
    RESEARCH_PROTOSS_AIR_ARMOR_LEVEL1(1565, NONE),
    RESEARCH_PROTOSS_AIR_ARMOR_LEVEL2(1566, NONE),
    RESEARCH_PROTOSS_AIR_ARMOR_LEVEL3(1567, NONE),
    RESEARCH_PROTOSS_AIR_WEAPONS(3693, NONE),
    RESEARCH_PROTOSS_AIR_WEAPONS_LEVEL1(1562, NONE),
    RESEARCH_PROTOSS_AIR_WEAPONS_LEVEL2(1563, NONE),
    RESEARCH_PROTOSS_AIR_WEAPONS_LEVEL3(1564, NONE),
    RESEARCH_PROTOSS_GROUND_ARMOR(3694, NONE),
    RESEARCH_PROTOSS_GROUND_ARMOR_LEVEL1(1065, NONE),
    RESEARCH_PROTOSS_GROUND_ARMOR_LEVEL2(1066, NONE),
    RESEARCH_PROTOSS_GROUND_ARMOR_LEVEL3(1067, NONE),
    RESEARCH_PROTOSS_GROUND_WEAPONS(3695, NONE),
    RESEARCH_PROTOSS_GROUND_WEAPONS_LEVEL1(1062, NONE),
    RESEARCH_PROTOSS_GROUND_WEAPONS_LEVEL2(1063, NONE),
    RESEARCH_PROTOSS_GROUND_WEAPONS_LEVEL3(1064, NONE),
    RESEARCH_PROTOSS_SHIELDS(3696, NONE),
    RESEARCH_PROTOSS_SHIELDS_LEVEL1(1068, NONE),
    RESEARCH_PROTOSS_SHIELDS_LEVEL2(1069, NONE),
    RESEARCH_PROTOSS_SHIELDS_LEVEL3(1070, NONE),
    RESEARCH_PSI_STORM(1126, NONE),
    RESEARCH_RAVEN_CORVID_REACTOR(793, NONE),
    RESEARCH_RAVEN_RECALIBRATED_EXPLOSIVES(803, NONE),
    RESEARCH_SHADOW_STRIKE(2720, NONE),
    RESEARCH_STIMPACK(730, NONE),
    RESEARCH_TERRAN_INFANTRY_ARMOR(3697, NONE),
    RESEARCH_TERRAN_INFANTRY_ARMOR_LEVEL1(656, NONE),
    RESEARCH_TERRAN_INFANTRY_ARMOR_LEVEL2(657, NONE),
    RESEARCH_TERRAN_INFANTRY_ARMOR_LEVEL3(658, NONE),
    RESEARCH_TERRAN_INFANTRY_WEAPONS(3698, NONE),
    RESEARCH_TERRAN_INFANTRY_WEAPONS_LEVEL1(652, NONE),
    RESEARCH_TERRAN_INFANTRY_WEAPONS_LEVEL2(653, NONE),
    RESEARCH_TERRAN_INFANTRY_WEAPONS_LEVEL3(654, NONE),
    RESEARCH_TERRAN_SHIP_WEAPONS(3699, NONE),
    RESEARCH_TERRAN_SHIP_WEAPONS_LEVEL1(861, NONE),
    RESEARCH_TERRAN_SHIP_WEAPONS_LEVEL2(862, NONE),
    RESEARCH_TERRAN_SHIP_WEAPONS_LEVEL3(863, NONE),
    RESEARCH_TERRAN_STRUCTURE_ARMOR_UPGRADE(651, NONE),
    RESEARCH_TERRAN_VEHICLE_AND_SHIP_PLATING(3700, NONE),
    RESEARCH_TERRAN_VEHICLE_AND_SHIP_PLATING_LEVEL1(864, NONE),
    RESEARCH_TERRAN_VEHICLE_AND_SHIP_PLATING_LEVEL2(865, NONE),
    RESEARCH_TERRAN_VEHICLE_AND_SHIP_PLATING_LEVEL3(866, NONE),
    RESEARCH_TERRAN_VEHICLE_WEAPONS(3701, NONE),
    RESEARCH_TERRAN_VEHICLE_WEAPONS_LEVEL1(855, NONE),
    RESEARCH_TERRAN_VEHICLE_WEAPONS_LEVEL2(856, NONE),
    RESEARCH_TERRAN_VEHICLE_WEAPONS_LEVEL3(857, NONE),
    RESEARCH_TUNNELING_CLAWS(217, NONE),
    RESEARCH_WARP_GATE(1568, NONE),
    RESEARCH_ZERG_FLYER_ARMOR(3702, NONE),
    RESEARCH_ZERG_FLYER_ARMOR_LEVEL1(1315, NONE),
    RESEARCH_ZERG_FLYER_ARMOR_LEVEL2(1316, NONE),
    RESEARCH_ZERG_FLYER_ARMOR_LEVEL3(1317, NONE),
    RESEARCH_ZERG_FLYER_ATTACK(3703, NONE),
    RESEARCH_ZERG_FLYER_ATTACK_LEVEL1(1312, NONE),
    RESEARCH_ZERG_FLYER_ATTACK_LEVEL2(1313, NONE),
    RESEARCH_ZERG_FLYER_ATTACK_LEVEL3(1314, NONE),
    RESEARCH_ZERG_GROUND_ARMOR(3704, NONE),
    RESEARCH_ZERG_GROUND_ARMOR_LEVEL1(1189, NONE),
    RESEARCH_ZERG_GROUND_ARMOR_LEVEL2(1190, NONE),
    RESEARCH_ZERG_GROUND_ARMOR_LEVEL3(1191, NONE),
    RESEARCH_ZERGLING_ADRENAL_GLANDS(1252, NONE),
    RESEARCH_ZERGLING_METABOLIC_BOOST(1253, NONE),
    RESEARCH_ZERG_MELEE_WEAPONS(3705, NONE),
    RESEARCH_ZERG_MELEE_WEAPONS_LEVEL1(1186, NONE),
    RESEARCH_ZERG_MELEE_WEAPONS_LEVEL2(1187, NONE),
    RESEARCH_ZERG_MELEE_WEAPONS_LEVEL3(1188, NONE),
    RESEARCH_ZERG_MISSILE_WEAPONS(3706, NONE),
    RESEARCH_ZERG_MISSILE_WEAPONS_LEVEL1(1192, NONE),
    RESEARCH_ZERG_MISSILE_WEAPONS_LEVEL2(1193, NONE),
    RESEARCH_ZERG_MISSILE_WEAPONS_LEVEL3(1194, NONE),
    SCAN_MOVE(19, UNIT, POINT),
    STOP(3665, NONE),
    STOP_BUILDING(2057, NONE),
    STOP_CHEER(6, NONE),
    STOP_DANCE(7, NONE),
    STOP_REDIRECT(1691, NONE),
    STOP_STOP(4, NONE),
    TRAIN_WARP_ADEPT(1419, POINT),
    TRAIN_WARP_DARK_TEMPLAR(1417, POINT),
    TRAIN_WARP_HIGH_TEMPLAR(1416, POINT),
    TRAIN_WARP_SENTRY(1418, POINT),
    TRAIN_WARP_STALKER(1414, POINT),
    TRAIN_WARP_ZEALOT(1413, POINT),
    TRAIN_ADEPT(922, NONE),
    TRAIN_BANELING(80, NONE),
    TRAIN_BANSHEE(621, NONE),
    TRAIN_BATTLECRUISER(623, NONE),
    TRAIN_CARRIER(948, NONE),
    TRAIN_COLOSSUS(978, NONE),
    TRAIN_CORRUPTOR(1353, NONE),
    TRAIN_CYCLONE(597, NONE),
    TRAIN_DARK_TEMPLAR(920, NONE),
    TRAIN_DISRUPTOR(994, NONE),
    TRAIN_DRONE(1342, NONE),
    TRAIN_GHOST(562, NONE),
    TRAIN_HELLBAT(596, NONE),
    TRAIN_HELLION(595, NONE),
    TRAIN_HIGH_TEMPLAR(919, NONE),
    TRAIN_HYDRALISK(1345, NONE),
    TRAIN_IMMORTAL(979, NONE),
    TRAIN_INFESTOR(1352, NONE),
    TRAIN_LIBERATOR(626, NONE),
    TRAIN_MARAUDER(563, NONE),
    TRAIN_MARINE(560, NONE),
    TRAIN_MEDIVAC(620, NONE),
    TRAIN_MOTHERSHIP_CORE(1853, NONE),
    TRAIN_MUTALISK(1346, NONE),
    TRAIN_OBSERVER(977, NONE),
    TRAIN_ORACLE(954, NONE),
    TRAIN_OVERLORD(1344, NONE),
    TRAIN_PHOENIX(946, NONE),
    TRAIN_PROBE(1006, NONE),
    TRAIN_QUEEN(1632, NONE),
    TRAIN_RAVEN(622, NONE),
    TRAIN_REAPER(561, NONE),
    TRAIN_ROACH(1351, NONE),
    TRAIN_SCV(524, NONE),
    TRAIN_SENTRY(921, NONE),
    TRAIN_SIEGE_TANK(591, NONE),
    TRAIN_STALKER(917, NONE),
    TRAIN_SWARMHOST(1356, NONE),
    TRAIN_TEMPEST(955, NONE),
    TRAIN_THOR(594, NONE),
    TRAIN_ULTRALISK(1348, NONE),
    TRAIN_VIKING_FIGHTER(624, NONE),
    TRAIN_VIPER(1354, NONE),
    TRAIN_VOIDRAY(950, NONE),
    TRAIN_WARP_PRISM(976, NONE),
    TRAIN_WIDOWMINE(614, NONE),
    TRAIN_ZEALOT(916, NONE),
    TRAIN_ZERGLING(1343, NONE),
    UNLOAD_ALL(3664, NONE),
    UNLOAD_ALL_AT(3669, UNIT, POINT),
    UNLOAD_ALL_AT_MEDIVAC(396, UNIT, POINT),
    UNLOAD_ALL_AT_OVERLORD(1408, UNIT, POINT),
    UNLOAD_ALL_AT_WARP_PRISM(913, UNIT, POINT),
    UNLOAD_ALL_BUNKER(408, NONE),
    UNLOAD_ALL_COMMAND_CENTER(413, NONE),
    UNLOAD_ALL_NYDUS_NETWORK(1438, NONE),
    UNLOAD_ALL_NYDUS_WORM(2371, NONE),
    UNLOAD_UNIT_BUNKER(410, NONE),
    UNLOAD_UNIT_COMMAND_CENTER(415, NONE),
    UNLOAD_UNIT_MEDIVAC(397, NONE),
    UNLOAD_UNIT_NYDUS_NETWORK(1440, NONE),
    UNLOAD_UNIT_OVERLORD(1409, NONE),
    UNLOAD_UNIT_WARP_PRISM(914, NONE);

    public static final class Other implements Ability {

        private static final long serialVersionUID = -4720067203204064344L;

        private static final Map<Integer, Other> INSTANCES = new ConcurrentHashMap<>();

        private final int abilityId;

        private Other(int abilityId) {
            this.abilityId = abilityId;
        }

        public static Other of(int abilityId) {
            INSTANCES.computeIfAbsent(abilityId, Other::new);
            return INSTANCES.get(abilityId);
        }

        @Override
        public Integer toSc2Api() {
            return getAbilityId();
        }

        @Override
        public int getAbilityId() {
            return abilityId;
        }

        @Override
        public Set<Target> getTargets() {
            return EnumSet.noneOf(Target.class);
        }

        @Override
        public String toString() {
            return "ABILITY_" + abilityId;
        }
    }

    private static Map<Integer, Ability> abilityIdMap = new HashMap<>();

    static {
        EnumSet.allOf(Abilities.class).forEach(ability -> abilityIdMap.put(ability.getAbilityId(), ability));
    }

    private final int abilityId;
    private final EnumSet<Target> targets;

    Abilities(int abilityId, Target... targets) {
        this.abilityId = abilityId;
        this.targets = targets.length > 0 ? EnumSet.copyOf(asList(targets)) : EnumSet.noneOf(Target.class);
    }

    public static Ability from(int sc2ApiAbilityId) {
        return Optional.ofNullable(abilityIdMap.get(sc2ApiAbilityId)).orElse(Other.of(sc2ApiAbilityId));
    }

    @Override
    public Integer toSc2Api() {
        return abilityId;
    }

    @Override
    public int getAbilityId() {
        return abilityId;
    }

    @Override
    public Set<Target> getTargets() {
        return targets;
    }

}