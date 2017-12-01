package sorashido.DDAgent3.util;

import java.util.HashMap;

public class Constants {
    public HashMap<String, Integer> provinceId =
            new HashMap<String, Integer>() {
                {
                    //  補給地
                    put("LVP", 0);
                    put("LON", 1);
                    put("EDI", 2);
                    put("BER", 3);
                    put("MUN", 4);
                    put("KIE", 5);
                    put("MOS", 6);
                    put("WAR", 7);
                    put("STP", 8);
                    put("SEV", 9);
                    put("CON", 10);
                    put("SMY", 11);
                    put("ANK", 12);
                    put("VIE", 13);
                    put("BUD", 14);
                    put("TRI", 15);
                    put("ROM", 16);
                    put("VEN", 17);
                    put("NAP", 18);
                    put("PAR", 19);
                    put("MAR", 20);
                    put("BRE", 21);
                    put("POR", 22);
                    put("SPA", 23);
                    put("SWE", 24);
                    put("BEL", 25);
                    put("HOL", 26);
                    put("SER", 27);
                    put("BUL", 28);
                    put("GRE", 29);
                    put("RUM", 30);
                    put("DEN", 31);
                    put("NWY", 32);
                    put("TUN", 33);

                    //  その他
                    put("ALB", 34);
                    put("APU", 35);
                    put("ARM", 36);
                    put("BOH", 37);
                    put("BUR", 38);
                    put("CLY", 39);
                    put("FIN", 40);
                    put("GAL", 41);
                    put("GAS", 42);
                    put("LIV", 43);
                    put("NAF", 44);
                    put("PIC", 45);
                    put("PIA", 46);
                    put("PRU", 47);
                    put("RUH", 48);
                    put("SIL", 49);
                    put("SYR", 50);
                    put("TUS", 51);
                    put("TYR", 52);
                    put("UKR", 53);
                    put("WAL", 54);
                    put("YOR", 55);

                    //  海域
                    put("ADS", 56);
                    put("AES", 57);
                    put("BAR", 58);
                    put("BAL", 59);
                    put("BLA", 60);
                    put("EMS", 61);
                    put("ENC", 62);
                    put("GOB", 63);
                    put("GOL", 64);
                    put("HEL", 65);
                    put("IOS", 66);
                    put("IRS", 67);
                    put("MAO", 68);
                    put("NAO", 69);
                    put("NTH", 70);
                    put("NWG", 71);
                    put("SKA", 72);
                    put("TYS", 73);
                    put("WMS", 74);
                }
            };

    public HashMap<String, Integer> regionId =
        new HashMap<String, Integer>() {
            {
                // 補給地
                put("NAPFLT", 0);
                put("GOBFLT", 1);
                put("SERAMY", 2);
                put("NWYAMY", 3);
                put("GASAMY", 4);
                put("AEGFLT", 5);
                put("TUNAMY", 6);
                put("NWYFLT", 7);
                put("GASFLT", 8);
                put("YORAMY", 9);
                put("BUDAMY", 10);
                put("ECHFLT", 11);
                put("TUNFLT", 12);
                put("BALFLT", 13);
                put("YORFLT", 14);
                put("SILAMY", 15);
                put("SEVAMY", 16);
                put("STPAMY", 17);
                put("SEVFLT", 18);
                put("PRUAMY", 19);
                put("NTHFLT", 20);
                put("TUSAMY", 21);
                put("UKRAMY", 22);
                put("PRUFLT", 23);
                put("TUSFLT", 24);
                put("MOSAMY", 25);
                put("STPSCS", 26);
                put("FINAMY", 27);
                put("GOLFLT", 28);
                put("WALAMY", 29);
                put("SYRAMY", 30);
                put("BARFLT", 31);
                put("FINFLT", 32);
                put("WALFLT", 33);
                put("SYRFLT", 34);
                put("HELFLT", 35);
                put("SWEAMY", 36);
                put("BULAMY", 37);
                put("PARAMY", 38);
                put("BELAMY", 39);
                put("APUAMY", 40);
                put("SWEFLT", 41);
                put("BOHAMY", 42);
                put("BELFLT", 43);
                put("APUFLT", 44);
                put("HOLAMY", 45);
                put("BULSCS", 46);
                put("VENAMY", 47);
                put("STPNCS", 48);
                put("VIEAMY", 49);
                put("HOLFLT", 50);
                put("WARAMY", 51);
                put("PICAMY", 52);
                put("TYRAMY", 53);
                put("VENFLT", 54);
                put("ANKAMY", 55);
                put("PICFLT", 56);
                put("BURAMY", 57);
                put("PIEAMY", 58);
                put("GREAMY", 59);
                put("ANKFLT", 60);
                put("TYSFLT", 61);
                put("BERAMY", 62);
                put("SKAFLT", 63);
                put("PIEFLT", 64);
                put("CLYAMY", 65);
                put("TRIAMY", 66);
                put("GREFLT", 67);
                put("IONFLT", 68);
                put("BERFLT", 69);
                put("SPAAMY", 70);
                put("CLYFLT", 71);
                put("TRIFLT", 72);
                put("ADRFLT", 73);
                put("ALBAMY", 74);
                put("RUHAMY", 75);
                put("NWGFLT", 76);
                put("SPASCS", 77);
                put("ALBFLT", 78);
                put("LVNAMY", 79);
                put("CONAMY", 80);
                put("LVNFLT", 81);
                put("PORAMY", 82);
                put("LVPAMY", 83);
                put("CONFLT", 84);
                put("KIEAMY", 85);
                put("DENAMY", 86);
                put("NAFAMY", 87);
                put("BREAMY", 88);
                put("SMYAMY", 89);
                put("PORFLT", 90);
                put("LVPFLT", 91);
                put("KIEFLT", 92);
                put("WESFLT", 93);
                put("DENFLT", 94);
                put("NAFFLT", 95);
                put("BREFLT", 96);
                put("RUMAMY", 97);
                put("SMYFLT", 98);
                put("ARMAMY", 99);
                put("BLAFLT", 100);
                put("SPANCS", 101);
                put("RUMFLT", 102);
                put("EASFLT", 103);
                put("MAOAMY", 104);
                put("ARMFLT", 105);
                put("MAOFLT", 106);
                put("IRIFLT", 107);
                put("BULECS", 108);
                put("MARAMY", 109);
                put("ROMAMY", 110);
                put("GALAMY", 111);
                put("MARFLT", 112);
                put("ROMFLT", 113);
                put("EDIAMY", 114);
                put("EDIFLT", 115);
                put("LONAMY", 116);
                put("NAPAMY", 117);
                put("NAOFLT", 118);
                put("MUNAMY", 119);
                put("LONFLT", 120);
            }
        };
}